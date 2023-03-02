// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicInfluenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicInfluenceResponseBody</p>
 */
public class GetTopicInfluenceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetTopicInfluenceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicInfluenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the baseline instances affected by the event.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTopicInfluenceResponseBody build() {
            return new GetTopicInfluenceResponseBody(this);
        } 

    } 

    public static class Influences extends TeaModel {
        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("BaselineName")
        private String baselineName;

        @NameInMap("Bizdate")
        private Long bizdate;

        @NameInMap("Buffer")
        private Long buffer;

        @NameInMap("InGroupId")
        private Integer inGroupId;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Status")
        private String status;

        private Influences(Builder builder) {
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
            this.bizdate = builder.bizdate;
            this.buffer = builder.buffer;
            this.inGroupId = builder.inGroupId;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Influences create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return baselineName
         */
        public String getBaselineName() {
            return this.baselineName;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return buffer
         */
        public Long getBuffer() {
            return this.buffer;
        }

        /**
         * @return inGroupId
         */
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long baselineId; 
            private String baselineName; 
            private Long bizdate; 
            private Long buffer; 
            private Integer inGroupId; 
            private String owner; 
            private Integer priority; 
            private Long projectId; 
            private String status; 

            /**
             * The ID of the baseline.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The name of the baseline.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * The data timestamp of the baseline instance.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * The margin of the baseline instance. Unit: seconds.
             */
            public Builder buffer(Long buffer) {
                this.buffer = buffer;
                return this;
            }

            /**
             * The ID of the scheduling cycle of the baseline instance. For a baseline instance that is scheduled by day, the value of this parameter is 1. For a baseline instance that is scheduled by hour, the value of this parameter ranges from 1 to 24.
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The priority of the baseline. Valid values: 1, 2, 5, 7, and 8.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the workspace to which the baseline belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes finish running before the alerting time. The value DANGEROUS indicates that nodes are still running after the alerting time but before the committed time. The value OVER indicates that nodes are still running after the committed time.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Influences build() {
                return new Influences(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Influences")
        private java.util.List < Influences> influences;

        @NameInMap("TopicId")
        private Long topicId;

        private Data(Builder builder) {
            this.influences = builder.influences;
            this.topicId = builder.topicId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return influences
         */
        public java.util.List < Influences> getInfluences() {
            return this.influences;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        public static final class Builder {
            private java.util.List < Influences> influences; 
            private Long topicId; 

            /**
             * The affected baseline instances.
             */
            public Builder influences(java.util.List < Influences> influences) {
                this.influences = influences;
                return this;
            }

            /**
             * The ID of the event.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
