// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody</p>
 */
public class DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    private DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody create() {
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

        public DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody build() {
            return new DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody(this);
        } 

    } 

}
