// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosEventListResponseBody</p>
 */
public class DescribeDdosEventListResponseBody extends TeaModel {
    @NameInMap("DdosEventList")
    private DdosEventList ddosEventList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeDdosEventListResponseBody(Builder builder) {
        this.ddosEventList = builder.ddosEventList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return ddosEventList
     */
    public DdosEventList getDdosEventList() {
        return this.ddosEventList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private DdosEventList ddosEventList; 
        private String requestId; 
        private Integer total; 

        /**
         * DdosEventList.
         */
        public Builder ddosEventList(DdosEventList ddosEventList) {
            this.ddosEventList = ddosEventList;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDdosEventListResponseBody build() {
            return new DescribeDdosEventListResponseBody(this);
        } 

    } 

    public static class DdosEvent extends TeaModel {
        @NameInMap("DdosStatus")
        private String ddosStatus;

        @NameInMap("DdosType")
        private String ddosType;

        @NameInMap("DelayTime")
        private Long delayTime;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("UnBlackholeTime")
        private Long unBlackholeTime;

        private DdosEvent(Builder builder) {
            this.ddosStatus = builder.ddosStatus;
            this.ddosType = builder.ddosType;
            this.delayTime = builder.delayTime;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.unBlackholeTime = builder.unBlackholeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdosEvent create() {
            return builder().build();
        }

        /**
         * @return ddosStatus
         */
        public String getDdosStatus() {
            return this.ddosStatus;
        }

        /**
         * @return ddosType
         */
        public String getDdosType() {
            return this.ddosType;
        }

        /**
         * @return delayTime
         */
        public Long getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return unBlackholeTime
         */
        public Long getUnBlackholeTime() {
            return this.unBlackholeTime;
        }

        public static final class Builder {
            private String ddosStatus; 
            private String ddosType; 
            private Long delayTime; 
            private Long endTime; 
            private Long startTime; 
            private Long unBlackholeTime; 

            /**
             * DdosStatus.
             */
            public Builder ddosStatus(String ddosStatus) {
                this.ddosStatus = ddosStatus;
                return this;
            }

            /**
             * DdosType.
             */
            public Builder ddosType(String ddosType) {
                this.ddosType = ddosType;
                return this;
            }

            /**
             * DelayTime.
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UnBlackholeTime.
             */
            public Builder unBlackholeTime(Long unBlackholeTime) {
                this.unBlackholeTime = unBlackholeTime;
                return this;
            }

            public DdosEvent build() {
                return new DdosEvent(this);
            } 

        } 

    }
    public static class DdosEventList extends TeaModel {
        @NameInMap("DdosEvent")
        private java.util.List < DdosEvent> ddosEvent;

        private DdosEventList(Builder builder) {
            this.ddosEvent = builder.ddosEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdosEventList create() {
            return builder().build();
        }

        /**
         * @return ddosEvent
         */
        public java.util.List < DdosEvent> getDdosEvent() {
            return this.ddosEvent;
        }

        public static final class Builder {
            private java.util.List < DdosEvent> ddosEvent; 

            /**
             * DdosEvent.
             */
            public Builder ddosEvent(java.util.List < DdosEvent> ddosEvent) {
                this.ddosEvent = ddosEvent;
                return this;
            }

            public DdosEventList build() {
                return new DdosEventList(this);
            } 

        } 

    }
}
