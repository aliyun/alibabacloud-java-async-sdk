// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleApplicationRequest} extends {@link RequestModel}
 *
 * <p>RescaleApplicationRequest</p>
 */
public class RescaleApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("RescaleLevel")
    private String rescaleLevel;

    @Query
    @NameInMap("RescaleType")
    @Validation(required = true)
    private String rescaleType;

    @Query
    @NameInMap("ResourceSelector")
    @Validation(required = true)
    private String resourceSelector;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    @Query
    @NameInMap("ToAppVersion")
    private String toAppVersion;

    private RescaleApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.rescaleLevel = builder.rescaleLevel;
        this.rescaleType = builder.rescaleType;
        this.resourceSelector = builder.resourceSelector;
        this.timeout = builder.timeout;
        this.toAppVersion = builder.toAppVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleApplicationRequest create() {
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
     * @return rescaleLevel
     */
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    /**
     * @return rescaleType
     */
    public String getRescaleType() {
        return this.rescaleType;
    }

    /**
     * @return resourceSelector
     */
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return toAppVersion
     */
    public String getToAppVersion() {
        return this.toAppVersion;
    }

    public static final class Builder extends Request.Builder<RescaleApplicationRequest, Builder> {
        private String appId; 
        private String rescaleLevel; 
        private String rescaleType; 
        private String resourceSelector; 
        private Integer timeout; 
        private String toAppVersion; 

        private Builder() {
            super();
        } 

        private Builder(RescaleApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.rescaleLevel = request.rescaleLevel;
            this.rescaleType = request.rescaleType;
            this.resourceSelector = request.resourceSelector;
            this.timeout = request.timeout;
            this.toAppVersion = request.toAppVersion;
        } 

        /**
         * The ID of the application. You can query the application ID by calling the ListApplications operation.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The level of resource scaling. The value must be of the enumerated data type. Valid values:
         * <p>
         * 
         * *   AreaIspCode (default): scales resources based on the Internet service provider (ISP).
         * *   RegionId: scales resources based on the edge node.
         * *   InstanceId: scales resources based on the instance ID. Resource scale-out specifies resource hosting and scale-in specifies resource release.
         */
        public Builder rescaleLevel(String rescaleLevel) {
            this.putQueryParameter("RescaleLevel", rescaleLevel);
            this.rescaleLevel = rescaleLevel;
            return this;
        }

        /**
         * The scaling operation. The value must be of the enumerated data type. Valid values:
         * <p>
         * 
         * *   Add: adds new resources.
         * *   Del: releases resources.
         */
        public Builder rescaleType(String rescaleType) {
            this.putQueryParameter("RescaleType", rescaleType);
            this.rescaleType = rescaleType;
            return this;
        }

        /**
         * The required resources. The value must be a JSON string.
         */
        public Builder resourceSelector(String resourceSelector) {
            this.putQueryParameter("ResourceSelector", resourceSelector);
            this.resourceSelector = resourceSelector;
            return this;
        }

        /**
         * The timeout period for asynchronous scaling. Unit: seconds. Default value: 300.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The version number of the application deployment package. By default, the stable version number is used. This parameter takes effect only when you perform resource scale-out.
         */
        public Builder toAppVersion(String toAppVersion) {
            this.putQueryParameter("ToAppVersion", toAppVersion);
            this.toAppVersion = toAppVersion;
            return this;
        }

        @Override
        public RescaleApplicationRequest build() {
            return new RescaleApplicationRequest(this);
        } 

    } 

}
