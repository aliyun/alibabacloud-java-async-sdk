// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyStrategyTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyStrategyTargetRequest</p>
 */
public class ModifyStrategyTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyStrategyTargetRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.sourceIp = builder.sourceIp;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStrategyTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyStrategyTargetRequest, Builder> {
        private String config; 
        private String sourceIp; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStrategyTargetRequest request) {
            super(request);
            this.config = request.config;
            this.sourceIp = request.sourceIp;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;strategyId&quot;:8070645}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Target&quot;:&quot;9273980&quot;,&quot;BindUuidCount&quot;:5320,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;9677606&quot;,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;10121607&quot;,&quot;BindUuidCount&quot;:7,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;add&quot;},{&quot;Target&quot;:&quot;10670708&quot;,&quot;BindUuidCount&quot;:2,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;11246338&quot;,&quot;BindUuidCount&quot;:6,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;11291161&quot;,&quot;BindUuidCount&quot;:13,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;}]</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_strategy</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyStrategyTargetRequest build() {
            return new ModifyStrategyTargetRequest(this);
        } 

    } 

}
