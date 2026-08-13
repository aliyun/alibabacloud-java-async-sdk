// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RunSkillRequest} extends {@link RequestModel}
 *
 * <p>RunSkillRequest</p>
 */
public class RunSkillRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arguments")
    private java.util.Map<String, ?> arguments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skillCode")
    private String skillCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private RunSkillRequest(Builder builder) {
        super(builder);
        this.arguments = builder.arguments;
        this.clientToken = builder.clientToken;
        this.model = builder.model;
        this.operatingObjectName = builder.operatingObjectName;
        this.skillCode = builder.skillCode;
        this.skillName = builder.skillName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arguments
     */
    public java.util.Map<String, ?> getArguments() {
        return this.arguments;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return skillCode
     */
    public String getSkillCode() {
        return this.skillCode;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RunSkillRequest, Builder> {
        private java.util.Map<String, ?> arguments; 
        private String clientToken; 
        private String model; 
        private String operatingObjectName; 
        private String skillCode; 
        private String skillName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RunSkillRequest request) {
            super(request);
            this.arguments = request.arguments;
            this.clientToken = request.clientToken;
            this.model = request.model;
            this.operatingObjectName = request.operatingObjectName;
            this.skillCode = request.skillCode;
            this.skillName = request.skillName;
            this.tenantId = request.tenantId;
        } 

        /**
         * arguments.
         */
        public Builder arguments(java.util.Map<String, ?> arguments) {
            String argumentsShrink = shrink(arguments, "arguments", "json");
            this.putBodyParameter("arguments", argumentsShrink);
            this.arguments = arguments;
            return this;
        }

        /**
         * <p>幂等 token，调用方自行生成；当前版本仅记录到 metadata，未做去重</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>抽象模型名（模型档位），不传默认 standard</p>
         * 
         * <strong>example:</strong>
         * <p>quick</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>数字员工名称；用于按绑定关系计算 CodeAgent allowedSkills 白名单</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>技能编码（全局唯一），优先级高于 skillName</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillCode(String skillCode) {
            this.putBodyParameter("skillCode", skillCode);
            this.skillCode = skillCode;
            return this;
        }

        /**
         * <p>技能名称，未传 skillCode 时使用；租户范围内必须唯一</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillName(String skillName) {
            this.putBodyParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public RunSkillRequest build() {
            return new RunSkillRequest(this);
        } 

    } 

}
