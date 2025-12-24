// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link UpdateExecutorsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExecutorsResponseBody</p>
 */
public class UpdateExecutorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateExecutorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExecutorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateExecutorsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
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

        public UpdateExecutorsResponseBody build() {
            return new UpdateExecutorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateExecutorsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExecutorsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        private Long appGroupId;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private Integer appType;

        @com.aliyun.core.annotation.NameInMap("FailedService")
        private String failedService;

        @com.aliyun.core.annotation.NameInMap("WorkId")
        private Integer workId;

        @com.aliyun.core.annotation.NameInMap("WorkerType")
        private String workerType;

        @com.aliyun.core.annotation.NameInMap("Workers")
        private String workers;

        private Data(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appType = builder.appType;
            this.failedService = builder.failedService;
            this.workId = builder.workId;
            this.workerType = builder.workerType;
            this.workers = builder.workers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appType
         */
        public Integer getAppType() {
            return this.appType;
        }

        /**
         * @return failedService
         */
        public String getFailedService() {
            return this.failedService;
        }

        /**
         * @return workId
         */
        public Integer getWorkId() {
            return this.workId;
        }

        /**
         * @return workerType
         */
        public String getWorkerType() {
            return this.workerType;
        }

        /**
         * @return workers
         */
        public String getWorkers() {
            return this.workers;
        }

        public static final class Builder {
            private Long appGroupId; 
            private Integer appType; 
            private String failedService; 
            private Integer workId; 
            private String workerType; 
            private String workers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appGroupId = model.appGroupId;
                this.appType = model.appType;
                this.failedService = model.failedService;
                this.workId = model.workId;
                this.workerType = model.workerType;
                this.workers = model.workers;
            } 

            /**
             * AppGroupId.
             */
            public Builder appGroupId(Long appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(Integer appType) {
                this.appType = appType;
                return this;
            }

            /**
             * FailedService.
             */
            public Builder failedService(String failedService) {
                this.failedService = failedService;
                return this;
            }

            /**
             * WorkId.
             */
            public Builder workId(Integer workId) {
                this.workId = workId;
                return this;
            }

            /**
             * WorkerType.
             */
            public Builder workerType(String workerType) {
                this.workerType = workerType;
                return this;
            }

            /**
             * Workers.
             */
            public Builder workers(String workers) {
                this.workers = workers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
