// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSdlEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSdlEventDetailResponseBody</p>
 */
public class DescribeSdlEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SdlEventDetailList")
    private java.util.List<SdlEventDetailList> sdlEventDetailList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSdlEventDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdlEventDetailList = builder.sdlEventDetailList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlEventDetailResponseBody create() {
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
     * @return sdlEventDetailList
     */
    public java.util.List<SdlEventDetailList> getSdlEventDetailList() {
        return this.sdlEventDetailList;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SdlEventDetailList> sdlEventDetailList; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSdlEventDetailResponseBody model) {
            this.requestId = model.requestId;
            this.sdlEventDetailList = model.sdlEventDetailList;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SdlEventDetailList.
         */
        public Builder sdlEventDetailList(java.util.List<SdlEventDetailList> sdlEventDetailList) {
            this.sdlEventDetailList = sdlEventDetailList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSdlEventDetailResponseBody build() {
            return new DescribeSdlEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSdlEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSdlEventDetailResponseBody</p>
     */
    public static class SdlEventDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataCnt")
        private Long sensitiveDataCnt;

        @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
        private String sensitiveLevel;

        @com.aliyun.core.annotation.NameInMap("SensitiveType")
        private String sensitiveType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private SdlEventDetailList(Builder builder) {
            this.eventName = builder.eventName;
            this.sensitiveDataCnt = builder.sensitiveDataCnt;
            this.sensitiveLevel = builder.sensitiveLevel;
            this.sensitiveType = builder.sensitiveType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdlEventDetailList create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return sensitiveDataCnt
         */
        public Long getSensitiveDataCnt() {
            return this.sensitiveDataCnt;
        }

        /**
         * @return sensitiveLevel
         */
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        /**
         * @return sensitiveType
         */
        public String getSensitiveType() {
            return this.sensitiveType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String eventName; 
            private Long sensitiveDataCnt; 
            private String sensitiveLevel; 
            private String sensitiveType; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(SdlEventDetailList model) {
                this.eventName = model.eventName;
                this.sensitiveDataCnt = model.sensitiveDataCnt;
                this.sensitiveLevel = model.sensitiveLevel;
                this.sensitiveType = model.sensitiveType;
                this.startTime = model.startTime;
            } 

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * SensitiveDataCnt.
             */
            public Builder sensitiveDataCnt(Long sensitiveDataCnt) {
                this.sensitiveDataCnt = sensitiveDataCnt;
                return this;
            }

            /**
             * SensitiveLevel.
             */
            public Builder sensitiveLevel(String sensitiveLevel) {
                this.sensitiveLevel = sensitiveLevel;
                return this;
            }

            /**
             * SensitiveType.
             */
            public Builder sensitiveType(String sensitiveType) {
                this.sensitiveType = sensitiveType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SdlEventDetailList build() {
                return new SdlEventDetailList(this);
            } 

        } 

    }
}
