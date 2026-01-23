// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetStandardStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetStandardStatisticsRequest</p>
 */
public class GetStandardStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisticsQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private StatisticsQuery statisticsQuery;

    private GetStandardStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.statisticsQuery = builder.statisticsQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardStatisticsRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return statisticsQuery
     */
    public StatisticsQuery getStatisticsQuery() {
        return this.statisticsQuery;
    }

    public static final class Builder extends Request.Builder<GetStandardStatisticsRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private StatisticsQuery statisticsQuery; 

        private Builder() {
            super();
        } 

        private Builder(GetStandardStatisticsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.statisticsQuery = request.statisticsQuery;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder statisticsQuery(StatisticsQuery statisticsQuery) {
            String statisticsQueryShrink = shrink(statisticsQuery, "StatisticsQuery", "json");
            this.putBodyParameter("StatisticsQuery", statisticsQueryShrink);
            this.statisticsQuery = statisticsQuery;
            return this;
        }

        @Override
        public GetStandardStatisticsRequest build() {
            return new GetStandardStatisticsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardStatisticsRequest} extends {@link TeaModel}
     *
     * <p>GetStandardStatisticsRequest</p>
     */
    public static class CreateTimePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IncludeEndTime")
        private Boolean includeEndTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private CreateTimePeriod(Builder builder) {
            this.endTime = builder.endTime;
            this.includeEndTime = builder.includeEndTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateTimePeriod create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return includeEndTime
         */
        public Boolean getIncludeEndTime() {
            return this.includeEndTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Boolean includeEndTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CreateTimePeriod model) {
                this.endTime = model.endTime;
                this.includeEndTime = model.includeEndTime;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IncludeEndTime.
             */
            public Builder includeEndTime(Boolean includeEndTime) {
                this.includeEndTime = includeEndTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CreateTimePeriod build() {
                return new CreateTimePeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardStatisticsRequest} extends {@link TeaModel}
     *
     * <p>GetStandardStatisticsRequest</p>
     */
    public static class StatisticsQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimePeriod")
        private CreateTimePeriod createTimePeriod;

        @com.aliyun.core.annotation.NameInMap("Directory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String directory;

        @com.aliyun.core.annotation.NameInMap("StandardStageList")
        private java.util.List<String> standardStageList;

        private StatisticsQuery(Builder builder) {
            this.createTimePeriod = builder.createTimePeriod;
            this.directory = builder.directory;
            this.standardStageList = builder.standardStageList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticsQuery create() {
            return builder().build();
        }

        /**
         * @return createTimePeriod
         */
        public CreateTimePeriod getCreateTimePeriod() {
            return this.createTimePeriod;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return standardStageList
         */
        public java.util.List<String> getStandardStageList() {
            return this.standardStageList;
        }

        public static final class Builder {
            private CreateTimePeriod createTimePeriod; 
            private String directory; 
            private java.util.List<String> standardStageList; 

            private Builder() {
            } 

            private Builder(StatisticsQuery model) {
                this.createTimePeriod = model.createTimePeriod;
                this.directory = model.directory;
                this.standardStageList = model.standardStageList;
            } 

            /**
             * CreateTimePeriod.
             */
            public Builder createTimePeriod(CreateTimePeriod createTimePeriod) {
                this.createTimePeriod = createTimePeriod;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/dir1</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * StandardStageList.
             */
            public Builder standardStageList(java.util.List<String> standardStageList) {
                this.standardStageList = standardStageList;
                return this;
            }

            public StatisticsQuery build() {
                return new StatisticsQuery(this);
            } 

        } 

    }
}
