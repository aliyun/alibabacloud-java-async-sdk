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
 * {@link GetImageScanNumInPeriodResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageScanNumInPeriodResponseBody</p>
 */
public class GetImageScanNumInPeriodResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageScanData")
    private ImageScanData imageScanData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetImageScanNumInPeriodResponseBody model) {
            this.imageScanData = model.imageScanData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder imageScanData(ImageScanData imageScanData) {
            this.imageScanData = imageScanData;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageScanNumInPeriodResponseBody build() {
            return new GetImageScanNumInPeriodResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageScanNumInPeriodResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageScanNumInPeriodResponseBody</p>
     */
    public static class ImageScanData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageScanCount")
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

            private Builder() {
            } 

            private Builder(ImageScanData model) {
                this.imageScanCount = model.imageScanCount;
            } 

            /**
             * <p>The number of image scans.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
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
