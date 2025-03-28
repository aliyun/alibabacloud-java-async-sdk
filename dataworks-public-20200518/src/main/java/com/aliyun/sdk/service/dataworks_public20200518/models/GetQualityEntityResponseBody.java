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
 * {@link GetQualityEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityEntityResponseBody</p>
 */
public class GetQualityEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityEntityResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityEntityResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The information about the partition filter expression.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>401</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>You have no permission.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6d739ef6-098a-47****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityEntityResponseBody build() {
            return new GetQualityEntityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityEntityResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityEntityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EntityLevel")
        private Integer entityLevel;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Followers")
        private String followers;

        @com.aliyun.core.annotation.NameInMap("HasRelativeNode")
        private Boolean hasRelativeNode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MatchExpression")
        private String matchExpression;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("OnDuty")
        private String onDuty;

        @com.aliyun.core.annotation.NameInMap("OnDutyAccountName")
        private String onDutyAccountName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RelativeNode")
        private String relativeNode;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private Integer sql;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("Task")
        private Integer task;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.entityLevel = builder.entityLevel;
            this.envType = builder.envType;
            this.followers = builder.followers;
            this.hasRelativeNode = builder.hasRelativeNode;
            this.id = builder.id;
            this.matchExpression = builder.matchExpression;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.onDuty = builder.onDuty;
            this.onDutyAccountName = builder.onDutyAccountName;
            this.projectName = builder.projectName;
            this.relativeNode = builder.relativeNode;
            this.sql = builder.sql;
            this.tableName = builder.tableName;
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return entityLevel
         */
        public Integer getEntityLevel() {
            return this.entityLevel;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return followers
         */
        public String getFollowers() {
            return this.followers;
        }

        /**
         * @return hasRelativeNode
         */
        public Boolean getHasRelativeNode() {
            return this.hasRelativeNode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return matchExpression
         */
        public String getMatchExpression() {
            return this.matchExpression;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return onDuty
         */
        public String getOnDuty() {
            return this.onDuty;
        }

        /**
         * @return onDutyAccountName
         */
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return relativeNode
         */
        public String getRelativeNode() {
            return this.relativeNode;
        }

        /**
         * @return sql
         */
        public Integer getSql() {
            return this.sql;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return task
         */
        public Integer getTask() {
            return this.task;
        }

        public static final class Builder {
            private Long createTime; 
            private Integer entityLevel; 
            private String envType; 
            private String followers; 
            private Boolean hasRelativeNode; 
            private Long id; 
            private String matchExpression; 
            private Long modifyTime; 
            private String modifyUser; 
            private String onDuty; 
            private String onDutyAccountName; 
            private String projectName; 
            private String relativeNode; 
            private Integer sql; 
            private String tableName; 
            private Integer task; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.entityLevel = model.entityLevel;
                this.envType = model.envType;
                this.followers = model.followers;
                this.hasRelativeNode = model.hasRelativeNode;
                this.id = model.id;
                this.matchExpression = model.matchExpression;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.onDuty = model.onDuty;
                this.onDutyAccountName = model.onDutyAccountName;
                this.projectName = model.projectName;
                this.relativeNode = model.relativeNode;
                this.sql = model.sql;
                this.tableName = model.tableName;
                this.task = model.task;
            } 

            /**
             * <p>The time when the partition filter expression was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1593964800000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The level of the partition filter expression. Valid values:</p>
             * <ul>
             * <li>0: The partition filter expression is at the SQL level. This indicates that the system checks data quality after each SQL statement is executed.</li>
             * <li>1: The partition filter expression is at the node level. This indicates that the system checks data quality after all the SQL statements for a node are executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder entityLevel(Integer entityLevel) {
                this.entityLevel = entityLevel;
                return this;
            }

            /**
             * <p>The type of the compute engine instance or data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to receive alert notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>1822931****</p>
             */
            public Builder followers(String followers) {
                this.followers = followers;
                return this;
            }

            /**
             * <p>Indicates whether the partition filter expression is associated with a node. Valid values:</p>
             * <ul>
             * <li>true: The partition filter expression is associated with a node.</li>
             * <li>false: The partition filter expression is not associated with a node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasRelativeNode(Boolean hasRelativeNode) {
                this.hasRelativeNode = hasRelativeNode;
                return this;
            }

            /**
             * <p>The ID of the partition filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>4003918</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The partition filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>dt=$[yyyymmdd-1]</p>
             */
            public Builder matchExpression(String matchExpression) {
                this.matchExpression = matchExpression;
                return this;
            }

            /**
             * <p>The time when the partition filter expression was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1593964800000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to modify the partition filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>1822931****</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to configure the partition filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>1822931****</p>
             */
            public Builder onDuty(String onDuty) {
                this.onDuty = onDuty;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account that is used to configure the partition filter expression.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder onDutyAccountName(String onDutyAccountName) {
                this.onDutyAccountName = onDutyAccountName;
                return this;
            }

            /**
             * <p>The name of the compute engine instance or data source.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The information about the node with which the partition filter expression is associated. The information includes the following items:</p>
             * <ul>
             * <li>ProjectName: the name of the workspace to which the node belongs.</li>
             * <li>NodeID: the ID of the node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;projectName&quot;:&quot;xc_DP****&quot;,&quot;nodeId&quot;:7000026****}]</p>
             */
            public Builder relativeNode(String relativeNode) {
                this.relativeNode = relativeNode;
                return this;
            }

            /**
             * <p>Indicates that the partition filter expression is at the SQL level.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sql(Integer sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The name of the partitioned table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_dqc_de****</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The node.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder task(Integer task) {
                this.task = task;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
