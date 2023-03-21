// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageScanNumInPeriodResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageScanNumInPeriodResponseBody</p>
 */
public class GetImageScanNumInPeriodResponseBody extends TeaModel {
    @NameInMap("ImageScanData")
    private ImageScanData imageScanData;

    @NameInMap("RequestId")
    private String requestId;

    private GetImageScanNumInPeriodResponseBody(Builder builder) {
        this.imageScanData = builder.imageScanData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageScanNumInPeriodResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageScanData
     */
    public ImageScanData getImageScanData() {
        return this.imageScanData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageScanData imageScanData; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder imageScanData(ImageScanData imageScanData) {
            this.imageScanData = imageScanData;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageScanNumInPeriodResponseBody build() {
            return new GetImageScanNumInPeriodResponseBody(this);
        } 

    } 

    public static class ImageScanData extends TeaModel {
        @NameInMap("ImageScanCount")
        private Integer imageScanCount;

        private ImageScanData(Builder builder) {
            this.imageScanCount = builder.imageScanCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageScanData create() {
            return builder().build();
        }

        /**
         * @return imageScanCount
         */
        public Integer getImageScanCount() {
            return this.imageScanCount;
        }

        public static final class Builder {
            private Integer imageScanCount; 

            /**
             * The number of image scans.
             */
            public Builder imageScanCount(Integer imageScanCount) {
                this.imageScanCount = imageScanCount;
                return this;
            }

            public ImageScanData build() {
                return new ImageScanData(this);
            } 

        } 

    }
}
