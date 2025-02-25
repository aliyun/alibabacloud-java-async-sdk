// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TripTaskQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TripTaskQueryResponseBody</p>
 */
public class TripTaskQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TripTaskQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TripTaskQueryResponseBody create() {
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
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>module。</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TripTaskQueryResponseBody build() {
            return new TripTaskQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TripTaskQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TripTaskQueryResponseBody</p>
     */
    public static class RecordTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actioner")
        private String actioner;

        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_finished")
        private Long gmtFinished;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("node_id")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("out_result")
        private String outResult;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private RecordTasks(Builder builder) {
            this.actioner = builder.actioner;
            this.attributes = builder.attributes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtFinished = builder.gmtFinished;
            this.id = builder.id;
            this.nodeId = builder.nodeId;
            this.outResult = builder.outResult;
            this.owner = builder.owner;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordTasks create() {
            return builder().build();
        }

        /**
         * @return actioner
         */
        public String getActioner() {
            return this.actioner;
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtFinished
         */
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return outResult
         */
        public String getOutResult() {
            return this.outResult;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String actioner; 
            private String attributes; 
            private Long gmtCreate; 
            private Long gmtFinished; 
            private Long id; 
            private String nodeId; 
            private String outResult; 
            private String owner; 
            private String status; 

            /**
             * actioner.
             */
            public Builder actioner(String actioner) {
                this.actioner = actioner;
                return this;
            }

            /**
             * attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_finished.
             */
            public Builder gmtFinished(Long gmtFinished) {
                this.gmtFinished = gmtFinished;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * node_id.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * out_result.
             */
            public Builder outResult(String outResult) {
                this.outResult = outResult;
                return this;
            }

            /**
             * owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RecordTasks build() {
                return new RecordTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link TripTaskQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TripTaskQueryResponseBody</p>
     */
    public static class RunningTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actioner")
        private String actioner;

        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_finished")
        private Long gmtFinished;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("node_id")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("out_result")
        private String outResult;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private RunningTasks(Builder builder) {
            this.actioner = builder.actioner;
            this.attributes = builder.attributes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtFinished = builder.gmtFinished;
            this.id = builder.id;
            this.nodeId = builder.nodeId;
            this.outResult = builder.outResult;
            this.owner = builder.owner;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningTasks create() {
            return builder().build();
        }

        /**
         * @return actioner
         */
        public String getActioner() {
            return this.actioner;
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtFinished
         */
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return outResult
         */
        public String getOutResult() {
            return this.outResult;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String actioner; 
            private String attributes; 
            private Long gmtCreate; 
            private Long gmtFinished; 
            private Long id; 
            private String nodeId; 
            private String outResult; 
            private String owner; 
            private String status; 

            /**
             * actioner.
             */
            public Builder actioner(String actioner) {
                this.actioner = actioner;
                return this;
            }

            /**
             * attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_finished.
             */
            public Builder gmtFinished(Long gmtFinished) {
                this.gmtFinished = gmtFinished;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * node_id.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * out_result.
             */
            public Builder outResult(String outResult) {
                this.outResult = outResult;
                return this;
            }

            /**
             * owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RunningTasks build() {
                return new RunningTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link TripTaskQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TripTaskQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("needRefresh")
        private Boolean needRefresh;

        @com.aliyun.core.annotation.NameInMap("record_tasks")
        private java.util.List<RecordTasks> recordTasks;

        @com.aliyun.core.annotation.NameInMap("running_tasks")
        private java.util.List<RunningTasks> runningTasks;

        private Module(Builder builder) {
            this.needRefresh = builder.needRefresh;
            this.recordTasks = builder.recordTasks;
            this.runningTasks = builder.runningTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return needRefresh
         */
        public Boolean getNeedRefresh() {
            return this.needRefresh;
        }

        /**
         * @return recordTasks
         */
        public java.util.List<RecordTasks> getRecordTasks() {
            return this.recordTasks;
        }

        /**
         * @return runningTasks
         */
        public java.util.List<RunningTasks> getRunningTasks() {
            return this.runningTasks;
        }

        public static final class Builder {
            private Boolean needRefresh; 
            private java.util.List<RecordTasks> recordTasks; 
            private java.util.List<RunningTasks> runningTasks; 

            /**
             * needRefresh.
             */
            public Builder needRefresh(Boolean needRefresh) {
                this.needRefresh = needRefresh;
                return this;
            }

            /**
             * record_tasks.
             */
            public Builder recordTasks(java.util.List<RecordTasks> recordTasks) {
                this.recordTasks = recordTasks;
                return this;
            }

            /**
             * running_tasks.
             */
            public Builder runningTasks(java.util.List<RunningTasks> runningTasks) {
                this.runningTasks = runningTasks;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
