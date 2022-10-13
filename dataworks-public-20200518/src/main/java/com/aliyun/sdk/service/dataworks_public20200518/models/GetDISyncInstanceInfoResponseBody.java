// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncInstanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDISyncInstanceInfoResponseBody</p>
 */
public class GetDISyncInstanceInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDISyncInstanceInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDISyncInstanceInfoResponseBody create() {
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

        public GetDISyncInstanceInfoResponseBody build() {
            return new GetDISyncInstanceInfoResponseBody(this);
        } 

    } 

    public static class StepDetail extends TeaModel {
        @NameInMap("Info")
        private String info;

        @NameInMap("Status")
        private String status;

        @NameInMap("StepId")
        private Long stepId;

        @NameInMap("StepName")
        private String stepName;

        private StepDetail(Builder builder) {
            this.info = builder.info;
            this.status = builder.status;
            this.stepId = builder.stepId;
            this.stepName = builder.stepName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepDetail create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepId
         */
        public Long getStepId() {
            return this.stepId;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        public static final class Builder {
            private String info; 
            private String status; 
            private Long stepId; 
            private String stepName; 

            /**
             * Info.
             */
            public Builder info(String info) {
                this.info = info;
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
             * StepId.
             */
            public Builder stepId(Long stepId) {
                this.stepId = stepId;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            public StepDetail build() {
                return new StepDetail(this);
            } 

        } 

    }
    public static class SolutionInfo extends TeaModel {
        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Status")
        private String status;

        @NameInMap("StepDetail")
        private java.util.List < StepDetail> stepDetail;

        private SolutionInfo(Builder builder) {
            this.creatorName = builder.creatorName;
            this.id = builder.id;
            this.status = builder.status;
            this.stepDetail = builder.stepDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SolutionInfo create() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepDetail
         */
        public java.util.List < StepDetail> getStepDetail() {
            return this.stepDetail;
        }

        public static final class Builder {
            private String creatorName; 
            private Long id; 
            private String status; 
            private java.util.List < StepDetail> stepDetail; 

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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StepDetail.
             */
            public Builder stepDetail(java.util.List < StepDetail> stepDetail) {
                this.stepDetail = stepDetail;
                return this;
            }

            public SolutionInfo build() {
                return new SolutionInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("SolutionInfo")
        private SolutionInfo solutionInfo;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.message = builder.message;
            this.name = builder.name;
            this.solutionInfo = builder.solutionInfo;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return solutionInfo
         */
        public SolutionInfo getSolutionInfo() {
            return this.solutionInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String name; 
            private SolutionInfo solutionInfo; 
            private String status; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * SolutionInfo.
             */
            public Builder solutionInfo(SolutionInfo solutionInfo) {
                this.solutionInfo = solutionInfo;
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
