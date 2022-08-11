// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityResultsByRuleRequest} extends {@link RequestModel}
 *
 * <p>ListQualityResultsByRuleRequest</p>
 */
public class ListQualityResultsByRuleRequest extends Request {
    @Body
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RuleId")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer ruleId;

    @Body
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private ListQualityResultsByRuleRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.ruleId = builder.ruleId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityResultsByRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ListQualityResultsByRuleRequest, Builder> {
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectName; 
        private String regionId; 
        private Integer ruleId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityResultsByRuleRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.ruleId = request.ruleId;
            this.startDate = request.startDate;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Integer ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ListQualityResultsByRuleRequest build() {
            return new ListQualityResultsByRuleRequest(this);
        } 

    } 

}
