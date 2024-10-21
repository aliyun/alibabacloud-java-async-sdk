// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckProcessingServerLockApplyResponseBody} extends {@link TeaModel}
 *
 * <p>CheckProcessingServerLockApplyResponseBody</p>
 */
public class CheckProcessingServerLockApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Exists")
    private Boolean exists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckProcessingServerLockApplyResponseBody(Builder builder) {
        this.exists = builder.exists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckProcessingServerLockApplyResponseBody create() {
        return builder().build();
    }

    /**
     * @return exists
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean exists; 
        private String requestId; 

        /**
         * Exists.
         */
        public Builder exists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckProcessingServerLockApplyResponseBody build() {
            return new CheckProcessingServerLockApplyResponseBody(this);
        } 

    } 

}
