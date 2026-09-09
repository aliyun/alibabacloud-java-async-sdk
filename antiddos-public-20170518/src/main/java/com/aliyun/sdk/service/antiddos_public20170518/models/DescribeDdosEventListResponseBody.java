// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

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
 * {@link DescribeDdosEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosEventListResponseBody</p>
 */
public class DescribeDdosEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DdosEventList")
    private DdosEventList ddosEventList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDdosEventListResponseBody model) {
            this.ddosEventList = model.ddosEventList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * DdosEventList.
         */
        public Builder ddosEventList(DdosEventList ddosEventList) {
            this.ddosEventList = ddosEventList;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BC0907F8-A9F3-5E11-977B-D59CD98C64ED</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of DDoS attack events found.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDdosEventListResponseBody build() {
            return new DescribeDdosEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDdosEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosEventListResponseBody</p>
     */
    public static class DdosEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DdosStatus")
        private String ddosStatus;

        @com.aliyun.core.annotation.NameInMap("DdosType")
        private String ddosType;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Long delayTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UnBlackholeTime")
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

            private Builder() {
            } 

            private Builder(DdosEvent model) {
                this.ddosStatus = model.ddosStatus;
                this.ddosType = model.ddosType;
                this.delayTime = model.delayTime;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.unBlackholeTime = model.unBlackholeTime;
            } 

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
    /**
     * 
     * {@link DescribeDdosEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosEventListResponseBody</p>
     */
    public static class DdosEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DdosEvent")
        private java.util.List<DdosEvent> ddosEvent;

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
        public java.util.List<DdosEvent> getDdosEvent() {
            return this.ddosEvent;
        }

        public static final class Builder {
            private java.util.List<DdosEvent> ddosEvent; 

            private Builder() {
            } 

            private Builder(DdosEventList model) {
                this.ddosEvent = model.ddosEvent;
            } 

            /**
             * DdosEvent.
             */
            public Builder ddosEvent(java.util.List<DdosEvent> ddosEvent) {
                this.ddosEvent = ddosEvent;
                return this;
            }

            public DdosEventList build() {
                return new DdosEventList(this);
            } 

        } 

    }
}
