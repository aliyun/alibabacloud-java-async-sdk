// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenUploadPictureRequest} extends {@link RequestModel}
 *
 * <p>DescribeScreenUploadPictureRequest</p>
 */
public class DescribeScreenUploadPictureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logoUrl;

    private DescribeScreenUploadPictureRequest(Builder builder) {
        super(builder);
        this.logoUrl = builder.logoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenUploadPictureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public static final class Builder extends Request.Builder<DescribeScreenUploadPictureRequest, Builder> {
        private String logoUrl; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScreenUploadPictureRequest request) {
            super(request);
            this.logoUrl = request.logoUrl;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://security-pic.oss-cn-hangzhou.aliyuncs.com/screenLogo/1766185894104675/c28bd4d2-c5c1-43f8-9ef5-de41d762xxxx">https://security-pic.oss-cn-hangzhou.aliyuncs.com/screenLogo/1766185894104675/c28bd4d2-c5c1-43f8-9ef5-de41d762xxxx</a></p>
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        @Override
        public DescribeScreenUploadPictureRequest build() {
            return new DescribeScreenUploadPictureRequest(this);
        } 

    } 

}
