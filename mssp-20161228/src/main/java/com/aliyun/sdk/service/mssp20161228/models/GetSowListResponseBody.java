// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSowListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSowListResponseBody</p>
 */
public class GetSowListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSowListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSowListResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Interface response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Prompt information for the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FA8883BC-CB18-5E28-A113-8249917CA05E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSowListResponseBody build() {
            return new GetSowListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSowListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSowListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("OperateRemark")
        private String operateRemark;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Integer recordCount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TaskTypeName")
        private String taskTypeName;

        @com.aliyun.core.annotation.NameInMap("WorkOrderName")
        private String workOrderName;

        private Data(Builder builder) {
            this.completeTime = builder.completeTime;
            this.operateRemark = builder.operateRemark;
            this.progress = builder.progress;
            this.recordCount = builder.recordCount;
            this.startTime = builder.startTime;
            this.taskTypeName = builder.taskTypeName;
            this.workOrderName = builder.workOrderName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return operateRemark
         */
        public String getOperateRemark() {
            return this.operateRemark;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return recordCount
         */
        public Integer getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskTypeName
         */
        public String getTaskTypeName() {
            return this.taskTypeName;
        }

        /**
         * @return workOrderName
         */
        public String getWorkOrderName() {
            return this.workOrderName;
        }

        public static final class Builder {
            private String completeTime; 
            private String operateRemark; 
            private String progress; 
            private Integer recordCount; 
            private String startTime; 
            private String taskTypeName; 
            private String workOrderName; 

            /**
             * <p>Completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-28 16:19:35</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>Operation remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>新建</p>
             */
            public Builder operateRemark(String operateRemark) {
                this.operateRemark = operateRemark;
                return this;
            }

            /**
             * <p>Progress.</p>
             * 
             * <strong>example:</strong>
             * <p>IN_PREPARATION</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Record count.</p>
             * 
             * <strong>example:</strong>
             * <p>173</p>
             */
            public Builder recordCount(Integer recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * <p>Start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-24 16:51:26</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Task type.</p>
             * 
             * <strong>example:</strong>
             * <p>安全风险评估</p>
             */
            public Builder taskTypeName(String taskTypeName) {
                this.taskTypeName = taskTypeName;
                return this;
            }

            /**
             * <p>Work order name.</p>
             * 
             * <strong>example:</strong>
             * <p>安全产品配置问题与超量提醒</p>
             */
            public Builder workOrderName(String workOrderName) {
                this.workOrderName = workOrderName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
