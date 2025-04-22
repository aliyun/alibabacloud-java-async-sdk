// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SystemTag} extends {@link TeaModel}
 *
 * <p>SystemTag</p>
 */
public class SystemTag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("centric_score")
    private Float centricScore;

    @com.aliyun.core.annotation.NameInMap("confidence")
    private Float confidence;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("parent_name")
    private String parentName;

    @com.aliyun.core.annotation.NameInMap("tag_level")
    private Integer tagLevel;

    private SystemTag(Builder builder) {
        this.centricScore = builder.centricScore;
        this.confidence = builder.confidence;
        this.name = builder.name;
        this.parentName = builder.parentName;
        this.tagLevel = builder.tagLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SystemTag create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return centricScore
     */
    public Float getCentricScore() {
        return this.centricScore;
    }

    /**
     * @return confidence
     */
    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentName
     */
    public String getParentName() {
        return this.parentName;
    }

    /**
     * @return tagLevel
     */
    public Integer getTagLevel() {
        return this.tagLevel;
    }

    public static final class Builder {
        private Float centricScore; 
        private Float confidence; 
        private String name; 
        private String parentName; 
        private Integer tagLevel; 

        private Builder() {
        } 

        private Builder(SystemTag model) {
            this.centricScore = model.centricScore;
            this.confidence = model.confidence;
            this.name = model.name;
            this.parentName = model.parentName;
            this.tagLevel = model.tagLevel;
        } 

        /**
         * centric_score.
         */
        public Builder centricScore(Float centricScore) {
            this.centricScore = centricScore;
            return this;
        }

        /**
         * confidence.
         */
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * parent_name.
         */
        public Builder parentName(String parentName) {
            this.parentName = parentName;
            return this;
        }

        /**
         * tag_level.
         */
        public Builder tagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }

        public SystemTag build() {
            return new SystemTag(this);
        } 

    } 

}
