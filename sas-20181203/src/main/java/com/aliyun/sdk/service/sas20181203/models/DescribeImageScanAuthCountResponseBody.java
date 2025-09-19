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
 * {@link DescribeImageScanAuthCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageScanAuthCountResponseBody</p>
 */
public class DescribeImageScanAuthCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageScan")
    private ImageScan imageScan;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeImageScanAuthCountResponseBody model) {
            this.imageScan = model.imageScan;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the quota for container image scan.</p>
         */
        public Builder imageScan(ImageScan imageScan) {
            this.imageScan = imageScan;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>892NYH839-0EDC-4CD0-A2EF-5BD294656C99</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageScanAuthCountResponseBody build() {
            return new DescribeImageScanAuthCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageScanAuthCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageScanAuthCountResponseBody</p>
     */
    public static class ImageScan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private Long imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ScanCount")
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

            private Builder() {
            } 

            private Builder(ImageScan model) {
                this.imageScanCapacity = model.imageScanCapacity;
                this.instanceId = model.instanceId;
                this.scanCount = model.scanCount;
            } 

            /**
             * <p>The quota for container image scan.</p>
             * 
             * <strong>example:</strong>
             * <p>15340</p>
             */
            public Builder imageScanCapacity(Long imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * <p>The instance ID of Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-qdl123412****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The consumed quota for container image scan.</p>
             * 
             * <strong>example:</strong>
             * <p>5489</p>
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
