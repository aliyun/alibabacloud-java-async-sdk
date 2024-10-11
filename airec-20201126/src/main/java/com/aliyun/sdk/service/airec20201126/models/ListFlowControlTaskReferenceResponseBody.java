// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskReferenceResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowControlTaskReferenceResponseBody</p>
 */
public class ListFlowControlTaskReferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListFlowControlTaskReferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskReferenceResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>The ID of the request. The value is unique for each request. This helps troubleshoot issues later.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListFlowControlTaskReferenceResponseBody build() {
            return new ListFlowControlTaskReferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowControlTaskReferenceResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskReferenceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("last7PvPercent")
        private Double last7PvPercent;

        @com.aliyun.core.annotation.NameInMap("last7ScenePv")
        private Double last7ScenePv;

        @com.aliyun.core.annotation.NameInMap("last7TaskPv")
        private Double last7TaskPv;

        @com.aliyun.core.annotation.NameInMap("lastPvPercent")
        private Double lastPvPercent;

        @com.aliyun.core.annotation.NameInMap("lastScenePv")
        private Long lastScenePv;

        @com.aliyun.core.annotation.NameInMap("lastTaskPv")
        private Long lastTaskPv;

        @com.aliyun.core.annotation.NameInMap("referenceId")
        private String referenceId;

        private Result(Builder builder) {
            this.last7PvPercent = builder.last7PvPercent;
            this.last7ScenePv = builder.last7ScenePv;
            this.last7TaskPv = builder.last7TaskPv;
            this.lastPvPercent = builder.lastPvPercent;
            this.lastScenePv = builder.lastScenePv;
            this.lastTaskPv = builder.lastTaskPv;
            this.referenceId = builder.referenceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return last7PvPercent
         */
        public Double getLast7PvPercent() {
            return this.last7PvPercent;
        }

        /**
         * @return last7ScenePv
         */
        public Double getLast7ScenePv() {
            return this.last7ScenePv;
        }

        /**
         * @return last7TaskPv
         */
        public Double getLast7TaskPv() {
            return this.last7TaskPv;
        }

        /**
         * @return lastPvPercent
         */
        public Double getLastPvPercent() {
            return this.lastPvPercent;
        }

        /**
         * @return lastScenePv
         */
        public Long getLastScenePv() {
            return this.lastScenePv;
        }

        /**
         * @return lastTaskPv
         */
        public Long getLastTaskPv() {
            return this.lastTaskPv;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        public static final class Builder {
            private Double last7PvPercent; 
            private Double last7ScenePv; 
            private Double last7TaskPv; 
            private Double lastPvPercent; 
            private Long lastScenePv; 
            private Long lastTaskPv; 
            private String referenceId; 

            /**
             * <p>The average exposure rate of the item pool in the last seven days.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder last7PvPercent(Double last7PvPercent) {
                this.last7PvPercent = last7PvPercent;
                return this;
            }

            /**
             * <p>The average number of exposures for the items in the selected scene in the last seven days.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder last7ScenePv(Double last7ScenePv) {
                this.last7ScenePv = last7ScenePv;
                return this;
            }

            /**
             * <p>The average number of exposures for the item pool in the selected scene in the last seven days.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder last7TaskPv(Double last7TaskPv) {
                this.last7TaskPv = last7TaskPv;
                return this;
            }

            /**
             * <p>The exposure rate of the item pool yesterday.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder lastPvPercent(Double lastPvPercent) {
                this.lastPvPercent = lastPvPercent;
                return this;
            }

            /**
             * <p>The total number of exposures for the items in the selected scene yesterday.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder lastScenePv(Long lastScenePv) {
                this.lastScenePv = lastScenePv;
                return this;
            }

            /**
             * <p>The number of exposures for the item pool in the selected scene yesterday.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder lastTaskPv(Long lastTaskPv) {
                this.lastTaskPv = lastTaskPv;
                return this;
            }

            /**
             * <p>The ID of the reference data.</p>
             * 
             * <strong>example:</strong>
             * <p>421351235918</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
