// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDISyncTaskResponseBody</p>
 */
public class GetDISyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDISyncTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDISyncTaskResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   True
         * *   False
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDISyncTaskResponseBody build() {
            return new GetDISyncTaskResponseBody(this);
        } 

    } 

    public static class SolutionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProcessContent")
        private String processContent;

        @com.aliyun.core.annotation.NameInMap("ProcessExtra")
        private String processExtra;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SolutionDetail(Builder builder) {
            this.creatorName = builder.creatorName;
            this.id = builder.id;
            this.name = builder.name;
            this.processContent = builder.processContent;
            this.processExtra = builder.processExtra;
            this.projectId = builder.projectId;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SolutionDetail create() {
            return builder().build();
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processContent
         */
        public String getProcessContent() {
            return this.processContent;
        }

        /**
         * @return processExtra
         */
        public String getProcessExtra() {
            return this.processExtra;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String creatorName; 
            private Long id; 
            private String name; 
            private String processContent; 
            private String processExtra; 
            private Long projectId; 
            private String sourceType; 
            private String startTime; 
            private String status; 
            private String submitTime; 
            private String type; 

            /**
             * The creator of the data synchronization solution.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * The ID of the data synchronization solution.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the data synchronization solution.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The configuration details of the data synchronization solution.
             */
            public Builder processContent(String processContent) {
                this.processContent = processContent;
                return this;
            }

            /**
             * The additional parameters of the data synchronization solution.
             */
            public Builder processExtra(String processExtra) {
                this.processExtra = processExtra;
                return this;
            }

            /**
             * The ID of the project to which the data synchronization solution belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The type of the source of the data synchronization solution.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The start time of the data synchronization solution.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the data synchronization solution. Valid values:
             * <p>
             * 
             * *   0: successful
             * *   1: not running
             * *   2: running
             * *   3: failed
             * *   4: committed
             * *   5: pending manual confirmation
             * *   6: manually confirmed
             * *   7: others
             * *   8: waiting
             * *   9: deleted
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the data synchronization solution was committed.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * The type of the data synchronization solution.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SolutionDetail build() {
                return new SolutionDetail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SolutionDetail")
        private SolutionDetail solutionDetail;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.solutionDetail = builder.solutionDetail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return solutionDetail
         */
        public SolutionDetail getSolutionDetail() {
            return this.solutionDetail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private SolutionDetail solutionDetail; 
            private String status; 

            /**
             * *   If the TaskType parameter is set to DI_REALTIME, the details of the real-time synchronization task are returned.
             * <p>
             * *   If the TaskType parameter is set to DI_SOLUTION, the value null is returned.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The cause of the failure to obtain the details of the real-time synchronization task or data synchronization solution.
             * <p>
             * 
             * If the details of the real-time synchronization task or data synchronization solution are obtained, the value null is returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * *   If the TaskType parameter is set to DI_REALTIME, the value null is returned.
             * <p>
             * *   If the TaskType parameter is set to DI_SOLUTION, the details of the data synchronization solution are returned.
             */
            public Builder solutionDetail(SolutionDetail solutionDetail) {
                this.solutionDetail = solutionDetail;
                return this;
            }

            /**
             * Indicates whether the details of the real-time synchronization task or data synchronization solution are obtained. Valid values:
             * <p>
             * 
             * success: The details are obtained. fail: The details fail to be obtained.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
