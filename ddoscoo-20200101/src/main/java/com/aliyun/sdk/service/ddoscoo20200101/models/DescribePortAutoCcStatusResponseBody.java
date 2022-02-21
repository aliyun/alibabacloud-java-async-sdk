// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortAutoCcStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortAutoCcStatusResponseBody</p>
 */
public class DescribePortAutoCcStatusResponseBody extends TeaModel {
    @NameInMap("PortAutoCcStatus")
    private java.util.List < PortAutoCcStatus> portAutoCcStatus;

    @NameInMap("RequestId")
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
    public java.util.List < PortAutoCcStatus> getPortAutoCcStatus() {
        return this.portAutoCcStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PortAutoCcStatus> portAutoCcStatus; 
        private String requestId; 

        /**
         * PortAutoCcStatus.
         */
        public Builder portAutoCcStatus(java.util.List < PortAutoCcStatus> portAutoCcStatus) {
            this.portAutoCcStatus = portAutoCcStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortAutoCcStatusResponseBody build() {
            return new DescribePortAutoCcStatusResponseBody(this);
        } 

    } 

    public static class PortAutoCcStatus extends TeaModel {
        @NameInMap("Mode")
        private String mode;

        @NameInMap("Switch")
        private String _switch;

        @NameInMap("WebMode")
        private String webMode;

        @NameInMap("WebSwitch")
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
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Switch.
             */
            public Builder _switch(String _switch) {
                this._switch = _switch;
                return this;
            }

            /**
             * WebMode.
             */
            public Builder webMode(String webMode) {
                this.webMode = webMode;
                return this;
            }

            /**
             * WebSwitch.
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
