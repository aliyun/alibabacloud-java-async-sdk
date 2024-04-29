// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotProbeBindRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotProbeBindRequest</p>
 */
public class CreateHoneypotProbeBindRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindPortList")
    private java.util.List < BindPortList> bindPortList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotId")
    private String honeypotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeId")
    private String probeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceIpList")
    private java.util.List < String > serviceIpList;

    private CreateHoneypotProbeBindRequest(Builder builder) {
        super(builder);
        this.bindPortList = builder.bindPortList;
        this.honeypotId = builder.honeypotId;
        this.lang = builder.lang;
        this.probeId = builder.probeId;
        this.serviceIpList = builder.serviceIpList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotProbeBindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindPortList
     */
    public java.util.List < BindPortList> getBindPortList() {
        return this.bindPortList;
    }

    /**
     * @return honeypotId
     */
    public String getHoneypotId() {
        return this.honeypotId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return probeId
     */
    public String getProbeId() {
        return this.probeId;
    }

    /**
     * @return serviceIpList
     */
    public java.util.List < String > getServiceIpList() {
        return this.serviceIpList;
    }

    public static final class Builder extends Request.Builder<CreateHoneypotProbeBindRequest, Builder> {
        private java.util.List < BindPortList> bindPortList; 
        private String honeypotId; 
        private String lang; 
        private String probeId; 
        private java.util.List < String > serviceIpList; 

        private Builder() {
            super();
        } 

        private Builder(CreateHoneypotProbeBindRequest request) {
            super(request);
            this.bindPortList = request.bindPortList;
            this.honeypotId = request.honeypotId;
            this.lang = request.lang;
            this.probeId = request.probeId;
            this.serviceIpList = request.serviceIpList;
        } 

        /**
         * The ports that are bound to the probe.
         */
        public Builder bindPortList(java.util.List < BindPortList> bindPortList) {
            this.putQueryParameter("BindPortList", bindPortList);
            this.bindPortList = bindPortList;
            return this;
        }

        /**
         * The honeypot ID.
         * <p>
         * 
         * >  You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The probe ID.
         * <p>
         * 
         * >  You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        /**
         * The IP addresses that are monitored.
         */
        public Builder serviceIpList(java.util.List < String > serviceIpList) {
            this.putQueryParameter("ServiceIpList", serviceIpList);
            this.serviceIpList = serviceIpList;
            return this;
        }

        @Override
        public CreateHoneypotProbeBindRequest build() {
            return new CreateHoneypotProbeBindRequest(this);
        } 

    } 

    public static class BindPortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindPort")
        private Boolean bindPort;

        @com.aliyun.core.annotation.NameInMap("EndPort")
        private Integer endPort;

        @com.aliyun.core.annotation.NameInMap("Fixed")
        private Boolean fixed;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("StartPort")
        private Integer startPort;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
        private Integer targetPort;

        private BindPortList(Builder builder) {
            this.bindPort = builder.bindPort;
            this.endPort = builder.endPort;
            this.fixed = builder.fixed;
            this.proto = builder.proto;
            this.startPort = builder.startPort;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindPortList create() {
            return builder().build();
        }

        /**
         * @return bindPort
         */
        public Boolean getBindPort() {
            return this.bindPort;
        }

        /**
         * @return endPort
         */
        public Integer getEndPort() {
            return this.endPort;
        }

        /**
         * @return fixed
         */
        public Boolean getFixed() {
            return this.fixed;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return startPort
         */
        public Integer getStartPort() {
            return this.startPort;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private Boolean bindPort; 
            private Integer endPort; 
            private Boolean fixed; 
            private String proto; 
            private Integer startPort; 
            private Integer targetPort; 

            /**
             * Specifies whether to bind the port. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder bindPort(Boolean bindPort) {
                this.bindPort = bindPort;
                return this;
            }

            /**
             * The end port on which the probe monitors.
             */
            public Builder endPort(Integer endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * Specifies whether the port is a fixed port. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * The start port on which the probe monitors.
             */
            public Builder startPort(Integer startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * The destination port.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public BindPortList build() {
                return new BindPortList(this);
            } 

        } 

    }
}
