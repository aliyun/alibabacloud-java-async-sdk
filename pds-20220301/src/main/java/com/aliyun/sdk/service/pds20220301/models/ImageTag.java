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
 * {@link ImageTag} extends {@link TeaModel}
 *
 * <p>ImageTag</p>
 */
public class ImageTag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("cover_file_category")
    private String coverFileCategory;

    @com.aliyun.core.annotation.NameInMap("cover_file_id")
    private String coverFileId;

    @com.aliyun.core.annotation.NameInMap("cover_overall_score")
    private Float coverOverallScore;

    @com.aliyun.core.annotation.NameInMap("cover_tag_confidence")
    private Float coverTagConfidence;

    @com.aliyun.core.annotation.NameInMap("cover_url")
    private String coverUrl;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ImageTag(Builder builder) {
        this.count = builder.count;
        this.coverFileCategory = builder.coverFileCategory;
        this.coverFileId = builder.coverFileId;
        this.coverOverallScore = builder.coverOverallScore;
        this.coverTagConfidence = builder.coverTagConfidence;
        this.coverUrl = builder.coverUrl;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageTag create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return coverFileCategory
     */
    public String getCoverFileCategory() {
        return this.coverFileCategory;
    }

    /**
     * @return coverFileId
     */
    public String getCoverFileId() {
        return this.coverFileId;
    }

    /**
     * @return coverOverallScore
     */
    public Float getCoverOverallScore() {
        return this.coverOverallScore;
    }

    /**
     * @return coverTagConfidence
     */
    public Float getCoverTagConfidence() {
        return this.coverTagConfidence;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private Long count; 
        private String coverFileCategory; 
        private String coverFileId; 
        private Float coverOverallScore; 
        private Float coverTagConfidence; 
        private String coverUrl; 
        private String name; 

        private Builder() {
        } 

        private Builder(ImageTag model) {
            this.count = model.count;
            this.coverFileCategory = model.coverFileCategory;
            this.coverFileId = model.coverFileId;
            this.coverOverallScore = model.coverOverallScore;
            this.coverTagConfidence = model.coverTagConfidence;
            this.coverUrl = model.coverUrl;
            this.name = model.name;
        } 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * cover_file_category.
         */
        public Builder coverFileCategory(String coverFileCategory) {
            this.coverFileCategory = coverFileCategory;
            return this;
        }

        /**
         * cover_file_id.
         */
        public Builder coverFileId(String coverFileId) {
            this.coverFileId = coverFileId;
            return this;
        }

        /**
         * cover_overall_score.
         */
        public Builder coverOverallScore(Float coverOverallScore) {
            this.coverOverallScore = coverOverallScore;
            return this;
        }

        /**
         * cover_tag_confidence.
         */
        public Builder coverTagConfidence(Float coverTagConfidence) {
            this.coverTagConfidence = coverTagConfidence;
            return this;
        }

        /**
         * cover_url.
         */
        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ImageTag build() {
            return new ImageTag(this);
        } 

    } 

}
