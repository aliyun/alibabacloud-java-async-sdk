// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListExecutorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListExecutorGroupResponseBody</p>
 */
public class ListExecutorGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListExecutorGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutorGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer code; 
        private Data data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListExecutorGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter check error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
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

        public ListExecutorGroupResponseBody build() {
            return new ListExecutorGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExecutorGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorGroupResponseBody</p>
     */
    public static class CiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private CiteList(Builder builder) {
            this.appName = builder.appName;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CiteList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String appName; 
            private String description; 

            private Builder() {
            } 

            private Builder(CiteList model) {
                this.appName = model.appName;
                this.description = model.description;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public CiteList build() {
                return new CiteList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExecutorGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorGroupResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("AutoScale")
        private Boolean autoScale;

        @com.aliyun.core.annotation.NameInMap("CiteList")
        private java.util.List<CiteList> citeList;

        @com.aliyun.core.annotation.NameInMap("CmsWorkspaceId")
        private String cmsWorkspaceId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IntegrationType")
        private String integrationType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("ResolvedWorkers")
        private String resolvedWorkers;

        @com.aliyun.core.annotation.NameInMap("WorkerId")
        private Long workerId;

        @com.aliyun.core.annotation.NameInMap("WorkerType")
        private String workerType;

        @com.aliyun.core.annotation.NameInMap("Workers")
        private String workers;

        @com.aliyun.core.annotation.NameInMap("XAttrs")
        private String xAttrs;

        private Records(Builder builder) {
            this.apiKey = builder.apiKey;
            this.authType = builder.authType;
            this.autoScale = builder.autoScale;
            this.citeList = builder.citeList;
            this.cmsWorkspaceId = builder.cmsWorkspaceId;
            this.description = builder.description;
            this.integrationType = builder.integrationType;
            this.name = builder.name;
            this.network = builder.network;
            this.protocol = builder.protocol;
            this.resolvedWorkers = builder.resolvedWorkers;
            this.workerId = builder.workerId;
            this.workerType = builder.workerType;
            this.workers = builder.workers;
            this.xAttrs = builder.xAttrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return autoScale
         */
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        /**
         * @return citeList
         */
        public java.util.List<CiteList> getCiteList() {
            return this.citeList;
        }

        /**
         * @return cmsWorkspaceId
         */
        public String getCmsWorkspaceId() {
            return this.cmsWorkspaceId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return integrationType
         */
        public String getIntegrationType() {
            return this.integrationType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return resolvedWorkers
         */
        public String getResolvedWorkers() {
            return this.resolvedWorkers;
        }

        /**
         * @return workerId
         */
        public Long getWorkerId() {
            return this.workerId;
        }

        /**
         * @return workerType
         */
        public String getWorkerType() {
            return this.workerType;
        }

        /**
         * @return workers
         */
        public String getWorkers() {
            return this.workers;
        }

        /**
         * @return xAttrs
         */
        public String getXAttrs() {
            return this.xAttrs;
        }

        public static final class Builder {
            private String apiKey; 
            private String authType; 
            private Boolean autoScale; 
            private java.util.List<CiteList> citeList; 
            private String cmsWorkspaceId; 
            private String description; 
            private String integrationType; 
            private String name; 
            private String network; 
            private String protocol; 
            private String resolvedWorkers; 
            private Long workerId; 
            private String workerType; 
            private String workers; 
            private String xAttrs; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.apiKey = model.apiKey;
                this.authType = model.authType;
                this.autoScale = model.autoScale;
                this.citeList = model.citeList;
                this.cmsWorkspaceId = model.cmsWorkspaceId;
                this.description = model.description;
                this.integrationType = model.integrationType;
                this.name = model.name;
                this.network = model.network;
                this.protocol = model.protocol;
                this.resolvedWorkers = model.resolvedWorkers;
                this.workerId = model.workerId;
                this.workerType = model.workerType;
                this.workers = model.workers;
                this.xAttrs = model.xAttrs;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * AutoScale.
             */
            public Builder autoScale(Boolean autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * CiteList.
             */
            public Builder citeList(java.util.List<CiteList> citeList) {
                this.citeList = citeList;
                return this;
            }

            /**
             * CmsWorkspaceId.
             */
            public Builder cmsWorkspaceId(String cmsWorkspaceId) {
                this.cmsWorkspaceId = cmsWorkspaceId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IntegrationType.
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
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
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * ResolvedWorkers.
             */
            public Builder resolvedWorkers(String resolvedWorkers) {
                this.resolvedWorkers = resolvedWorkers;
                return this;
            }

            /**
             * WorkerId.
             */
            public Builder workerId(Long workerId) {
                this.workerId = workerId;
                return this;
            }

            /**
             * WorkerType.
             */
            public Builder workerType(String workerType) {
                this.workerType = workerType;
                return this;
            }

            /**
             * Workers.
             */
            public Builder workers(String workers) {
                this.workers = workers;
                return this;
            }

            /**
             * XAttrs.
             */
            public Builder xAttrs(String xAttrs) {
                this.xAttrs = xAttrs;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExecutorGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListExecutorGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.total = model.total;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * Total.
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
