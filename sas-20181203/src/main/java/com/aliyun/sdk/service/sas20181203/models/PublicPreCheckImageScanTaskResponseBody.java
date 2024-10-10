// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PublicPreCheckImageScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>PublicPreCheckImageScanTaskResponseBody</p>
 */
public class PublicPreCheckImageScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PublicPreCheckImageScanTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicPreCheckImageScanTaskResponseBody create() {
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

        public PublicPreCheckImageScanTaskResponseBody build() {
            return new PublicPreCheckImageScanTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PublicPreCheckImageScanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>PublicPreCheckImageScanTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NeedAuthCount")
        private Integer needAuthCount;

        @com.aliyun.core.annotation.NameInMap("ScanImageCount")
        private Integer scanImageCount;

        private Data(Builder builder) {
            this.needAuthCount = builder.needAuthCount;
            this.scanImageCount = builder.scanImageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return needAuthCount
         */
        public Integer getNeedAuthCount() {
            return this.needAuthCount;
        }

        /**
         * @return scanImageCount
         */
        public Integer getScanImageCount() {
            return this.scanImageCount;
        }

        public static final class Builder {
            private Integer needAuthCount; 
            private Integer scanImageCount; 

            /**
             * NeedAuthCount.
             */
            public Builder needAuthCount(Integer needAuthCount) {
                this.needAuthCount = needAuthCount;
                return this;
            }

            /**
             * ScanImageCount.
             */
            public Builder scanImageCount(Integer scanImageCount) {
                this.scanImageCount = scanImageCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
