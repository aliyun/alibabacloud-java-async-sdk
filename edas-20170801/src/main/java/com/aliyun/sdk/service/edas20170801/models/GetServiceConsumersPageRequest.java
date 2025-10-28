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
 * {@link GetServiceConsumersPageRequest} extends {@link RequestModel}
 *
 * <p>GetServiceConsumersPageRequest</p>
 */
public class GetServiceConsumersPageRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

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
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private GetServiceConsumersPageRequest(Builder builder) {
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

    public static GetServiceConsumersPageRequest create() {
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

    public static final class Builder extends Request.Builder<GetServiceConsumersPageRequest, Builder> {
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

        private Builder(GetServiceConsumersPageRequest request) {
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>efbda488-7b33-432f-a40d-<strong><strong>0047</strong></strong></p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The service group.</p>
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
         * <p>The IP address of the service provider. Fuzzy searches are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.20.x.xx</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("ip", ip);
            this.ip = ip;
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
         * <p>0</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
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
         * <p>The type of the service registry. This parameter is deprecated. You can ignore it.</p>
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
         * <p>The ID of the service. This parameter is deprecated. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibabacloud.hipstershop.CartService</p>
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
         * <p>com.alibabacloud.hipstershop.CartService</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The type of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>dubbo</p>
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
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
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
        public GetServiceConsumersPageRequest build() {
            return new GetServiceConsumersPageRequest(this);
        } 

    } 

}
