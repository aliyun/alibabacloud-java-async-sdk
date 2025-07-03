// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link ModifyAppAgentFunctionStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppAgentFunctionStatusRequest</p>
 */
public class ModifyAppAgentFunctionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private ModifyAppAgentFunctionStatusRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppAgentFunctionStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<ModifyAppAgentFunctionStatusRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppAgentFunctionStatusRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public ModifyAppAgentFunctionStatusRequest build() {
            return new ModifyAppAgentFunctionStatusRequest(this);
        } 

    } 

}
