// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDatabaseInstanceDescriptionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDatabaseInstanceDescriptionResponseBody</p>
 */
public class ModifyDatabaseInstanceDescriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDatabaseInstanceDescriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseInstanceDescriptionResponseBody create() {
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
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDatabaseInstanceDescriptionResponseBody build() {
            return new ModifyDatabaseInstanceDescriptionResponseBody(this);
        } 

    } 

}
