// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link ListRebalanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListRebalanceInfoResponseBody</p>
 */
public class ListRebalanceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRebalanceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRebalanceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRebalanceInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRebalanceInfoResponseBody build() {
            return new ListRebalanceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRebalanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListRebalanceInfoResponseBody</p>
     */
    public static class RebalanceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Generation")
        private Long generation;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("LastRebalanceTimestamp")
        private Long lastRebalanceTimestamp;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RebalanceSuccess")
        private Boolean rebalanceSuccess;

        @com.aliyun.core.annotation.NameInMap("RebalanceTimeConsuming")
        private Long rebalanceTimeConsuming;

        private RebalanceInfoList(Builder builder) {
            this.generation = builder.generation;
            this.groupId = builder.groupId;
            this.lastRebalanceTimestamp = builder.lastRebalanceTimestamp;
            this.reason = builder.reason;
            this.rebalanceSuccess = builder.rebalanceSuccess;
            this.rebalanceTimeConsuming = builder.rebalanceTimeConsuming;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RebalanceInfoList create() {
            return builder().build();
        }

        /**
         * @return generation
         */
        public Long getGeneration() {
            return this.generation;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return lastRebalanceTimestamp
         */
        public Long getLastRebalanceTimestamp() {
            return this.lastRebalanceTimestamp;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return rebalanceSuccess
         */
        public Boolean getRebalanceSuccess() {
            return this.rebalanceSuccess;
        }

        /**
         * @return rebalanceTimeConsuming
         */
        public Long getRebalanceTimeConsuming() {
            return this.rebalanceTimeConsuming;
        }

        public static final class Builder {
            private Long generation; 
            private String groupId; 
            private Long lastRebalanceTimestamp; 
            private String reason; 
            private Boolean rebalanceSuccess; 
            private Long rebalanceTimeConsuming; 

            private Builder() {
            } 

            private Builder(RebalanceInfoList model) {
                this.generation = model.generation;
                this.groupId = model.groupId;
                this.lastRebalanceTimestamp = model.lastRebalanceTimestamp;
                this.reason = model.reason;
                this.rebalanceSuccess = model.rebalanceSuccess;
                this.rebalanceTimeConsuming = model.rebalanceTimeConsuming;
            } 

            /**
             * Generation.
             */
            public Builder generation(Long generation) {
                this.generation = generation;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * LastRebalanceTimestamp.
             */
            public Builder lastRebalanceTimestamp(Long lastRebalanceTimestamp) {
                this.lastRebalanceTimestamp = lastRebalanceTimestamp;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * RebalanceSuccess.
             */
            public Builder rebalanceSuccess(Boolean rebalanceSuccess) {
                this.rebalanceSuccess = rebalanceSuccess;
                return this;
            }

            /**
             * RebalanceTimeConsuming.
             */
            public Builder rebalanceTimeConsuming(Long rebalanceTimeConsuming) {
                this.rebalanceTimeConsuming = rebalanceTimeConsuming;
                return this;
            }

            public RebalanceInfoList build() {
                return new RebalanceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRebalanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListRebalanceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RebalanceInfoList")
        private java.util.List<RebalanceInfoList> rebalanceInfoList;

        private Data(Builder builder) {
            this.rebalanceInfoList = builder.rebalanceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rebalanceInfoList
         */
        public java.util.List<RebalanceInfoList> getRebalanceInfoList() {
            return this.rebalanceInfoList;
        }

        public static final class Builder {
            private java.util.List<RebalanceInfoList> rebalanceInfoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.rebalanceInfoList = model.rebalanceInfoList;
            } 

            /**
             * RebalanceInfoList.
             */
            public Builder rebalanceInfoList(java.util.List<RebalanceInfoList> rebalanceInfoList) {
                this.rebalanceInfoList = rebalanceInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
