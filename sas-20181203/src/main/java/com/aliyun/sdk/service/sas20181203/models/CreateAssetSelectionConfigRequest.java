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
 * {@link CreateAssetSelectionConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAssetSelectionConfigRequest</p>
 */
public class CreateAssetSelectionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private CreateAssetSelectionConfigRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.platform = builder.platform;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssetSelectionConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateAssetSelectionConfigRequest, Builder> {
        private String businessType; 
        private String clientToken; 
        private Boolean dryRun; 
        private String platform; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAssetSelectionConfigRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.platform = request.platform;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The business type of the asset selection. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: trojan scan configuration.</li>
         * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: trojan scan one-time scan.</li>
         * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: agentless detection alert whitelisting rule.</li>
         * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: agentless detection vulnerability whitelisting rule.</li>
         * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: core file protection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>是否只预检此次请求。true：仅检查请求，不执行实际操作；false：正常执行请求。默认值为 false。</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The operating system of the target asset. Valid values:</p>
         * <ul>
         * <li><strong>all</strong>: all operating systems.</li>
         * <li><strong>windows</strong>: Windows operating system.</li>
         * <li><strong>linux</strong>: Linux operating system.<blockquote>
         * <p>If this parameter is left empty, the default value is determined based on the <strong>BusinessType</strong> value.</p>
         * <ul>
         * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: the value is <strong>all</strong>.</li>
         * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: the value is <strong>all</strong>.</li>
         * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: the value is <strong>all</strong>.</li>
         * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: the value is <strong>all</strong>.</li>
         * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: the value is <strong>linux</strong>.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The target asset type. Valid values:</p>
         * <ul>
         * <li><strong>all_instance</strong>: all servers.</li>
         * <li><strong>instance</strong>: select by server.</li>
         * <li><strong>group</strong>: select by group.</li>
         * <li><strong>vpc</strong>: select by VPC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateAssetSelectionConfigRequest build() {
            return new CreateAssetSelectionConfigRequest(this);
        } 

    } 

}
