// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateBizTraceRequest} extends {@link RequestModel}
 *
 * <p>CreateBizTraceRequest</p>
 */
public class CreateBizTraceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("advancedConfig")
    private String advancedConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizTraceCode")
    private String bizTraceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizTraceName")
    private String bizTraceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ruleConfig")
    private String ruleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private CreateBizTraceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.advancedConfig = builder.advancedConfig;
        this.bizTraceCode = builder.bizTraceCode;
        this.bizTraceName = builder.bizTraceName;
        this.ruleConfig = builder.ruleConfig;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBizTraceRequest create() {
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
     * @return advancedConfig
     */
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    /**
     * @return bizTraceCode
     */
    public String getBizTraceCode() {
        return this.bizTraceCode;
    }

    /**
     * @return bizTraceName
     */
    public String getBizTraceName() {
        return this.bizTraceName;
    }

    /**
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CreateBizTraceRequest, Builder> {
        private String regionId; 
        private String advancedConfig; 
        private String bizTraceCode; 
        private String bizTraceName; 
        private String ruleConfig; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateBizTraceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.advancedConfig = request.advancedConfig;
            this.bizTraceCode = request.bizTraceCode;
            this.bizTraceName = request.bizTraceName;
            this.ruleConfig = request.ruleConfig;
            this.workspace = request.workspace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The advanced configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sample&quot;:{&quot;strategy&quot;:&quot;BY_APP&quot;}}</p>
         */
        public Builder advancedConfig(String advancedConfig) {
            this.putBodyParameter("advancedConfig", advancedConfig);
            this.advancedConfig = advancedConfig;
            return this;
        }

        /**
         * <p>The identifier for the business trace. It can contain only letters, digits, and underscores (_). The first character must be a lowercase letter.</p>
         * 
         * <strong>example:</strong>
         * <p>label_env</p>
         */
        public Builder bizTraceCode(String bizTraceCode) {
            this.putBodyParameter("bizTraceCode", bizTraceCode);
            this.bizTraceCode = bizTraceCode;
            return this;
        }

        /**
         * <p>The name of the business trace.</p>
         * 
         * <strong>example:</strong>
         * <p>just test</p>
         */
        public Builder bizTraceName(String bizTraceName) {
            this.putBodyParameter("bizTraceName", bizTraceName);
            this.bizTraceName = bizTraceName;
            return this;
        }

        /**
         * <p>The configuration rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;entrancePid&quot;:&quot;xxx@d9w3jd9j3&quot;,&quot;rpcMatcher&quot;:{&quot;matchType&quot;:&quot;EQUALS&quot;,&quot;pattern&quot;:&quot;/&quot;},&quot;characteristics&quot;:{&quot;operation&quot;:&quot;OR&quot;,&quot;rules&quot;:[{&quot;target&quot;:&quot;CUSTOM_EXTRACT&quot;,&quot;id&quot;:&quot;oi0b3bb7&quot;,&quot;key&quot;:&quot;biz.test&quot;,&quot;matcher&quot;:{&quot;matchType&quot;:&quot;CONTAINS&quot;,&quot;pattern&quot;:[&quot;1&quot;]}}]}}]</p>
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putBodyParameter("ruleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-xxxxxxx-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateBizTraceRequest build() {
            return new CreateBizTraceRequest(this);
        } 

    } 

}
