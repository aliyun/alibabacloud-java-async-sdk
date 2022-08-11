// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDISyncTaskResponseBody</p>
 */
public class GetDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetDISyncTaskResponseBody build() {
            return new GetDISyncTaskResponseBody(this);
        } 

    } 

    public static class SolutionDetail extends TeaModel {
        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProcessContent")
        private String processContent;

        @NameInMap("ProcessExtra")
        private String processExtra;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitTime")
        private String submitTime;

        @NameInMap("Type")
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
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProcessContent.
             */
            public Builder processContent(String processContent) {
                this.processContent = processContent;
                return this;
            }

            /**
             * ProcessExtra.
             */
            public Builder processExtra(String processExtra) {
                this.processExtra = processExtra;
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
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("SolutionDetail")
        private SolutionDetail solutionDetail;

        @NameInMap("Status")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * SolutionDetail.
             */
            public Builder solutionDetail(SolutionDetail solutionDetail) {
                this.solutionDetail = solutionDetail;
                return this;
            }

            /**
             * Status.
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
