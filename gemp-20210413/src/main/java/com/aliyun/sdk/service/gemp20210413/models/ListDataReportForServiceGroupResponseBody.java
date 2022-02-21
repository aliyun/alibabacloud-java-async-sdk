// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataReportForServiceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataReportForServiceGroupResponseBody</p>
 */
public class ListDataReportForServiceGroupResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("pageSIze")
    private Long pageSIze;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListDataReportForServiceGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSIze = builder.pageSIze;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataReportForServiceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSIze
     */
    public Long getPageSIze() {
        return this.pageSIze;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSIze; 
        private String requestId; 
        private Long totalCount; 

        /**
         * 统计数据
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 当前页
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页大小
         */
        public Builder pageSIze(Long pageSIze) {
            this.pageSIze = pageSIze;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataReportForServiceGroupResponseBody build() {
            return new ListDataReportForServiceGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("escalationIncidentCount")
        private Long escalationIncidentCount;

        @NameInMap("finishIncidentCount")
        private Long finishIncidentCount;

        @NameInMap("finishProportion")
        private String finishProportion;

        @NameInMap("incidentCount")
        private Long incidentCount;

        @NameInMap("meanTimeToAcknowledge")
        private Long meanTimeToAcknowledge;

        @NameInMap("meanTimeToRepair")
        private Long meanTimeToRepair;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("serviceGroupName")
        private String serviceGroupName;

        @NameInMap("unAcknowledgedEscalationIncidentCount")
        private Long unAcknowledgedEscalationIncidentCount;

        @NameInMap("unFinishEscalationIncidentCount")
        private Long unFinishEscalationIncidentCount;

        private Data(Builder builder) {
            this.escalationIncidentCount = builder.escalationIncidentCount;
            this.finishIncidentCount = builder.finishIncidentCount;
            this.finishProportion = builder.finishProportion;
            this.incidentCount = builder.incidentCount;
            this.meanTimeToAcknowledge = builder.meanTimeToAcknowledge;
            this.meanTimeToRepair = builder.meanTimeToRepair;
            this.serviceGroupId = builder.serviceGroupId;
            this.serviceGroupName = builder.serviceGroupName;
            this.unAcknowledgedEscalationIncidentCount = builder.unAcknowledgedEscalationIncidentCount;
            this.unFinishEscalationIncidentCount = builder.unFinishEscalationIncidentCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return escalationIncidentCount
         */
        public Long getEscalationIncidentCount() {
            return this.escalationIncidentCount;
        }

        /**
         * @return finishIncidentCount
         */
        public Long getFinishIncidentCount() {
            return this.finishIncidentCount;
        }

        /**
         * @return finishProportion
         */
        public String getFinishProportion() {
            return this.finishProportion;
        }

        /**
         * @return incidentCount
         */
        public Long getIncidentCount() {
            return this.incidentCount;
        }

        /**
         * @return meanTimeToAcknowledge
         */
        public Long getMeanTimeToAcknowledge() {
            return this.meanTimeToAcknowledge;
        }

        /**
         * @return meanTimeToRepair
         */
        public Long getMeanTimeToRepair() {
            return this.meanTimeToRepair;
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        /**
         * @return serviceGroupName
         */
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        /**
         * @return unAcknowledgedEscalationIncidentCount
         */
        public Long getUnAcknowledgedEscalationIncidentCount() {
            return this.unAcknowledgedEscalationIncidentCount;
        }

        /**
         * @return unFinishEscalationIncidentCount
         */
        public Long getUnFinishEscalationIncidentCount() {
            return this.unFinishEscalationIncidentCount;
        }

        public static final class Builder {
            private Long escalationIncidentCount; 
            private Long finishIncidentCount; 
            private String finishProportion; 
            private Long incidentCount; 
            private Long meanTimeToAcknowledge; 
            private Long meanTimeToRepair; 
            private Long serviceGroupId; 
            private String serviceGroupName; 
            private Long unAcknowledgedEscalationIncidentCount; 
            private Long unFinishEscalationIncidentCount; 

            /**
             * 升级事件数量
             */
            public Builder escalationIncidentCount(Long escalationIncidentCount) {
                this.escalationIncidentCount = escalationIncidentCount;
                return this;
            }

            /**
             * 事件完结数
             */
            public Builder finishIncidentCount(Long finishIncidentCount) {
                this.finishIncidentCount = finishIncidentCount;
                return this;
            }

            /**
             * 完结率
             */
            public Builder finishProportion(String finishProportion) {
                this.finishProportion = finishProportion;
                return this;
            }

            /**
             * 事件数量
             */
            public Builder incidentCount(Long incidentCount) {
                this.incidentCount = incidentCount;
                return this;
            }

            /**
             * MRRA
             */
            public Builder meanTimeToAcknowledge(Long meanTimeToAcknowledge) {
                this.meanTimeToAcknowledge = meanTimeToAcknowledge;
                return this;
            }

            /**
             * MTTR
             */
            public Builder meanTimeToRepair(Long meanTimeToRepair) {
                this.meanTimeToRepair = meanTimeToRepair;
                return this;
            }

            /**
             * 服务组ID
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * 服务组名字
             */
            public Builder serviceGroupName(String serviceGroupName) {
                this.serviceGroupName = serviceGroupName;
                return this;
            }

            /**
             * 未响应升级事件数量
             */
            public Builder unAcknowledgedEscalationIncidentCount(Long unAcknowledgedEscalationIncidentCount) {
                this.unAcknowledgedEscalationIncidentCount = unAcknowledgedEscalationIncidentCount;
                return this;
            }

            /**
             * 未完成升级事件数量
             */
            public Builder unFinishEscalationIncidentCount(Long unFinishEscalationIncidentCount) {
                this.unFinishEscalationIncidentCount = unFinishEscalationIncidentCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
