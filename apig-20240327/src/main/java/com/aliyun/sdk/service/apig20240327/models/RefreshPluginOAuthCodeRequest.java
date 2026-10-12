// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link RefreshPluginOAuthCodeRequest} extends {@link RequestModel}
 *
 * <p>RefreshPluginOAuthCodeRequest</p>
 */
public class RefreshPluginOAuthCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    private RefreshPluginOAuthCodeRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshPluginOAuthCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<RefreshPluginOAuthCodeRequest, Builder> {
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(RefreshPluginOAuthCodeRequest request) {
            super(request);
            this.code = request.code;
        } 

        /**
         * <p>The authorization code returned by the Codeup OAuth authorization callback (the code parameter carried in the callback after authorization at <a href="https://codeup.aliyun.com/oauth/authorize?app_id=xxx&state=apigw">https://codeup.aliyun.com/oauth/authorize?app_id=xxx&amp;state=apigw</a>). If this parameter is empty, the ErrInvalidParameterWithEmpty(&quot;oauth code&quot;) error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4/0AX4xxxx</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        @Override
        public RefreshPluginOAuthCodeRequest build() {
            return new RefreshPluginOAuthCodeRequest(this);
        } 

    } 

}
