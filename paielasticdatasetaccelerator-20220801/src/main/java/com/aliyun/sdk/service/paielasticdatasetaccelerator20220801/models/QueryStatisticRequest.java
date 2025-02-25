// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStatisticRequest} extends {@link RequestModel}
 *
 * <p>QueryStatisticRequest</p>
 */
public class QueryStatisticRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Fields")
    private String fields;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private QueryStatisticRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.fields = builder.fields;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStatisticRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryStatisticRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String fields; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryStatisticRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.fields = request.fields;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryStatisticRequest build() {
            return new QueryStatisticRequest(this);
        } 

    } 

}
