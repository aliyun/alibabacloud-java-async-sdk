// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceAmountRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceAmountRequest</p>
 */
public class ListInstanceAmountRequest extends Request {
    @Body
    @NameInMap("BeginDate")
    @Validation(required = true)
    private String beginDate;

    @Body
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 99999999999D, minimum = 2)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListInstanceAmountRequest(Builder builder) {
        super(builder);
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginDate
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListInstanceAmountRequest, Builder> {
        private String beginDate; 
        private String endDate; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceAmountRequest request) {
            super(request);
            this.beginDate = request.beginDate;
            this.endDate = request.endDate;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * BeginDate.
         */
        public Builder beginDate(String beginDate) {
            this.putBodyParameter("BeginDate", beginDate);
            this.beginDate = beginDate;
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
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public ListInstanceAmountRequest build() {
            return new ListInstanceAmountRequest(this);
        } 

    } 

}
