// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyClusterAttributesResponseBody</p>
 */
public class ModifyClusterAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyClusterAttributesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterAttributesResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyClusterAttributesResponseBody build() {
            return new ModifyClusterAttributesResponseBody(this);
        } 

    } 

}
