// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityEntityResponseBody</p>
 */
public class GetQualityEntityResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
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

        public GetQualityEntityResponseBody build() {
            return new GetQualityEntityResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EntityLevel")
        private Integer entityLevel;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Followers")
        private String followers;

        @NameInMap("HasRelativeNode")
        private Boolean hasRelativeNode;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MatchExpression")
        private String matchExpression;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("ModifyUser")
        private String modifyUser;

        @NameInMap("OnDuty")
        private String onDuty;

        @NameInMap("OnDutyAccountName")
        private String onDutyAccountName;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("RelativeNode")
        private String relativeNode;

        @NameInMap("Sql")
        private Integer sql;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("Task")
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

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EntityLevel.
             */
            public Builder entityLevel(Integer entityLevel) {
                this.entityLevel = entityLevel;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Followers.
             */
            public Builder followers(String followers) {
                this.followers = followers;
                return this;
            }

            /**
             * HasRelativeNode.
             */
            public Builder hasRelativeNode(Boolean hasRelativeNode) {
                this.hasRelativeNode = hasRelativeNode;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MatchExpression.
             */
            public Builder matchExpression(String matchExpression) {
                this.matchExpression = matchExpression;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * OnDuty.
             */
            public Builder onDuty(String onDuty) {
                this.onDuty = onDuty;
                return this;
            }

            /**
             * OnDutyAccountName.
             */
            public Builder onDutyAccountName(String onDutyAccountName) {
                this.onDutyAccountName = onDutyAccountName;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * RelativeNode.
             */
            public Builder relativeNode(String relativeNode) {
                this.relativeNode = relativeNode;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(Integer sql) {
                this.sql = sql;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Task.
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
