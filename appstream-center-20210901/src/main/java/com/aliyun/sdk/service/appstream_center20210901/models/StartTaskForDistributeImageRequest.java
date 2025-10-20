// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link StartTaskForDistributeImageRequest} extends {@link RequestModel}
 *
 * <p>StartTaskForDistributeImageRequest</p>
 */
public class StartTaskForDistributeImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationRegionList")
    private java.util.List<String> destinationRegionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RetryType")
    private String retryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    private String sourceRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private StartTaskForDistributeImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationRegionList = builder.destinationRegionList;
        this.imageId = builder.imageId;
        this.productType = builder.productType;
        this.retryType = builder.retryType;
        this.sourceRegion = builder.sourceRegion;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTaskForDistributeImageRequest create() {
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
     * @return destinationRegionList
     */
    public java.util.List<String> getDestinationRegionList() {
        return this.destinationRegionList;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return retryType
     */
    public String getRetryType() {
        return this.retryType;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<StartTaskForDistributeImageRequest, Builder> {
        private String regionId; 
        private java.util.List<String> destinationRegionList; 
        private String imageId; 
        private String productType; 
        private String retryType; 
        private String sourceRegion; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(StartTaskForDistributeImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationRegionList = request.destinationRegionList;
            this.imageId = request.imageId;
            this.productType = request.productType;
            this.retryType = request.retryType;
            this.sourceRegion = request.sourceRegion;
            this.versionId = request.versionId;
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
         * DestinationRegionList.
         */
        public Builder destinationRegionList(java.util.List<String> destinationRegionList) {
            this.putBodyParameter("DestinationRegionList", destinationRegionList);
            this.destinationRegionList = destinationRegionList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-07jyldnd9i*****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * RetryType.
         */
        public Builder retryType(String retryType) {
            this.putBodyParameter("RetryType", retryType);
            this.retryType = retryType;
            return this;
        }

        /**
         * SourceRegion.
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putBodyParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public StartTaskForDistributeImageRequest build() {
            return new StartTaskForDistributeImageRequest(this);
        } 

    } 

}
