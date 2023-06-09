// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceMethodPageRequest} extends {@link RequestModel}
 *
 * <p>GetServiceMethodPageRequest</p>
 */
public class GetServiceMethodPageRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    @Validation(maxLength = 64)
    private String appName;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("MethodController")
    private String methodController;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 65536, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 65536, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Path")
    private String path;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("ServiceGroup")
    private String serviceGroup;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("ServiceType")
    private String serviceType;

    @Query
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    private GetServiceMethodPageRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.ip = builder.ip;
        this.methodController = builder.methodController;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.region = builder.region;
        this.serviceGroup = builder.serviceGroup;
        this.serviceName = builder.serviceName;
        this.serviceType = builder.serviceType;
        this.serviceVersion = builder.serviceVersion;
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
     * @return serviceGroup
     */
    public String getServiceGroup() {
        return this.serviceGroup;
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

    public static final class Builder extends Request.Builder<GetServiceMethodPageRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private String ip; 
        private String methodController; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String path; 
        private String region; 
        private String serviceGroup; 
        private String serviceName; 
        private String serviceType; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceMethodPageRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.ip = request.ip;
            this.methodController = request.methodController;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.region = request.region;
            this.serviceGroup = request.serviceGroup;
            this.serviceName = request.serviceName;
            this.serviceType = request.serviceType;
            this.serviceVersion = request.serviceVersion;
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
         * 应用id。
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * 服务提供者ip。
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * 接口所在的Controller类全称。
         */
        public Builder methodController(String methodController) {
            this.putQueryParameter("MethodController", methodController);
            this.methodController = methodController;
            return this;
        }

        /**
         * 方法名。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 获取第几页的数据。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每一页多少条。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 接口对应的请求路径。
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * 服务分组。
         */
        public Builder serviceGroup(String serviceGroup) {
            this.putQueryParameter("ServiceGroup", serviceGroup);
            this.serviceGroup = serviceGroup;
            return this;
        }

        /**
         * 服务名。
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 服务类型。
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * 服务版本。
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public GetServiceMethodPageRequest build() {
            return new GetServiceMethodPageRequest(this);
        } 

    } 

}
