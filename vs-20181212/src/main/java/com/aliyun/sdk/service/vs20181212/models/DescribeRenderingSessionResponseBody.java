// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeRenderingSessionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRenderingSessionResponseBody</p>
 */
public class DescribeRenderingSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalIngresses")
    private java.util.List<AdditionalIngresses> additionalIngresses;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.NameInMap("Location")
    private Location location;

    @com.aliyun.core.annotation.NameInMap("PatchId")
    private String patchId;

    @com.aliyun.core.annotation.NameInMap("PortMappings")
    private java.util.List<PortMappings> portMappings;

    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StateInfo")
    private StateInfo stateInfo;

    private DescribeRenderingSessionResponseBody(Builder builder) {
        this.additionalIngresses = builder.additionalIngresses;
        this.appId = builder.appId;
        this.clientId = builder.clientId;
        this.hostname = builder.hostname;
        this.isp = builder.isp;
        this.location = builder.location;
        this.patchId = builder.patchId;
        this.portMappings = builder.portMappings;
        this.renderingInstanceId = builder.renderingInstanceId;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.startTime = builder.startTime;
        this.stateInfo = builder.stateInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalIngresses
     */
    public java.util.List<AdditionalIngresses> getAdditionalIngresses() {
        return this.additionalIngresses;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return location
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * @return patchId
     */
    public String getPatchId() {
        return this.patchId;
    }

    /**
     * @return portMappings
     */
    public java.util.List<PortMappings> getPortMappings() {
        return this.portMappings;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return stateInfo
     */
    public StateInfo getStateInfo() {
        return this.stateInfo;
    }

    public static final class Builder {
        private java.util.List<AdditionalIngresses> additionalIngresses; 
        private String appId; 
        private String clientId; 
        private String hostname; 
        private String isp; 
        private Location location; 
        private String patchId; 
        private java.util.List<PortMappings> portMappings; 
        private String renderingInstanceId; 
        private String requestId; 
        private String sessionId; 
        private String startTime; 
        private StateInfo stateInfo; 

        private Builder() {
        } 

        private Builder(DescribeRenderingSessionResponseBody model) {
            this.additionalIngresses = model.additionalIngresses;
            this.appId = model.appId;
            this.clientId = model.clientId;
            this.hostname = model.hostname;
            this.isp = model.isp;
            this.location = model.location;
            this.patchId = model.patchId;
            this.portMappings = model.portMappings;
            this.renderingInstanceId = model.renderingInstanceId;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.startTime = model.startTime;
            this.stateInfo = model.stateInfo;
        } 

        /**
         * <p>Additional optional ingress network information</p>
         */
        public Builder additionalIngresses(java.util.List<AdditionalIngresses> additionalIngresses) {
            this.additionalIngresses = additionalIngresses;
            return this;
        }

        /**
         * <p>Cloud application ID</p>
         * 
         * <strong>example:</strong>
         * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>End client ID</p>
         * 
         * <strong>example:</strong>
         * <p>c91263a0-f9ac-45bd-bbe9-6e293ad32d91</p>
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>Instance hostname. Defaults to the EIP address.</p>
         * 
         * <strong>example:</strong>
         * <p>111.45.29.96</p>
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>Carrier code. Valid values:</p>
         * <ol>
         * <li><p>cmcc</p>
         * </li>
         * <li><p>unicom</p>
         * </li>
         * <li><p>telecom</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        public Builder isp(String isp) {
            this.isp = isp;
            return this;
        }

        /**
         * <p>Cloud application service instance location</p>
         */
        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        /**
         * <p>Cloud application patch package ID. An empty value means the original version.</p>
         * 
         * <strong>example:</strong>
         * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
         */
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            return this;
        }

        /**
         * <p>Port mapping information</p>
         */
        public Builder portMappings(java.util.List<PortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }

        /**
         * <p>Cloud application service instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Session ID</p>
         * 
         * <strong>example:</strong>
         * <p>session-i205217481741918129226</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>Start time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-18T02:20:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Session state information</p>
         */
        public Builder stateInfo(StateInfo stateInfo) {
            this.stateInfo = stateInfo;
            return this;
        }

        public DescribeRenderingSessionResponseBody build() {
            return new DescribeRenderingSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingSessionResponseBody</p>
     */
    public static class AdditionalIngressesPortMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        private AdditionalIngressesPortMappings(Builder builder) {
            this.externalPort = builder.externalPort;
            this.internalPort = builder.internalPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalIngressesPortMappings create() {
            return builder().build();
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return internalPort
         */
        public String getInternalPort() {
            return this.internalPort;
        }

        public static final class Builder {
            private String externalPort; 
            private String internalPort; 

            private Builder() {
            } 

            private Builder(AdditionalIngressesPortMappings model) {
                this.externalPort = model.externalPort;
                this.internalPort = model.internalPort;
            } 

            /**
             * <p>Public port or port range, such as 22. For a port range, use a forward slash (/) to separate the start and end ports. Example: 10/20.</p>
             * 
             * <strong>example:</strong>
             * <p>11060/11079</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>Private port or port range. Each private port maps one-to-one with a public port. For a port range, use a forward slash (/) to separate the start and end ports. Example: 10/20.</p>
             * 
             * <strong>example:</strong>
             * <p>11060/11079</p>
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            public AdditionalIngressesPortMappings build() {
                return new AdditionalIngressesPortMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingSessionResponseBody</p>
     */
    public static class AdditionalIngresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("PortMappings")
        private java.util.List<AdditionalIngressesPortMappings> portMappings;

        private AdditionalIngresses(Builder builder) {
            this.hostname = builder.hostname;
            this.isp = builder.isp;
            this.portMappings = builder.portMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalIngresses create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return portMappings
         */
        public java.util.List<AdditionalIngressesPortMappings> getPortMappings() {
            return this.portMappings;
        }

        public static final class Builder {
            private String hostname; 
            private String isp; 
            private java.util.List<AdditionalIngressesPortMappings> portMappings; 

            private Builder() {
            } 

            private Builder(AdditionalIngresses model) {
                this.hostname = model.hostname;
                this.isp = model.isp;
                this.portMappings = model.portMappings;
            } 

            /**
             * <p>Domain name or IP address of the cloud application service instance</p>
             * 
             * <strong>example:</strong>
             * <p>111.45.29.96</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Carrier code. Valid values:</p>
             * <ol>
             * <li><p>cmcc</p>
             * </li>
             * <li><p>unicom</p>
             * </li>
             * <li><p>telecom</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>List of port mappings</p>
             */
            public Builder portMappings(java.util.List<AdditionalIngressesPortMappings> portMappings) {
                this.portMappings = portMappings;
                return this;
            }

            public AdditionalIngresses build() {
                return new AdditionalIngresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingSessionResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProvinceCode")
        private String provinceCode;

        private Location(Builder builder) {
            this.provinceCode = builder.provinceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return provinceCode
         */
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public static final class Builder {
            private String provinceCode; 

            private Builder() {
            } 

            private Builder(Location model) {
                this.provinceCode = model.provinceCode;
            } 

            /**
             * <p>Province code of the cloud application service instance</p>
             * 
             * <strong>example:</strong>
             * <p>310000</p>
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingSessionResponseBody</p>
     */
    public static class PortMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        private PortMappings(Builder builder) {
            this.externalPort = builder.externalPort;
            this.internalPort = builder.internalPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortMappings create() {
            return builder().build();
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return internalPort
         */
        public String getInternalPort() {
            return this.internalPort;
        }

        public static final class Builder {
            private String externalPort; 
            private String internalPort; 

            private Builder() {
            } 

            private Builder(PortMappings model) {
                this.externalPort = model.externalPort;
                this.internalPort = model.internalPort;
            } 

            /**
             * <p>Public port or port range, such as 22. For a port range, use a forward slash (/) to separate the start and end ports. Example: 10/20.</p>
             * 
             * <strong>example:</strong>
             * <p>10013/10020</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>Private port or port range. Each private port maps one-to-one with a public port. For a port range, use a forward slash (/) to separate the start and end ports. Example: 10/20.</p>
             * 
             * <strong>example:</strong>
             * <p>49008/49015</p>
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            public PortMappings build() {
                return new PortMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingSessionResponseBody</p>
     */
    public static class StateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private StateInfo(Builder builder) {
            this.comment = builder.comment;
            this.state = builder.state;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateInfo create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String comment; 
            private String state; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(StateInfo model) {
                this.comment = model.comment;
                this.state = model.state;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>State description</p>
             * 
             * <strong>example:</strong>
             * <p>已启动</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Session state. Valid values:</p>
             * <ol>
             * <li><p>SessionStarting: Starting the session</p>
             * </li>
             * <li><p>SessionStartSuspended: Session start is suspended. Retry by calling Start again.</p>
             * </li>
             * <li><p>SessionStarted: Session started or in use</p>
             * </li>
             * <li><p>SessionStartFailed: Session failed to start</p>
             * </li>
             * <li><p>SessionAbnormal: Session became abnormal after starting successfully</p>
             * </li>
             * <li><p>SessionStopping: Stopping the session</p>
             * </li>
             * <li><p>SessionStopFailed: Session failed to stop</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>SessionStarted</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Time when the state was last updated</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-15T10:05:20+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StateInfo build() {
                return new StateInfo(this);
            } 

        } 

    }
}
