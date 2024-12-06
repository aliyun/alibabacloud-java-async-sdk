// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineResponseBody</p>
 */
public class ListPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListPipelineResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The response.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the pipeline was created.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListPipelineResponseBody build() {
            return new ListPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * <p>The time when the pipeline was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreatedTime")
        private String gmtCreatedTime;

        @com.aliyun.core.annotation.NameInMap("gmtUpdateTime")
        private String gmtUpdateTime;

        @com.aliyun.core.annotation.NameInMap("pipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("pipelineStatus")
        private String pipelineStatus;

        private Result(Builder builder) {
            this.gmtCreatedTime = builder.gmtCreatedTime;
            this.gmtUpdateTime = builder.gmtUpdateTime;
            this.pipelineId = builder.pipelineId;
            this.pipelineStatus = builder.pipelineStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreatedTime
         */
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        /**
         * @return gmtUpdateTime
         */
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineStatus
         */
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

        public static final class Builder {
            private String gmtCreatedTime; 
            private String gmtUpdateTime; 
            private String pipelineId; 
            private String pipelineStatus; 

            /**
             * gmtCreatedTime.
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * gmtUpdateTime.
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * <p>The status of the pipeline. Supported:</p>
             * <ul>
             * <li>NOT_DEPLOYED: The node is not deployed.</li>
             * <li>RUNNING</li>
             * <li>DELETED: Deleted. The console does not display this status.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pipeline_test</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * pipelineStatus.
             */
            public Builder pipelineStatus(String pipelineStatus) {
                this.pipelineStatus = pipelineStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
