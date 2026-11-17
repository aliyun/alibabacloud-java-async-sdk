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
 * {@link DescribeShareImageRequest} extends {@link RequestModel}
 *
 * <p>DescribeShareImageRequest</p>
 */
public class DescribeShareImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    private DescribeShareImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.imageId = builder.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShareImageRequest create() {
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    public static final class Builder extends Request.Builder<DescribeShareImageRequest, Builder> {
        private String regionId; 
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeShareImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.imageId = request.imageId;
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
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public DescribeShareImageRequest build() {
            return new DescribeShareImageRequest(this);
        } 

    } 

}
