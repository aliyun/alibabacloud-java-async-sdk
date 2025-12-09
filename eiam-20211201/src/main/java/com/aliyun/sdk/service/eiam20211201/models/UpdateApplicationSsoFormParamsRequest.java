// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link UpdateApplicationSsoFormParamsRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationSsoFormParamsRequest</p>
 */
public class UpdateApplicationSsoFormParamsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ApplicationTemplateParams> applicationTemplateParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateApplicationSsoFormParamsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.applicationTemplateParams = builder.applicationTemplateParams;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationSsoFormParamsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationTemplateParams
     */
    public java.util.List<ApplicationTemplateParams> getApplicationTemplateParams() {
        return this.applicationTemplateParams;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationSsoFormParamsRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private java.util.List<ApplicationTemplateParams> applicationTemplateParams; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationSsoFormParamsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.applicationTemplateParams = request.applicationTemplateParams;
            this.instanceId = request.instanceId;
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
         * <p>IDaaS的应用主键id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_11111</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>应用模板创建参数，应用创建来源为模板时才可以指定</p>
         * <p>This parameter is required.</p>
         */
        public Builder applicationTemplateParams(java.util.List<ApplicationTemplateParams> applicationTemplateParams) {
            this.putQueryParameter("ApplicationTemplateParams", applicationTemplateParams);
            this.applicationTemplateParams = applicationTemplateParams;
            return this;
        }

        /**
         * <p>IDaaS EIAM的实例id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-111ccc1111</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateApplicationSsoFormParamsRequest build() {
            return new UpdateApplicationSsoFormParamsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationSsoFormParamsRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationSsoFormParamsRequest</p>
     */
    public static class ApplicationTemplateParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateParamName")
        private String templateParamName;

        @com.aliyun.core.annotation.NameInMap("TemplateParamValue")
        private String templateParamValue;

        private ApplicationTemplateParams(Builder builder) {
            this.templateParamName = builder.templateParamName;
            this.templateParamValue = builder.templateParamValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationTemplateParams create() {
            return builder().build();
        }

        /**
         * @return templateParamName
         */
        public String getTemplateParamName() {
            return this.templateParamName;
        }

        /**
         * @return templateParamValue
         */
        public String getTemplateParamValue() {
            return this.templateParamValue;
        }

        public static final class Builder {
            private String templateParamName; 
            private String templateParamValue; 

            private Builder() {
            } 

            private Builder(ApplicationTemplateParams model) {
                this.templateParamName = model.templateParamName;
                this.templateParamValue = model.templateParamValue;
            } 

            /**
             * <p>应用模板创建参数具体名称</p>
             * 
             * <strong>example:</strong>
             * <p>aliyunUid</p>
             */
            public Builder templateParamName(String templateParamName) {
                this.templateParamName = templateParamName;
                return this;
            }

            /**
             * <p>应用模板创建参数真实的取值</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder templateParamValue(String templateParamValue) {
                this.templateParamValue = templateParamValue;
                return this;
            }

            public ApplicationTemplateParams build() {
                return new ApplicationTemplateParams(this);
            } 

        } 

    }
}
