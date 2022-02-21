// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountYunIdInfoResponseBody} extends {@link TeaModel}
 *
 * <p>CountYunIdInfoResponseBody</p>
 */
public class CountYunIdInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("YunIdInfo")
    private java.util.List < YunIdInfo> yunIdInfo;

    private CountYunIdInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.yunIdInfo = builder.yunIdInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountYunIdInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return yunIdInfo
     */
    public java.util.List < YunIdInfo> getYunIdInfo() {
        return this.yunIdInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < YunIdInfo> yunIdInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * YunIdInfo.
         */
        public Builder yunIdInfo(java.util.List < YunIdInfo> yunIdInfo) {
            this.yunIdInfo = yunIdInfo;
            return this;
        }

        public CountYunIdInfoResponseBody build() {
            return new CountYunIdInfoResponseBody(this);
        } 

    } 

    public static class YunIdInfo extends TeaModel {
        @NameInMap("TotalBrandCount")
        private Long totalBrandCount;

        @NameInMap("TotalDeviceCount")
        private Long totalDeviceCount;

        @NameInMap("TotalDeviceModelCount")
        private Long totalDeviceModelCount;

        private YunIdInfo(Builder builder) {
            this.totalBrandCount = builder.totalBrandCount;
            this.totalDeviceCount = builder.totalDeviceCount;
            this.totalDeviceModelCount = builder.totalDeviceModelCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static YunIdInfo create() {
            return builder().build();
        }

        /**
         * @return totalBrandCount
         */
        public Long getTotalBrandCount() {
            return this.totalBrandCount;
        }

        /**
         * @return totalDeviceCount
         */
        public Long getTotalDeviceCount() {
            return this.totalDeviceCount;
        }

        /**
         * @return totalDeviceModelCount
         */
        public Long getTotalDeviceModelCount() {
            return this.totalDeviceModelCount;
        }

        public static final class Builder {
            private Long totalBrandCount; 
            private Long totalDeviceCount; 
            private Long totalDeviceModelCount; 

            /**
             * TotalBrandCount.
             */
            public Builder totalBrandCount(Long totalBrandCount) {
                this.totalBrandCount = totalBrandCount;
                return this;
            }

            /**
             * TotalDeviceCount.
             */
            public Builder totalDeviceCount(Long totalDeviceCount) {
                this.totalDeviceCount = totalDeviceCount;
                return this;
            }

            /**
             * TotalDeviceModelCount.
             */
            public Builder totalDeviceModelCount(Long totalDeviceModelCount) {
                this.totalDeviceModelCount = totalDeviceModelCount;
                return this;
            }

            public YunIdInfo build() {
                return new YunIdInfo(this);
            } 

        } 

    }
}
