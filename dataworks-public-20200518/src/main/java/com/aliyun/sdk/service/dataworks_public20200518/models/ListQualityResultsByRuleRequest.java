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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Body
    @NameInMap("RuleId")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Long ruleId;

    @Body
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private ListQualityResultsByRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectName = builder.projectName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ListQualityResultsByRuleRequest, Builder> {
        private String regionId; 
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectName; 
        private Long ruleId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityResultsByRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectName = request.projectName;
            this.ruleId = request.ruleId;
            this.startDate = request.startDate;
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
         * The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         * <p>
         * 
         * This parameter is used together with the StartDate parameter. The interval between the time specified by this parameter and the time specified by the StartDate parameter cannot exceed 7 days.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the compute engine instance or data source for which data quality is monitored.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The ID of the monitoring rule. You can use the ID and information such as a partition filter expression to perform a joint query.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.
         * <p>
         * 
         * This parameter is used together with the EndDate parameter. The interval between the time specified by this parameter and the time specified by the EndDate parameter cannot exceed 7 days.
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
