// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link SumComputeMetricsByUsageRequest} extends {@link RequestModel}
 *
 * <p>SumComputeMetricsByUsageRequest</p>
 */
public class SumComputeMetricsByUsageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endDate")
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectNames")
    private java.util.List<String> projectNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("usageType")
    private String usageType;

    private SumComputeMetricsByUsageRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.projectNames = builder.projectNames;
        this.startDate = builder.startDate;
        this.usageType = builder.usageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumComputeMetricsByUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return projectNames
     */
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return usageType
     */
    public String getUsageType() {
        return this.usageType;
    }

    public static final class Builder extends Request.Builder<SumComputeMetricsByUsageRequest, Builder> {
        private Long endDate; 
        private java.util.List<String> projectNames; 
        private Long startDate; 
        private String usageType; 

        private Builder() {
            super();
        } 

        private Builder(SumComputeMetricsByUsageRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.projectNames = request.projectNames;
            this.startDate = request.startDate;
            this.usageType = request.usageType;
        } 

        /**
         * endDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * projectNames.
         */
        public Builder projectNames(java.util.List<String> projectNames) {
            this.putBodyParameter("projectNames", projectNames);
            this.projectNames = projectNames;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * usageType.
         */
        public Builder usageType(String usageType) {
            this.putBodyParameter("usageType", usageType);
            this.usageType = usageType;
            return this;
        }

        @Override
        public SumComputeMetricsByUsageRequest build() {
            return new SumComputeMetricsByUsageRequest(this);
        } 

    } 

}
