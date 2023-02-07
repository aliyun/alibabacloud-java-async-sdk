// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopInstanceRequest</p>
 */
public class StopInstanceRequest extends Request {
    @Query
    @NameInMap("SessionId")
    private String sessionId;

    @Query
    @NameInMap("TenantId")
    private Long tenantId;

    private StopInstanceRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<StopInstanceRequest, Builder> {
        private String sessionId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(StopInstanceRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
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

        @Override
        public StopInstanceRequest build() {
            return new StopInstanceRequest(this);
        } 

    } 

}
