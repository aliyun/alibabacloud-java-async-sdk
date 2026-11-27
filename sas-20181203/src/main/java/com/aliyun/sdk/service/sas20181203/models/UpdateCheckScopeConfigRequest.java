// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateCheckScopeConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateCheckScopeConfigRequest</p>
 */
public class UpdateCheckScopeConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoConfig")
    private String autoConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoType")
    private Integer autoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private UpdateCheckScopeConfigRequest(Builder builder) {
        super(builder);
        this.autoConfig = builder.autoConfig;
        this.autoType = builder.autoType;
        this.configId = builder.configId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCheckScopeConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfig
     */
    public String getAutoConfig() {
        return this.autoConfig;
    }

    /**
     * @return autoType
     */
    public Integer getAutoType() {
        return this.autoType;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateCheckScopeConfigRequest, Builder> {
        private String autoConfig; 
        private Integer autoType; 
        private String configId; 
        private Long resourceDirectoryAccountId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCheckScopeConfigRequest request) {
            super(request);
            this.autoConfig = request.autoConfig;
            this.autoType = request.autoType;
            this.configId = request.configId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.type = request.type;
        } 

        /**
         * <p>The JSON string for the automatic scan configuration. Fields:</p>
         * <ul>
         * <li><strong>autoInclude</strong>: specifies whether to enable automatic scanning. Valid values: <strong>true</strong> (enabled) and <strong>false</strong> (disabled).</li>
         * <li><strong>autoRule</strong>: the enablement configuration.</li>
         * <li><strong>ruleOperator</strong>: the enablement configuration rule. Valid value: <strong>include</strong>.</li>
         * <li><strong>operator</strong>: the logical operator. Valid value: <strong>or</strong>.</li>
         * <li><strong>rule</strong>: the rule.</li>
         * <li><strong>condition</strong>: the rule condition. Valid values: <strong>vendor</strong> (vendor), <strong>assetType</strong> (primary asset type), and <strong>assetSubType</strong> (secondary asset type).<blockquote>
         * <p>For more information about the specific meanings, refer to the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>If AutoType is set to 1 (enable automatic scanning), this parameter is required and must be a valid JSON configuration string. If AutoType is set to 0, this parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;autoInclude&quot;:true,&quot;autoRule&quot;:{&quot;ruleOperator&quot;:&quot;include&quot;,&quot;operator&quot;:&quot;or&quot;,&quot;rule&quot;:[{&quot;condition&quot;:&quot;assetSubType&quot;,&quot;ruleOperator&quot;:&quot;include&quot;,&quot;value&quot;:[{&quot;vendor&quot;:&quot;0&quot;,&quot;assetType&quot;:&quot;0&quot;,&quot;assetSubType&quot;:&quot;100&quot;}]}]}}&quot;</p>
         */
        public Builder autoConfig(String autoConfig) {
            this.putQueryParameter("AutoConfig", autoConfig);
            this.autoConfig = autoConfig;
            return this;
        }

        /**
         * <p>The type of the automatic scan configuration. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disable automatic scanning</li>
         * <li><strong>1</strong>: automatically scan new cloud assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoType(Integer autoType) {
            this.putQueryParameter("AutoType", autoType);
            this.autoType = autoType;
            return this;
        }

        /**
         * <p>The configuration ID. You can call the <a href="~~GetCheckScopeConfig~~">GetCheckScopeConfig</a> operation to query this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>00cfa8161da093089e6804ba6a33****</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is the primary account of the member accounts of the resource folder. You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The type of the scan scope configuration. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: scan by instance</li>
         * <li><strong>3</strong>: scan all</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateCheckScopeConfigRequest build() {
            return new UpdateCheckScopeConfigRequest(this);
        } 

    } 

}
