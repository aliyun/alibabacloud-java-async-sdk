// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeQualityAreaDistributionStatDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeQualityAreaDistributionStatDataRequest</p>
 */
public class DescribeQualityAreaDistributionStatDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentArea")
    private String parentArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    private DescribeQualityAreaDistributionStatDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.parentArea = builder.parentArea;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQualityAreaDistributionStatDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return parentArea
     */
    public String getParentArea() {
        return this.parentArea;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeQualityAreaDistributionStatDataRequest, Builder> {
        private String appId; 
        private Long endDate; 
        private String parentArea; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQualityAreaDistributionStatDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.parentArea = request.parentArea;
            this.startDate = request.startDate;
        } 

        /**
         * <p>APP ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0rbd****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615910399</p>
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ParentArea.
         */
        public Builder parentArea(String parentArea) {
            this.putQueryParameter("ParentArea", parentArea);
            this.parentArea = parentArea;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615824000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeQualityAreaDistributionStatDataRequest build() {
            return new DescribeQualityAreaDistributionStatDataRequest(this);
        } 

    } 

}
