// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssUploadTokenRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssUploadTokenRequest</p>
 */
public class DescribeOssUploadTokenRequest extends Request {
    private DescribeOssUploadTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssUploadTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeOssUploadTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeOssUploadTokenRequest request) {
            super(request);
        } 

        @Override
        public DescribeOssUploadTokenRequest build() {
            return new DescribeOssUploadTokenRequest(this);
        } 

    } 

}
