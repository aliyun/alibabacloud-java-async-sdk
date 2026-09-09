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
 * {@link StartRenderingSessionResponseBody} extends {@link TeaModel}
 *
 * <p>StartRenderingSessionResponseBody</p>
 */
public class StartRenderingSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("IsRepeatedRequest")
    private Boolean isRepeatedRequest;

    @com.aliyun.core.annotation.NameInMap("Location")
    private Location location;

    @com.aliyun.core.annotation.NameInMap("PortMappings")
    private java.util.List<PortMappings> portMappings;

    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("StateInfo")
    private StateInfo stateInfo;

    private StartRenderingSessionResponseBody(Builder builder) {
        this.hostname = builder.hostname;
        this.isRepeatedRequest = builder.isRepeatedRequest;
        this.location = builder.location;
        this.portMappings = builder.portMappings;
        this.renderingInstanceId = builder.renderingInstanceId;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.stateInfo = builder.stateInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRenderingSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return isRepeatedRequest
     */
    public Boolean getIsRepeatedRequest() {
        return this.isRepeatedRequest;
    }

    /**
     * @return location
     */
    public Location getLocation() {
        return this.location;
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
     * @return stateInfo
     */
    public StateInfo getStateInfo() {
        return this.stateInfo;
    }

    public static final class Builder {
        private String hostname; 
        private Boolean isRepeatedRequest; 
        private Location location; 
        private java.util.List<PortMappings> portMappings; 
        private String renderingInstanceId; 
        private String requestId; 
        private String sessionId; 
        private StateInfo stateInfo; 

        private Builder() {
        } 

        private Builder(StartRenderingSessionResponseBody model) {
            this.hostname = model.hostname;
            this.isRepeatedRequest = model.isRepeatedRequest;
            this.location = model.location;
            this.portMappings = model.portMappings;
            this.renderingInstanceId = model.renderingInstanceId;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.stateInfo = model.stateInfo;
        } 

        /**
         * <p>Instance hostname. By default, this is the EIP used for access.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xxx.ecr.aliyuncs.com</p>
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>Is this a repeated request</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isRepeatedRequest(Boolean isRepeatedRequest) {
            this.isRepeatedRequest = isRepeatedRequest;
            return this;
        }

        /**
         * <p>Cloud application service instance location information</p>
         */
        public Builder location(Location location) {
            this.location = location;
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
         * <p>Session state information</p>
         */
        public Builder stateInfo(StateInfo stateInfo) {
            this.stateInfo = stateInfo;
            return this;
        }

        public StartRenderingSessionResponseBody build() {
            return new StartRenderingSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>StartRenderingSessionResponseBody</p>
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
             * <p>610000</p>
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
     * {@link StartRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>StartRenderingSessionResponseBody</p>
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
             * <p>External port or port range, such as 22. For a port range, separate the start and end ports with a forward slash (/), for example, 10/20.</p>
             * 
             * <strong>example:</strong>
             * <p>10013/10020</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>Internal port or port range. Ports correspond one-to-one with external ports. For a port range, separate the start and end ports with a forward slash (/), for example, 10/20.</p>
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
     * {@link StartRenderingSessionResponseBody} extends {@link TeaModel}
     *
     * <p>StartRenderingSessionResponseBody</p>
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
             * <p>会话启动中</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Session state</p>
             * 
             * <strong>example:</strong>
             * <p>SessionStarting</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Last update time of the state</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-06T06:37Z</p>
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
