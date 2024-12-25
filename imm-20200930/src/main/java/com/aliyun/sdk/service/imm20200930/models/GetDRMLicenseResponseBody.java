// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link GetDRMLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDRMLicenseResponseBody</p>
 */
public class GetDRMLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    private String deviceInfo;

    @com.aliyun.core.annotation.NameInMap("License")
    private String license;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("States")
    private Long states;

    private GetDRMLicenseResponseBody(Builder builder) {
        this.deviceInfo = builder.deviceInfo;
        this.license = builder.license;
        this.requestId = builder.requestId;
        this.states = builder.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDRMLicenseResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceInfo
     */
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return states
     */
    public Long getStates() {
        return this.states;
    }

    public static final class Builder {
        private String deviceInfo; 
        private String license; 
        private String requestId; 
        private Long states; 

        /**
         * DeviceInfo.
         */
        public Builder deviceInfo(String deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * License.
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * States.
         */
        public Builder states(Long states) {
            this.states = states;
            return this;
        }

        public GetDRMLicenseResponseBody build() {
            return new GetDRMLicenseResponseBody(this);
        } 

    } 

}
