// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link UpdateDataAgentAccuracyTestResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDataAgentAccuracyTestResponseBody</p>
 */
public class UpdateDataAgentAccuracyTestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private UpdateDataAgentAccuracyTestResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAgentAccuracyTestResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(UpdateDataAgentAccuracyTestResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-xxx-FD8AD04A63B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.                                 </li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public UpdateDataAgentAccuracyTestResponseBody build() {
            return new UpdateDataAgentAccuracyTestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataAgentAccuracyTestResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDataAgentAccuracyTestResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccuracyTest")
        private String accuracyTest;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("Dataset")
        private String dataset;

        @com.aliyun.core.annotation.NameInMap("Datasource")
        private String datasource;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("EvaluationPrompt")
        private String evaluationPrompt;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrent")
        private Integer maxConcurrent;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedDelete")
        private Boolean needDelete;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.accuracyTest = builder.accuracyTest;
            this.agentId = builder.agentId;
            this.dataset = builder.dataset;
            this.datasource = builder.datasource;
            this.desc = builder.desc;
            this.evaluationPrompt = builder.evaluationPrompt;
            this.fileId = builder.fileId;
            this.maxConcurrent = builder.maxConcurrent;
            this.mode = builder.mode;
            this.name = builder.name;
            this.needDelete = builder.needDelete;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accuracyTest
         */
        public String getAccuracyTest() {
            return this.accuracyTest;
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return dataset
         */
        public String getDataset() {
            return this.dataset;
        }

        /**
         * @return datasource
         */
        public String getDatasource() {
            return this.datasource;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return evaluationPrompt
         */
        public String getEvaluationPrompt() {
            return this.evaluationPrompt;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return maxConcurrent
         */
        public Integer getMaxConcurrent() {
            return this.maxConcurrent;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needDelete
         */
        public Boolean getNeedDelete() {
            return this.needDelete;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accuracyTest; 
            private String agentId; 
            private String dataset; 
            private String datasource; 
            private String desc; 
            private String evaluationPrompt; 
            private String fileId; 
            private Integer maxConcurrent; 
            private Integer mode; 
            private String name; 
            private Boolean needDelete; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accuracyTest = model.accuracyTest;
                this.agentId = model.agentId;
                this.dataset = model.dataset;
                this.datasource = model.datasource;
                this.desc = model.desc;
                this.evaluationPrompt = model.evaluationPrompt;
                this.fileId = model.fileId;
                this.maxConcurrent = model.maxConcurrent;
                this.mode = model.mode;
                this.name = model.name;
                this.needDelete = model.needDelete;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The ID of the accuracy test item.</p>
             * 
             * <strong>example:</strong>
             * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
             */
            public Builder accuracyTest(String accuracyTest) {
                this.accuracyTest = accuracyTest;
                return this;
            }

            /**
             * <p>Agent Id</p>
             * 
             * <strong>example:</strong>
             * <p>cu0cs*******mf</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The data source. We recommend that you configure this parameter in a custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;DataSourceType\&quot;:\&quot;database\&quot;,\&quot;RegionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;DmsInstanceId\&quot;:\&quot;27xxxxx\&quot;,\&quot;DmsDatabaseId\&quot;:\&quot;752xxxxx\&quot;,\&quot;Database\&quot;:\&quot;employees\&quot;,\&quot;Tables\&quot;:[\&quot;employees\&quot;,\&quot;salaries\&quot;,\&quot;departments\&quot;]}]</p>
             */
            public Builder dataset(String dataset) {
                this.dataset = dataset;
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
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The accuracy evaluation criteria. An empty value indicates the default criteria.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder evaluationPrompt(String evaluationPrompt) {
                this.evaluationPrompt = evaluationPrompt;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f-8*******01m</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * MaxConcurrent.
             */
            public Builder maxConcurrent(Integer maxConcurrent) {
                this.maxConcurrent = maxConcurrent;
                return this;
            }

            /**
             * <p>The analysis mode.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NeedDelete.
             */
            public Builder needDelete(Boolean needDelete) {
                this.needDelete = needDelete;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8wfig6l33n4f4xxxxxxxxxx</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
