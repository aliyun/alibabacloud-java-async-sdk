// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportFileUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeImportFileUrlRequest</p>
 */
public class DescribeImportFileUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    private DescribeImportFileUrlRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImportFileUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    public static final class Builder extends Request.Builder<DescribeImportFileUrlRequest, Builder> {
        private String contentType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImportFileUrlRequest request) {
            super(request);
            this.contentType = request.contentType;
        } 

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        @Override
        public DescribeImportFileUrlRequest build() {
            return new DescribeImportFileUrlRequest(this);
        } 

    } 

}
