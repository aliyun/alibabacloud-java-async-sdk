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
 * {@link UpdatePrivateAccessApplicationL7SwitchResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrivateAccessApplicationL7SwitchResponseBody</p>
 */
public class UpdatePrivateAccessApplicationL7SwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("L7Switch")
    private L7Switch l7Switch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdatePrivateAccessApplicationL7SwitchResponseBody(Builder builder) {
        this.l7Switch = builder.l7Switch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateAccessApplicationL7SwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return l7Switch
     */
    public L7Switch getL7Switch() {
        return this.l7Switch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private L7Switch l7Switch; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdatePrivateAccessApplicationL7SwitchResponseBody model) {
            this.l7Switch = model.l7Switch;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Layer 7 access switch configuration of the internal-facing application after this update.</p>
         */
        public Builder l7Switch(L7Switch l7Switch) {
            this.l7Switch = l7Switch;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBody build() {
            return new UpdatePrivateAccessApplicationL7SwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrivateAccessApplicationL7SwitchResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePrivateAccessApplicationL7SwitchResponseBody</p>
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
             * <p>The start port. The value must be less than or equal to the end port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The end port. The value must be greater than or equal to the start port.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
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
     * {@link UpdatePrivateAccessApplicationL7SwitchResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePrivateAccessApplicationL7SwitchResponseBody</p>
     */
    public static class L7Switch extends TeaModel {
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

        private L7Switch(Builder builder) {
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

        public static L7Switch create() {
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

            private Builder(L7Switch model) {
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
             * <p>The ID of the internal-facing application.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-e12860ef6c48****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The device tag mark switch. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder devTagMarkStatus(String devTagMarkStatus) {
                this.devTagMarkStatus = devTagMarkStatus;
                return this;
            }

            /**
             * <p>The sensitive application download audit switch. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder downloadAuditStatus(String downloadAuditStatus) {
                this.downloadAuditStatus = downloadAuditStatus;
                return this;
            }

            /**
             * <p>The collection of port ranges that are effective for Layer 7 access. This is the intersection of the ports specified in this request and the port ranges already configured for the internal-facing application. An empty collection is returned when Status is set to <strong>Disabled</strong>.</p>
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * <p>The source IP mark switch. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder srcIpMarkStatus(String srcIpMarkStatus) {
                this.srcIpMarkStatus = srcIpMarkStatus;
                return this;
            }

            /**
             * <p>The master switch for Layer 7 access of the internal-facing application. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The request timeout period, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeoutSec(Integer timeoutSec) {
                this.timeoutSec = timeoutSec;
                return this;
            }

            /**
             * <p>The user mark switch. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder userMarkStatus(String userMarkStatus) {
                this.userMarkStatus = userMarkStatus;
                return this;
            }

            /**
             * <p>The host bypass prevention switch. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder zeroTrustStatus(String zeroTrustStatus) {
                this.zeroTrustStatus = zeroTrustStatus;
                return this;
            }

            public L7Switch build() {
                return new L7Switch(this);
            } 

        } 

    }
}
