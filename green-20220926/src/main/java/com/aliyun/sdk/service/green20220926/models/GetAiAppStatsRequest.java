// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppStatsRequest} extends {@link RequestModel}
 *
 * <p>GetAiAppStatsRequest</p>
 */
public class GetAiAppStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ByMonth")
    private Boolean byMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetAiAppStatsRequest(Builder builder) {
        super(builder);
        this.byMonth = builder.byMonth;
        this.endDate = builder.endDate;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppStatsRequest create() {
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAiAppStatsRequest, Builder> {
        private Boolean byMonth; 
        private String endDate; 
        private String query; 
        private String regionId; 
        private String startDate; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetAiAppStatsRequest request) {
            super(request);
            this.byMonth = request.byMonth;
            this.endDate = request.endDate;
            this.query = request.query;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether to aggregate statistics by month. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder byMonth(Boolean byMonth) {
            this.putQueryParameter("ByMonth", byMonth);
            this.byMonth = byMonth;
            return this;
        }

        /**
         * <p>The end date of the query. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02 00:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start date of the query. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>sensitive_data</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAiAppStatsRequest build() {
            return new GetAiAppStatsRequest(this);
        } 

    } 

}
