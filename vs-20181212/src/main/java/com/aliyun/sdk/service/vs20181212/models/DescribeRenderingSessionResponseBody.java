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
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("Location")
    private Location location;

    @com.aliyun.core.annotation.NameInMap("PortMappings")
    private java.util.List<PortMappings> portMappings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StateInfo")
    private StateInfo stateInfo;

    private DescribeRenderingSessionResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.clientId = builder.clientId;
        this.hostname = builder.hostname;
        this.location = builder.location;
        this.portMappings = builder.portMappings;
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
        private String appId; 
        private String clientId; 
        private String hostname; 
        private Location location; 
        private java.util.List<PortMappings> portMappings; 
        private String requestId; 
        private String sessionId; 
        private String startTime; 
        private StateInfo stateInfo; 

        private Builder() {
        } 

        private Builder(DescribeRenderingSessionResponseBody model) {
            this.appId = model.appId;
            this.clientId = model.clientId;
            this.hostname = model.hostname;
            this.location = model.location;
            this.portMappings = model.portMappings;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.startTime = model.startTime;
            this.stateInfo = model.stateInfo;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        /**
         * PortMappings.
         */
        public Builder portMappings(java.util.List<PortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * StateInfo.
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
             * ProvinceCode.
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
             * ExternalPort.
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * InternalPort.
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UpdateTime.
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
