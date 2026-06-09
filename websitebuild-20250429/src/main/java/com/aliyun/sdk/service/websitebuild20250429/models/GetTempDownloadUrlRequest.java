// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetTempDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetTempDownloadUrlRequest</p>
 */
public class GetTempDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

    private GetTempDownloadUrlRequest(Builder builder) {
        super(builder);
        this.ossKey = builder.ossKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTempDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    public static final class Builder extends Request.Builder<GetTempDownloadUrlRequest, Builder> {
        private String ossKey; 

        private Builder() {
            super();
        } 

        private Builder(GetTempDownloadUrlRequest request) {
            super(request);
            this.ossKey = request.ossKey;
        } 

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putBodyParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        @Override
        public GetTempDownloadUrlRequest build() {
            return new GetTempDownloadUrlRequest(this);
        } 

    } 

}
