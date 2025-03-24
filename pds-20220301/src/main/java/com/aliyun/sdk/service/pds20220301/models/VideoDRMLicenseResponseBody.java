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
         * <p>The returned DRM license.</p>
         * 
         * <strong>example:</strong>
         * <p>cb9swCy8P50H9KePsxET3jZ1tm41bDs9HTsxbWnsjf3bsf6QGdiS4kZPhDaskimbNyAfNjmhQRmWFt3AhwNF3</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The information about the device from which the DRM request was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder deviceInfo(String deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * <p>The request state returned by the DRM server.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
