// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DistributeImageRequest} extends {@link RequestModel}
 *
 * <p>DistributeImageRequest</p>
 */
public class DistributeImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributeRegionList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> distributeRegionList;

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
    public java.util.List<String> getDistributeRegionList() {
        return this.distributeRegionList;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    public static final class Builder extends Request.Builder<DistributeImageRequest, Builder> {
        private java.util.List<String> distributeRegionList; 
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
         * <p>The regions to which you want to distribute an image.</p>
         * <p>This parameter is required.</p>
         */
        public Builder distributeRegionList(java.util.List<String> distributeRegionList) {
            this.putBodyParameter("DistributeRegionList", distributeRegionList);
            this.distributeRegionList = distributeRegionList;
            return this;
        }

        /**
         * <p>The ID of the image that you want to distribute.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh0****</p>
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
