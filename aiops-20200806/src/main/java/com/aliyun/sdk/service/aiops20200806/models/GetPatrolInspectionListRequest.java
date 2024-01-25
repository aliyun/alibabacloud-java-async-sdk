// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPatrolInspectionListRequest} extends {@link RequestModel}
 *
 * <p>GetPatrolInspectionListRequest</p>
 */
public class GetPatrolInspectionListRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

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
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("RiskLevel")
    private Integer riskLevel;

    @Query
    @NameInMap("RiskName")
    private String riskName;

    @Query
    @NameInMap("RiskPatrolItem")
    private String riskPatrolItem;

    @Query
    @NameInMap("RiskType")
    private Integer riskType;

    @Query
    @NameInMap("SeverityLevel")
    private Integer severityLevel;

    @Query
    @NameInMap("Status")
    private Integer status;

    private GetPatrolInspectionListRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.patrolId = builder.patrolId;
        this.productCode = builder.productCode;
        this.riskLevel = builder.riskLevel;
        this.riskName = builder.riskName;
        this.riskPatrolItem = builder.riskPatrolItem;
        this.riskType = builder.riskType;
        this.severityLevel = builder.severityLevel;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPatrolInspectionListRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return riskName
     */
    public String getRiskName() {
        return this.riskName;
    }

    /**
     * @return riskPatrolItem
     */
    public String getRiskPatrolItem() {
        return this.riskPatrolItem;
    }

    /**
     * @return riskType
     */
    public Integer getRiskType() {
        return this.riskType;
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

    public static final class Builder extends Request.Builder<GetPatrolInspectionListRequest, Builder> {
        private String businessGroupId; 
        private Integer currentPage; 
        private String lang; 
        private String operaUid; 
        private Integer pageSize; 
        private Long patrolId; 
        private String productCode; 
        private Integer riskLevel; 
        private String riskName; 
        private String riskPatrolItem; 
        private Integer riskType; 
        private Integer severityLevel; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetPatrolInspectionListRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.patrolId = request.patrolId;
            this.productCode = request.productCode;
            this.riskLevel = request.riskLevel;
            this.riskName = request.riskName;
            this.riskPatrolItem = request.riskPatrolItem;
            this.riskType = request.riskType;
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * RiskName.
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
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
         * RiskType.
         */
        public Builder riskType(Integer riskType) {
            this.putQueryParameter("RiskType", riskType);
            this.riskType = riskType;
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
        public GetPatrolInspectionListRequest build() {
            return new GetPatrolInspectionListRequest(this);
        } 

    } 

}
