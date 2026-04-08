// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link QueryTrafficControlTaskItemReportResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTrafficControlTaskItemReportResponseBody</p>
 */
public class QueryTrafficControlTaskItemReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskItemReports")
    private java.util.List<TrafficControlTaskItemReports> trafficControlTaskItemReports;

    private QueryTrafficControlTaskItemReportResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlTaskItemReports = builder.trafficControlTaskItemReports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTrafficControlTaskItemReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficControlTaskItemReports
     */
    public java.util.List<TrafficControlTaskItemReports> getTrafficControlTaskItemReports() {
        return this.trafficControlTaskItemReports;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TrafficControlTaskItemReports> trafficControlTaskItemReports; 

        private Builder() {
        } 

        private Builder(QueryTrafficControlTaskItemReportResponseBody model) {
            this.requestId = model.requestId;
            this.trafficControlTaskItemReports = model.trafficControlTaskItemReports;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficControlTaskItemReports.
         */
        public Builder trafficControlTaskItemReports(java.util.List<TrafficControlTaskItemReports> trafficControlTaskItemReports) {
            this.trafficControlTaskItemReports = trafficControlTaskItemReports;
            return this;
        }

        public QueryTrafficControlTaskItemReportResponseBody build() {
            return new QueryTrafficControlTaskItemReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTrafficControlTaskItemReportResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTrafficControlTaskItemReportResponseBody</p>
     */
    public static class TrafficControlTaskItemReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualItemControlNum")
        private Long actualItemControlNum;

        @com.aliyun.core.annotation.NameInMap("ActualItemControlTraffic")
        private Long actualItemControlTraffic;

        @com.aliyun.core.annotation.NameInMap("DoneItemControlNum")
        private Long doneItemControlNum;

        @com.aliyun.core.annotation.NameInMap("DoneItemControlPercentage")
        private String doneItemControlPercentage;

        @com.aliyun.core.annotation.NameInMap("ItemControlNumPercentage")
        private String itemControlNumPercentage;

        @com.aliyun.core.annotation.NameInMap("ItemControlTrafficPercentage")
        private String itemControlTrafficPercentage;

        @com.aliyun.core.annotation.NameInMap("OughtItemControlNum")
        private Long oughtItemControlNum;

        @com.aliyun.core.annotation.NameInMap("OughtItemControlTraffic")
        private Long oughtItemControlTraffic;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
        private String trafficControlTargetId;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetName")
        private String trafficControlTargetName;

        private TrafficControlTaskItemReports(Builder builder) {
            this.actualItemControlNum = builder.actualItemControlNum;
            this.actualItemControlTraffic = builder.actualItemControlTraffic;
            this.doneItemControlNum = builder.doneItemControlNum;
            this.doneItemControlPercentage = builder.doneItemControlPercentage;
            this.itemControlNumPercentage = builder.itemControlNumPercentage;
            this.itemControlTrafficPercentage = builder.itemControlTrafficPercentage;
            this.oughtItemControlNum = builder.oughtItemControlNum;
            this.oughtItemControlTraffic = builder.oughtItemControlTraffic;
            this.trafficControlTargetId = builder.trafficControlTargetId;
            this.trafficControlTargetName = builder.trafficControlTargetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlTaskItemReports create() {
            return builder().build();
        }

        /**
         * @return actualItemControlNum
         */
        public Long getActualItemControlNum() {
            return this.actualItemControlNum;
        }

        /**
         * @return actualItemControlTraffic
         */
        public Long getActualItemControlTraffic() {
            return this.actualItemControlTraffic;
        }

        /**
         * @return doneItemControlNum
         */
        public Long getDoneItemControlNum() {
            return this.doneItemControlNum;
        }

        /**
         * @return doneItemControlPercentage
         */
        public String getDoneItemControlPercentage() {
            return this.doneItemControlPercentage;
        }

        /**
         * @return itemControlNumPercentage
         */
        public String getItemControlNumPercentage() {
            return this.itemControlNumPercentage;
        }

        /**
         * @return itemControlTrafficPercentage
         */
        public String getItemControlTrafficPercentage() {
            return this.itemControlTrafficPercentage;
        }

        /**
         * @return oughtItemControlNum
         */
        public Long getOughtItemControlNum() {
            return this.oughtItemControlNum;
        }

        /**
         * @return oughtItemControlTraffic
         */
        public Long getOughtItemControlTraffic() {
            return this.oughtItemControlTraffic;
        }

        /**
         * @return trafficControlTargetId
         */
        public String getTrafficControlTargetId() {
            return this.trafficControlTargetId;
        }

        /**
         * @return trafficControlTargetName
         */
        public String getTrafficControlTargetName() {
            return this.trafficControlTargetName;
        }

        public static final class Builder {
            private Long actualItemControlNum; 
            private Long actualItemControlTraffic; 
            private Long doneItemControlNum; 
            private String doneItemControlPercentage; 
            private String itemControlNumPercentage; 
            private String itemControlTrafficPercentage; 
            private Long oughtItemControlNum; 
            private Long oughtItemControlTraffic; 
            private String trafficControlTargetId; 
            private String trafficControlTargetName; 

            private Builder() {
            } 

            private Builder(TrafficControlTaskItemReports model) {
                this.actualItemControlNum = model.actualItemControlNum;
                this.actualItemControlTraffic = model.actualItemControlTraffic;
                this.doneItemControlNum = model.doneItemControlNum;
                this.doneItemControlPercentage = model.doneItemControlPercentage;
                this.itemControlNumPercentage = model.itemControlNumPercentage;
                this.itemControlTrafficPercentage = model.itemControlTrafficPercentage;
                this.oughtItemControlNum = model.oughtItemControlNum;
                this.oughtItemControlTraffic = model.oughtItemControlTraffic;
                this.trafficControlTargetId = model.trafficControlTargetId;
                this.trafficControlTargetName = model.trafficControlTargetName;
            } 

            /**
             * ActualItemControlNum.
             */
            public Builder actualItemControlNum(Long actualItemControlNum) {
                this.actualItemControlNum = actualItemControlNum;
                return this;
            }

            /**
             * ActualItemControlTraffic.
             */
            public Builder actualItemControlTraffic(Long actualItemControlTraffic) {
                this.actualItemControlTraffic = actualItemControlTraffic;
                return this;
            }

            /**
             * DoneItemControlNum.
             */
            public Builder doneItemControlNum(Long doneItemControlNum) {
                this.doneItemControlNum = doneItemControlNum;
                return this;
            }

            /**
             * DoneItemControlPercentage.
             */
            public Builder doneItemControlPercentage(String doneItemControlPercentage) {
                this.doneItemControlPercentage = doneItemControlPercentage;
                return this;
            }

            /**
             * ItemControlNumPercentage.
             */
            public Builder itemControlNumPercentage(String itemControlNumPercentage) {
                this.itemControlNumPercentage = itemControlNumPercentage;
                return this;
            }

            /**
             * ItemControlTrafficPercentage.
             */
            public Builder itemControlTrafficPercentage(String itemControlTrafficPercentage) {
                this.itemControlTrafficPercentage = itemControlTrafficPercentage;
                return this;
            }

            /**
             * OughtItemControlNum.
             */
            public Builder oughtItemControlNum(Long oughtItemControlNum) {
                this.oughtItemControlNum = oughtItemControlNum;
                return this;
            }

            /**
             * OughtItemControlTraffic.
             */
            public Builder oughtItemControlTraffic(Long oughtItemControlTraffic) {
                this.oughtItemControlTraffic = oughtItemControlTraffic;
                return this;
            }

            /**
             * TrafficControlTargetId.
             */
            public Builder trafficControlTargetId(String trafficControlTargetId) {
                this.trafficControlTargetId = trafficControlTargetId;
                return this;
            }

            /**
             * TrafficControlTargetName.
             */
            public Builder trafficControlTargetName(String trafficControlTargetName) {
                this.trafficControlTargetName = trafficControlTargetName;
                return this;
            }

            public TrafficControlTaskItemReports build() {
                return new TrafficControlTaskItemReports(this);
            } 

        } 

    }
}
