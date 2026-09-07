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
 * {@link UpdatePrivateAccessApplicationL7SwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateAccessApplicationL7SwitchRequest</p>
 */
public class UpdatePrivateAccessApplicationL7SwitchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTagMarkStatus")
    private String devTagMarkStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DownloadAuditStatus")
    private String downloadAuditStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortRanges")
    private java.util.List<PortRanges> portRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcIpMarkStatus")
    private String srcIpMarkStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeoutSec")
    private Integer timeoutSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserMarkStatus")
    private String userMarkStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZeroTrustStatus")
    private String zeroTrustStatus;

    private UpdatePrivateAccessApplicationL7SwitchRequest(Builder builder) {
        super(builder);
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

    public static UpdatePrivateAccessApplicationL7SwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdatePrivateAccessApplicationL7SwitchRequest, Builder> {
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
            super();
        } 

        private Builder(UpdatePrivateAccessApplicationL7SwitchRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.devTagMarkStatus = request.devTagMarkStatus;
            this.downloadAuditStatus = request.downloadAuditStatus;
            this.portRanges = request.portRanges;
            this.srcIpMarkStatus = request.srcIpMarkStatus;
            this.status = request.status;
            this.timeoutSec = request.timeoutSec;
            this.userMarkStatus = request.userMarkStatus;
            this.zeroTrustStatus = request.zeroTrustStatus;
        } 

        /**
         * <p>The ID of the internal-facing application. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The device tag mark switch. Required. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder devTagMarkStatus(String devTagMarkStatus) {
            this.putBodyParameter("DevTagMarkStatus", devTagMarkStatus);
            this.devTagMarkStatus = devTagMarkStatus;
            return this;
        }

        /**
         * <p>The sensitive application download audit switch. Optional. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder downloadAuditStatus(String downloadAuditStatus) {
            this.putBodyParameter("DownloadAuditStatus", downloadAuditStatus);
            this.downloadAuditStatus = downloadAuditStatus;
            return this;
        }

        /**
         * <p>The collection of port ranges for the internal-facing application. Multiple port ranges cannot be duplicated or overlap. You can specify up to 50 port ranges. This parameter takes effect and is validated only when Status is set to <strong>Enabled</strong>. If this parameter is not specified or an empty collection is passed in, the default ports 80, 443, 8080, and 465 are used. The effective ports are the intersection of the ports specified in this request and the port ranges already configured for the internal-facing application.</p>
         */
        public Builder portRanges(java.util.List<PortRanges> portRanges) {
            this.putBodyParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * <p>The source IP mark switch. Required. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder srcIpMarkStatus(String srcIpMarkStatus) {
            this.putBodyParameter("SrcIpMarkStatus", srcIpMarkStatus);
            this.srcIpMarkStatus = srcIpMarkStatus;
            return this;
        }

        /**
         * <p>The master switch for Layer 7 access of the internal-facing application. Required. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * <p>When the value is <strong>Disabled</strong>, PortRanges is neither validated nor saved.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The request timeout period, in seconds. Valid values: 1 to 3600. Default value: 60. If this parameter is not specified or an invalid value is specified, the value 60 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeoutSec(Integer timeoutSec) {
            this.putBodyParameter("TimeoutSec", timeoutSec);
            this.timeoutSec = timeoutSec;
            return this;
        }

        /**
         * <p>The user mark switch. Required. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder userMarkStatus(String userMarkStatus) {
            this.putBodyParameter("UserMarkStatus", userMarkStatus);
            this.userMarkStatus = userMarkStatus;
            return this;
        }

        /**
         * <p>The host bypass prevention switch. Required. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder zeroTrustStatus(String zeroTrustStatus) {
            this.putBodyParameter("ZeroTrustStatus", zeroTrustStatus);
            this.zeroTrustStatus = zeroTrustStatus;
            return this;
        }

        @Override
        public UpdatePrivateAccessApplicationL7SwitchRequest build() {
            return new UpdatePrivateAccessApplicationL7SwitchRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrivateAccessApplicationL7SwitchRequest} extends {@link TeaModel}
     *
     * <p>UpdatePrivateAccessApplicationL7SwitchRequest</p>
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
}
