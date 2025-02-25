// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitDomainSpecialBizCredentialsRequest} extends {@link RequestModel}
 *
 * <p>SubmitDomainSpecialBizCredentialsRequest</p>
 */
public class SubmitDomainSpecialBizCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private Long bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Credentials")
    private String credentials;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SubmitDomainSpecialBizCredentialsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.credentials = builder.credentials;
        this.extend = builder.extend;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDomainSpecialBizCredentialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public Long getBizId() {
        return this.bizId;
    }

    /**
     * @return credentials
     */
    public String getCredentials() {
        return this.credentials;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SubmitDomainSpecialBizCredentialsRequest, Builder> {
        private Long bizId; 
        private String credentials; 
        private String extend; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDomainSpecialBizCredentialsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.credentials = request.credentials;
            this.extend = request.extend;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>219</p>
         */
        public Builder bizId(Long bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The certificate information.</p>
         */
        public Builder credentials(String credentials) {
            this.putBodyParameter("Credentials", credentials);
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;addTransferLock&quot;:true}</p>
         */
        public Builder extend(String extend) {
            this.putBodyParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SubmitDomainSpecialBizCredentialsRequest build() {
            return new SubmitDomainSpecialBizCredentialsRequest(this);
        } 

    } 

}
