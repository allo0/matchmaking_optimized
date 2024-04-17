package com.topas404.matchmaking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Score
 */
@Validated
public class Score {
	@JsonProperty("quality")
	private Float quality = null;

	@JsonProperty("collaboration")
	private Float colaboration = null;

	public Score quality(Float quality) {
		this.quality = quality;
		return this;
	}

	/**
	 * Get quality
	 * 
	 * @return quality
	 **/
	public Float getQuality() {
		return quality;
	}

	public void setQuality(Float quality) {
		this.quality = quality;
	}

	public Score colaboration(Float colaboration) {
		this.colaboration = colaboration;
		return this;
	}

	/**
	 * Get colaboration
	 * 
	 * @return colaboration
	 **/
	public Float getColaboration() {
		return colaboration;
	}

	public void setColaboration(Float colaboration) {
		this.colaboration = colaboration;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Score score = (Score) o;
		return Objects.equals(this.quality, score.quality) && Objects.equals(this.colaboration, score.colaboration);
	}

	@Override
	public int hashCode() {
		return Objects.hash(quality, colaboration);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Score {\n");

		sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
		sb.append("    colaboration: ").append(toIndentedString(colaboration)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
