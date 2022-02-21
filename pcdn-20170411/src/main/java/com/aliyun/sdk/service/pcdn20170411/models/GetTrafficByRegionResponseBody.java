// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficByRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrafficByRegionResponseBody</p>
 */
public class GetTrafficByRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrafficDataList")
    private TrafficDataList trafficDataList;

    private GetTrafficByRegionResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.trafficDataList = builder.trafficDataList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficByRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficDataList
     */
    public TrafficDataList getTrafficDataList() {
        return this.trafficDataList;
    }

    public static final class Builder {
        private Integer code; 
        private String requestId; 
        private TrafficDataList trafficDataList; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficDataList.
         */
        public Builder trafficDataList(TrafficDataList trafficDataList) {
            this.trafficDataList = trafficDataList;
            return this;
        }

        public GetTrafficByRegionResponseBody build() {
            return new GetTrafficByRegionResponseBody(this);
        } 

    } 

    public static class TrafficData extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Traffic")
        private Long traffic;

        private TrafficData(Builder builder) {
            this.name = builder.name;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficData create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return traffic
         */
        public Long getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private String name; 
            private Long traffic; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Long traffic) {
                this.traffic = traffic;
                return this;
            }

            public TrafficData build() {
                return new TrafficData(this);
            } 

        } 

    }
    public static class TrafficDataList extends TeaModel {
        @NameInMap("TrafficData")
        private java.util.List < TrafficData> trafficData;

        private TrafficDataList(Builder builder) {
            this.trafficData = builder.trafficData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficDataList create() {
            return builder().build();
        }

        /**
         * @return trafficData
         */
        public java.util.List < TrafficData> getTrafficData() {
            return this.trafficData;
        }

        public static final class Builder {
            private java.util.List < TrafficData> trafficData; 

            /**
             * TrafficData.
             */
            public Builder trafficData(java.util.List < TrafficData> trafficData) {
                this.trafficData = trafficData;
                return this;
            }

            public TrafficDataList build() {
                return new TrafficDataList(this);
            } 

        } 

    }
}
