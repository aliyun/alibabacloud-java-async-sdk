// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInstancesResponseBody</p>
 */
public class DeleteInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstancesResponseBody create() {
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
         * The returned data.
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

        public DeleteInstancesResponseBody build() {
            return new DeleteInstancesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DryRunResult")
        private Boolean dryRunResult;

        private Data(Builder builder) {
            this.dryRunResult = builder.dryRunResult;
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

        public static final class Builder {
            private Boolean dryRunResult; 

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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
