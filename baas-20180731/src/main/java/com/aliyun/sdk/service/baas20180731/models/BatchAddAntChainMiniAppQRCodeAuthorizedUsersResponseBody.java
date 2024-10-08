// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody} extends {@link TeaModel}
 *
 * <p>BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody</p>
 */
public class BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody build() {
            return new BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody(this);
        } 

    } 

}
