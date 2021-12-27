// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RefreshContainerNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshContainerNetworkResponseBody</p>
 */
public class RefreshContainerNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private RefreshContainerNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshContainerNetworkResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshContainerNetworkResponseBody build() {
            return new RefreshContainerNetworkResponseBody(this);
        } 

    } 

}
