// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceConfigDiffResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceConfigDiffResponseBody</p>
 */
public class GetDeviceConfigDiffResponseBody extends TeaModel {
    @NameInMap("DeviceConfigDiff")
    private DeviceConfigDiff deviceConfigDiff;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceConfigDiffResponseBody(Builder builder) {
        this.deviceConfigDiff = builder.deviceConfigDiff;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceConfigDiffResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceConfigDiff
     */
    public DeviceConfigDiff getDeviceConfigDiff() {
        return this.deviceConfigDiff;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceConfigDiff deviceConfigDiff; 
        private String requestId; 

        /**
         * DeviceConfigDiff.
         */
        public Builder deviceConfigDiff(DeviceConfigDiff deviceConfigDiff) {
            this.deviceConfigDiff = deviceConfigDiff;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceConfigDiffResponseBody build() {
            return new GetDeviceConfigDiffResponseBody(this);
        } 

    } 

    public static class DeviceConfigDiff extends TeaModel {
        @NameInMap("ExtractDiff")
        private String extractDiff;

        @NameInMap("TotalDiff")
        private String totalDiff;

        private DeviceConfigDiff(Builder builder) {
            this.extractDiff = builder.extractDiff;
            this.totalDiff = builder.totalDiff;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceConfigDiff create() {
            return builder().build();
        }

        /**
         * @return extractDiff
         */
        public String getExtractDiff() {
            return this.extractDiff;
        }

        /**
         * @return totalDiff
         */
        public String getTotalDiff() {
            return this.totalDiff;
        }

        public static final class Builder {
            private String extractDiff; 
            private String totalDiff; 

            /**
             * ExtractDiff.
             */
            public Builder extractDiff(String extractDiff) {
                this.extractDiff = extractDiff;
                return this;
            }

            /**
             * TotalDiff.
             */
            public Builder totalDiff(String totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            public DeviceConfigDiff build() {
                return new DeviceConfigDiff(this);
            } 

        } 

    }
}
