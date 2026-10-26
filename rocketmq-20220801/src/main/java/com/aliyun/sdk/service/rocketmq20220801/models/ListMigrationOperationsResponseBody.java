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
 * {@link ListMigrationOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMigrationOperationsResponseBody</p>
 */
public class ListMigrationOperationsResponseBody extends TeaModel {
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

    private ListMigrationOperationsResponseBody(Builder builder) {
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

    public static ListMigrationOperationsResponseBody create() {
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

        private Builder(ListMigrationOperationsResponseBody model) {
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>consumerGroupId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The topic already exists.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7E8AE3A-219B-52EE-BE32-4036F5F88833</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListMigrationOperationsResponseBody build() {
            return new ListMigrationOperationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMigrationOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationOperationsResponseBody</p>
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
             * <p>The parameter information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;action&quot;: &quot;MIGRATE_FORWARD&quot;,
             *       &quot;targetStage&quot;: &quot;MIGRATE_FINISH&quot;
             * }</p>
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
     * {@link ListMigrationOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationOperationsResponseBody</p>
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
             * <p>The operation result.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;checkStatus&quot;: &quot;WAIT_CHECK&quot;,
             *       &quot;sourceTopicStatus&quot;: &quot;PERM_6&quot;,
             *       &quot;targetTopicStatus&quot;: &quot;PERM_4&quot;,
             *       &quot;checkResult&quot;: {},
             *       &quot;migrateStage&quot;: &quot;DOUBLE_READ&quot;
             * }</p>
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
     * {@link ListMigrationOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationOperationsResponseBody</p>
     */
    public static class List extends TeaModel {
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

        private List(Builder builder) {
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

        public static List create() {
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

            private Builder(List model) {
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
             * <p>The operation business status.</p>
             * 
             * <strong>example:</strong>
             * <p>DOUBLE_READ</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The creation time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The migration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder migrationId(Long migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            /**
             * <p>The migration operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>183</p>
             */
            public Builder operationId(Long operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The primary key of the operation object.</p>
             * <blockquote>
             * <ul>
             * <li>During the message migration stage, the operation object is the topic name.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>normal-topic-1</p>
             */
            public Builder operationKey(String operationKey) {
                this.operationKey = operationKey;
                return this;
            }

            /**
             * <p>The operation parameter.</p>
             */
            public Builder operationParam(OperationParam operationParam) {
                this.operationParam = operationParam;
                return this;
            }

            /**
             * <p>The operation result.</p>
             */
            public Builder operationResult(OperationResult operationResult) {
                this.operationResult = operationResult;
                return this;
            }

            /**
             * <p>The operation status.</p>
             * 
             * <strong>example:</strong>
             * <p>DOING</p>
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * <p>The operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>MIGRATE_MESSAGE</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The migration stage type.</p>
             * 
             * <strong>example:</strong>
             * <p>MIGRATE_MESSAGE</p>
             */
            public Builder stageType(String stageType) {
                this.stageType = stageType;
                return this;
            }

            /**
             * <p>The update time, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 20:05:50</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationOperationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The paginated data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
