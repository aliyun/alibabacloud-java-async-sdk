// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotProbeBindRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotProbeBindRequest</p>
 */
public class UpdateHoneypotProbeBindRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindId")
    private String bindId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindPortList")
    private java.util.List < BindPortList> bindPortList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindType")
    private String bindType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotId")
    private String honeypotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ports")
    private String ports;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeId")
    private String probeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceIpList")
    private java.util.List < String > serviceIpList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SetStatus")
    private Integer setStatus;

    private UpdateHoneypotProbeBindRequest(Builder builder) {
        super(builder);
        this.bindId = builder.bindId;
        this.bindPortList = builder.bindPortList;
        this.bindType = builder.bindType;
        this.currentPage = builder.currentPage;
        this.honeypotId = builder.honeypotId;
        this.id = builder.id;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ports = builder.ports;
        this.probeId = builder.probeId;
        this.serviceIpList = builder.serviceIpList;
        this.setStatus = builder.setStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHoneypotProbeBindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindId
     */
    public String getBindId() {
        return this.bindId;
    }

    /**
     * @return bindPortList
     */
    public java.util.List < BindPortList> getBindPortList() {
        return this.bindPortList;
    }

    /**
     * @return bindType
     */
    public String getBindType() {
        return this.bindType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return honeypotId
     */
    public String getHoneypotId() {
        return this.honeypotId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ports
     */
    public String getPorts() {
        return this.ports;
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

    /**
     * @return setStatus
     */
    public Integer getSetStatus() {
        return this.setStatus;
    }

    public static final class Builder extends Request.Builder<UpdateHoneypotProbeBindRequest, Builder> {
        private String bindId; 
        private java.util.List < BindPortList> bindPortList; 
        private String bindType; 
        private Integer currentPage; 
        private String honeypotId; 
        private Long id; 
        private String lang; 
        private Integer pageSize; 
        private String ports; 
        private String probeId; 
        private java.util.List < String > serviceIpList; 
        private Integer setStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHoneypotProbeBindRequest request) {
            super(request);
            this.bindId = request.bindId;
            this.bindPortList = request.bindPortList;
            this.bindType = request.bindType;
            this.currentPage = request.currentPage;
            this.honeypotId = request.honeypotId;
            this.id = request.id;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ports = request.ports;
            this.probeId = request.probeId;
            this.serviceIpList = request.serviceIpList;
            this.setStatus = request.setStatus;
        } 

        /**
         * The unique ID of the honeypot to which the probe is bound.
         */
        public Builder bindId(String bindId) {
            this.putQueryParameter("BindId", bindId);
            this.bindId = bindId;
            return this;
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
         * The operation that the probe performs. Valid values:
         * <p>
         * 
         * *   **forward_honey**: forward traffic to a honeypot
         * *   **scan_port**: monitor and scan
         */
        public Builder bindType(String bindType) {
            this.putQueryParameter("BindType", bindType);
            this.bindType = bindType;
            return this;
        }

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The honeypot ID.
         * <p>
         * 
         * >  You can call the [ListHoneypot](~~ListHoneypot~~) operation to obtain the IDs of honeypots.
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * The port ID of the probe service.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
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
         * The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ports that are monitored.
         */
        public Builder ports(String ports) {
            this.putQueryParameter("Ports", ports);
            this.ports = ports;
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

        /**
         * The status of the port.
         */
        public Builder setStatus(Integer setStatus) {
            this.putQueryParameter("SetStatus", setStatus);
            this.setStatus = setStatus;
            return this;
        }

        @Override
        public UpdateHoneypotProbeBindRequest build() {
            return new UpdateHoneypotProbeBindRequest(this);
        } 

    } 

    public static class BindPortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindPort")
        private Boolean bindPort;

        @com.aliyun.core.annotation.NameInMap("EndPort")
        private Integer endPort;

        @com.aliyun.core.annotation.NameInMap("Fixed")
        private Boolean fixed;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

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
            this.id = builder.id;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private Long id; 
            private String proto; 
            private Integer startPort; 
            private Integer targetPort; 

            /**
             * Specifies whether to bind a port. Valid values:
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
             * Specifies whether the port is fixed. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * The UUID of the port.
             */
            public Builder id(Long id) {
                this.id = id;
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
