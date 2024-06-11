// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DistributeImageRequest} extends {@link RequestModel}
 *
 * <p>DistributeImageRequest</p>
 */
public class DistributeImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributeRegionList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > distributeRegionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    private DistributeImageRequest(Builder builder) {
        super(builder);
        this.distributeRegionList = builder.distributeRegionList;
        this.imageId = builder.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistributeImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return distributeRegionList
     */
    public java.util.List < String > getDistributeRegionList() {
        return this.distributeRegionList;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    public static final class Builder extends Request.Builder<DistributeImageRequest, Builder> {
        private java.util.List < String > distributeRegionList; 
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(DistributeImageRequest request) {
            super(request);
            this.distributeRegionList = request.distributeRegionList;
            this.imageId = request.imageId;
        } 

        /**
         * DistributeRegionList.
         */
        public Builder distributeRegionList(java.util.List < String > distributeRegionList) {
            this.putBodyParameter("DistributeRegionList", distributeRegionList);
            this.distributeRegionList = distributeRegionList;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public DistributeImageRequest build() {
            return new DistributeImageRequest(this);
        } 

    } 

}
