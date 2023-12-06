// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitEnvironmentResourceRequest} extends {@link RequestModel}
 *
 * <p>InitEnvironmentResourceRequest</p>
 */
public class InitEnvironmentResourceRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("accessKeyID")
    private String accessKeyID;

    @Body
    @NameInMap("accessKeySecret")
    private String accessKeySecret;

    @Body
    @NameInMap("securityToken")
    private String securityToken;

    private InitEnvironmentResourceRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.accessKeyID = builder.accessKeyID;
        this.accessKeySecret = builder.accessKeySecret;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitEnvironmentResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return accessKeyID
     */
    public String getAccessKeyID() {
        return this.accessKeyID;
    }

    /**
     * @return accessKeySecret
     */
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<InitEnvironmentResourceRequest, Builder> {
        private String uid; 
        private String accessKeyID; 
        private String accessKeySecret; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(InitEnvironmentResourceRequest request) {
            super(request);
            this.uid = request.uid;
            this.accessKeyID = request.accessKeyID;
            this.accessKeySecret = request.accessKeySecret;
            this.securityToken = request.securityToken;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * accessKeyID.
         */
        public Builder accessKeyID(String accessKeyID) {
            this.putBodyParameter("accessKeyID", accessKeyID);
            this.accessKeyID = accessKeyID;
            return this;
        }

        /**
         * accessKeySecret.
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.putBodyParameter("accessKeySecret", accessKeySecret);
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * securityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putBodyParameter("securityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public InitEnvironmentResourceRequest build() {
            return new InitEnvironmentResourceRequest(this);
        } 

    } 

}
