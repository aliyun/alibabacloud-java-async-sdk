// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListInstanceAmountRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceAmountRequest</p>
 */
public class ListInstanceAmountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999999D, minimum = 2)
    private Long projectId;

    private ListInstanceAmountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.projectId = builder.projectId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ListInstanceAmountRequest, Builder> {
        private String regionId; 
        private String beginDate; 
        private String endDate; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceAmountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginDate = request.beginDate;
            this.endDate = request.endDate;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query, accurate to the day. Specify the time in the ISO 8601 standard in the yyyy-MM-dd&quot;T&quot;HH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-13T00:00:00+0800</p>
         */
        public Builder beginDate(String beginDate) {
            this.putBodyParameter("BeginDate", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * <p>The end of the time range to query, accurate to the day. Specify the time in the ISO 8601 standard in the yyyy-MM-dd&quot;T&quot;HH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-16T00:00:00+0800</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Work space page to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListInstanceAmountRequest build() {
            return new ListInstanceAmountRequest(this);
        } 

    } 

}
