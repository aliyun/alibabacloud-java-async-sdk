// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateAppCodeRequest} extends {@link RequestModel}
 *
 * <p>CreateAppCodeRequest</p>
 */
public class CreateAppCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private CreateAppCodeRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<CreateAppCodeRequest, Builder> {
        private String appCode; 
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppCodeRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appId = request.appId;
        } 

        /**
         * <p>The application AppCode.</p>
         * 
         * <strong>example:</strong>
         * <p>3aaf905a0a1f4f0eabc6d891dfa08afc</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111203109</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public CreateAppCodeRequest build() {
            return new CreateAppCodeRequest(this);
        } 

    } 

}
