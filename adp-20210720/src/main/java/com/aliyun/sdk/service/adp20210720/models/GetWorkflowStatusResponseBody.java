// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkflowStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowStatusResponseBody</p>
 */
public class GetWorkflowStatusResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetWorkflowStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetWorkflowStatusResponseBody build() {
            return new GetWorkflowStatusResponseBody(this);
        } 

    } 

    public static class WorkflowTasks extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        private WorkflowTasks(Builder builder) {
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowTasks create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String name; 
            private String status; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public WorkflowTasks build() {
                return new WorkflowTasks(this);
            } 

        } 

    }
    public static class StepStatus extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        @NameInMap("workflowTasks")
        private java.util.List < WorkflowTasks> workflowTasks;

        private StepStatus(Builder builder) {
            this.name = builder.name;
            this.status = builder.status;
            this.workflowTasks = builder.workflowTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepStatus create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workflowTasks
         */
        public java.util.List < WorkflowTasks> getWorkflowTasks() {
            return this.workflowTasks;
        }

        public static final class Builder {
            private String name; 
            private String status; 
            private java.util.List < WorkflowTasks> workflowTasks; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * workflowTasks.
             */
            public Builder workflowTasks(java.util.List < WorkflowTasks> workflowTasks) {
                this.workflowTasks = workflowTasks;
                return this;
            }

            public StepStatus build() {
                return new StepStatus(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("status")
        private String status;

        @NameInMap("stepStatus")
        private java.util.List < StepStatus> stepStatus;

        private Data(Builder builder) {
            this.status = builder.status;
            this.stepStatus = builder.stepStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepStatus
         */
        public java.util.List < StepStatus> getStepStatus() {
            return this.stepStatus;
        }

        public static final class Builder {
            private String status; 
            private java.util.List < StepStatus> stepStatus; 

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * stepStatus.
             */
            public Builder stepStatus(java.util.List < StepStatus> stepStatus) {
                this.stepStatus = stepStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
