// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeThreatEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeThreatEventDetailResponseBody</p>
 */
public class DescribeThreatEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ThreatEventDetail")
    private ThreatEventDetail threatEventDetail;

    private DescribeThreatEventDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.threatEventDetail = builder.threatEventDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeThreatEventDetailResponseBody create() {
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
     * @return threatEventDetail
     */
    public ThreatEventDetail getThreatEventDetail() {
        return this.threatEventDetail;
    }

    public static final class Builder {
        private String requestId; 
        private ThreatEventDetail threatEventDetail; 

        private Builder() {
        } 

        private Builder(DescribeThreatEventDetailResponseBody model) {
            this.requestId = model.requestId;
            this.threatEventDetail = model.threatEventDetail;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ThreatEventDetail.
         */
        public Builder threatEventDetail(ThreatEventDetail threatEventDetail) {
            this.threatEventDetail = threatEventDetail;
            return this;
        }

        public DescribeThreatEventDetailResponseBody build() {
            return new DescribeThreatEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeThreatEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeThreatEventDetailResponseBody</p>
     */
    public static class ThreatEventDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventBlock")
        private String eventBlock;

        @com.aliyun.core.annotation.NameInMap("EventCnt")
        private String eventCnt;

        @com.aliyun.core.annotation.NameInMap("EventCondition")
        private String eventCondition;

        @com.aliyun.core.annotation.NameInMap("EventIntelligence")
        private String eventIntelligence;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventSrc")
        private String eventSrc;

        @com.aliyun.core.annotation.NameInMap("EventSrcCountry")
        private String eventSrcCountry;

        @com.aliyun.core.annotation.NameInMap("EventSrcRegion")
        private String eventSrcRegion;

        @com.aliyun.core.annotation.NameInMap("EventSuggest")
        private String eventSuggest;

        @com.aliyun.core.annotation.NameInMap("EventTag")
        private String eventTag;

        @com.aliyun.core.annotation.NameInMap("IsPersistent")
        private Long isPersistent;

        private ThreatEventDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.eventBlock = builder.eventBlock;
            this.eventCnt = builder.eventCnt;
            this.eventCondition = builder.eventCondition;
            this.eventIntelligence = builder.eventIntelligence;
            this.eventLevel = builder.eventLevel;
            this.eventSrc = builder.eventSrc;
            this.eventSrcCountry = builder.eventSrcCountry;
            this.eventSrcRegion = builder.eventSrcRegion;
            this.eventSuggest = builder.eventSuggest;
            this.eventTag = builder.eventTag;
            this.isPersistent = builder.isPersistent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreatEventDetail create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventBlock
         */
        public String getEventBlock() {
            return this.eventBlock;
        }

        /**
         * @return eventCnt
         */
        public String getEventCnt() {
            return this.eventCnt;
        }

        /**
         * @return eventCondition
         */
        public String getEventCondition() {
            return this.eventCondition;
        }

        /**
         * @return eventIntelligence
         */
        public String getEventIntelligence() {
            return this.eventIntelligence;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventSrc
         */
        public String getEventSrc() {
            return this.eventSrc;
        }

        /**
         * @return eventSrcCountry
         */
        public String getEventSrcCountry() {
            return this.eventSrcCountry;
        }

        /**
         * @return eventSrcRegion
         */
        public String getEventSrcRegion() {
            return this.eventSrcRegion;
        }

        /**
         * @return eventSuggest
         */
        public String getEventSuggest() {
            return this.eventSuggest;
        }

        /**
         * @return eventTag
         */
        public String getEventTag() {
            return this.eventTag;
        }

        /**
         * @return isPersistent
         */
        public Long getIsPersistent() {
            return this.isPersistent;
        }

        public static final class Builder {
            private Long endTime; 
            private String eventBlock; 
            private String eventCnt; 
            private String eventCondition; 
            private String eventIntelligence; 
            private String eventLevel; 
            private String eventSrc; 
            private String eventSrcCountry; 
            private String eventSrcRegion; 
            private String eventSuggest; 
            private String eventTag; 
            private Long isPersistent; 

            private Builder() {
            } 

            private Builder(ThreatEventDetail model) {
                this.endTime = model.endTime;
                this.eventBlock = model.eventBlock;
                this.eventCnt = model.eventCnt;
                this.eventCondition = model.eventCondition;
                this.eventIntelligence = model.eventIntelligence;
                this.eventLevel = model.eventLevel;
                this.eventSrc = model.eventSrc;
                this.eventSrcCountry = model.eventSrcCountry;
                this.eventSrcRegion = model.eventSrcRegion;
                this.eventSuggest = model.eventSuggest;
                this.eventTag = model.eventTag;
                this.isPersistent = model.isPersistent;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EventBlock.
             */
            public Builder eventBlock(String eventBlock) {
                this.eventBlock = eventBlock;
                return this;
            }

            /**
             * EventCnt.
             */
            public Builder eventCnt(String eventCnt) {
                this.eventCnt = eventCnt;
                return this;
            }

            /**
             * EventCondition.
             */
            public Builder eventCondition(String eventCondition) {
                this.eventCondition = eventCondition;
                return this;
            }

            /**
             * EventIntelligence.
             */
            public Builder eventIntelligence(String eventIntelligence) {
                this.eventIntelligence = eventIntelligence;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventSrc.
             */
            public Builder eventSrc(String eventSrc) {
                this.eventSrc = eventSrc;
                return this;
            }

            /**
             * EventSrcCountry.
             */
            public Builder eventSrcCountry(String eventSrcCountry) {
                this.eventSrcCountry = eventSrcCountry;
                return this;
            }

            /**
             * EventSrcRegion.
             */
            public Builder eventSrcRegion(String eventSrcRegion) {
                this.eventSrcRegion = eventSrcRegion;
                return this;
            }

            /**
             * EventSuggest.
             */
            public Builder eventSuggest(String eventSuggest) {
                this.eventSuggest = eventSuggest;
                return this;
            }

            /**
             * EventTag.
             */
            public Builder eventTag(String eventTag) {
                this.eventTag = eventTag;
                return this;
            }

            /**
             * IsPersistent.
             */
            public Builder isPersistent(Long isPersistent) {
                this.isPersistent = isPersistent;
                return this;
            }

            public ThreatEventDetail build() {
                return new ThreatEventDetail(this);
            } 

        } 

    }
}
