// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DeleteTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTenantsResponseBody</p>
 */
public class DeleteTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantIds")
    private java.util.List<String> tenantIds;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getTenantIds() {
        return this.tenantIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> tenantIds; 

        private Builder() {
        } 

        private Builder(DeleteTenantsResponseBody model) {
            this.requestId = model.requestId;
            this.tenantIds = model.tenantIds;
        } 

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
        public Builder tenantIds(java.util.List<String> tenantIds) {
            this.tenantIds = tenantIds;
            return this;
        }

        public DeleteTenantsResponseBody build() {
            return new DeleteTenantsResponseBody(this);
        } 

    } 

}
