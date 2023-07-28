// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionRiskyTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionRiskyTasksResponseBody</p>
 */
public class ListExecutionRiskyTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskyTasks")
    private java.util.List < RiskyTasks> riskyTasks;

    private ListExecutionRiskyTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskyTasks = builder.riskyTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionRiskyTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskyTasks
     */
    public java.util.List < RiskyTasks> getRiskyTasks() {
        return this.riskyTasks;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RiskyTasks> riskyTasks; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about high-risk tasks.
         */
        public Builder riskyTasks(java.util.List < RiskyTasks> riskyTasks) {
            this.riskyTasks = riskyTasks;
            return this;
        }

        public ListExecutionRiskyTasksResponseBody build() {
            return new ListExecutionRiskyTasksResponseBody(this);
        } 

    } 

    public static class RiskyTasks extends TeaModel {
        @NameInMap("API")
        private String API;

        @NameInMap("Service")
        private String service;

        @NameInMap("Task")
        private java.util.List < String > task;

        @NameInMap("Template")
        private java.util.List < String > template;

        private RiskyTasks(Builder builder) {
            this.API = builder.API;
            this.service = builder.service;
            this.task = builder.task;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskyTasks create() {
            return builder().build();
        }

        /**
         * @return API
         */
        public String getAPI() {
            return this.API;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return task
         */
        public java.util.List < String > getTask() {
            return this.task;
        }

        /**
         * @return template
         */
        public java.util.List < String > getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String API; 
            private String service; 
            private java.util.List < String > task; 
            private java.util.List < String > template; 

            /**
             * The name of the operation that the high-risk task calls.
             */
            public Builder API(String API) {
                this.API = API;
                return this;
            }

            /**
             * The cloud service in which the high-risk task runs.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * The details of the high-risk task.
             */
            public Builder task(java.util.List < String > task) {
                this.task = task;
                return this;
            }

            /**
             * The details of templates to which the high-risk task belongs.
             */
            public Builder template(java.util.List < String > template) {
                this.template = template;
                return this;
            }

            public RiskyTasks build() {
                return new RiskyTasks(this);
            } 

        } 

    }
}
