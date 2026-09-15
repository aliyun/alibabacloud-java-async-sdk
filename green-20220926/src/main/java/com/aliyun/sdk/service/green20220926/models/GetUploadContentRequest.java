// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetUploadContentRequest} extends {@link RequestModel}
 *
 * <p>GetUploadContentRequest</p>
 */
public class GetUploadContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUrl")
    private String uploadUrl;

    private GetUploadContentRequest(Builder builder) {
        super(builder);
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder extends Request.Builder<GetUploadContentRequest, Builder> {
        private String uploadUrl; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadContentRequest request) {
            super(request);
            this.uploadUrl = request.uploadUrl;
        } 

        /**
         * <p>The OSS URL of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/test_text.txt">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/test_text.txt</a></p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.putQueryParameter("UploadUrl", uploadUrl);
            this.uploadUrl = uploadUrl;
            return this;
        }

        @Override
        public GetUploadContentRequest build() {
            return new GetUploadContentRequest(this);
        } 

    } 

}
