// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

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
 * {@link GetAuthCodeRequest} extends {@link RequestModel}
 *
 * <p>GetAuthCodeRequest</p>
 */
public class GetAuthCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoCreateUser")
    private Boolean autoCreateUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    private GetAuthCodeRequest(Builder builder) {
        super(builder);
        this.autoCreateUser = builder.autoCreateUser;
        this.endUserId = builder.endUserId;
        this.externalUserId = builder.externalUserId;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoCreateUser
     */
    public Boolean getAutoCreateUser() {
        return this.autoCreateUser;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<GetAuthCodeRequest, Builder> {
        private Boolean autoCreateUser; 
        private String endUserId; 
        private String externalUserId; 
        private String policy; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthCodeRequest request) {
            super(request);
            this.autoCreateUser = request.autoCreateUser;
            this.endUserId = request.endUserId;
            this.externalUserId = request.externalUserId;
            this.policy = request.policy;
        } 

        /**
         * AutoCreateUser.
         */
        public Builder autoCreateUser(Boolean autoCreateUser) {
            this.putBodyParameter("AutoCreateUser", autoCreateUser);
            this.autoCreateUser = autoCreateUser;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        @Override
        public GetAuthCodeRequest build() {
            return new GetAuthCodeRequest(this);
        } 

    } 

}
