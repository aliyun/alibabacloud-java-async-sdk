// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridCloudGroupExpansionServerResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyHybridCloudGroupExpansionServerResponseBody</p>
 */
public class ModifyHybridCloudGroupExpansionServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyHybridCloudGroupExpansionServerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudGroupExpansionServerResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyHybridCloudGroupExpansionServerResponseBody build() {
            return new ModifyHybridCloudGroupExpansionServerResponseBody(this);
        } 

    } 

}
