// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCipStatsRequest} extends {@link RequestModel}
 *
 * <p>GetCipStatsRequest</p>
 */
public class GetCipStatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ByMonth")
    private Boolean byMonth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUid")
    private String subUid;

    private GetCipStatsRequest(Builder builder) {
        super(builder);
        this.byMonth = builder.byMonth;
        this.endDate = builder.endDate;
        this.label = builder.label;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.startDate = builder.startDate;
        this.subUid = builder.subUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCipStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return byMonth
     */
    public Boolean getByMonth() {
        return this.byMonth;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return subUid
     */
    public String getSubUid() {
        return this.subUid;
    }

    public static final class Builder extends Request.Builder<GetCipStatsRequest, Builder> {
        private Boolean byMonth; 
        private String endDate; 
        private String label; 
        private String regionId; 
        private String resourceType; 
        private String startDate; 
        private String subUid; 

        private Builder() {
            super();
        } 

        private Builder(GetCipStatsRequest request) {
            super(request);
            this.byMonth = request.byMonth;
            this.endDate = request.endDate;
            this.label = request.label;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.startDate = request.startDate;
            this.subUid = request.subUid;
        } 

        /**
         * ByMonth.
         */
        public Builder byMonth(Boolean byMonth) {
            this.putBodyParameter("ByMonth", byMonth);
            this.byMonth = byMonth;
            return this;
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
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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

        /**
         * SubUid.
         */
        public Builder subUid(String subUid) {
            this.putBodyParameter("SubUid", subUid);
            this.subUid = subUid;
            return this;
        }

        @Override
        public GetCipStatsRequest build() {
            return new GetCipStatsRequest(this);
        } 

    } 

}
