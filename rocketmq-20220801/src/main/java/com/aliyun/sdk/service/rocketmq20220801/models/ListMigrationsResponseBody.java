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
 * {@link ListMigrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMigrationsResponseBody</p>
 */
public class ListMigrationsResponseBody extends TeaModel {
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

    private ListMigrationsResponseBody(Builder builder) {
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

    public static ListMigrationsResponseBody create() {
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

        private Builder(ListMigrationsResponseBody model) {
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
         * <p>MissingInstanceId</p>
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
         * <p>instanceId</p>
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
         * <p>The instance cannot be found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E5897B2E-C3AC-56DC-A482-F0E9E53F48D5</p>
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

        public ListMigrationsResponseBody build() {
            return new ListMigrationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMigrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationsResponseBody</p>
     */
    public static class CurrentStage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stageData")
        private Object stageData;

        @com.aliyun.core.annotation.NameInMap("stageStatus")
        private String stageStatus;

        @com.aliyun.core.annotation.NameInMap("stageType")
        private String stageType;

        private CurrentStage(Builder builder) {
            this.stageData = builder.stageData;
            this.stageStatus = builder.stageStatus;
            this.stageType = builder.stageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentStage create() {
            return builder().build();
        }

        /**
         * @return stageData
         */
        public Object getStageData() {
            return this.stageData;
        }

        /**
         * @return stageStatus
         */
        public String getStageStatus() {
            return this.stageStatus;
        }

        /**
         * @return stageType
         */
        public String getStageType() {
            return this.stageType;
        }

        public static final class Builder {
            private Object stageData; 
            private String stageStatus; 
            private String stageType; 

            private Builder() {
            } 

            private Builder(CurrentStage model) {
                this.stageData = model.stageData;
                this.stageStatus = model.stageStatus;
                this.stageType = model.stageType;
            } 

            /**
             * <p>The stage data.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder stageData(Object stageData) {
                this.stageData = stageData;
                return this;
            }

            /**
             * <p>The stage status. Valid values:</p>
             * <ul>
             * <li>INIT: Not started.</li>
             * <li>DOING: In progress.</li>
             * <li>DONE: Completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DOING</p>
             */
            public Builder stageStatus(String stageStatus) {
                this.stageStatus = stageStatus;
                return this;
            }

            /**
             * <p>The stage type. Valid values:</p>
             * <ul>
             * <li>CONNECT_NETWORK: Network connection.</li>
             * <li>MIGRATE_METADATA: Metadata migration.</li>
             * <li>REPLACE_ENDPOINT: Endpoint replacement.</li>
             * <li>MIGRATE_MESSAGE: Message migration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MIGRATE_METADATA</p>
             */
            public Builder stageType(String stageType) {
                this.stageType = stageType;
                return this;
            }

            public CurrentStage build() {
                return new CurrentStage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationsResponseBody</p>
     */
    public static class MigrationSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sourceData")
        private Object sourceData;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private MigrationSource(Builder builder) {
            this.sourceData = builder.sourceData;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationSource create() {
            return builder().build();
        }

        /**
         * @return sourceData
         */
        public Object getSourceData() {
            return this.sourceData;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private Object sourceData; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(MigrationSource model) {
                this.sourceData = model.sourceData;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The migration source data.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;clusterType&quot;:&quot;INTERNET_NETWORK&quot;,
             * &quot;aclType&quot;:&quot;NONE&quot;,
             * &quot;clusterName&quot;:&quot;test&quot;,
             * &quot;namesrvAddrList&quot;:&quot;47.110.248.xxx:9876&quot;],
             * &quot;brokerObtainMethod&quot;:&quot;AUTO_OBTAIN&quot;
             * }</p>
             */
            public Builder sourceData(Object sourceData) {
                this.sourceData = sourceData;
                return this;
            }

            /**
             * <p>The migration source type. Valid values:</p>
             * <ul>
             * <li>EXTERNAL_INSTANCE: External instance.</li>
             * <li>INTERNAL_INSTANCE: Alibaba Cloud 5.0 instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXTERNAL_INSTANCE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public MigrationSource build() {
                return new MigrationSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationsResponseBody</p>
     */
    public static class MigrationTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetData")
        private Object targetData;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        private MigrationTarget(Builder builder) {
            this.targetData = builder.targetData;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationTarget create() {
            return builder().build();
        }

        /**
         * @return targetData
         */
        public Object getTargetData() {
            return this.targetData;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Object targetData; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(MigrationTarget model) {
                this.targetData = model.targetData;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The migration target data.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;clusterType&quot;:&quot;ROCKETMQ_V5&quot;,
             * &quot;instanceId&quot;:&quot;rmq-cn-778429mp301&quot;,
             * &quot;regionId&quot;:&quot;cn-hangzhou&quot;
             * }</p>
             */
            public Builder targetData(Object targetData) {
                this.targetData = targetData;
                return this;
            }

            /**
             * <p>The migration target type. Valid values:</p>
             * <ul>
             * <li>INTERNAL_INSTANCE: Alibaba Cloud 5.0 instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNAL_INSTANCE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public MigrationTarget build() {
                return new MigrationTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentStage")
        private CurrentStage currentStage;

        @com.aliyun.core.annotation.NameInMap("migrationId")
        private Long migrationId;

        @com.aliyun.core.annotation.NameInMap("migrationName")
        private String migrationName;

        @com.aliyun.core.annotation.NameInMap("migrationSource")
        private MigrationSource migrationSource;

        @com.aliyun.core.annotation.NameInMap("migrationStatus")
        private String migrationStatus;

        @com.aliyun.core.annotation.NameInMap("migrationTarget")
        private MigrationTarget migrationTarget;

        @com.aliyun.core.annotation.NameInMap("migrationType")
        private String migrationType;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private List(Builder builder) {
            this.createTime = builder.createTime;
            this.currentStage = builder.currentStage;
            this.migrationId = builder.migrationId;
            this.migrationName = builder.migrationName;
            this.migrationSource = builder.migrationSource;
            this.migrationStatus = builder.migrationStatus;
            this.migrationTarget = builder.migrationTarget;
            this.migrationType = builder.migrationType;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentStage
         */
        public CurrentStage getCurrentStage() {
            return this.currentStage;
        }

        /**
         * @return migrationId
         */
        public Long getMigrationId() {
            return this.migrationId;
        }

        /**
         * @return migrationName
         */
        public String getMigrationName() {
            return this.migrationName;
        }

        /**
         * @return migrationSource
         */
        public MigrationSource getMigrationSource() {
            return this.migrationSource;
        }

        /**
         * @return migrationStatus
         */
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        /**
         * @return migrationTarget
         */
        public MigrationTarget getMigrationTarget() {
            return this.migrationTarget;
        }

        /**
         * @return migrationType
         */
        public String getMigrationType() {
            return this.migrationType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createTime; 
            private CurrentStage currentStage; 
            private Long migrationId; 
            private String migrationName; 
            private MigrationSource migrationSource; 
            private String migrationStatus; 
            private MigrationTarget migrationTarget; 
            private String migrationType; 
            private String updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.createTime = model.createTime;
                this.currentStage = model.currentStage;
                this.migrationId = model.migrationId;
                this.migrationName = model.migrationName;
                this.migrationSource = model.migrationSource;
                this.migrationStatus = model.migrationStatus;
                this.migrationTarget = model.migrationTarget;
                this.migrationType = model.migrationType;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * <p>The creation time, in YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The current migration stage.</p>
             */
            public Builder currentStage(CurrentStage currentStage) {
                this.currentStage = currentStage;
                return this;
            }

            /**
             * <p>The migration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder migrationId(Long migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            /**
             * <p>The migration name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder migrationName(String migrationName) {
                this.migrationName = migrationName;
                return this;
            }

            /**
             * <p>The migration source.</p>
             */
            public Builder migrationSource(MigrationSource migrationSource) {
                this.migrationSource = migrationSource;
                return this;
            }

            /**
             * <p>The migration status. Valid values:</p>
             * <ul>
             * <li>CREATED: Created.</li>
             * <li>MIGRATING: Migrating.</li>
             * <li>COMPLETED: Completed.</li>
             * <li>CANCELLED: Cancelled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MIGRATING</p>
             */
            public Builder migrationStatus(String migrationStatus) {
                this.migrationStatus = migrationStatus;
                return this;
            }

            /**
             * <p>The migration target.</p>
             */
            public Builder migrationTarget(MigrationTarget migrationTarget) {
                this.migrationTarget = migrationTarget;
                return this;
            }

            /**
             * <p>The migration type. Valid values:</p>
             * <ul>
             * <li>INSTANCE_MIGRATION: instance migration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTANCE_MIGRATION</p>
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * <p>The modification time, in YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 20:05:50</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMigrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationsResponseBody</p>
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
             * <p>The paged data.</p>
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
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
