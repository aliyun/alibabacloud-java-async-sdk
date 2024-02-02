// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNodeNumResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceNodeNumResponseBody</p>
 */
public class ModifyInstanceNodeNumResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceNodeNumResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNodeNumResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The return result of the request.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceNodeNumResponseBody build() {
            return new ModifyInstanceNodeNumResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DryRunResult")
        private Boolean dryRunResult;

        @NameInMap("OrderId")
        private String orderId;

        private Data(Builder builder) {
            this.dryRunResult = builder.dryRunResult;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dryRunResult
         */
        public Boolean getDryRunResult() {
            return this.dryRunResult;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private Boolean dryRunResult; 
            private String orderId; 

            /**
             * The result of the dry-run request.
             * <p>
             * - If the DryRun parameter is set to true and the dry run succeeds, the DryRunResult parameter returns true. Otherwise, an error code is returned.
             * - If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.
             */
            public Builder dryRunResult(Boolean dryRunResult) {
                this.dryRunResult = dryRunResult;
                return this;
            }

            /**
             * The ID of the order.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
