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
 * {@link SumStorageMetricsByDateRequest} extends {@link RequestModel}
 *
 * <p>SumStorageMetricsByDateRequest</p>
 */
public class SumStorageMetricsByDateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endDate")
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectNames")
    private java.util.List<String> projectNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statsType")
    private String statsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private SumStorageMetricsByDateRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.projectNames = builder.projectNames;
        this.region = builder.region;
        this.startDate = builder.startDate;
        this.statsType = builder.statsType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumStorageMetricsByDateRequest create() {
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
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SumStorageMetricsByDateRequest, Builder> {
        private Long endDate; 
        private java.util.List<String> projectNames; 
        private String region; 
        private Long startDate; 
        private String statsType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SumStorageMetricsByDateRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.projectNames = request.projectNames;
            this.region = request.region;
            this.startDate = request.startDate;
            this.statsType = request.statsType;
            this.userId = request.userId;
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
         * region.
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
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

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SumStorageMetricsByDateRequest build() {
            return new SumStorageMetricsByDateRequest(this);
        } 

    } 

}
