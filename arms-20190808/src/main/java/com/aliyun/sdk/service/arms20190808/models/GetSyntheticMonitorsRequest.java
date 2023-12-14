// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticMonitorsRequest} extends {@link RequestModel}
 *
 * <p>GetSyntheticMonitorsRequest</p>
 */
public class GetSyntheticMonitorsRequest extends Request {
    @Query
    @NameInMap("Filter")
    @Validation(required = true)
    private Filter filter;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetSyntheticMonitorsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSyntheticMonitorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetSyntheticMonitorsRequest, Builder> {
        private Filter filter; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSyntheticMonitorsRequest request) {
            super(request);
            this.filter = request.filter;
            this.regionId = request.regionId;
        } 

        /**
         * Filter.
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
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

        @Override
        public GetSyntheticMonitorsRequest build() {
            return new GetSyntheticMonitorsRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("MonitorCategory")
        @Validation(required = true)
        private Integer monitorCategory;

        @NameInMap("Network")
        @Validation(required = true)
        private Integer network;

        @NameInMap("TaskType")
        @Validation(required = true)
        private Integer taskType;

        private Filter(Builder builder) {
            this.monitorCategory = builder.monitorCategory;
            this.network = builder.network;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return monitorCategory
         */
        public Integer getMonitorCategory() {
            return this.monitorCategory;
        }

        /**
         * @return network
         */
        public Integer getNetwork() {
            return this.network;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Integer monitorCategory; 
            private Integer network; 
            private Integer taskType; 

            /**
             * MonitorCategory.
             */
            public Builder monitorCategory(Integer monitorCategory) {
                this.monitorCategory = monitorCategory;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(Integer network) {
                this.network = network;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
