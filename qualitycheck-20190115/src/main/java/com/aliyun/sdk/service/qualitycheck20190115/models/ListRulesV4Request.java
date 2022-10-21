// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRulesV4Request} extends {@link RequestModel}
 *
 * <p>ListRulesV4Request</p>
 */
public class ListRulesV4Request extends Request {
    @Body
    @NameInMap("BusinessName")
    private String businessName;

    @Body
    @NameInMap("BusinessRange")
    private Integer businessRange;

    @Body
    @NameInMap("CategoryName")
    private String categoryName;

    @Body
    @NameInMap("CountTotal")
    private Boolean countTotal;

    @Body
    @NameInMap("CreateEmpid")
    private String createEmpid;

    @Body
    @NameInMap("CreateUserId")
    private Long createUserId;

    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("LastUpdateEmpid")
    private String lastUpdateEmpid;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("RequireInfos")
    private java.util.List < String > requireInfos;

    @Body
    @NameInMap("Rid")
    private Long rid;

    @Body
    @NameInMap("RuleIdOrRuleName")
    private String ruleIdOrRuleName;

    @Body
    @NameInMap("RuleScoreSingleType")
    private Integer ruleScoreSingleType;

    @Body
    @NameInMap("RuleType")
    private Integer ruleType;

    @Body
    @NameInMap("SchemeId")
    private Long schemeId;

    @Body
    @NameInMap("SourceType")
    private Integer sourceType;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    @Body
    @NameInMap("Status")
    private Integer status;

    @Body
    @NameInMap("Type")
    private Integer type;

    @Body
    @NameInMap("TypeName")
    private String typeName;

    @Body
    @NameInMap("UpdateEndTime")
    private String updateEndTime;

    @Body
    @NameInMap("UpdateStartTime")
    private String updateStartTime;

    @Body
    @NameInMap("UpdateUserId")
    private Long updateUserId;

    private ListRulesV4Request(Builder builder) {
        super(builder);
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

    public static ListRulesV4Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List < String > getRequireInfos() {
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

    public static final class Builder extends Request.Builder<ListRulesV4Request, Builder> {
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
        private java.util.List < String > requireInfos; 
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

        private Builder(ListRulesV4Request request) {
            super(request);
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
        public Builder requireInfos(java.util.List < String > requireInfos) {
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
        public ListRulesV4Request build() {
            return new ListRulesV4Request(this);
        } 

    } 

}
