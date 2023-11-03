// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssScanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssScanConfigResponseBody</p>
 */
public class GetOssScanConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetOssScanConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssScanConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssScanConfigResponseBody build() {
            return new GetOssScanConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BucketNameList")
        private java.util.List < String > bucketNameList;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("KeySuffixList")
        private java.util.List < String > keySuffixList;

        @NameInMap("ScanDayList")
        private java.util.List < Integer > scanDayList;

        @NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.bucketNameList = builder.bucketNameList;
            this.enable = builder.enable;
            this.endTime = builder.endTime;
            this.keySuffixList = builder.keySuffixList;
            this.scanDayList = builder.scanDayList;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucketNameList
         */
        public java.util.List < String > getBucketNameList() {
            return this.bucketNameList;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return keySuffixList
         */
        public java.util.List < String > getKeySuffixList() {
            return this.keySuffixList;
        }

        /**
         * @return scanDayList
         */
        public java.util.List < Integer > getScanDayList() {
            return this.scanDayList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < String > bucketNameList; 
            private Integer enable; 
            private String endTime; 
            private java.util.List < String > keySuffixList; 
            private java.util.List < Integer > scanDayList; 
            private String startTime; 

            /**
             * BucketNameList.
             */
            public Builder bucketNameList(java.util.List < String > bucketNameList) {
                this.bucketNameList = bucketNameList;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * KeySuffixList.
             */
            public Builder keySuffixList(java.util.List < String > keySuffixList) {
                this.keySuffixList = keySuffixList;
                return this;
            }

            /**
             * ScanDayList.
             */
            public Builder scanDayList(java.util.List < Integer > scanDayList) {
                this.scanDayList = scanDayList;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
