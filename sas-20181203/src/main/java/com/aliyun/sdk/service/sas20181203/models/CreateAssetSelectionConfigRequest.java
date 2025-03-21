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
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private CreateAssetSelectionConfigRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
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
        private String platform; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAssetSelectionConfigRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.platform = request.platform;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The feature that you want to select for the asset. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: virus detection and removal</li>
         * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: one-time scan for viruses</li>
         * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: a whitelist rule for alerts that are detected by using the agentless detection feature</li>
         * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: a whitelist rule for vulnerabilities that are detected by using the agentless detection feature</li>
         * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: core file protection</li>
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
         * <p>The operating system of the asset. Valid values:</p>
         * <ul>
         * <li><strong>all</strong>: all operating systems</li>
         * <li><strong>windows</strong>: the Windows operating system</li>
         * <li><strong>linux</strong>: the Linux operating system</li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, the system automatically selects a value for the parameter based on the value of the <strong>BusinessType</strong> parameter.</p>
         * </blockquote>
         * <ul>
         * <li><p>If the BusinessType parameter is set to <strong>VIRUS_SCAN_CYCLE_CONFIG</strong>, the value of the Platform parameter is <strong>all</strong>.</p>
         * </li>
         * <li><p>If the BusinessType parameter is set to <strong>VIRUS_SCAN_ONCE_TASK</strong>, the value of the Platform parameter is <strong>all</strong>.</p>
         * </li>
         * <li><p>If the BusinessType parameter is set to <strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>, the value of the Platform parameter is <strong>all</strong>.</p>
         * </li>
         * <li><p>If the BusinessType parameter is set to <strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong> the value of the Platform parameter is <strong>all</strong>.</p>
         * </li>
         * <li><p>If the BusinessType parameter is set to <strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>, the value of the Platform parameter is <strong>linux</strong>.</p>
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
         * <p>The dimension based on which you want to select the asset. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: selects the asset by server.</li>
         * <li><strong>group</strong>: selects the asset by group.</li>
         * <li><strong>vpc</strong>: selects the asset by virtual private cloud (VPC).</li>
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
