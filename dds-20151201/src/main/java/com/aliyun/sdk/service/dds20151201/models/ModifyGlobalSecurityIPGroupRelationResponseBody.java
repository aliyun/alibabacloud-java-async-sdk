// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link ModifyGlobalSecurityIPGroupRelationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyGlobalSecurityIPGroupRelationResponseBody</p>
 */
public class ModifyGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyGlobalSecurityIPGroupRelationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalSecurityIPGroupRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52820D2B-B2DD-59F0-BDF2-83EC19C6F1CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyGlobalSecurityIPGroupRelationResponseBody build() {
            return new ModifyGlobalSecurityIPGroupRelationResponseBody(this);
        } 

    } 

}
