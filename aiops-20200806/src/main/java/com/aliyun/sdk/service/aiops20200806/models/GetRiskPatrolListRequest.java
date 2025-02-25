// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRiskPatrolListRequest} extends {@link RequestModel}
 *
 * <p>GetRiskPatrolListRequest</p>
 */
public class GetRiskPatrolListRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("BusinessGroupName")
    private String businessGroupName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PatrolId")
    private Long patrolId;

    @Query
    @NameInMap("RiskPatrolItem")
    private String riskPatrolItem;

    @Query
    @NameInMap("SeverityLevel")
    private Integer severityLevel;

    @Query
    @NameInMap("Status")
    private Integer status;

    private GetRiskPatrolListRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.businessGroupName = builder.businessGroupName;
        this.currentPage = builder.currentPage;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.patrolId = builder.patrolId;
        this.riskPatrolItem = builder.riskPatrolItem;
        this.severityLevel = builder.severityLevel;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskPatrolListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return businessGroupName
     */
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return patrolId
     */
    public Long getPatrolId() {
        return this.patrolId;
    }

    /**
     * @return riskPatrolItem
     */
    public String getRiskPatrolItem() {
        return this.riskPatrolItem;
    }

    /**
     * @return severityLevel
     */
    public Integer getSeverityLevel() {
        return this.severityLevel;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetRiskPatrolListRequest, Builder> {
        private String businessGroupId; 
        private String businessGroupName; 
        private Integer currentPage; 
        private String operaUid; 
        private Integer pageSize; 
        private Long patrolId; 
        private String riskPatrolItem; 
        private Integer severityLevel; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetRiskPatrolListRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.businessGroupName = request.businessGroupName;
            this.currentPage = request.currentPage;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.patrolId = request.patrolId;
            this.riskPatrolItem = request.riskPatrolItem;
            this.severityLevel = request.severityLevel;
            this.status = request.status;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * BusinessGroupName.
         */
        public Builder businessGroupName(String businessGroupName) {
            this.putQueryParameter("BusinessGroupName", businessGroupName);
            this.businessGroupName = businessGroupName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PatrolId.
         */
        public Builder patrolId(Long patrolId) {
            this.putQueryParameter("PatrolId", patrolId);
            this.patrolId = patrolId;
            return this;
        }

        /**
         * RiskPatrolItem.
         */
        public Builder riskPatrolItem(String riskPatrolItem) {
            this.putQueryParameter("RiskPatrolItem", riskPatrolItem);
            this.riskPatrolItem = riskPatrolItem;
            return this;
        }

        /**
         * SeverityLevel.
         */
        public Builder severityLevel(Integer severityLevel) {
            this.putQueryParameter("SeverityLevel", severityLevel);
            this.severityLevel = severityLevel;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetRiskPatrolListRequest build() {
            return new GetRiskPatrolListRequest(this);
        } 

    } 

}
