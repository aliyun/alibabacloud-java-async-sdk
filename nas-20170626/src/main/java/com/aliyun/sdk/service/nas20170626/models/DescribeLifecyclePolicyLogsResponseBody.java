// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeLifecyclePolicyLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecyclePolicyLogsResponseBody</p>
 */
public class DescribeLifecyclePolicyLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyLogs")
    private java.util.List<LifecyclePolicyLogs> lifecyclePolicyLogs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLifecyclePolicyLogsResponseBody(Builder builder) {
        this.lifecyclePolicyLogs = builder.lifecyclePolicyLogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLifecyclePolicyLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lifecyclePolicyLogs
     */
    public java.util.List<LifecyclePolicyLogs> getLifecyclePolicyLogs() {
        return this.lifecyclePolicyLogs;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<LifecyclePolicyLogs> lifecyclePolicyLogs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeLifecyclePolicyLogsResponseBody model) {
            this.lifecyclePolicyLogs = model.lifecyclePolicyLogs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The execution logs of the lifecycle management policy.</p>
         */
        public Builder lifecyclePolicyLogs(java.util.List<LifecyclePolicyLogs> lifecyclePolicyLogs) {
            this.lifecyclePolicyLogs = lifecyclePolicyLogs;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of log entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request status. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLifecyclePolicyLogsResponseBody build() {
            return new DescribeLifecyclePolicyLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLifecyclePolicyLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLifecyclePolicyLogsResponseBody</p>
     */
    public static class DeleteRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private DeleteRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteRules create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String attribute; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(DeleteRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The attribute of the rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Atime: the last access time of the file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Atime</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The threshold of the rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>If Attribute is set to Atime, this parameter specifies the number of days since the file was last accessed. Valid values: 1 to 365.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public DeleteRules build() {
                return new DeleteRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLifecyclePolicyLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLifecyclePolicyLogsResponseBody</p>
     */
    public static class RetrieveRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private RetrieveRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetrieveRules create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String attribute; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(RetrieveRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The attribute of the rule. Valid values:</p>
             * <ul>
             * <li>RetrieveType: the retrieval method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RetrieveType</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The threshold of the rule. Valid values:</p>
             * <ul>
             * <li>RetrieveType<ul>
             * <li>AfterVisit: Supported when LifecyclePolicyType=Auto. Indicates best-effort recall on visit.</li>
             * <li>All: Supported when LifecyclePolicyType=OnDemand. Indicates retrieving all data.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public RetrieveRules build() {
                return new RetrieveRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLifecyclePolicyLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLifecyclePolicyLogsResponseBody</p>
     */
    public static class TransitRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private TransitRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRules create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String attribute; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(TransitRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The attribute of the rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Atime: the last access time of the file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Atime</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The threshold of the rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>If Attribute is set to Atime, this parameter specifies the number of days since the file was last accessed. Valid values: 1 to 365.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public TransitRules build() {
                return new TransitRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLifecyclePolicyLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLifecyclePolicyLogsResponseBody</p>
     */
    public static class LifecyclePolicyLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeleteRules")
        private java.util.List<DeleteRules> deleteRules;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("RetrieveRules")
        private java.util.List<RetrieveRules> retrieveRules;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TransitRules")
        private java.util.List<TransitRules> transitRules;

        private LifecyclePolicyLogs(Builder builder) {
            this.createTime = builder.createTime;
            this.deleteRules = builder.deleteRules;
            this.paths = builder.paths;
            this.retrieveRules = builder.retrieveRules;
            this.status = builder.status;
            this.storageType = builder.storageType;
            this.summary = builder.summary;
            this.transitRules = builder.transitRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecyclePolicyLogs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleteRules
         */
        public java.util.List<DeleteRules> getDeleteRules() {
            return this.deleteRules;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return retrieveRules
         */
        public java.util.List<RetrieveRules> getRetrieveRules() {
            return this.retrieveRules;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return transitRules
         */
        public java.util.List<TransitRules> getTransitRules() {
            return this.transitRules;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<DeleteRules> deleteRules; 
            private java.util.List<String> paths; 
            private java.util.List<RetrieveRules> retrieveRules; 
            private String status; 
            private String storageType; 
            private String summary; 
            private java.util.List<TransitRules> transitRules; 

            private Builder() {
            } 

            private Builder(LifecyclePolicyLogs model) {
                this.createTime = model.createTime;
                this.deleteRules = model.deleteRules;
                this.paths = model.paths;
                this.retrieveRules = model.retrieveRules;
                this.status = model.status;
                this.storageType = model.storageType;
                this.summary = model.summary;
                this.transitRules = model.transitRules;
            } 

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-20T02:25:07Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The file data expiration and deletion rules. A maximum of one rule can be configured.</p>
             */
            public Builder deleteRules(java.util.List<DeleteRules> deleteRules) {
                this.deleteRules = deleteRules;
                return this;
            }

            /**
             * <p>The execution paths of the specified retrieval task.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The file data retrieval rules.</p>
             */
            public Builder retrieveRules(java.util.List<RetrieveRules> retrieveRules) {
                this.retrieveRules = retrieveRules;
                return this;
            }

            /**
             * <p>The status of the data retrieval task. Valid values:</p>
             * <ul>
             * <li>PENDING: Being created.</li>
             * <li>RUNNING: Running.</li>
             * <li>STOPPED: Stopped.</li>
             * <li>FINISHED: Finished.</li>
             * <li>FAILED: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tiered storage type. Valid values:</p>
             * <ul>
             * <li>InfrequentAccess: IA storage class (default).</li>
             * <li>Archive: Archive storage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InfrequentAccess</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The task overview.</p>
             * 
             * <strong>example:</strong>
             * <p>Total tasks: 100000, success tasks: 100000</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The file data transit rules.</p>
             */
            public Builder transitRules(java.util.List<TransitRules> transitRules) {
                this.transitRules = transitRules;
                return this;
            }

            public LifecyclePolicyLogs build() {
                return new LifecyclePolicyLogs(this);
            } 

        } 

    }
}
