// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTenantsResponseBody</p>
 */
public class DeleteTenantsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantIds")
    private java.util.List < String > tenantIds;

    private DeleteTenantsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantIds = builder.tenantIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTenantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantIds
     */
    public java.util.List < String > getTenantIds() {
        return this.tenantIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > tenantIds; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TenantIds.
         */
        public Builder tenantIds(java.util.List < String > tenantIds) {
            this.tenantIds = tenantIds;
            return this;
        }

        public DeleteTenantsResponseBody build() {
            return new DeleteTenantsResponseBody(this);
        } 

    } 

}
