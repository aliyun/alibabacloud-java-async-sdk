// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDisposeStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListDisposeStrategyRequest</p>
 */
public class ListDisposeStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EffectiveStatus")
    private Integer effectiveStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityIdentity")
    private String entityIdentity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookName")
    private String playbookName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookTypes")
    private String playbookTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SophonTaskId")
    private String sophonTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ListDisposeStrategyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.effectiveStatus = builder.effectiveStatus;
        this.endTime = builder.endTime;
        this.entityIdentity = builder.entityIdentity;
        this.entityType = builder.entityType;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageSize = builder.pageSize;
        this.playbookName = builder.playbookName;
        this.playbookTypes = builder.playbookTypes;
        this.playbookUuid = builder.playbookUuid;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.sophonTaskId = builder.sophonTaskId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDisposeStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return effectiveStatus
     */
    public Integer getEffectiveStatus() {
        return this.effectiveStatus;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return entityIdentity
     */
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playbookName
     */
    public String getPlaybookName() {
        return this.playbookName;
    }

    /**
     * @return playbookTypes
     */
    public String getPlaybookTypes() {
        return this.playbookTypes;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return sophonTaskId
     */
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListDisposeStrategyRequest, Builder> {
        private Integer currentPage; 
        private Integer effectiveStatus; 
        private Long endTime; 
        private String entityIdentity; 
        private String entityType; 
        private String order; 
        private String orderField; 
        private Integer pageSize; 
        private String playbookName; 
        private String playbookTypes; 
        private String playbookUuid; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String sophonTaskId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListDisposeStrategyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.effectiveStatus = request.effectiveStatus;
            this.endTime = request.endTime;
            this.entityIdentity = request.entityIdentity;
            this.entityType = request.entityType;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageSize = request.pageSize;
            this.playbookName = request.playbookName;
            this.playbookTypes = request.playbookTypes;
            this.playbookUuid = request.playbookUuid;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.sophonTaskId = request.sophonTaskId;
            this.startTime = request.startTime;
        } 

        /**
         * The page number. Pages start from page 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The status of the policy. Valid values:
         * <p>
         * 
         * *   0: invalid
         * *   1: valid
         */
        public Builder effectiveStatus(Integer effectiveStatus) {
            this.putBodyParameter("EffectiveStatus", effectiveStatus);
            this.effectiveStatus = effectiveStatus;
            return this;
        }

        /**
         * The end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The feature value of the entity. Fuzzy match is supported.
         */
        public Builder entityIdentity(String entityIdentity) {
            this.putBodyParameter("EntityIdentity", entityIdentity);
            this.entityIdentity = entityIdentity;
            return this;
        }

        /**
         * The entity type of the playbook. Valid values:
         * <p>
         * 
         * *   ip
         * *   process
         * *   file
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * The sort order. Valid values:
         * <p>
         * 
         * *   desc: descending order.
         * *   asc: ascending order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The sort field. Valid values:
         * <p>
         * 
         * *   GmtModified: sorts the policies by update time.
         * *   GmtCreate: sorts the policies by creation time.
         * *   FinishTime: sorts the policies by end time.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the playbook, which is the unique identifier of the playbook.
         */
        public Builder playbookName(String playbookName) {
            this.putBodyParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * The type of the playbook. Valid values:
         * <p>
         * 
         * *   system: user-triggered playbook
         * *   custom: event-triggered playbook
         * *   custom_alert: alert-triggered playbook
         * *   soar-manual: user-run playbook
         * *   soar-mdr: MDR-run playbook
         */
        public Builder playbookTypes(String playbookTypes) {
            this.putBodyParameter("PlaybookTypes", playbookTypes);
            this.playbookTypes = playbookTypes;
            return this;
        }

        /**
         * The UUID of the playbook.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the account that you switch from the management account.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view. Valid values:
         * <p>
         * - 0: the current Alibaba Cloud account
         * - 1: the global account
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * The ID of the SOAR handling policy.
         */
        public Builder sophonTaskId(String sophonTaskId) {
            this.putBodyParameter("SophonTaskId", sophonTaskId);
            this.sophonTaskId = sophonTaskId;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListDisposeStrategyRequest build() {
            return new ListDisposeStrategyRequest(this);
        } 

    } 

}
