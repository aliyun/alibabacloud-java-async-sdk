// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CancelServiceUsageRequest} extends {@link RequestModel}
 *
 * <p>CancelServiceUsageRequest</p>
 */
public class CancelServiceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedDelete")
    private Boolean needDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    private CancelServiceUsageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.needDelete = builder.needDelete;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelServiceUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return needDelete
     */
    public Boolean getNeedDelete() {
        return this.needDelete;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<CancelServiceUsageRequest, Builder> {
        private String clientToken; 
        private Boolean needDelete; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(CancelServiceUsageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.needDelete = request.needDelete;
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to delete the application.</p>
         * <blockquote>
         * <p> After you delete the application, you must re-enter the application information the next time you submit an application.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needDelete(Boolean needDelete) {
            this.putQueryParameter("NeedDelete", needDelete);
            this.needDelete = needDelete;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-d6fc5f949a9246xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public CancelServiceUsageRequest build() {
            return new CancelServiceUsageRequest(this);
        } 

    } 

}
