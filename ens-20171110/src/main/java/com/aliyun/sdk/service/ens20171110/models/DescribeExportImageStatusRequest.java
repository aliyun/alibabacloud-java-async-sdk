// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportImageStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeExportImageStatusRequest</p>
 */
public class DescribeExportImageStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    private DescribeExportImageStatusRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportImageStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeExportImageStatusRequest, Builder> {
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExportImageStatusRequest request) {
            super(request);
            this.imageId = request.imageId;
        } 

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public DescribeExportImageStatusRequest build() {
            return new DescribeExportImageStatusRequest(this);
        } 

    } 

}
