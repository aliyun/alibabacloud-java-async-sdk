// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ExportImageRequest} extends {@link RequestModel}
 *
 * <p>ExportImageRequest</p>
 */
public class ExportImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSPrefix")
    @com.aliyun.core.annotation.Validation(maxLength = 30)
    private String OSSPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private ExportImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.OSSBucket = builder.OSSBucket;
        this.OSSPrefix = builder.OSSPrefix;
        this.OSSRegionId = builder.OSSRegionId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
     * @return OSSRegionId
     */
    public String getOSSRegionId() {
        return this.OSSRegionId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<ExportImageRequest, Builder> {
        private String imageId; 
        private String OSSBucket; 
        private String OSSPrefix; 
        private String OSSRegionId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(ExportImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.OSSBucket = request.OSSBucket;
            this.OSSPrefix = request.OSSPrefix;
            this.OSSRegionId = request.OSSRegionId;
            this.roleName = request.roleName;
        } 

        /**
         * <p>The ID of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5ragaz3s74b7go8ks7jp9****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The OSS bucket to which you want to export the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>whxyl****</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * <p>The prefix of the object as which you want to store the image in the OSS bucket. The prefix must be 1 to 30 characters in length and can contain digits and letters.</p>
         */
        public Builder OSSPrefix(String OSSPrefix) {
            this.putQueryParameter("OSSPrefix", OSSPrefix);
            this.OSSPrefix = OSSPrefix;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder OSSRegionId(String OSSRegionId) {
            this.putQueryParameter("OSSRegionId", OSSRegionId);
            this.OSSRegionId = OSSRegionId;
            return this;
        }

        /**
         * <p>The name of the Resource Access Management (RAM) role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunMNSLoggingRole</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public ExportImageRequest build() {
            return new ExportImageRequest(this);
        } 

    } 

}
