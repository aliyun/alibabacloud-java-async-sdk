// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInstancesResponseBody</p>
 */
public class DeleteInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteInstancesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-<strong><strong>-</strong></strong>-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteInstancesResponseBody build() {
            return new DeleteInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DryRunResult")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.dryRunResult = model.dryRunResult;
            } 

            /**
             * <p>The result of the dry-run request.</p>
             * <ul>
             * <li>If the DryRun parameter is set to true and the dry run succeeds, the DryRunResult parameter returns true. Otherwise, an error code is returned.</li>
             * <li>If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
