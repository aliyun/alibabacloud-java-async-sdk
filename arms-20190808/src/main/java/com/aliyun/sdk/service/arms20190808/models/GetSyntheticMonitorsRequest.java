// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetSyntheticMonitorsRequest} extends {@link RequestModel}
 *
 * <p>GetSyntheticMonitorsRequest</p>
 */
public class GetSyntheticMonitorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * <p>The query conditions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

    /**
     * 
     * {@link GetSyntheticMonitorsRequest} extends {@link TeaModel}
     *
     * <p>GetSyntheticMonitorsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorCategory")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer monitorCategory;

        @com.aliyun.core.annotation.NameInMap("Network")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer network;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The type of the monitoring point. Valid values: 1: PC. 2: mobile device.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder monitorCategory(Integer monitorCategory) {
                this.monitorCategory = monitorCategory;
                return this;
            }

            /**
             * <p>The network type. Valid values: 1: private network. 2: Internet.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder network(Integer network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The type of the monitoring task. Valid values:</p>
             * <p>1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed. 6: file download.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
