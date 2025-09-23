// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ExecuteMigrationOperationResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteMigrationOperationResponseBody</p>
 */
public class ExecuteMigrationOperationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ExecuteMigrationOperationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteMigrationOperationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecuteMigrationOperationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * dynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * dynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ExecuteMigrationOperationResponseBody build() {
            return new ExecuteMigrationOperationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteMigrationOperationResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteMigrationOperationResponseBody</p>
     */
    public static class OperationParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("paramData")
        private Object paramData;

        private OperationParam(Builder builder) {
            this.paramData = builder.paramData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationParam create() {
            return builder().build();
        }

        /**
         * @return paramData
         */
        public Object getParamData() {
            return this.paramData;
        }

        public static final class Builder {
            private Object paramData; 

            private Builder() {
            } 

            private Builder(OperationParam model) {
                this.paramData = model.paramData;
            } 

            /**
             * paramData.
             */
            public Builder paramData(Object paramData) {
                this.paramData = paramData;
                return this;
            }

            public OperationParam build() {
                return new OperationParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteMigrationOperationResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteMigrationOperationResponseBody</p>
     */
    public static class OperationResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resultData")
        private Object resultData;

        private OperationResult(Builder builder) {
            this.resultData = builder.resultData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationResult create() {
            return builder().build();
        }

        /**
         * @return resultData
         */
        public Object getResultData() {
            return this.resultData;
        }

        public static final class Builder {
            private Object resultData; 

            private Builder() {
            } 

            private Builder(OperationResult model) {
                this.resultData = model.resultData;
            } 

            /**
             * resultData.
             */
            public Builder resultData(Object resultData) {
                this.resultData = resultData;
                return this;
            }

            public OperationResult build() {
                return new OperationResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteMigrationOperationResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteMigrationOperationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("businessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("migrationId")
        private Long migrationId;

        @com.aliyun.core.annotation.NameInMap("operationId")
        private Long operationId;

        @com.aliyun.core.annotation.NameInMap("operationKey")
        private String operationKey;

        @com.aliyun.core.annotation.NameInMap("operationParam")
        private OperationParam operationParam;

        @com.aliyun.core.annotation.NameInMap("operationResult")
        private OperationResult operationResult;

        @com.aliyun.core.annotation.NameInMap("operationStatus")
        private String operationStatus;

        @com.aliyun.core.annotation.NameInMap("operationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("stageType")
        private String stageType;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.createTime = builder.createTime;
            this.migrationId = builder.migrationId;
            this.operationId = builder.operationId;
            this.operationKey = builder.operationKey;
            this.operationParam = builder.operationParam;
            this.operationResult = builder.operationResult;
            this.operationStatus = builder.operationStatus;
            this.operationType = builder.operationType;
            this.stageType = builder.stageType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return migrationId
         */
        public Long getMigrationId() {
            return this.migrationId;
        }

        /**
         * @return operationId
         */
        public Long getOperationId() {
            return this.operationId;
        }

        /**
         * @return operationKey
         */
        public String getOperationKey() {
            return this.operationKey;
        }

        /**
         * @return operationParam
         */
        public OperationParam getOperationParam() {
            return this.operationParam;
        }

        /**
         * @return operationResult
         */
        public OperationResult getOperationResult() {
            return this.operationResult;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return stageType
         */
        public String getStageType() {
            return this.stageType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String businessStatus; 
            private String createTime; 
            private Long migrationId; 
            private Long operationId; 
            private String operationKey; 
            private OperationParam operationParam; 
            private OperationResult operationResult; 
            private String operationStatus; 
            private String operationType; 
            private String stageType; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.businessStatus = model.businessStatus;
                this.createTime = model.createTime;
                this.migrationId = model.migrationId;
                this.operationId = model.operationId;
                this.operationKey = model.operationKey;
                this.operationParam = model.operationParam;
                this.operationResult = model.operationResult;
                this.operationStatus = model.operationStatus;
                this.operationType = model.operationType;
                this.stageType = model.stageType;
                this.updateTime = model.updateTime;
            } 

            /**
             * businessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * migrationId.
             */
            public Builder migrationId(Long migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            /**
             * operationId.
             */
            public Builder operationId(Long operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * operationKey.
             */
            public Builder operationKey(String operationKey) {
                this.operationKey = operationKey;
                return this;
            }

            /**
             * operationParam.
             */
            public Builder operationParam(OperationParam operationParam) {
                this.operationParam = operationParam;
                return this;
            }

            /**
             * operationResult.
             */
            public Builder operationResult(OperationResult operationResult) {
                this.operationResult = operationResult;
                return this;
            }

            /**
             * operationStatus.
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * operationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * stageType.
             */
            public Builder stageType(String stageType) {
                this.stageType = stageType;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
