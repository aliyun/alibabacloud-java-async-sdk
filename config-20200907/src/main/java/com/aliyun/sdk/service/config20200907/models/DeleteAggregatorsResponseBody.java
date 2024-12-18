// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DeleteAggregatorsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAggregatorsResponseBody</p>
 */
public class DeleteAggregatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperateAggregatorsResult")
    private OperateAggregatorsResult operateAggregatorsResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAggregatorsResponseBody(Builder builder) {
        this.operateAggregatorsResult = builder.operateAggregatorsResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregatorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return operateAggregatorsResult
     */
    public OperateAggregatorsResult getOperateAggregatorsResult() {
        return this.operateAggregatorsResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OperateAggregatorsResult operateAggregatorsResult; 
        private String requestId; 

        /**
         * <p>The returned result.</p>
         */
        public Builder operateAggregatorsResult(OperateAggregatorsResult operateAggregatorsResult) {
            this.operateAggregatorsResult = operateAggregatorsResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8195B664-9565-4685-89AC-8B5F04B44B92</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAggregatorsResponseBody build() {
            return new DeleteAggregatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAggregatorsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteAggregatorsResponseBody</p>
     */
    public static class OperateAggregators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private OperateAggregators(Builder builder) {
            this.aggregatorId = builder.aggregatorId;
            this.errorCode = builder.errorCode;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateAggregators create() {
            return builder().build();
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String aggregatorId; 
            private String errorCode; 
            private Boolean success; 

            /**
             * <p>The ID of the account group.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-dacf86d8314e00eb****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * <blockquote>
             * <p>No error code is returned for the account group if the account group is deleted.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>AccountNotExisted</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li>true: The request was successful.</li>
             * <li>false: The request failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public OperateAggregators build() {
                return new OperateAggregators(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteAggregatorsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteAggregatorsResponseBody</p>
     */
    public static class OperateAggregatorsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateAggregators")
        private java.util.List<OperateAggregators> operateAggregators;

        private OperateAggregatorsResult(Builder builder) {
            this.operateAggregators = builder.operateAggregators;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateAggregatorsResult create() {
            return builder().build();
        }

        /**
         * @return operateAggregators
         */
        public java.util.List<OperateAggregators> getOperateAggregators() {
            return this.operateAggregators;
        }

        public static final class Builder {
            private java.util.List<OperateAggregators> operateAggregators; 

            /**
             * <p>The details of the account group.</p>
             */
            public Builder operateAggregators(java.util.List<OperateAggregators> operateAggregators) {
                this.operateAggregators = operateAggregators;
                return this;
            }

            public OperateAggregatorsResult build() {
                return new OperateAggregatorsResult(this);
            } 

        } 

    }
}
