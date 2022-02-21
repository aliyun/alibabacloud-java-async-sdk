// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRpcServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateRpcServiceRequest</p>
 */
public class CreateRpcServiceRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("InterfaceName")
    @Validation(required = true)
    private String interfaceName;

    @Query
    @NameInMap("InvokeType")
    @Validation(required = true)
    private String invokeType;

    @Query
    @NameInMap("MethodName")
    @Validation(required = true)
    private String methodName;

    @Query
    @NameInMap("Params")
    @Validation(required = true)
    private String params;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VersionCode")
    private String versionCode;

    private CreateRpcServiceRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.groupName = builder.groupName;
        this.interfaceName = builder.interfaceName;
        this.invokeType = builder.invokeType;
        this.methodName = builder.methodName;
        this.params = builder.params;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRpcServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return interfaceName
     */
    public String getInterfaceName() {
        return this.interfaceName;
    }

    /**
     * @return invokeType
     */
    public String getInvokeType() {
        return this.invokeType;
    }

    /**
     * @return methodName
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder extends Request.Builder<CreateRpcServiceRequest, Builder> {
        private String appKey; 
        private String groupName; 
        private String interfaceName; 
        private String invokeType; 
        private String methodName; 
        private String params; 
        private String projectId; 
        private String regionId; 
        private String versionCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateRpcServiceRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.groupName = response.groupName;
            this.interfaceName = response.interfaceName;
            this.invokeType = response.invokeType;
            this.methodName = response.methodName;
            this.params = response.params;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.versionCode = response.versionCode;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * InterfaceName.
         */
        public Builder interfaceName(String interfaceName) {
            this.putQueryParameter("InterfaceName", interfaceName);
            this.interfaceName = interfaceName;
            return this;
        }

        /**
         * InvokeType.
         */
        public Builder invokeType(String invokeType) {
            this.putQueryParameter("InvokeType", invokeType);
            this.invokeType = invokeType;
            return this;
        }

        /**
         * MethodName.
         */
        public Builder methodName(String methodName) {
            this.putQueryParameter("MethodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VersionCode.
         */
        public Builder versionCode(String versionCode) {
            this.putQueryParameter("VersionCode", versionCode);
            this.versionCode = versionCode;
            return this;
        }

        @Override
        public CreateRpcServiceRequest build() {
            return new CreateRpcServiceRequest(this);
        } 

    } 

}
