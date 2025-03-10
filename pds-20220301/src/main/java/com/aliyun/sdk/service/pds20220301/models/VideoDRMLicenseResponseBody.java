// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link VideoDRMLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>VideoDRMLicenseResponseBody</p>
 */
public class VideoDRMLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("device_info")
    private String deviceInfo;

    @com.aliyun.core.annotation.NameInMap("states")
    private String states;

    private VideoDRMLicenseResponseBody(Builder builder) {
        this.data = builder.data;
        this.deviceInfo = builder.deviceInfo;
        this.states = builder.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoDRMLicenseResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return deviceInfo
     */
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return states
     */
    public String getStates() {
        return this.states;
    }

    public static final class Builder {
        private String data; 
        private String deviceInfo; 
        private String states; 

        /**
         * data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * device_info.
         */
        public Builder deviceInfo(String deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * states.
         */
        public Builder states(String states) {
            this.states = states;
            return this;
        }

        public VideoDRMLicenseResponseBody build() {
            return new VideoDRMLicenseResponseBody(this);
        } 

    } 

}
