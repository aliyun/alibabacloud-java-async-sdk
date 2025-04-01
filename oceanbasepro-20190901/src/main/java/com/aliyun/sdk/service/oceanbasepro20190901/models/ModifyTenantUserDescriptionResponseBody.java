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
 * {@link ModifyTenantUserDescriptionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantUserDescriptionResponseBody</p>
 */
public class ModifyTenantUserDescriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyTenantUserDescriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantUserDescriptionResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyTenantUserDescriptionResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>You can call this operation to modify the description of a specified account in a tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyTenantUserDescriptionResponseBody build() {
            return new ModifyTenantUserDescriptionResponseBody(this);
        } 

    } 

}
