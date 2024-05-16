// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicInfluenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicInfluenceResponseBody</p>
 */
public class GetTopicInfluenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetTopicInfluenceResponseBody build() {
            return new GetTopicInfluenceResponseBody(this);
        } 

    } 

    public static class Influences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("Buffer")
        private Long buffer;

        @com.aliyun.core.annotation.NameInMap("InGroupId")
        private Integer inGroupId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * BaselineId.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * BaselineName.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * Bizdate.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * Buffer.
             */
            public Builder buffer(Long buffer) {
                this.buffer = buffer;
                return this;
            }

            /**
             * InGroupId.
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
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
        @com.aliyun.core.annotation.NameInMap("Influences")
        private java.util.List < Influences> influences;

        @com.aliyun.core.annotation.NameInMap("TopicId")
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
             * Influences.
             */
            public Builder influences(java.util.List < Influences> influences) {
                this.influences = influences;
                return this;
            }

            /**
             * TopicId.
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
