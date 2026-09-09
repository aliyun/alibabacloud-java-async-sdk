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
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statsType")
    private String statsType;

    private SumStorageMetricsByDateRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.projectNames = builder.projectNames;
        this.startDate = builder.startDate;
        this.statsType = builder.statsType;
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

    public static final class Builder extends Request.Builder<SumStorageMetricsByDateRequest, Builder> {
        private Long endDate; 
        private java.util.List<String> projectNames; 
        private Long startDate; 
        private String statsType; 

        private Builder() {
            super();
        } 

        private Builder(SumStorageMetricsByDateRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.projectNames = request.projectNames;
            this.startDate = request.startDate;
            this.statsType = request.statsType;
        } 

        /**
         * <p>The end of the time range to query. The value must be a timestamp in milliseconds. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1718590596556</p>
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The project names. If this parameter is not specified, the data of all projects is returned.</p>
         */
        public Builder projectNames(java.util.List<String> projectNames) {
            this.putBodyParameter("projectNames", projectNames);
            this.projectNames = projectNames;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value must be a timestamp in milliseconds. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1715393576201</p>
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The dimension for aggregating storage metrics. This parameter is required. Valid values:</p>
         * <ul>
         * <li><p><code>PROJECT</code></p>
         * </li>
         * <li><p><code>STORAGE_TYPE</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        public Builder statsType(String statsType) {
            this.putBodyParameter("statsType", statsType);
            this.statsType = statsType;
            return this;
        }

        @Override
        public SumStorageMetricsByDateRequest build() {
            return new SumStorageMetricsByDateRequest(this);
        } 

    } 

}
