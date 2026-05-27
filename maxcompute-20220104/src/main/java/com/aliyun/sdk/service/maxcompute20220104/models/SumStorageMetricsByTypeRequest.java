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
 * {@link SumStorageMetricsByTypeRequest} extends {@link RequestModel}
 *
 * <p>SumStorageMetricsByTypeRequest</p>
 */
public class SumStorageMetricsByTypeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("statsType")
    private String statsType;

    private SumStorageMetricsByTypeRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.projectNames = builder.projectNames;
        this.startDate = builder.startDate;
        this.statsType = builder.statsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumStorageMetricsByTypeRequest create() {
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
     * @return statsType
     */
    public String getStatsType() {
        return this.statsType;
    }

    public static final class Builder extends Request.Builder<SumStorageMetricsByTypeRequest, Builder> {
        private Long endDate; 
        private java.util.List<String> projectNames; 
        private Long startDate; 
        private String statsType; 

        private Builder() {
            super();
        } 

        private Builder(SumStorageMetricsByTypeRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.projectNames = request.projectNames;
            this.startDate = request.startDate;
            this.statsType = request.statsType;
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
         * statsType.
         */
        public Builder statsType(String statsType) {
            this.putBodyParameter("statsType", statsType);
            this.statsType = statsType;
            return this;
        }

        @Override
        public SumStorageMetricsByTypeRequest build() {
            return new SumStorageMetricsByTypeRequest(this);
        } 

    } 

}
