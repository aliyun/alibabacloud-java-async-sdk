// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreatePolarClawSkillRequest} extends {@link RequestModel}
 *
 * <p>CreatePolarClawSkillRequest</p>
 */
public class CreatePolarClawSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketRegionId")
    private String bucketRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketType")
    private String bucketType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreatePolarClawSkillRequest(Builder builder) {
        super(builder);
        this.bucketRegionId = builder.bucketRegionId;
        this.bucketType = builder.bucketType;
        this.OSSBucket = builder.OSSBucket;
        this.OSSPrefix = builder.OSSPrefix;
        this.regionId = builder.regionId;
        this.skillName = builder.skillName;
        this.skillVersion = builder.skillVersion;
        this.summary = builder.summary;
        this.tags = builder.tags;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketRegionId
     */
    public String getBucketRegionId() {
        return this.bucketRegionId;
    }

    /**
     * @return bucketType
     */
    public String getBucketType() {
        return this.bucketType;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return OSSPrefix
     */
    public String getOSSPrefix() {
        return this.OSSPrefix;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return skillVersion
     */
    public String getSkillVersion() {
        return this.skillVersion;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreatePolarClawSkillRequest, Builder> {
        private String bucketRegionId; 
        private String bucketType; 
        private String OSSBucket; 
        private String OSSPrefix; 
        private String regionId; 
        private String skillName; 
        private String skillVersion; 
        private String summary; 
        private String tags; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolarClawSkillRequest request) {
            super(request);
            this.bucketRegionId = request.bucketRegionId;
            this.bucketType = request.bucketType;
            this.OSSBucket = request.OSSBucket;
            this.OSSPrefix = request.OSSPrefix;
            this.regionId = request.regionId;
            this.skillName = request.skillName;
            this.skillVersion = request.skillVersion;
            this.summary = request.summary;
            this.tags = request.tags;
            this.title = request.title;
        } 

        /**
         * BucketRegionId.
         */
        public Builder bucketRegionId(String bucketRegionId) {
            this.putQueryParameter("BucketRegionId", bucketRegionId);
            this.bucketRegionId = bucketRegionId;
            return this;
        }

        /**
         * BucketType.
         */
        public Builder bucketType(String bucketType) {
            this.putQueryParameter("BucketType", bucketType);
            this.bucketType = bucketType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket-test</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>steelStorage</p>
         */
        public Builder OSSPrefix(String OSSPrefix) {
            this.putQueryParameter("OSSPrefix", OSSPrefix);
            this.OSSPrefix = OSSPrefix;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclawhub</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder skillVersion(String skillVersion) {
            this.putQueryParameter("SkillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarClawHub</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreatePolarClawSkillRequest build() {
            return new CreatePolarClawSkillRequest(this);
        } 

    } 

}
