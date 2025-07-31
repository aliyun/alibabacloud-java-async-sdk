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
 * {@link GetUploadLinkRequest} extends {@link RequestModel}
 *
 * <p>GetUploadLinkRequest</p>
 */
public class GetUploadLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUrl")
    private String uploadUrl;

    private GetUploadLinkRequest(Builder builder) {
        super(builder);
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadLinkRequest create() {
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

    public static final class Builder extends Request.Builder<GetUploadLinkRequest, Builder> {
        private String uploadUrl; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadLinkRequest request) {
            super(request);
            this.uploadUrl = request.uploadUrl;
        } 

        /**
         * UploadUrl.
         */
        public Builder uploadUrl(String uploadUrl) {
            this.putQueryParameter("UploadUrl", uploadUrl);
            this.uploadUrl = uploadUrl;
            return this;
        }

        @Override
        public GetUploadLinkRequest build() {
            return new GetUploadLinkRequest(this);
        } 

    } 

}
