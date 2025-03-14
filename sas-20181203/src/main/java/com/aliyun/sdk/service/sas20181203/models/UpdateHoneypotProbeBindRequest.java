// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<BindPortList> bindPortList;

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
    private java.util.List<String> serviceIpList;

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
    public java.util.List<BindPortList> getBindPortList() {
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
    public java.util.List<String> getServiceIpList() {
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
        private java.util.List<BindPortList> bindPortList; 
        private String bindType; 
        private Integer currentPage; 
        private String honeypotId; 
        private Long id; 
        private String lang; 
        private Integer pageSize; 
        private String ports; 
        private String probeId; 
        private java.util.List<String> serviceIpList; 
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
         * <p>The unique ID of the honeypot to which the probe is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>f52e8624-e43c-473c-8312-e0fed384****</p>
         */
        public Builder bindId(String bindId) {
            this.putQueryParameter("BindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * <p>The ports that are bound to the probe.</p>
         */
        public Builder bindPortList(java.util.List<BindPortList> bindPortList) {
            this.putQueryParameter("BindPortList", bindPortList);
            this.bindPortList = bindPortList;
            return this;
        }

        /**
         * <p>The operation that the probe performs. Valid values:</p>
         * <ul>
         * <li><strong>forward_honey</strong>: forward traffic to a honeypot</li>
         * <li><strong>scan_port</strong>: monitor and scan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>forward_honey</p>
         */
        public Builder bindType(String bindType) {
            this.putQueryParameter("BindType", bindType);
            this.bindType = bindType;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The honeypot ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to obtain the IDs of honeypots.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dba7d44775be8e0e5888ee3b1a62554a93d2512247cabc38ddeac17a3b3f****</p>
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * <p>The port ID of the probe service.</p>
         * 
         * <strong>example:</strong>
         * <p>1906</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ports that are monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tcp&quot;:&quot;1-65535&quot;,&quot;udp&quot;:&quot;1-65535&quot;}</p>
         */
        public Builder ports(String ports) {
            this.putQueryParameter("Ports", ports);
            this.ports = ports;
            return this;
        }

        /**
         * <p>The probe ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>36bad711-d1ac-4419-ac68-c1aa280f****</p>
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        /**
         * <p>The IP addresses that are monitored.</p>
         */
        public Builder serviceIpList(java.util.List<String> serviceIpList) {
            this.putQueryParameter("ServiceIpList", serviceIpList);
            this.serviceIpList = serviceIpList;
            return this;
        }

        /**
         * <p>The status of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

    /**
     * 
     * {@link UpdateHoneypotProbeBindRequest} extends {@link TeaModel}
     *
     * <p>UpdateHoneypotProbeBindRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(BindPortList model) {
                this.bindPort = model.bindPort;
                this.endPort = model.endPort;
                this.fixed = model.fixed;
                this.id = model.id;
                this.proto = model.proto;
                this.startPort = model.startPort;
                this.targetPort = model.targetPort;
            } 

            /**
             * <p>Specifies whether to bind a port. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bindPort(Boolean bindPort) {
                this.bindPort = bindPort;
                return this;
            }

            /**
             * <p>The end port on which the probe monitors.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder endPort(Integer endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * <p>Specifies whether the port is fixed. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * <p>The UUID of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>3183</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * <p>The start port on which the probe monitors.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder startPort(Integer startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * <p>The destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
