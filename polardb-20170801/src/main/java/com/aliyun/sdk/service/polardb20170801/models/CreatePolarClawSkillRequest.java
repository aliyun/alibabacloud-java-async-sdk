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
         * <p>The type of the bucket used for skill files. Valid values: UserOwned: a user-owned bucket. Hosted: a managed bucket. You must have the required permissions to use a managed bucket.</p>
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
         * <p>The name of the OSS bucket that is in the same region as the current project.</p>
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
         * <p>The prefix of your OSS object. The prefix can contain digits and letters and must be 1 to 30 characters in length.</p>
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
         * <p>The region ID of the region where the parameter template resides.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The skill name.</p>
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
         * <p>The skill version.</p>
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
         * <p>The brief description of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>Example for managing PolarDB skills</p>
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
         * <p>[&quot;PolarDB&quot;]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The title.</p>
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
