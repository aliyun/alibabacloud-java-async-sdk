// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpsertClusterSecurityIPGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpsertClusterSecurityIPGroupResponseBody</p>
 */
public class UpsertClusterSecurityIPGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpsertClusterSecurityIPGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertClusterSecurityIPGroupResponseBody create() {
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

        public UpsertClusterSecurityIPGroupResponseBody build() {
            return new UpsertClusterSecurityIPGroupResponseBody(this);
        } 

    } 

}
