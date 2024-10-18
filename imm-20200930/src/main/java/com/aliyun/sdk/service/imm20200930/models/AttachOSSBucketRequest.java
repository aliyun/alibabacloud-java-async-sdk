// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachOSSBucketRequest} extends {@link RequestModel}
 *
 * <p>AttachOSSBucketRequest</p>
 */
public class AttachOSSBucketRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private AttachOSSBucketRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.OSSBucket = builder.OSSBucket;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachOSSBucketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<AttachOSSBucketRequest, Builder> {
        private String regionId; 
        private String description; 
        private String OSSBucket; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(AttachOSSBucketRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.OSSBucket = request.OSSBucket;
            this.projectName = request.projectName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the binding. The description must be 1 to 128 characters in length. By default, no description is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>test-attachment</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the OSS bucket in the same region as the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>examplebucket</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public AttachOSSBucketRequest build() {
            return new AttachOSSBucketRequest(this);
        } 

    } 

}
