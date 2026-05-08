// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuyingai20260311.models;

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
 * {@link GetAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>GetAccessTokenRequest</p>
 */
public class GetAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private GetAccessTokenRequest(Builder builder) {
        super(builder);
        this.externalUserId = builder.externalUserId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetAccessTokenRequest, Builder> {
        private String externalUserId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessTokenRequest request) {
            super(request);
            this.externalUserId = request.externalUserId;
            this.templateId = request.templateId;
        } 

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putQueryParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetAccessTokenRequest build() {
            return new GetAccessTokenRequest(this);
        } 

    } 

}
