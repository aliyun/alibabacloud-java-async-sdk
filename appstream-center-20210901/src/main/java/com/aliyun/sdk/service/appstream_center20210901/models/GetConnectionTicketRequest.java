// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetConnectionTicketRequest} extends {@link RequestModel}
 *
 * <p>GetConnectionTicketRequest</p>
 */
public class GetConnectionTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessType")
    @com.aliyun.core.annotation.Validation(maxLength = 10)
    private String accessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupIdList")
    private java.util.List<String> appInstanceGroupIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupSetId")
    private String appInstanceGroupSetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    private String appInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
    private String appInstancePersistentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppPolicyId")
    private String appPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppStartParam")
    private String appStartParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvironmentConfig")
    private String environmentConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetConnectionTicketRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.appId = builder.appId;
        this.appInstanceGroupIdList = builder.appInstanceGroupIdList;
        this.appInstanceGroupSetId = builder.appInstanceGroupSetId;
        this.appInstanceId = builder.appInstanceId;
        this.appInstancePersistentId = builder.appInstancePersistentId;
        this.appPolicyId = builder.appPolicyId;
        this.appStartParam = builder.appStartParam;
        this.appVersion = builder.appVersion;
        this.bizRegionId = builder.bizRegionId;
        this.endUserId = builder.endUserId;
        this.environmentConfig = builder.environmentConfig;
        this.productType = builder.productType;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appInstanceGroupIdList
     */
    public java.util.List<String> getAppInstanceGroupIdList() {
        return this.appInstanceGroupIdList;
    }

    /**
     * @return appInstanceGroupSetId
     */
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return appInstancePersistentId
     */
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    /**
     * @return appPolicyId
     */
    public String getAppPolicyId() {
        return this.appPolicyId;
    }

    /**
     * @return appStartParam
     */
    public String getAppStartParam() {
        return this.appStartParam;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return environmentConfig
     */
    public String getEnvironmentConfig() {
        return this.environmentConfig;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetConnectionTicketRequest, Builder> {
        private String accessType; 
        private String appId; 
        private java.util.List<String> appInstanceGroupIdList; 
        private String appInstanceGroupSetId; 
        private String appInstanceId; 
        private String appInstancePersistentId; 
        private String appPolicyId; 
        private String appStartParam; 
        private String appVersion; 
        private String bizRegionId; 
        private String endUserId; 
        private String environmentConfig; 
        private String productType; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectionTicketRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.appId = request.appId;
            this.appInstanceGroupIdList = request.appInstanceGroupIdList;
            this.appInstanceGroupSetId = request.appInstanceGroupSetId;
            this.appInstanceId = request.appInstanceId;
            this.appInstancePersistentId = request.appInstancePersistentId;
            this.appPolicyId = request.appPolicyId;
            this.appStartParam = request.appStartParam;
            this.appVersion = request.appVersion;
            this.bizRegionId = request.bizRegionId;
            this.endUserId = request.endUserId;
            this.environmentConfig = request.environmentConfig;
            this.productType = request.productType;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The access type.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder accessType(String accessType) {
            this.putBodyParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <blockquote>
         * <p>This parameter is required for the initial call and optional for subsequent calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ca-e4s0puhmwi7v****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The list of delivery groups.</p>
         * <blockquote>
         * <ul>
         * <li>If you specify this parameter, application instances are allocated only from the specified and authorized delivery groups.</li>
         * <li>If you specify the <code>AppInstanceId</code> or <code>AppInstancePersistentId</code> parameter, this parameter is required.</li>
         * </ul>
         * </blockquote>
         */
        public Builder appInstanceGroupIdList(java.util.List<String> appInstanceGroupIdList) {
            this.putBodyParameter("AppInstanceGroupIdList", appInstanceGroupIdList);
            this.appInstanceGroupIdList = appInstanceGroupIdList;
            return this;
        }

        /**
         * <p>The delivery group set ID used to obtain the connection credential.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        public Builder appInstanceGroupSetId(String appInstanceGroupSetId) {
            this.putBodyParameter("AppInstanceGroupSetId", appInstanceGroupSetId);
            this.appInstanceGroupSetId = appInstanceGroupSetId;
            return this;
        }

        /**
         * <p>The application instance ID.</p>
         * <blockquote>
         * <ul>
         * <li>If you specify this parameter, only the specified application instance is allocated.</li>
         * <li>If you specify this parameter, you must also specify the <code>AppInstanceGroupIdList</code> parameter, and the number of delivery group IDs in <code>AppInstanceGroupIdList</code> must be 1.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ai-1rznfnrvsa99d****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The persistent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0bxls9m3cl7s****</p>
         */
        public Builder appInstancePersistentId(String appInstancePersistentId) {
            this.putBodyParameter("AppInstancePersistentId", appInstancePersistentId);
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0clfzcy0adpcf****</p>
         */
        public Builder appPolicyId(String appPolicyId) {
            this.putBodyParameter("AppPolicyId", appPolicyId);
            this.appPolicyId = appPolicyId;
            return this;
        }

        /**
         * <p>The application startup parameter. This parameter is optional. You can refer to the method for specifying startup parameters in the image creation documentation and manually verify the startup parameters during image creation. This field is suitable for startup parameters with variable content, allowing API callers to set them flexibly. For more information about how to obtain startup parameters, see <a href="https://help.aliyun.com/document_detail/426045.html">How to obtain application installation parameters and startup parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>/q /n</p>
         */
        public Builder appStartParam(String appStartParam) {
            this.putBodyParameter("AppStartParam", appStartParam);
            this.appStartParam = appStartParam;
            return this;
        }

        /**
         * <p>The application version. If you specify this parameter, only the specified version of the application is opened. If you do not specify this parameter, any authorized version of the application is opened.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>If you specify this parameter, application instances are allocated only from delivery groups in the specified region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The environment configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userConfigReenter&quot;:&quot;NATIVE&quot;}</p>
         */
        public Builder environmentConfig(String environmentConfig) {
            this.putBodyParameter("EnvironmentConfig", environmentConfig);
            this.environmentConfig = environmentConfig;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>This parameter is required for non-initial calls. Use this parameter query to invoke the node status and connection credential retrieval.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>28778acb-a469-4bc0-8e0f****</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetConnectionTicketRequest build() {
            return new GetConnectionTicketRequest(this);
        } 

    } 

}
