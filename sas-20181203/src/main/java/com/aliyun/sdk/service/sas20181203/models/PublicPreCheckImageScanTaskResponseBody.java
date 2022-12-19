// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublicPreCheckImageScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>PublicPreCheckImageScanTaskResponseBody</p>
 */
public class PublicPreCheckImageScanTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The data returned if the call is successful.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublicPreCheckImageScanTaskResponseBody build() {
            return new PublicPreCheckImageScanTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("NeedAuthCount")
        private Integer needAuthCount;

        @NameInMap("ScanImageCount")
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
             * The number of images to scan in the task.
             */
            public Builder needAuthCount(Integer needAuthCount) {
                this.needAuthCount = needAuthCount;
                return this;
            }

            /**
             * The quota for container image scan to be consumed by the task.
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
