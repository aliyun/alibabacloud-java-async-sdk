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
         * <p>是否开启审计日志转发。取值：</p>
         * <ul>
         * <li><strong>true</strong>：开启转发。</li>
         * <li><strong>false</strong>：关闭转发。</li>
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
         * <p>数据库实例ID。支持RDS、PolarDB、DRDS、Redis、MongoDB等阿里云数据库实例。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>转发目标服务类型。取值：</p>
         * <ul>
         * <li><strong>SLS</strong>：日志服务（CloudLens 日志审计投递）。</li>
         * <li><strong>DSC</strong>：数据安全中心（安全审计投递）。</li>
         * <li><strong>FLOW</strong>：流量预测。</li>
         * <li><strong>USER</strong>：用户自建 SLS（脱敏数据投递）。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>数据来源通道，取值取决于 Service 参数：</p>
         * <ul>
         * <li>当 Service 为 <strong>SLS</strong> 时，取值为 <strong>SLS_LENS</strong>、<strong>SLS_AUDIT</strong> 或 <strong>ALL</strong>。</li>
         * <li>当 Service 为 <strong>DSC</strong> 时，取值为 <strong>DAS_SIDE</strong>、<strong>DSC_SIDE</strong> 或 <strong>ALL</strong>。</li>
         * <li>当 Service 为 <strong>USER</strong> 时，取值为 <strong>PSQL</strong>、<strong>SQL_INSIGHT</strong> 或 <strong>PSQL_TEXT</strong>。</li>
         * <li>当 Service 为 <strong>FLOW</strong> 时，无需指定。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS_LENS</p>
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
