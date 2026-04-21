// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListAutoDisposeEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoDisposeEntitiesResponseBody</p>
 */
public class ListAutoDisposeEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoDecisionEntities")
    private java.util.List<AutoDecisionEntities> autoDecisionEntities;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAutoDisposeEntitiesResponseBody(Builder builder) {
        this.autoDecisionEntities = builder.autoDecisionEntities;
        this.currentPage = builder.currentPage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoDisposeEntitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDecisionEntities
     */
    public java.util.List<AutoDecisionEntities> getAutoDecisionEntities() {
        return this.autoDecisionEntities;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AutoDecisionEntities> autoDecisionEntities; 
        private Integer currentPage; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAutoDisposeEntitiesResponseBody model) {
            this.autoDecisionEntities = model.autoDecisionEntities;
            this.currentPage = model.currentPage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AutoDecisionEntities.
         */
        public Builder autoDecisionEntities(java.util.List<AutoDecisionEntities> autoDecisionEntities) {
            this.autoDecisionEntities = autoDecisionEntities;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAutoDisposeEntitiesResponseBody build() {
            return new ListAutoDisposeEntitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutoDisposeEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoDisposeEntitiesResponseBody</p>
     */
    public static class AutoDecisionEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertId")
        private String alertId;

        @com.aliyun.core.annotation.NameInMap("DisposalMethod")
        private String disposalMethod;

        @com.aliyun.core.annotation.NameInMap("DisposeRecordId")
        private String disposeRecordId;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("EntityUuid")
        private String entityUuid;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private AutoDecisionEntities(Builder builder) {
            this.alertId = builder.alertId;
            this.disposalMethod = builder.disposalMethod;
            this.disposeRecordId = builder.disposeRecordId;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.entityUuid = builder.entityUuid;
            this.playbookUuid = builder.playbookUuid;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoDecisionEntities create() {
            return builder().build();
        }

        /**
         * @return alertId
         */
        public String getAlertId() {
            return this.alertId;
        }

        /**
         * @return disposalMethod
         */
        public String getDisposalMethod() {
            return this.disposalMethod;
        }

        /**
         * @return disposeRecordId
         */
        public String getDisposeRecordId() {
            return this.disposeRecordId;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return entityUuid
         */
        public String getEntityUuid() {
            return this.entityUuid;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String alertId; 
            private String disposalMethod; 
            private String disposeRecordId; 
            private String entityName; 
            private String entityType; 
            private String entityUuid; 
            private String playbookUuid; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(AutoDecisionEntities model) {
                this.alertId = model.alertId;
                this.disposalMethod = model.disposalMethod;
                this.disposeRecordId = model.disposeRecordId;
                this.entityName = model.entityName;
                this.entityType = model.entityType;
                this.entityUuid = model.entityUuid;
                this.playbookUuid = model.playbookUuid;
                this.uuid = model.uuid;
            } 

            /**
             * AlertId.
             */
            public Builder alertId(String alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * DisposalMethod.
             */
            public Builder disposalMethod(String disposalMethod) {
                this.disposalMethod = disposalMethod;
                return this;
            }

            /**
             * DisposeRecordId.
             */
            public Builder disposeRecordId(String disposeRecordId) {
                this.disposeRecordId = disposeRecordId;
                return this;
            }

            /**
             * EntityName.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * EntityUuid.
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            /**
             * PlaybookUuid.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AutoDecisionEntities build() {
                return new AutoDecisionEntities(this);
            } 

        } 

    }
}
