// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVamlRequest} extends {@link RequestModel}
 *
 * <p>SendVamlRequest</p>
 */
public class SendVamlRequest extends Request {
    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Vaml")
    @Validation(required = true)
    private String vaml;

    private SendVamlRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
        this.vaml = builder.vaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVamlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return vaml
     */
    public String getVaml() {
        return this.vaml;
    }

    public static final class Builder extends Request.Builder<SendVamlRequest, Builder> {
        private String sessionId; 
        private Long tenantId; 
        private String vaml; 

        private Builder() {
            super();
        } 

        private Builder(SendVamlRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
            this.vaml = request.vaml;
        } 

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Vaml.
         */
        public Builder vaml(String vaml) {
            this.putQueryParameter("Vaml", vaml);
            this.vaml = vaml;
            return this;
        }

        @Override
        public SendVamlRequest build() {
            return new SendVamlRequest(this);
        } 

    } 

}
