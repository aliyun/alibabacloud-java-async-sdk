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
         * <p>The list of AI automatic decision-making entity information.</p>
         */
        public Builder autoDecisionEntities(java.util.List<AutoDecisionEntities> autoDecisionEntities) {
            this.autoDecisionEntities = autoDecisionEntities;
            return this;
        }

        /**
         * <p>The current page number. The value must be greater than or equal to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The maximum number of entries returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If a next query exists, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
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
             * <p>The alert rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20403189</p>
             */
            public Builder alertId(String alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The disposal method. Valid values:</p>
             * <ul>
             * <li>ignore: Ignored.</li>
             * <li>dispose: Playbook-based disposal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dispose</p>
             */
            public Builder disposalMethod(String disposalMethod) {
                this.disposalMethod = disposalMethod;
                return this;
            }

            /**
             * <p>The disposal ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1ec121479b341a61886dbd2c4ccd*****</p>
             */
            public Builder disposeRecordId(String disposeRecordId) {
                this.disposeRecordId = disposeRecordId;
                return this;
            }

            /**
             * <p>The entity name.</p>
             * 
             * <strong>example:</strong>
             * <p>/apps/ext/ka****</p>
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * <p>The entity type. Valid values:</p>
             * <ul>
             * <li>ip: IP address.</li>
             * <li>domain: domain name.</li>
             * <li>process: process.</li>
             * <li>file: file.</li>
             * <li>host: host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>process</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The entity UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>022ed6c601514a370cc9e3acd37a****</p>
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            /**
             * <p>The playbook UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>6fd2b143-e420-4c1b-a118-e764*****</p>
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * <p>The UUID of the playbook. This is the unique identifier of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>0d23f133-22d7-4388-b738-ab******</p>
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
