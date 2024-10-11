// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetServiceListPageRequest} extends {@link RequestModel}
 *
 * <p>GetServiceListPageRequest</p>
 */
public class GetServiceListPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    private GetServiceListPageRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.ip = builder.ip;
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.serviceName = builder.serviceName;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceListPageRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder extends Request.Builder<GetServiceListPageRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private String ip; 
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String region; 
        private String serviceName; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceListPageRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.ip = request.ip;
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.serviceName = request.serviceName;
            this.serviceType = request.serviceType;
        } 

        /**
         * <p>The language of the response. Valid values: zh and en. Default value: zh. The value zh indicates Chinese, and the value en indicates English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dez4xxxxx@f3f75ed8ffxxxxx</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The IP address from which the query is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.5.5</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The name of the MSE namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>sc-A</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The service type.</p>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public GetServiceListPageRequest build() {
            return new GetServiceListPageRequest(this);
        } 

    } 

}
