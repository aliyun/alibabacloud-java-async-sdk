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
 * {@link GetAiAppDetailTopoRequest} extends {@link RequestModel}
 *
 * <p>GetAiAppDetailTopoRequest</p>
 */
public class GetAiAppDetailTopoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeQuery")
    private TimeQuery timeQuery;

    private GetAiAppDetailTopoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.timeQuery = builder.timeQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppDetailTopoRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timeQuery
     */
    public TimeQuery getTimeQuery() {
        return this.timeQuery;
    }

    public static final class Builder extends Request.Builder<GetAiAppDetailTopoRequest, Builder> {
        private String appId; 
        private String regionId; 
        private TimeQuery timeQuery; 

        private Builder() {
            super();
        } 

        private Builder(GetAiAppDetailTopoRequest request) {
            super(request);
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.timeQuery = request.timeQuery;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * TimeQuery.
         */
        public Builder timeQuery(TimeQuery timeQuery) {
            String timeQueryShrink = shrink(timeQuery, "TimeQuery", "json");
            this.putQueryParameter("TimeQuery", timeQueryShrink);
            this.timeQuery = timeQuery;
            return this;
        }

        @Override
        public GetAiAppDetailTopoRequest build() {
            return new GetAiAppDetailTopoRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAiAppDetailTopoRequest} extends {@link TeaModel}
     *
     * <p>GetAiAppDetailTopoRequest</p>
     */
    public static class TimeQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private TimeQuery(Builder builder) {
            this.dimension = builder.dimension;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeQuery create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String dimension; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(TimeQuery model) {
                this.dimension = model.dimension;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeQuery build() {
                return new TimeQuery(this);
            } 

        } 

    }
}
