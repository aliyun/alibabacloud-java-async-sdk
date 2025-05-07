// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetRulesCountListRequest} extends {@link RequestModel}
 *
 * <p>GetRulesCountListRequest</p>
 */
public class GetRulesCountListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessName")
    private String businessName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessRange")
    private Integer businessRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CountTotal")
    private Boolean countTotal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateEmpid")
    private String createEmpid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private Long createUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LastUpdateEmpid")
    private String lastUpdateEmpid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequireInfos")
    private java.util.List<String> requireInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rid")
    private Long rid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleIdOrRuleName")
    private String ruleIdOrRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleScoreSingleType")
    private Integer ruleScoreSingleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemeId")
    private Long schemeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private Integer sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateEndTime")
    private String updateEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateStartTime")
    private String updateStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateUserId")
    private Long updateUserId;

    private GetRulesCountListRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.businessName = builder.businessName;
        this.businessRange = builder.businessRange;
        this.categoryName = builder.categoryName;
        this.countTotal = builder.countTotal;
        this.createEmpid = builder.createEmpid;
        this.createUserId = builder.createUserId;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lastUpdateEmpid = builder.lastUpdateEmpid;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requireInfos = builder.requireInfos;
        this.rid = builder.rid;
        this.ruleIdOrRuleName = builder.ruleIdOrRuleName;
        this.ruleScoreSingleType = builder.ruleScoreSingleType;
        this.ruleType = builder.ruleType;
        this.schemeId = builder.schemeId;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.type = builder.type;
        this.typeName = builder.typeName;
        this.updateEndTime = builder.updateEndTime;
        this.updateStartTime = builder.updateStartTime;
        this.updateUserId = builder.updateUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRulesCountListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseMeAgentId
     */
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    /**
     * @return businessName
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * @return businessRange
     */
    public Integer getBusinessRange() {
        return this.businessRange;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return countTotal
     */
    public Boolean getCountTotal() {
        return this.countTotal;
    }

    /**
     * @return createEmpid
     */
    public String getCreateEmpid() {
        return this.createEmpid;
    }

    /**
     * @return createUserId
     */
    public Long getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lastUpdateEmpid
     */
    public String getLastUpdateEmpid() {
        return this.lastUpdateEmpid;
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
     * @return requireInfos
     */
    public java.util.List<String> getRequireInfos() {
        return this.requireInfos;
    }

    /**
     * @return rid
     */
    public Long getRid() {
        return this.rid;
    }

    /**
     * @return ruleIdOrRuleName
     */
    public String getRuleIdOrRuleName() {
        return this.ruleIdOrRuleName;
    }

    /**
     * @return ruleScoreSingleType
     */
    public Integer getRuleScoreSingleType() {
        return this.ruleScoreSingleType;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return schemeId
     */
    public Long getSchemeId() {
        return this.schemeId;
    }

    /**
     * @return sourceType
     */
    public Integer getSourceType() {
        return this.sourceType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @return updateEndTime
     */
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    /**
     * @return updateStartTime
     */
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    /**
     * @return updateUserId
     */
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

    public static final class Builder extends Request.Builder<GetRulesCountListRequest, Builder> {
        private Long baseMeAgentId; 
        private String businessName; 
        private Integer businessRange; 
        private String categoryName; 
        private Boolean countTotal; 
        private String createEmpid; 
        private Long createUserId; 
        private Integer currentPage; 
        private String endTime; 
        private String lastUpdateEmpid; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> requireInfos; 
        private Long rid; 
        private String ruleIdOrRuleName; 
        private Integer ruleScoreSingleType; 
        private Integer ruleType; 
        private Long schemeId; 
        private Integer sourceType; 
        private String startTime; 
        private Integer status; 
        private Integer type; 
        private String typeName; 
        private String updateEndTime; 
        private String updateStartTime; 
        private Long updateUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetRulesCountListRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.businessName = request.businessName;
            this.businessRange = request.businessRange;
            this.categoryName = request.categoryName;
            this.countTotal = request.countTotal;
            this.createEmpid = request.createEmpid;
            this.createUserId = request.createUserId;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lastUpdateEmpid = request.lastUpdateEmpid;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.requireInfos = request.requireInfos;
            this.rid = request.rid;
            this.ruleIdOrRuleName = request.ruleIdOrRuleName;
            this.ruleScoreSingleType = request.ruleScoreSingleType;
            this.ruleType = request.ruleType;
            this.schemeId = request.schemeId;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.type = request.type;
            this.typeName = request.typeName;
            this.updateEndTime = request.updateEndTime;
            this.updateStartTime = request.updateStartTime;
            this.updateUserId = request.updateUserId;
        } 

        /**
         * <p>baseMeAgentId</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * BusinessName.
         */
        public Builder businessName(String businessName) {
            this.putBodyParameter("BusinessName", businessName);
            this.businessName = businessName;
            return this;
        }

        /**
         * BusinessRange.
         */
        public Builder businessRange(Integer businessRange) {
            this.putBodyParameter("BusinessRange", businessRange);
            this.businessRange = businessRange;
            return this;
        }

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.putBodyParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * CountTotal.
         */
        public Builder countTotal(Boolean countTotal) {
            this.putBodyParameter("CountTotal", countTotal);
            this.countTotal = countTotal;
            return this;
        }

        /**
         * CreateEmpid.
         */
        public Builder createEmpid(String createEmpid) {
            this.putBodyParameter("CreateEmpid", createEmpid);
            this.createEmpid = createEmpid;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(Long createUserId) {
            this.putBodyParameter("CreateUserId", createUserId);
            this.createUserId = createUserId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * LastUpdateEmpid.
         */
        public Builder lastUpdateEmpid(String lastUpdateEmpid) {
            this.putBodyParameter("LastUpdateEmpid", lastUpdateEmpid);
            this.lastUpdateEmpid = lastUpdateEmpid;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequireInfos.
         */
        public Builder requireInfos(java.util.List<String> requireInfos) {
            this.putBodyParameter("RequireInfos", requireInfos);
            this.requireInfos = requireInfos;
            return this;
        }

        /**
         * Rid.
         */
        public Builder rid(Long rid) {
            this.putBodyParameter("Rid", rid);
            this.rid = rid;
            return this;
        }

        /**
         * RuleIdOrRuleName.
         */
        public Builder ruleIdOrRuleName(String ruleIdOrRuleName) {
            this.putBodyParameter("RuleIdOrRuleName", ruleIdOrRuleName);
            this.ruleIdOrRuleName = ruleIdOrRuleName;
            return this;
        }

        /**
         * RuleScoreSingleType.
         */
        public Builder ruleScoreSingleType(Integer ruleScoreSingleType) {
            this.putBodyParameter("RuleScoreSingleType", ruleScoreSingleType);
            this.ruleScoreSingleType = ruleScoreSingleType;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * SchemeId.
         */
        public Builder schemeId(Long schemeId) {
            this.putBodyParameter("SchemeId", schemeId);
            this.schemeId = schemeId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(Integer sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * TypeName.
         */
        public Builder typeName(String typeName) {
            this.putBodyParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        /**
         * UpdateEndTime.
         */
        public Builder updateEndTime(String updateEndTime) {
            this.putBodyParameter("UpdateEndTime", updateEndTime);
            this.updateEndTime = updateEndTime;
            return this;
        }

        /**
         * UpdateStartTime.
         */
        public Builder updateStartTime(String updateStartTime) {
            this.putBodyParameter("UpdateStartTime", updateStartTime);
            this.updateStartTime = updateStartTime;
            return this;
        }

        /**
         * UpdateUserId.
         */
        public Builder updateUserId(Long updateUserId) {
            this.putBodyParameter("UpdateUserId", updateUserId);
            this.updateUserId = updateUserId;
            return this;
        }

        @Override
        public GetRulesCountListRequest build() {
            return new GetRulesCountListRequest(this);
        } 

    } 

}
