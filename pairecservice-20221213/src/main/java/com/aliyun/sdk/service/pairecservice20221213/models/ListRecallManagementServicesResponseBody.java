// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListRecallManagementServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecallManagementServicesResponseBody</p>
 */
public class ListRecallManagementServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RecallManagementServices")
    private java.util.List<RecallManagementServices> recallManagementServices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRecallManagementServicesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.recallManagementServices = builder.recallManagementServices;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecallManagementServicesResponseBody create() {
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
     * @return recallManagementServices
     */
    public java.util.List<RecallManagementServices> getRecallManagementServices() {
        return this.recallManagementServices;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<RecallManagementServices> recallManagementServices; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRecallManagementServicesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.recallManagementServices = model.recallManagementServices;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * RecallManagementServices.
         */
        public Builder recallManagementServices(java.util.List<RecallManagementServices> recallManagementServices) {
            this.recallManagementServices = recallManagementServices;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecallManagementServicesResponseBody build() {
            return new ListRecallManagementServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecallManagementServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecallManagementServicesResponseBody</p>
     */
    public static class RecallManagementServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentRecallManagementServiceVersionId")
        private String currentRecallManagementServiceVersionId;

        @com.aliyun.core.annotation.NameInMap("CurrentRecallManagementServiceVersionName")
        private String currentRecallManagementServiceVersionName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
        private String recallManagementServiceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RecallManagementServices(Builder builder) {
            this.currentRecallManagementServiceVersionId = builder.currentRecallManagementServiceVersionId;
            this.currentRecallManagementServiceVersionName = builder.currentRecallManagementServiceVersionName;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.recallManagementServiceId = builder.recallManagementServiceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagementServices create() {
            return builder().build();
        }

        /**
         * @return currentRecallManagementServiceVersionId
         */
        public String getCurrentRecallManagementServiceVersionId() {
            return this.currentRecallManagementServiceVersionId;
        }

        /**
         * @return currentRecallManagementServiceVersionName
         */
        public String getCurrentRecallManagementServiceVersionName() {
            return this.currentRecallManagementServiceVersionName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recallManagementServiceId
         */
        public String getRecallManagementServiceId() {
            return this.recallManagementServiceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String currentRecallManagementServiceVersionId; 
            private String currentRecallManagementServiceVersionName; 
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String recallManagementServiceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(RecallManagementServices model) {
                this.currentRecallManagementServiceVersionId = model.currentRecallManagementServiceVersionId;
                this.currentRecallManagementServiceVersionName = model.currentRecallManagementServiceVersionName;
                this.description = model.description;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.name = model.name;
                this.recallManagementServiceId = model.recallManagementServiceId;
                this.status = model.status;
            } 

            /**
             * CurrentRecallManagementServiceVersionId.
             */
            public Builder currentRecallManagementServiceVersionId(String currentRecallManagementServiceVersionId) {
                this.currentRecallManagementServiceVersionId = currentRecallManagementServiceVersionId;
                return this;
            }

            /**
             * CurrentRecallManagementServiceVersionName.
             */
            public Builder currentRecallManagementServiceVersionName(String currentRecallManagementServiceVersionName) {
                this.currentRecallManagementServiceVersionName = currentRecallManagementServiceVersionName;
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
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
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
             * RecallManagementServiceId.
             */
            public Builder recallManagementServiceId(String recallManagementServiceId) {
                this.recallManagementServiceId = recallManagementServiceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RecallManagementServices build() {
                return new RecallManagementServices(this);
            } 

        } 

    }
}
