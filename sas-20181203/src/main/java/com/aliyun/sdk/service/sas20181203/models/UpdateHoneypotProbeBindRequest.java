// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotProbeBindRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotProbeBindRequest</p>
 */
public class UpdateHoneypotProbeBindRequest extends Request {
    @Query
    @NameInMap("BindId")
    private String bindId;

    @Query
    @NameInMap("BindPortList")
    private java.util.List < BindPortList> bindPortList;

    @Query
    @NameInMap("BindType")
    private String bindType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("HoneypotId")
    private String honeypotId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Ports")
    private String ports;

    @Query
    @NameInMap("ProbeId")
    private String probeId;

    @Query
    @NameInMap("ServiceIpList")
    private java.util.List < String > serviceIpList;

    @Query
    @NameInMap("SetStatus")
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
         * BindId.
         */
        public Builder bindId(String bindId) {
            this.putQueryParameter("BindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * BindPortList.
         */
        public Builder bindPortList(java.util.List < BindPortList> bindPortList) {
            this.putQueryParameter("BindPortList", bindPortList);
            this.bindPortList = bindPortList;
            return this;
        }

        /**
         * BindType.
         */
        public Builder bindType(String bindType) {
            this.putQueryParameter("BindType", bindType);
            this.bindType = bindType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * HoneypotId.
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Ports.
         */
        public Builder ports(String ports) {
            this.putQueryParameter("Ports", ports);
            this.ports = ports;
            return this;
        }

        /**
         * ProbeId.
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        /**
         * ServiceIpList.
         */
        public Builder serviceIpList(java.util.List < String > serviceIpList) {
            this.putQueryParameter("ServiceIpList", serviceIpList);
            this.serviceIpList = serviceIpList;
            return this;
        }

        /**
         * SetStatus.
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
        @NameInMap("BindPort")
        private Boolean bindPort;

        @NameInMap("EndPort")
        private Integer endPort;

        @NameInMap("Fixed")
        private Boolean fixed;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Proto")
        private String proto;

        @NameInMap("StartPort")
        private Integer startPort;

        @NameInMap("TargetPort")
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
             * BindPort.
             */
            public Builder bindPort(Boolean bindPort) {
                this.bindPort = bindPort;
                return this;
            }

            /**
             * EndPort.
             */
            public Builder endPort(Integer endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * Fixed.
             */
            public Builder fixed(Boolean fixed) {
                this.fixed = fixed;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Proto.
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * StartPort.
             */
            public Builder startPort(Integer startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * TargetPort.
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
