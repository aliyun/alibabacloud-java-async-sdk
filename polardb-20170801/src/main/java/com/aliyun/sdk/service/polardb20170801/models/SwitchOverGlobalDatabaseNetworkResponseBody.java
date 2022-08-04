// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchOverGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchOverGlobalDatabaseNetworkResponseBody</p>
 */
public class SwitchOverGlobalDatabaseNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
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
         * RequestId.
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
