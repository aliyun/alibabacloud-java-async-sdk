// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataSourceSharedRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceSharedRulesResponseBody</p>
 */
public class ListDataSourceSharedRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceSharedRules")
    private java.util.List < DataSourceSharedRules> dataSourceSharedRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataSourceSharedRulesResponseBody(Builder builder) {
        this.dataSourceSharedRules = builder.dataSourceSharedRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceSharedRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSourceSharedRules
     */
    public java.util.List < DataSourceSharedRules> getDataSourceSharedRules() {
        return this.dataSourceSharedRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataSourceSharedRules> dataSourceSharedRules; 
        private String requestId; 

        /**
         * DataSourceSharedRules.
         */
        public Builder dataSourceSharedRules(java.util.List < DataSourceSharedRules> dataSourceSharedRules) {
            this.dataSourceSharedRules = dataSourceSharedRules;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataSourceSharedRulesResponseBody build() {
            return new ListDataSourceSharedRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceSharedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceSharedRulesResponseBody</p>
     */
    public static class DataSourceSharedRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SharedDataSourceName")
        private String sharedDataSourceName;

        @com.aliyun.core.annotation.NameInMap("SharedUser")
        private String sharedUser;

        @com.aliyun.core.annotation.NameInMap("SourceProjectId")
        private Long sourceProjectId;

        @com.aliyun.core.annotation.NameInMap("TargetProjectId")
        private Long targetProjectId;

        private DataSourceSharedRules(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataSourceId = builder.dataSourceId;
            this.envType = builder.envType;
            this.id = builder.id;
            this.sharedDataSourceName = builder.sharedDataSourceName;
            this.sharedUser = builder.sharedUser;
            this.sourceProjectId = builder.sourceProjectId;
            this.targetProjectId = builder.targetProjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceSharedRules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sharedDataSourceName
         */
        public String getSharedDataSourceName() {
            return this.sharedDataSourceName;
        }

        /**
         * @return sharedUser
         */
        public String getSharedUser() {
            return this.sharedUser;
        }

        /**
         * @return sourceProjectId
         */
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        /**
         * @return targetProjectId
         */
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        public static final class Builder {
            private Long createTime; 
            private String createUser; 
            private Long dataSourceId; 
            private String envType; 
            private Long id; 
            private String sharedDataSourceName; 
            private String sharedUser; 
            private Long sourceProjectId; 
            private Long targetProjectId; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * SharedDataSourceName.
             */
            public Builder sharedDataSourceName(String sharedDataSourceName) {
                this.sharedDataSourceName = sharedDataSourceName;
                return this;
            }

            /**
             * SharedUser.
             */
            public Builder sharedUser(String sharedUser) {
                this.sharedUser = sharedUser;
                return this;
            }

            /**
             * SourceProjectId.
             */
            public Builder sourceProjectId(Long sourceProjectId) {
                this.sourceProjectId = sourceProjectId;
                return this;
            }

            /**
             * TargetProjectId.
             */
            public Builder targetProjectId(Long targetProjectId) {
                this.targetProjectId = targetProjectId;
                return this;
            }

            public DataSourceSharedRules build() {
                return new DataSourceSharedRules(this);
            } 

        } 

    }
}
