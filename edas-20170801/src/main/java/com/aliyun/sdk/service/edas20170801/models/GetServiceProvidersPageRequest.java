// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceProvidersPageRequest} extends {@link RequestModel}
 *
 * <p>GetServiceProvidersPageRequest</p>
 */
public class GetServiceProvidersPageRequest extends Request {
    @Query
    @NameInMap("appId")
    private String appId;

    @Query
    @NameInMap("group")
    private String group;

    @Query
    @NameInMap("ip")
    private String ip;

    @Query
    @NameInMap("namespace")
    private String namespace;

    @Query
    @NameInMap("origin")
    private String origin;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("region")
    private String region;

    @Query
    @NameInMap("registryType")
    private String registryType;

    @Query
    @NameInMap("serviceId")
    private String serviceId;

    @Query
    @NameInMap("serviceName")
    private String serviceName;

    @Query
    @NameInMap("serviceType")
    private String serviceType;

    @Query
    @NameInMap("serviceVersion")
    private String serviceVersion;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("source")
    private String source;

    private GetServiceProvidersPageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.group = builder.group;
        this.ip = builder.ip;
        this.namespace = builder.namespace;
        this.origin = builder.origin;
        this.page = builder.page;
        this.region = builder.region;
        this.registryType = builder.registryType;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceType = builder.serviceType;
        this.serviceVersion = builder.serviceVersion;
        this.size = builder.size;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceProvidersPageRequest create() {
        return builder().build();
    }

    @Override
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
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return registryType
     */
    public String getRegistryType() {
        return this.registryType;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetServiceProvidersPageRequest, Builder> {
        private String appId; 
        private String group; 
        private String ip; 
        private String namespace; 
        private String origin; 
        private Integer page; 
        private String region; 
        private String registryType; 
        private String serviceId; 
        private String serviceName; 
        private String serviceType; 
        private String serviceVersion; 
        private Integer size; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceProvidersPageRequest request) {
            super(request);
            this.appId = request.appId;
            this.group = request.group;
            this.ip = request.ip;
            this.namespace = request.namespace;
            this.origin = request.origin;
            this.page = request.page;
            this.region = request.region;
            this.registryType = request.registryType;
            this.serviceId = request.serviceId;
            this.serviceName = request.serviceName;
            this.serviceType = request.serviceType;
            this.serviceVersion = request.serviceVersion;
            this.size = request.size;
            this.source = request.source;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The group to which the service belongs.
         */
        public Builder group(String group) {
            this.putQueryParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * The IP address of the service provider. Fuzzy searches are supported.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of data. Valid values:
         * <p>
         * 
         * *   agent: Use this value if you use the service query feature of the latest version to pass the query result.
         * *   registry: Use this value if you use the service query feature of the earlier version to pass the query result.
         */
        public Builder origin(String origin) {
            this.putQueryParameter("origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * The number of the page to return. Pages start from Page 0.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * The type of the service registry. This parameter is deprecated. You can ignore it.
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("registryType", registryType);
            this.registryType = registryType;
            return this;
        }

        /**
         * The ID of the service. This parameter is deprecated. You can ignore it.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The type of the service. Valid values:
         * <p>
         * 
         * *   dubbo: Dubbo service
         * *   springCloud: Spring Cloud service
         * *   hsf: High-speed Service Framework (HSF) service
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * The version of the service.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("serviceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * The source of the service. Set the value to edas.
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetServiceProvidersPageRequest build() {
            return new GetServiceProvidersPageRequest(this);
        } 

    } 

}
