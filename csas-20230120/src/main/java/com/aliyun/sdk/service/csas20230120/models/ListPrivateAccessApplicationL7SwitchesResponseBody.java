// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListPrivateAccessApplicationL7SwitchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessApplicationL7SwitchesResponseBody</p>
 */
public class ListPrivateAccessApplicationL7SwitchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("L7Switches")
    private java.util.List<L7Switches> l7Switches;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrivateAccessApplicationL7SwitchesResponseBody(Builder builder) {
        this.l7Switches = builder.l7Switches;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessApplicationL7SwitchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return l7Switches
     */
    public java.util.List<L7Switches> getL7Switches() {
        return this.l7Switches;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<L7Switches> l7Switches; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrivateAccessApplicationL7SwitchesResponseBody model) {
            this.l7Switches = model.l7Switches;
            this.requestId = model.requestId;
        } 

        /**
         * L7Switches.
         */
        public Builder l7Switches(java.util.List<L7Switches> l7Switches) {
            this.l7Switches = l7Switches;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ED459CAD-8D3F-51B8-AEA5-CAABC0325022</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBody build() {
            return new ListPrivateAccessApplicationL7SwitchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateAccessApplicationL7SwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessApplicationL7SwitchesResponseBody</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

        private PortRanges(Builder builder) {
            this.begin = builder.begin;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        public static final class Builder {
            private Integer begin; 
            private Integer end; 

            private Builder() {
            } 

            private Builder(PortRanges model) {
                this.begin = model.begin;
                this.end = model.end;
            } 

            /**
             * Begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrivateAccessApplicationL7SwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessApplicationL7SwitchesResponseBody</p>
     */
    public static class L7Switches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("DevTagMarkStatus")
        private String devTagMarkStatus;

        @com.aliyun.core.annotation.NameInMap("DownloadAuditStatus")
        private String downloadAuditStatus;

        @com.aliyun.core.annotation.NameInMap("PortRanges")
        private java.util.List<PortRanges> portRanges;

        @com.aliyun.core.annotation.NameInMap("SrcIpMarkStatus")
        private String srcIpMarkStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeoutSec")
        private Integer timeoutSec;

        @com.aliyun.core.annotation.NameInMap("UserMarkStatus")
        private String userMarkStatus;

        @com.aliyun.core.annotation.NameInMap("ZeroTrustStatus")
        private String zeroTrustStatus;

        private L7Switches(Builder builder) {
            this.applicationId = builder.applicationId;
            this.devTagMarkStatus = builder.devTagMarkStatus;
            this.downloadAuditStatus = builder.downloadAuditStatus;
            this.portRanges = builder.portRanges;
            this.srcIpMarkStatus = builder.srcIpMarkStatus;
            this.status = builder.status;
            this.timeoutSec = builder.timeoutSec;
            this.userMarkStatus = builder.userMarkStatus;
            this.zeroTrustStatus = builder.zeroTrustStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static L7Switches create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return devTagMarkStatus
         */
        public String getDevTagMarkStatus() {
            return this.devTagMarkStatus;
        }

        /**
         * @return downloadAuditStatus
         */
        public String getDownloadAuditStatus() {
            return this.downloadAuditStatus;
        }

        /**
         * @return portRanges
         */
        public java.util.List<PortRanges> getPortRanges() {
            return this.portRanges;
        }

        /**
         * @return srcIpMarkStatus
         */
        public String getSrcIpMarkStatus() {
            return this.srcIpMarkStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeoutSec
         */
        public Integer getTimeoutSec() {
            return this.timeoutSec;
        }

        /**
         * @return userMarkStatus
         */
        public String getUserMarkStatus() {
            return this.userMarkStatus;
        }

        /**
         * @return zeroTrustStatus
         */
        public String getZeroTrustStatus() {
            return this.zeroTrustStatus;
        }

        public static final class Builder {
            private String applicationId; 
            private String devTagMarkStatus; 
            private String downloadAuditStatus; 
            private java.util.List<PortRanges> portRanges; 
            private String srcIpMarkStatus; 
            private String status; 
            private Integer timeoutSec; 
            private String userMarkStatus; 
            private String zeroTrustStatus; 

            private Builder() {
            } 

            private Builder(L7Switches model) {
                this.applicationId = model.applicationId;
                this.devTagMarkStatus = model.devTagMarkStatus;
                this.downloadAuditStatus = model.downloadAuditStatus;
                this.portRanges = model.portRanges;
                this.srcIpMarkStatus = model.srcIpMarkStatus;
                this.status = model.status;
                this.timeoutSec = model.timeoutSec;
                this.userMarkStatus = model.userMarkStatus;
                this.zeroTrustStatus = model.zeroTrustStatus;
            } 

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * DevTagMarkStatus.
             */
            public Builder devTagMarkStatus(String devTagMarkStatus) {
                this.devTagMarkStatus = devTagMarkStatus;
                return this;
            }

            /**
             * DownloadAuditStatus.
             */
            public Builder downloadAuditStatus(String downloadAuditStatus) {
                this.downloadAuditStatus = downloadAuditStatus;
                return this;
            }

            /**
             * PortRanges.
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * SrcIpMarkStatus.
             */
            public Builder srcIpMarkStatus(String srcIpMarkStatus) {
                this.srcIpMarkStatus = srcIpMarkStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TimeoutSec.
             */
            public Builder timeoutSec(Integer timeoutSec) {
                this.timeoutSec = timeoutSec;
                return this;
            }

            /**
             * UserMarkStatus.
             */
            public Builder userMarkStatus(String userMarkStatus) {
                this.userMarkStatus = userMarkStatus;
                return this;
            }

            /**
             * ZeroTrustStatus.
             */
            public Builder zeroTrustStatus(String zeroTrustStatus) {
                this.zeroTrustStatus = zeroTrustStatus;
                return this;
            }

            public L7Switches build() {
                return new L7Switches(this);
            } 

        } 

    }
}
