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
         * <p>The sharing rules of the data source.</p>
         */
        public Builder dataSourceSharedRules(java.util.List < DataSourceSharedRules> dataSourceSharedRules) {
            this.dataSourceSharedRules = dataSourceSharedRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
             * <p>The time when the rule was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1724379762000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who creates the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The data source ID. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to query the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the data source in the destination workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>targetProject.datasource</p>
             */
            public Builder sharedDataSourceName(String sharedDataSourceName) {
                this.sharedDataSourceName = sharedDataSourceName;
                return this;
            }

            /**
             * <p>The user in the workspace to which the data source is shared. If the data source is shared to the entire workspace, this parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sharedUser(String sharedUser) {
                this.sharedUser = sharedUser;
                return this;
            }

            /**
             * <p>The ID of the workspace with which the data source is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceProjectId(Long sourceProjectId) {
                this.sourceProjectId = sourceProjectId;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the data source is shared.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
