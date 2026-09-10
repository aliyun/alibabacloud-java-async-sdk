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
 * {@link UpdateBizTraceRequest} extends {@link RequestModel}
 *
 * <p>UpdateBizTraceRequest</p>
 */
public class UpdateBizTraceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("bizTraceId")
    private String bizTraceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("advancedConfig")
    private String advancedConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizTraceName")
    private String bizTraceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ruleConfig")
    private String ruleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private UpdateBizTraceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizTraceId = builder.bizTraceId;
        this.advancedConfig = builder.advancedConfig;
        this.bizTraceName = builder.bizTraceName;
        this.ruleConfig = builder.ruleConfig;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizTraceRequest create() {
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
     * @return bizTraceId
     */
    public String getBizTraceId() {
        return this.bizTraceId;
    }

    /**
     * @return advancedConfig
     */
    public String getAdvancedConfig() {
        return this.advancedConfig;
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

    public static final class Builder extends Request.Builder<UpdateBizTraceRequest, Builder> {
        private String regionId; 
        private String bizTraceId; 
        private String advancedConfig; 
        private String bizTraceName; 
        private String ruleConfig; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBizTraceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizTraceId = request.bizTraceId;
            this.advancedConfig = request.advancedConfig;
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
         * <p>The ID of the business trace.</p>
         * 
         * <strong>example:</strong>
         * <p>e339260ed64c95d</p>
         */
        public Builder bizTraceId(String bizTraceId) {
            this.putPathParameter("bizTraceId", bizTraceId);
            this.bizTraceId = bizTraceId;
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
         * <p>The list of configuration rules.</p>
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
        public UpdateBizTraceRequest build() {
            return new UpdateBizTraceRequest(this);
        } 

    } 

}
