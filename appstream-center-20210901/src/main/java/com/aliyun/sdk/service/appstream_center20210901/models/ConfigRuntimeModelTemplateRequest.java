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
 * {@link ConfigRuntimeModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>ConfigRuntimeModelTemplateRequest</p>
 */
public class ConfigRuntimeModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> runtimeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeType;

    private ConfigRuntimeModelTemplateRequest(Builder builder) {
        super(builder);
        this.modelTemplateId = builder.modelTemplateId;
        this.runtimeIds = builder.runtimeIds;
        this.runtimeType = builder.runtimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigRuntimeModelTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return runtimeIds
     */
    public java.util.List<String> getRuntimeIds() {
        return this.runtimeIds;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public static final class Builder extends Request.Builder<ConfigRuntimeModelTemplateRequest, Builder> {
        private String modelTemplateId; 
        private java.util.List<String> runtimeIds; 
        private String runtimeType; 

        private Builder() {
            super();
        } 

        private Builder(ConfigRuntimeModelTemplateRequest request) {
            super(request);
            this.modelTemplateId = request.modelTemplateId;
            this.runtimeIds = request.runtimeIds;
            this.runtimeType = request.runtimeType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxxxxxxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putBodyParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder runtimeIds(java.util.List<String> runtimeIds) {
            this.putBodyParameter("RuntimeIds", runtimeIds);
            this.runtimeIds = runtimeIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder runtimeType(String runtimeType) {
            this.putBodyParameter("RuntimeType", runtimeType);
            this.runtimeType = runtimeType;
            return this;
        }

        @Override
        public ConfigRuntimeModelTemplateRequest build() {
            return new ConfigRuntimeModelTemplateRequest(this);
        } 

    } 

}
