// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetSemanticJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSemanticJobDetailResponseBody</p>
 */
public class GetSemanticJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSemanticJobDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSemanticJobDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSemanticJobDetailResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetSemanticJobDetailResponseBody build() {
            return new GetSemanticJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSemanticJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSemanticJobDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvanceSettings")
        private java.util.Map<String, ?> advanceSettings;

        @com.aliyun.core.annotation.NameInMap("CodeParameters")
        private String codeParameters;

        @com.aliyun.core.annotation.NameInMap("CurrentSqlIndex")
        private Integer currentSqlIndex;

        @com.aliyun.core.annotation.NameInMap("CustomerName")
        private String customerName;

        @com.aliyun.core.annotation.NameInMap("Datasource")
        private String datasource;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ExecTypes")
        private java.util.List<Integer> execTypes;

        @com.aliyun.core.annotation.NameInMap("ExecutorJobId")
        private String executorJobId;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceUrls")
        private java.util.List<java.util.Map<String, ?>> resourceUrls;

        @com.aliyun.core.annotation.NameInMap("Statuses")
        private java.util.List<Integer> statuses;

        private Data(Builder builder) {
            this.advanceSettings = builder.advanceSettings;
            this.codeParameters = builder.codeParameters;
            this.currentSqlIndex = builder.currentSqlIndex;
            this.customerName = builder.customerName;
            this.datasource = builder.datasource;
            this.env = builder.env;
            this.execTypes = builder.execTypes;
            this.executorJobId = builder.executorJobId;
            this.fileType = builder.fileType;
            this.projectId = builder.projectId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceUrls = builder.resourceUrls;
            this.statuses = builder.statuses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return advanceSettings
         */
        public java.util.Map<String, ?> getAdvanceSettings() {
            return this.advanceSettings;
        }

        /**
         * @return codeParameters
         */
        public String getCodeParameters() {
            return this.codeParameters;
        }

        /**
         * @return currentSqlIndex
         */
        public Integer getCurrentSqlIndex() {
            return this.currentSqlIndex;
        }

        /**
         * @return customerName
         */
        public String getCustomerName() {
            return this.customerName;
        }

        /**
         * @return datasource
         */
        public String getDatasource() {
            return this.datasource;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return execTypes
         */
        public java.util.List<Integer> getExecTypes() {
            return this.execTypes;
        }

        /**
         * @return executorJobId
         */
        public String getExecutorJobId() {
            return this.executorJobId;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceUrls
         */
        public java.util.List<java.util.Map<String, ?>> getResourceUrls() {
            return this.resourceUrls;
        }

        /**
         * @return statuses
         */
        public java.util.List<Integer> getStatuses() {
            return this.statuses;
        }

        public static final class Builder {
            private java.util.Map<String, ?> advanceSettings; 
            private String codeParameters; 
            private Integer currentSqlIndex; 
            private String customerName; 
            private String datasource; 
            private String env; 
            private java.util.List<Integer> execTypes; 
            private String executorJobId; 
            private Integer fileType; 
            private Long projectId; 
            private String resourceGroupId; 
            private java.util.List<java.util.Map<String, ?>> resourceUrls; 
            private java.util.List<Integer> statuses; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.advanceSettings = model.advanceSettings;
                this.codeParameters = model.codeParameters;
                this.currentSqlIndex = model.currentSqlIndex;
                this.customerName = model.customerName;
                this.datasource = model.datasource;
                this.env = model.env;
                this.execTypes = model.execTypes;
                this.executorJobId = model.executorJobId;
                this.fileType = model.fileType;
                this.projectId = model.projectId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceUrls = model.resourceUrls;
                this.statuses = model.statuses;
            } 

            /**
             * AdvanceSettings.
             */
            public Builder advanceSettings(java.util.Map<String, ?> advanceSettings) {
                this.advanceSettings = advanceSettings;
                return this;
            }

            /**
             * CodeParameters.
             */
            public Builder codeParameters(String codeParameters) {
                this.codeParameters = codeParameters;
                return this;
            }

            /**
             * CurrentSqlIndex.
             */
            public Builder currentSqlIndex(Integer currentSqlIndex) {
                this.currentSqlIndex = currentSqlIndex;
                return this;
            }

            /**
             * CustomerName.
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
                return this;
            }

            /**
             * Datasource.
             */
            public Builder datasource(String datasource) {
                this.datasource = datasource;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * ExecTypes.
             */
            public Builder execTypes(java.util.List<Integer> execTypes) {
                this.execTypes = execTypes;
                return this;
            }

            /**
             * ExecutorJobId.
             */
            public Builder executorJobId(String executorJobId) {
                this.executorJobId = executorJobId;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceUrls.
             */
            public Builder resourceUrls(java.util.List<java.util.Map<String, ?>> resourceUrls) {
                this.resourceUrls = resourceUrls;
                return this;
            }

            /**
             * Statuses.
             */
            public Builder statuses(java.util.List<Integer> statuses) {
                this.statuses = statuses;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
