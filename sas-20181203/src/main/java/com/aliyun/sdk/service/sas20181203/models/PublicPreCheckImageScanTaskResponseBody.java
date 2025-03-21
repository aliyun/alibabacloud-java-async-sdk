// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F9353221-40F4-5F98-B73C-2803DC804033</p>
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
             * <p>The number of images to scan in the task.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder needAuthCount(Integer needAuthCount) {
                this.needAuthCount = needAuthCount;
                return this;
            }

            /**
             * <p>The quota for container image scan to be consumed by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
