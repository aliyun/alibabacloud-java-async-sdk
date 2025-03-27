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
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupIdList")
    private java.util.List<String> appInstanceGroupIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    private String appInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
    private String appInstancePersistentId;

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
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetConnectionTicketRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceGroupIdList = builder.appInstanceGroupIdList;
        this.appInstanceId = builder.appInstanceId;
        this.appInstancePersistentId = builder.appInstancePersistentId;
        this.appStartParam = builder.appStartParam;
        this.appVersion = builder.appVersion;
        this.bizRegionId = builder.bizRegionId;
        this.endUserId = builder.endUserId;
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
        private String appId; 
        private java.util.List<String> appInstanceGroupIdList; 
        private String appInstanceId; 
        private String appInstancePersistentId; 
        private String appStartParam; 
        private String appVersion; 
        private String bizRegionId; 
        private String endUserId; 
        private String productType; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectionTicketRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceGroupIdList = request.appInstanceGroupIdList;
            this.appInstanceId = request.appInstanceId;
            this.appInstancePersistentId = request.appInstancePersistentId;
            this.appStartParam = request.appStartParam;
            this.appVersion = request.appVersion;
            this.bizRegionId = request.bizRegionId;
            this.endUserId = request.endUserId;
            this.productType = request.productType;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The application ID.</p>
         * <blockquote>
         * <p> This parameter is required for the first call to this operation and optional for subsequent calls to the operation.</p>
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
         * <p>The delivery groups.</p>
         * <blockquote>
         * <ul>
         * <li>If you configure this parameter, the system assigns application instances only among the specified authorized delivery groups. </li>
         * <li>This parameter is required if you configure <code>AppInstanceId</code> or <code>AppInstancePersistentId</code>.</li>
         * </ul>
         * </blockquote>
         */
        public Builder appInstanceGroupIdList(java.util.List<String> appInstanceGroupIdList) {
            this.putBodyParameter("AppInstanceGroupIdList", appInstanceGroupIdList);
            this.appInstanceGroupIdList = appInstanceGroupIdList;
            return this;
        }

        /**
         * <p>The ID of the application instance.</p>
         * <blockquote>
         * <ul>
         * <li>If you configure this parameter, the system attempts to assign only the specified application instance.</li>
         * <li>If you configure this parameter, you must also configure <code>AppInstanceGroupIdList</code> and the number of delivery groups specified by <code>AppInstanceGroupIdList</code> must be 1.</li>
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
         * <p>The ID of the persistent session.</p>
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
         * <p>The parameters that are configured to start the application. For information about how to obtain these parameters, see <a href="https://help.aliyun.com/document_detail/426045.html">Obtain parameters configured to install and start an application</a>.</p>
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
         * <p>The application version. If you configure this parameter, only an application of the specified version is started. If you do not configure this parameter, an application of a random authorized version is started.</p>
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
         * <p> If you configure this parameter, the system assigns application instances only among the delivery groups that reside in the specified region.</p>
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
         * <p>The ID of the convenience account.</p>
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
         * <p>The product type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * <li>AndroidCloud: Cloud Phone</li>
         * </ul>
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
         * <p>The task ID.</p>
         * <blockquote>
         * <p> This parameter is required for calls other than the first call to this operation. You can use this parameter to query the task status and connection credential.</p>
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
