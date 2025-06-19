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
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * IsRepeatedRequest.
         */
        public Builder isRepeatedRequest(Boolean isRepeatedRequest) {
            this.isRepeatedRequest = isRepeatedRequest;
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
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
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
         * StateInfo.
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
