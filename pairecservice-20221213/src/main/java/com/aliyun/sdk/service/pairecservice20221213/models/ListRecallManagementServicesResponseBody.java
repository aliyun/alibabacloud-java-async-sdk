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
         * <p>This parameter is not currently in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is not currently in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of recall management services.</p>
         */
        public Builder recallManagementServices(java.util.List<RecallManagementServices> recallManagementServices) {
            this.recallManagementServices = recallManagementServices;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The ID of the currently active recall management service version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentRecallManagementServiceVersionId(String currentRecallManagementServiceVersionId) {
                this.currentRecallManagementServiceVersionId = currentRecallManagementServiceVersionId;
                return this;
            }

            /**
             * <p>The name of the currently active recall management service version.</p>
             * 
             * <strong>example:</strong>
             * <p>version-1</p>
             */
            public Builder currentRecallManagementServiceVersionName(String currentRecallManagementServiceVersionName) {
                this.currentRecallManagementServiceVersionName = currentRecallManagementServiceVersionName;
                return this;
            }

            /**
             * <p>The description of the recall management service.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a test recall</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The service name of the recall management service.</p>
             * 
             * <strong>example:</strong>
             * <p>hot_group_recall</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the recall management service.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder recallManagementServiceId(String recallManagementServiceId) {
                this.recallManagementServiceId = recallManagementServiceId;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>Online: online.</li>
             * <li>Offline: offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
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
