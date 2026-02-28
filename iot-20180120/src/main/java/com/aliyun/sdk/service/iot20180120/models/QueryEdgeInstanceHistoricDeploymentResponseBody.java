// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeInstanceHistoricDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceHistoricDeploymentResponseBody</p>
 */
public class QueryEdgeInstanceHistoricDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEdgeInstanceHistoricDeploymentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeInstanceHistoricDeploymentResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryEdgeInstanceHistoricDeploymentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned if the call was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C9D9C91B-1B3B-4D84-BE58-68E7B2A989E4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeInstanceHistoricDeploymentResponseBody build() {
            return new QueryEdgeInstanceHistoricDeploymentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeInstanceHistoricDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceHistoricDeploymentResponseBody</p>
     */
    public static class DeploymentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentId")
        private String deploymentId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCompleted")
        private String gmtCompleted;

        @com.aliyun.core.annotation.NameInMap("GmtCompletedTimestamp")
        private Long gmtCompletedTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DeploymentList(Builder builder) {
            this.deploymentId = builder.deploymentId;
            this.description = builder.description;
            this.gmtCompleted = builder.gmtCompleted;
            this.gmtCompletedTimestamp = builder.gmtCompletedTimestamp;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentList create() {
            return builder().build();
        }

        /**
         * @return deploymentId
         */
        public String getDeploymentId() {
            return this.deploymentId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCompleted
         */
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        /**
         * @return gmtCompletedTimestamp
         */
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String deploymentId; 
            private String description; 
            private String gmtCompleted; 
            private Long gmtCompletedTimestamp; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 
            private Integer status; 
            private String type; 

            private Builder() {
            } 

            private Builder(DeploymentList model) {
                this.deploymentId = model.deploymentId;
                this.description = model.description;
                this.gmtCompleted = model.gmtCompleted;
                this.gmtCompletedTimestamp = model.gmtCompletedTimestamp;
                this.gmtCreate = model.gmtCreate;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>e4803e566b424fa68e7f4b1c747c****</p>
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * <p>The description of the deployment task.</p>
             * 
             * <strong>example:</strong>
             * <p>deploy_1561694817061</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the deployment task was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-28 12:07:16</p>
             */
            public Builder gmtCompleted(String gmtCompleted) {
                this.gmtCompleted = gmtCompleted;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment task was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCompletedTimestamp(Long gmtCompletedTimestamp) {
                this.gmtCompletedTimestamp = gmtCompletedTimestamp;
                return this;
            }

            /**
             * <p>The time when the deployment task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 18:12:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the deployment task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * <p>The last time when the deployment task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-28 12:07:16</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The last UNIX timestamp when the deployment task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * <p>The status of the deployment task.</p>
             * <ul>
             * <li>0: The task was not started.</li>
             * <li>1: The task was being processed.</li>
             * <li>2: The task was successful.</li>
             * <li>3: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the deployment task.</p>
             * <ul>
             * <li>deploy: deploys the edge instance.</li>
             * <li>reset: resets the edge instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deploy</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DeploymentList build() {
                return new DeploymentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceHistoricDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceHistoricDeploymentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("DeploymentList")
        private java.util.List<DeploymentList> deploymentList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.deploymentList = builder.deploymentList;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return deploymentList
         */
        public java.util.List<DeploymentList> getDeploymentList() {
            return this.deploymentList;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<DeploymentList> deploymentList; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.deploymentList = model.deploymentList;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The list of deployment tasks.</p>
             */
            public Builder deploymentList(java.util.List<DeploymentList> deploymentList) {
                this.deploymentList = deploymentList;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of deployment tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
