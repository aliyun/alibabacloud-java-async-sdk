// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortAutoCcStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortAutoCcStatusResponseBody</p>
 */
public class DescribePortAutoCcStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortAutoCcStatus")
    private java.util.List<PortAutoCcStatus> portAutoCcStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePortAutoCcStatusResponseBody(Builder builder) {
        this.portAutoCcStatus = builder.portAutoCcStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortAutoCcStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return portAutoCcStatus
     */
    public java.util.List<PortAutoCcStatus> getPortAutoCcStatus() {
        return this.portAutoCcStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PortAutoCcStatus> portAutoCcStatus; 
        private String requestId; 

        /**
         * <p>An array that consists of the configurations of the Intelligent Protection policy.</p>
         */
        public Builder portAutoCcStatus(java.util.List<PortAutoCcStatus> portAutoCcStatus) {
            this.portAutoCcStatus = portAutoCcStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BC3C6403-F248-4125-B2C9-8733ED94EA85</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortAutoCcStatusResponseBody build() {
            return new DescribePortAutoCcStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortAutoCcStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortAutoCcStatusResponseBody</p>
     */
    public static class PortAutoCcStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Switch")
        private String _switch;

        @com.aliyun.core.annotation.NameInMap("WebMode")
        private String webMode;

        @com.aliyun.core.annotation.NameInMap("WebSwitch")
        private String webSwitch;

        private PortAutoCcStatus(Builder builder) {
            this.mode = builder.mode;
            this._switch = builder._switch;
            this.webMode = builder.webMode;
            this.webSwitch = builder.webSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortAutoCcStatus create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return _switch
         */
        public String get_switch() {
            return this._switch;
        }

        /**
         * @return webMode
         */
        public String getWebMode() {
            return this.webMode;
        }

        /**
         * @return webSwitch
         */
        public String getWebSwitch() {
            return this.webSwitch;
        }

        public static final class Builder {
            private String mode; 
            private String _switch; 
            private String webMode; 
            private String webSwitch; 

            /**
             * <p>The mode of the Intelligent Protection policy. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>loose</strong></li>
             * <li><strong>strict</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The status of the Intelligent Protection policy. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled</li>
             * <li><strong>off</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder _switch(String _switch) {
                this._switch = _switch;
                return this;
            }

            /**
             * <p>The protection mode for ports 80 and 443. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>loose</strong></li>
             * <li><strong>strict</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder webMode(String webMode) {
                this.webMode = webMode;
                return this;
            }

            /**
             * <p>The status of the Intelligent Protection policy for ports 80 and 443. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled</li>
             * <li><strong>off</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder webSwitch(String webSwitch) {
                this.webSwitch = webSwitch;
                return this;
            }

            public PortAutoCcStatus build() {
                return new PortAutoCcStatus(this);
            } 

        } 

    }
}
