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
 * {@link DescribeSdlEventSdListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSdlEventSdListResponseBody</p>
 */
public class DescribeSdlEventSdListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SdlEventSensitiveDataList")
    private java.util.List<SdlEventSensitiveDataList> sdlEventSensitiveDataList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSdlEventSdListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdlEventSensitiveDataList = builder.sdlEventSensitiveDataList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlEventSdListResponseBody create() {
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
     * @return sdlEventSensitiveDataList
     */
    public java.util.List<SdlEventSensitiveDataList> getSdlEventSensitiveDataList() {
        return this.sdlEventSensitiveDataList;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SdlEventSensitiveDataList> sdlEventSensitiveDataList; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSdlEventSdListResponseBody model) {
            this.requestId = model.requestId;
            this.sdlEventSensitiveDataList = model.sdlEventSensitiveDataList;
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
         * SdlEventSensitiveDataList.
         */
        public Builder sdlEventSensitiveDataList(java.util.List<SdlEventSensitiveDataList> sdlEventSensitiveDataList) {
            this.sdlEventSensitiveDataList = sdlEventSensitiveDataList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSdlEventSdListResponseBody build() {
            return new DescribeSdlEventSdListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSdlEventSdListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSdlEventSdListResponseBody</p>
     */
    public static class SdlEventSensitiveDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SensitiveData")
        private String sensitiveData;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataCnt")
        private Long sensitiveDataCnt;

        @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
        private String sensitiveLevel;

        @com.aliyun.core.annotation.NameInMap("SensitiveType")
        private String sensitiveType;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private SdlEventSensitiveDataList(Builder builder) {
            this.sensitiveData = builder.sensitiveData;
            this.sensitiveDataCnt = builder.sensitiveDataCnt;
            this.sensitiveLevel = builder.sensitiveLevel;
            this.sensitiveType = builder.sensitiveType;
            this.srcIp = builder.srcIp;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdlEventSensitiveDataList create() {
            return builder().build();
        }

        /**
         * @return sensitiveData
         */
        public String getSensitiveData() {
            return this.sensitiveData;
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
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String sensitiveData; 
            private Long sensitiveDataCnt; 
            private String sensitiveLevel; 
            private String sensitiveType; 
            private String srcIp; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(SdlEventSensitiveDataList model) {
                this.sensitiveData = model.sensitiveData;
                this.sensitiveDataCnt = model.sensitiveDataCnt;
                this.sensitiveLevel = model.sensitiveLevel;
                this.sensitiveType = model.sensitiveType;
                this.srcIp = model.srcIp;
                this.startTime = model.startTime;
            } 

            /**
             * SensitiveData.
             */
            public Builder sensitiveData(String sensitiveData) {
                this.sensitiveData = sensitiveData;
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
             * SrcIp.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SdlEventSensitiveDataList build() {
                return new SdlEventSensitiveDataList(this);
            } 

        } 

    }
}
