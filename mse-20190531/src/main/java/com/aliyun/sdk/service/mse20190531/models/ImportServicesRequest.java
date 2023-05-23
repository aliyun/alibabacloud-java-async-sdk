// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportServicesRequest} extends {@link RequestModel}
 *
 * <p>ImportServicesRequest</p>
 */
public class ImportServicesRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("FcServiceName")
    private String fcServiceName;

    @Query
    @NameInMap("FcVersion")
    private String fcVersion;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("ServiceList")
    private java.util.List < ServiceList> serviceList;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("TlsSetting")
    private String tlsSetting;

    private ImportServicesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.fcServiceName = builder.fcServiceName;
        this.fcVersion = builder.fcVersion;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.serviceList = builder.serviceList;
        this.sourceType = builder.sourceType;
        this.tlsSetting = builder.tlsSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return fcServiceName
     */
    public String getFcServiceName() {
        return this.fcServiceName;
    }

    /**
     * @return fcVersion
     */
    public String getFcVersion() {
        return this.fcVersion;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return serviceList
     */
    public java.util.List < ServiceList> getServiceList() {
        return this.serviceList;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return tlsSetting
     */
    public String getTlsSetting() {
        return this.tlsSetting;
    }

    public static final class Builder extends Request.Builder<ImportServicesRequest, Builder> {
        private String acceptLanguage; 
        private String fcServiceName; 
        private String fcVersion; 
        private String gatewayUniqueId; 
        private java.util.List < ServiceList> serviceList; 
        private String sourceType; 
        private String tlsSetting; 

        private Builder() {
            super();
        } 

        private Builder(ImportServicesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.fcServiceName = request.fcServiceName;
            this.fcVersion = request.fcVersion;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.serviceList = request.serviceList;
            this.sourceType = request.sourceType;
            this.tlsSetting = request.tlsSetting;
        } 

        /**
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * FcServiceName.
         */
        public Builder fcServiceName(String fcServiceName) {
            this.putQueryParameter("FcServiceName", fcServiceName);
            this.fcServiceName = fcServiceName;
            return this;
        }

        /**
         * FcVersion.
         */
        public Builder fcVersion(String fcVersion) {
            this.putQueryParameter("FcVersion", fcVersion);
            this.fcVersion = fcVersion;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * ServiceList.
         */
        public Builder serviceList(java.util.List < ServiceList> serviceList) {
            String serviceListShrink = shrink(serviceList, "ServiceList", "json");
            this.putQueryParameter("ServiceList", serviceListShrink);
            this.serviceList = serviceList;
            return this;
        }

        /**
         * 服务来源
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TlsSetting.
         */
        public Builder tlsSetting(String tlsSetting) {
            this.putQueryParameter("TlsSetting", tlsSetting);
            this.tlsSetting = tlsSetting;
            return this;
        }

        @Override
        public ImportServicesRequest build() {
            return new ImportServicesRequest(this);
        } 

    } 

    public static class ServiceList extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Ips")
        private java.util.List < String > ips;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ServicePort")
        private Long servicePort;

        @NameInMap("ServiceProtocol")
        private String serviceProtocol;

        private ServiceList(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.servicePort = builder.servicePort;
            this.serviceProtocol = builder.serviceProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return servicePort
         */
        public Long getServicePort() {
            return this.servicePort;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < String > ips; 
            private String name; 
            private String namespace; 
            private Long servicePort; 
            private String serviceProtocol; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Ips.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 服务的端口
             */
            public Builder servicePort(Long servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * 服务的协议版本
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            public ServiceList build() {
                return new ServiceList(this);
            } 

        } 

    }
}
