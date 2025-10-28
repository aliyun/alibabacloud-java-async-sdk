// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetServiceMethodPageRequest} extends {@link RequestModel}
 *
 * <p>GetServiceMethodPageRequest</p>
 */
public class GetServiceMethodPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("group")
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("methodController")
    private String methodController;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("registryType")
    private String registryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private GetServiceMethodPageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.group = builder.group;
        this.ip = builder.ip;
        this.methodController = builder.methodController;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.origin = builder.origin;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.region = builder.region;
        this.registryType = builder.registryType;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceType = builder.serviceType;
        this.serviceVersion = builder.serviceVersion;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceMethodPageRequest create() {
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
     * @return methodController
     */
    public String getMethodController() {
        return this.methodController;
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
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetServiceMethodPageRequest, Builder> {
        private String appId; 
        private String group; 
        private String ip; 
        private String methodController; 
        private String name; 
        private String namespace; 
        private String origin; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String path; 
        private String region; 
        private String registryType; 
        private String serviceId; 
        private String serviceName; 
        private String serviceType; 
        private String serviceVersion; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceMethodPageRequest request) {
            super(request);
            this.appId = request.appId;
            this.group = request.group;
            this.ip = request.ip;
            this.methodController = request.methodController;
            this.name = request.name;
            this.namespace = request.namespace;
            this.origin = request.origin;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.region = request.region;
            this.registryType = request.registryType;
            this.serviceId = request.serviceId;
            this.serviceName = request.serviceName;
            this.serviceType = request.serviceType;
            this.serviceVersion = request.serviceVersion;
            this.source = request.source;
        } 

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>310b18c3-1dbe-4807-<strong><strong>-18d7d637</strong></strong></p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The group to which the service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The IP address of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The controller method.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliware.edas.DemoController</p>
         */
        public Builder methodController(String methodController) {
            this.putQueryParameter("methodController", methodController);
            this.methodController = methodController;
            return this;
        }

        /**
         * <p>The name of the method.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:doc-test</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the data. Valid values:</p>
         * <ul>
         * <li>agent: Use this value if you use the service query feature of the latest version to pass the query result.</li>
         * <li>registry: Use this value if you use the service query feature of the earlier version to pass the query result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request path.</p>
         * 
         * <strong>example:</strong>
         * <p>/echo/{str}</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The type of the service registry.</p>
         * 
         * <strong>example:</strong>
         * <p>nacos</p>
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("registryType", registryType);
            this.registryType = registryType;
            return this;
        }

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>edas.service.consumer</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>edas.service.consumer</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>dubbo: Dubbo service</li>
         * <li>springCloud: Spring Cloud service</li>
         * <li>hsf: High-speed Service Framework (HSF) service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("serviceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The source of the service. Set the value to edas.</p>
         * 
         * <strong>example:</strong>
         * <p>edas</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetServiceMethodPageRequest build() {
            return new GetServiceMethodPageRequest(this);
        } 

    } 

}
