// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ModifyForwardSqlLogConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardSqlLogConfigRequest</p>
 */
public class ModifyForwardSqlLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    @com.aliyun.core.annotation.Validation(required = true)
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    private ModifyForwardSqlLogConfigRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.instanceId = builder.instanceId;
        this.service = builder.service;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardSqlLogConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ModifyForwardSqlLogConfigRequest, Builder> {
        private Boolean enable; 
        private String instanceId; 
        private String service; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ModifyForwardSqlLogConfigRequest request) {
            super(request);
            this.enable = request.enable;
            this.instanceId = request.instanceId;
            this.service = request.service;
            this.source = request.source;
        } 

        /**
         * <p>Specifies whether to enable the feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The database instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>DAS_OPS: enables top key delivery.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAS_OPS</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The source of the task. Valid values:</p>
         * <ul>
         * <li>TOP_KEY: enables top key delivery.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TOP_KEY</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ModifyForwardSqlLogConfigRequest build() {
            return new ModifyForwardSqlLogConfigRequest(this);
        } 

    } 

}
