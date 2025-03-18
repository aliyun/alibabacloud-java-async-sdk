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
         * <p>The ID of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_alibase_****</p>
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
