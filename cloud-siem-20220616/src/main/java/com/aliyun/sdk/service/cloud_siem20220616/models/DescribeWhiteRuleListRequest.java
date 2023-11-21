// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWhiteRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeWhiteRuleListRequest</p>
 */
public class DescribeWhiteRuleListRequest extends Request {
    @Body
    @NameInMap("AlertName")
    private String alertName;

    @Body
    @NameInMap("AlertType")
    private String alertType;

    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeWhiteRuleListRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.alertType = builder.alertType;
        this.currentPage = builder.currentPage;
        this.incidentUuid = builder.incidentUuid;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteRuleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeWhiteRuleListRequest, Builder> {
        private String alertName; 
        private String alertType; 
        private Integer currentPage; 
        private String incidentUuid; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWhiteRuleListRequest request) {
            super(request);
            this.alertName = request.alertName;
            this.alertType = request.alertType;
            this.currentPage = request.currentPage;
            this.incidentUuid = request.incidentUuid;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * AlertType.
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
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
         * IncidentUuid.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeWhiteRuleListRequest build() {
            return new DescribeWhiteRuleListRequest(this);
        } 

    } 

}
