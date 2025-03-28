// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetDISyncInstanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDISyncInstanceInfoResponseBody</p>
 */
public class GetDISyncInstanceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetDISyncInstanceInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status of the real-time synchronization task or data synchronization solution.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1411515937635973****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDISyncInstanceInfoResponseBody build() {
            return new GetDISyncInstanceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDISyncInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncInstanceInfoResponseBody</p>
     */
    public static class StepDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StepId")
        private Long stepId;

        @com.aliyun.core.annotation.NameInMap("StepName")
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

            private Builder() {
            } 

            private Builder(StepDetail model) {
                this.info = model.info;
                this.status = model.status;
                this.stepId = model.stepId;
                this.stepName = model.stepName;
            } 

            /**
             * <p>The information of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fusionProps&quot;:{&quot;dataSource&quot;:[{&quot;fileName&quot;:&quot;holo_20221020161613&quot;,&quot;status&quot;:&quot;SUCCESS&quot;}]},&quot;customProps&quot;:{&quot;showSN&quot;:true,&quot;columns&quot;:[{&quot;dataIndex&quot;:&quot;fileName&quot;,&quot;width&quot;:0.8,&quot;title&quot;:&quot;Real-time synchronization name&quot;},{&quot;dataIndex&quot;:&quot;status&quot;,&quot;width&quot;:0.2,&quot;title&quot;:&quot;Status&quot;}]},&quot;componentName&quot;:&quot;Table&quot;}</p>
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The status of the step in the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the step in the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stepId(Long stepId) {
                this.stepId = stepId;
                return this;
            }

            /**
             * <p>The name of the step in the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>Create a base table</p>
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
    /**
     * 
     * {@link GetDISyncInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncInstanceInfoResponseBody</p>
     */
    public static class SolutionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StepDetail")
        private java.util.List<StepDetail> stepDetail;

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
        public java.util.List<StepDetail> getStepDetail() {
            return this.stepDetail;
        }

        public static final class Builder {
            private String creatorName; 
            private Long id; 
            private String status; 
            private java.util.List<StepDetail> stepDetail; 

            private Builder() {
            } 

            private Builder(SolutionInfo model) {
                this.creatorName = model.creatorName;
                this.id = model.id;
                this.status = model.status;
                this.stepDetail = model.stepDetail;
            } 

            /**
             * <p>The creator of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks_3h1</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The ID of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>run</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The step details of the data synchronization solution.</p>
             */
            public Builder stepDetail(java.util.List<StepDetail> stepDetail) {
                this.stepDetail = stepDetail;
                return this;
            }

            public SolutionInfo build() {
                return new SolutionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDISyncInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncInstanceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SolutionInfo")
        private SolutionInfo solutionInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.message = model.message;
                this.name = model.name;
                this.solutionInfo = model.solutionInfo;
                this.status = model.status;
            } 

            /**
             * <p>The cause of the failure to obtain the status of the real-time synchronization task or data synchronization solution. If the status of the real-time synchronization task or data synchronization solution is obtained, the value null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>fileId[100] is invalid</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <ul>
             * <li>If the TaskType parameter is set to DI_REALTIME, the Name parameter indicates the name of the real-time synchronization task.</li>
             * <li>If the TaskType parameter is set to DI_SOLUTION, the value null is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>streamx_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <ul>
             * <li>If the TaskType parameter is set to DI_REALTIME, the value null is returned.</li>
             * <li>If the TaskType parameter is set to DI_SOLUTION, the SolutionInfo parameter indicates the details of the data synchronization solution.</li>
             * </ul>
             */
            public Builder solutionInfo(SolutionInfo solutionInfo) {
                this.solutionInfo = solutionInfo;
                return this;
            }

            /**
             * <ul>
             * <li>If the TaskType parameter is set to DI_REALTIME, the Status parameter indicates the status of the real-time synchronization task. Valid values: PAUSE, NORUN, RUN, KILLING, and WAIT.</li>
             * <li>If the TaskType parameter is set to DI_SOLUTION, the Status parameter indicates the status of the data synchronization solution. Valid values: success and fail.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUN</p>
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
