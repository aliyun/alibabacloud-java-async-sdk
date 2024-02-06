// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportImageRequest} extends {@link RequestModel}
 *
 * <p>ExportImageRequest</p>
 */
public class ExportImageRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("OSSBucket")
    @Validation(required = true)
    private String OSSBucket;

    @Query
    @NameInMap("OSSPrefix")
    private String OSSPrefix;

    @Query
    @NameInMap("OSSRegionId")
    @Validation(required = true)
    private String OSSRegionId;

    @Query
    @NameInMap("RoleName")
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
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The OSS bucket to which you want to export the image.
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * The prefix of the object as which you want to store the image in the OSS bucket. The prefix must be 1 to 30 characters in length and can contain digits and letters.
         */
        public Builder OSSPrefix(String OSSPrefix) {
            this.putQueryParameter("OSSPrefix", OSSPrefix);
            this.OSSPrefix = OSSPrefix;
            return this;
        }

        /**
         * The ID of the region.
         * <p>
         * 
         * Valid values:
         * 
         * *   cn-beijing
         */
        public Builder OSSRegionId(String OSSRegionId) {
            this.putQueryParameter("OSSRegionId", OSSRegionId);
            this.OSSRegionId = OSSRegionId;
            return this;
        }

        /**
         * The name of the Resource Access Management (RAM) role.
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
