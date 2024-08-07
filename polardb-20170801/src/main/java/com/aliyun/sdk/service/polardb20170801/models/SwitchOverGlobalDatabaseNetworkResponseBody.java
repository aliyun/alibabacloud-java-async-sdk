// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchOverGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchOverGlobalDatabaseNetworkResponseBody</p>
 */
public class SwitchOverGlobalDatabaseNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SwitchOverGlobalDatabaseNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchOverGlobalDatabaseNetworkResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SwitchOverGlobalDatabaseNetworkResponseBody build() {
            return new SwitchOverGlobalDatabaseNetworkResponseBody(this);
        } 

    } 

}
