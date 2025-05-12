// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListExecutionRiskyTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutionRiskyTasksResponseBody</p>
 */
public class ListExecutionRiskyTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskyTasks")
    private java.util.List<RiskyTasks> riskyTasks;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RiskyTasks> getRiskyTasks() {
        return this.riskyTasks;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RiskyTasks> riskyTasks; 

        private Builder() {
        } 

        private Builder(ListExecutionRiskyTasksResponseBody model) {
            this.requestId = model.requestId;
            this.riskyTasks = model.riskyTasks;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C04B668D-D2DD-4B40-B6E9-0E3C4F53D5B5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about high-risk tasks.</p>
         */
        public Builder riskyTasks(java.util.List<RiskyTasks> riskyTasks) {
            this.riskyTasks = riskyTasks;
            return this;
        }

        public ListExecutionRiskyTasksResponseBody build() {
            return new ListExecutionRiskyTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutionRiskyTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutionRiskyTasksResponseBody</p>
     */
    public static class RiskyTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("API")
        private String API;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("Task")
        private java.util.List<String> task;

        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List<String> template;

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
        public java.util.List<String> getTask() {
            return this.task;
        }

        /**
         * @return template
         */
        public java.util.List<String> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String API; 
            private String service; 
            private java.util.List<String> task; 
            private java.util.List<String> template; 

            private Builder() {
            } 

            private Builder(RiskyTasks model) {
                this.API = model.API;
                this.service = model.service;
                this.task = model.task;
                this.template = model.template;
            } 

            /**
             * <p>The name of the operation that the high-risk task calls.</p>
             * 
             * <strong>example:</strong>
             * <p>DeleteInstance</p>
             */
            public Builder API(String API) {
                this.API = API;
                return this;
            }

            /**
             * <p>The cloud service in which the high-risk task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The details of the high-risk task.</p>
             */
            public Builder task(java.util.List<String> task) {
                this.task = task;
                return this;
            }

            /**
             * <p>The details of templates to which the high-risk task belongs.</p>
             */
            public Builder template(java.util.List<String> template) {
                this.template = template;
                return this;
            }

            public RiskyTasks build() {
                return new RiskyTasks(this);
            } 

        } 

    }
}
