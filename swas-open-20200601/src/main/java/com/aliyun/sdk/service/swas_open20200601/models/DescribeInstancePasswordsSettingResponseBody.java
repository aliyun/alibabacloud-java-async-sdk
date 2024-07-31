// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePasswordsSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancePasswordsSettingResponseBody</p>
 */
public class DescribeInstancePasswordsSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstancePasswordSetting")
    private Boolean instancePasswordSetting;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VncPasswordSetting")
    private Boolean vncPasswordSetting;

    private DescribeInstancePasswordsSettingResponseBody(Builder builder) {
        this.instancePasswordSetting = builder.instancePasswordSetting;
        this.requestId = builder.requestId;
        this.vncPasswordSetting = builder.vncPasswordSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancePasswordsSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancePasswordSetting
     */
    public Boolean getInstancePasswordSetting() {
        return this.instancePasswordSetting;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vncPasswordSetting
     */
    public Boolean getVncPasswordSetting() {
        return this.vncPasswordSetting;
    }

    public static final class Builder {
        private Boolean instancePasswordSetting; 
        private String requestId; 
        private Boolean vncPasswordSetting; 

        /**
         * Indicates whether a logon password is set for the simple application server.
         */
        public Builder instancePasswordSetting(Boolean instancePasswordSetting) {
            this.instancePasswordSetting = instancePasswordSetting;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether a VNC connection password is set.
         */
        public Builder vncPasswordSetting(Boolean vncPasswordSetting) {
            this.vncPasswordSetting = vncPasswordSetting;
            return this;
        }

        public DescribeInstancePasswordsSettingResponseBody build() {
            return new DescribeInstancePasswordsSettingResponseBody(this);
        } 

    } 

}
