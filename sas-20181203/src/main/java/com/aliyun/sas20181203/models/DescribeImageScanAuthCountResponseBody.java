// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageScanAuthCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageScanAuthCountResponseBody</p>
 */
public class DescribeImageScanAuthCountResponseBody extends TeaModel {
    @NameInMap("ImageScan")
    private ImageScan imageScan;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageScanAuthCountResponseBody(Builder builder) {
        this.imageScan = builder.imageScan;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageScanAuthCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageScan
     */
    public ImageScan getImageScan() {
        return this.imageScan;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageScan imageScan; 
        private String requestId; 

        /**
         * ImageScan.
         */
        public Builder imageScan(ImageScan imageScan) {
            this.imageScan = imageScan;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageScanAuthCountResponseBody build() {
            return new DescribeImageScanAuthCountResponseBody(this);
        } 

    } 

    public static class ImageScan extends TeaModel {
        @NameInMap("ImageScanCapacity")
        private Long imageScanCapacity;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ScanCount")
        private Long scanCount;

        private ImageScan(Builder builder) {
            this.imageScanCapacity = builder.imageScanCapacity;
            this.instanceId = builder.instanceId;
            this.scanCount = builder.scanCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageScan create() {
            return builder().build();
        }

        /**
         * @return imageScanCapacity
         */
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return scanCount
         */
        public Long getScanCount() {
            return this.scanCount;
        }

        public static final class Builder {
            private Long imageScanCapacity; 
            private String instanceId; 
            private Long scanCount; 

            /**
             * ImageScanCapacity.
             */
            public Builder imageScanCapacity(Long imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ScanCount.
             */
            public Builder scanCount(Long scanCount) {
                this.scanCount = scanCount;
                return this;
            }

            public ImageScan build() {
                return new ImageScan(this);
            } 

        } 

    }
}
