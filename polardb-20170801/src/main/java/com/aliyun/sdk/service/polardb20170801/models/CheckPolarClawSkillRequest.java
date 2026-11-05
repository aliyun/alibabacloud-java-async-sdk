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
 * {@link CheckPolarClawSkillRequest} extends {@link RequestModel}
 *
 * <p>CheckPolarClawSkillRequest</p>
 */
public class CheckPolarClawSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketRegionId")
    private String bucketRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketType")
    private String bucketType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    private String OSSBucket;

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
    private String title;

    private CheckPolarClawSkillRequest(Builder builder) {
        super(builder);
        this.bucketRegionId = builder.bucketRegionId;
        this.bucketType = builder.bucketType;
        this.OSSBucket = builder.OSSBucket;
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

    public static CheckPolarClawSkillRequest create() {
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

    public static final class Builder extends Request.Builder<CheckPolarClawSkillRequest, Builder> {
        private String bucketRegionId; 
        private String bucketType; 
        private String OSSBucket; 
        private String regionId; 
        private String skillName; 
        private String skillVersion; 
        private String summary; 
        private String tags; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CheckPolarClawSkillRequest request) {
            super(request);
            this.bucketRegionId = request.bucketRegionId;
            this.bucketType = request.bucketType;
            this.OSSBucket = request.OSSBucket;
            this.regionId = request.regionId;
            this.skillName = request.skillName;
            this.skillVersion = request.skillVersion;
            this.summary = request.summary;
            this.tags = request.tags;
            this.title = request.title;
        } 

        /**
         * <p>The region ID of the OSS bucket where the skill files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bucketRegionId(String bucketRegionId) {
            this.putQueryParameter("BucketRegionId", bucketRegionId);
            this.bucketRegionId = bucketRegionId;
            return this;
        }

        /**
         * <p>The type of the bucket used for skill files. UserOwned indicates a user-owned bucket. Hosted indicates a hosted bucket. You must have the required permissions to use a hosted bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>UserOwned</p>
         */
        public Builder bucketType(String bucketType) {
            this.putQueryParameter("BucketType", bucketType);
            this.bucketType = bucketType;
            return this;
        }

        /**
         * <p>The name of the OSS bucket to be unbound.</p>
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the skill.</p>
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
         * <p>The version number of the skill.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        public Builder skillVersion(String skillVersion) {
            this.putQueryParameter("SkillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        /**
         * <p>The brief description of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>An example for managing PolarDB skills</p>
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        /**
         * <p>The tag details.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;PolarDB\&quot;,\&quot;programming\&quot;]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The title.</p>
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
        public CheckPolarClawSkillRequest build() {
            return new CheckPolarClawSkillRequest(this);
        } 

    } 

}
