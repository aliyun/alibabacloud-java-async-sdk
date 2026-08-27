// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListServiceRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceRecordsResponseBody</p>
 */
public class ListServiceRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListServiceRecordsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServiceRecordsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.records = model.records;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * records.
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-XXXX-XXXX-XXXX-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceRecordsResponseBody build() {
            return new ListServiceRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceRecordsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("recordContent")
        private String recordContent;

        @com.aliyun.core.annotation.NameInMap("recordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Records(Builder builder) {
            this.recordContent = builder.recordContent;
            this.recordType = builder.recordType;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return recordContent
         */
        public String getRecordContent() {
            return this.recordContent;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String recordContent; 
            private String recordType; 
            private String serviceId; 
            private String serviceName; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.recordContent = model.recordContent;
                this.recordType = model.recordType;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.workspace = model.workspace;
            } 

            /**
             * recordContent.
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * recordType.
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
