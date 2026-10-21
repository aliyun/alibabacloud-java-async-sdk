// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateDataStorageDeliveryRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataStorageDeliveryRequest</p>
 */
public class UpdateDataStorageDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoIncludeNewAccounts")
    private Boolean autoIncludeNewAccounts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigurationVersion")
    private Long configurationVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogDeliveryStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String logDeliveryStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SelectedAccountIds")
    private java.util.List<String> selectedAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    private Long subUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetProject")
    private String targetProject;

    private UpdateDataStorageDeliveryRequest(Builder builder) {
        super(builder);
        this.autoIncludeNewAccounts = builder.autoIncludeNewAccounts;
        this.configurationVersion = builder.configurationVersion;
        this.lang = builder.lang;
        this.logCode = builder.logCode;
        this.logDeliveryStatus = builder.logDeliveryStatus;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.selectedAccountIds = builder.selectedAccountIds;
        this.subUserId = builder.subUserId;
        this.targetProject = builder.targetProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStorageDeliveryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoIncludeNewAccounts
     */
    public Boolean getAutoIncludeNewAccounts() {
        return this.autoIncludeNewAccounts;
    }

    /**
     * @return configurationVersion
     */
    public Long getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logCode
     */
    public String getLogCode() {
        return this.logCode;
    }

    /**
     * @return logDeliveryStatus
     */
    public String getLogDeliveryStatus() {
        return this.logDeliveryStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return selectedAccountIds
     */
    public java.util.List<String> getSelectedAccountIds() {
        return this.selectedAccountIds;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    /**
     * @return targetProject
     */
    public String getTargetProject() {
        return this.targetProject;
    }

    public static final class Builder extends Request.Builder<UpdateDataStorageDeliveryRequest, Builder> {
        private Boolean autoIncludeNewAccounts; 
        private Long configurationVersion; 
        private String lang; 
        private String logCode; 
        private String logDeliveryStatus; 
        private String regionId; 
        private Long roleFor; 
        private java.util.List<String> selectedAccountIds; 
        private Long subUserId; 
        private String targetProject; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataStorageDeliveryRequest request) {
            super(request);
            this.autoIncludeNewAccounts = request.autoIncludeNewAccounts;
            this.configurationVersion = request.configurationVersion;
            this.lang = request.lang;
            this.logCode = request.logCode;
            this.logDeliveryStatus = request.logDeliveryStatus;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.selectedAccountIds = request.selectedAccountIds;
            this.subUserId = request.subUserId;
            this.targetProject = request.targetProject;
        } 

        /**
         * <p>是否将后续新增且可用的纳管成员自动加入该日志类型的账号选择。true 表示开启，false 表示关闭；关闭不会移除已选择成员。省略保持原值。需同时传 LogCode、ConfigurationVersion、TargetProject，可与 SelectedAccountIds 一起更新，不可同时传 LogDeliveryStatus 或成员 SubUserId。实际投递还受多账号总开关和该日志类型投递开关控制。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoIncludeNewAccounts(Boolean autoIncludeNewAccounts) {
            this.putBodyParameter("AutoIncludeNewAccounts", autoIncludeNewAccounts);
            this.autoIncludeNewAccounts = autoIncludeNewAccounts;
            return this;
        }

        /**
         * <p>本次修改所依据的投递设置版本。先调用 GetDataStorage，取 Data.DeliverySettings.ConfigurationVersion 原值传入；示例 1 仅展示格式，不能作为固定版本使用。修改总开关、账号选择、自动纳入设置或指定成员投递时必传。版本缺失或已变化时返回 OperationDenied.CentralizedDeliveryConfigChanged，应重新查询后再提交。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder configurationVersion(Long configurationVersion) {
            this.putBodyParameter("ConfigurationVersion", configurationVersion);
            this.configurationVersion = configurationVersion;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.
         * This parameter is required. If this parameter is not specified, the API returns a 400 error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The log code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-login</p>
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * <p>The log delivery status. Valid values:</p>
         * <ul>
         * <li>enable: Enables log delivery.</li>
         * <li>disable: Disables log delivery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder logDeliveryStatus(String logDeliveryStatus) {
            this.putBodyParameter("LogDeliveryStatus", logDeliveryStatus);
            this.logDeliveryStatus = logDeliveryStatus;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center resides. Specify the management center based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets reside outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>该日志类型的完整账号选择列表，元素为十进制 UID 字符串，必须包含 Data.DeliverySettings.DaAccountId（本账号），最多 10000 项。新增成员须在 GetDataStorage 的 Accounts 列表中且 Authorized=true。仅保留本账号时传本账号 UID，不能用空字符串或空数组代替。省略本字段保持原选择。HTTP 请求使用 array(simple) 的逗号分隔格式：SelectedAccountIds=1234567890123456,1234567890123457；单账号只传一个 UID。不使用 SelectedAccountIds.1/.2 或 JSON 数组字符串。需同时传 ConfigurationVersion、TargetProject，并省略 LogDeliveryStatus 和成员 SubUserId。</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456,1234567890123457</p>
         */
        public Builder selectedAccountIds(java.util.List<String> selectedAccountIds) {
            String selectedAccountIdsShrink = shrink(selectedAccountIds, "SelectedAccountIds", "simple");
            this.putBodyParameter("SelectedAccountIds", selectedAccountIdsShrink);
            this.selectedAccountIds = selectedAccountIds;
            return this;
        }

        /**
         * <p>日志来源云账号 UID，使用十进制整数。省略或等于本账号 UID 时操作本账号投递；传成员 UID 时仅对该成员应用当前配置期望的投递状态，需同时传 LogDeliveryStatus、ConfigurationVersion、TargetProject。成员必须已在该类型选择范围中或已有投递记录。保存账号选择或自动纳入设置时应省略本字段，不可传其他成员 UID。</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123457</p>
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        /**
         * <p>当前日志投递目标 SLS Project 的名称。先调用 GetDataStorage，取 Data.DeliverySettings.TargetProject 原值传入；用于校验本次修改的目标，不用于指定新的 Project。修改总开关、账号选择、自动纳入设置或指定成员投递时必传；缺失或与当前目标不同会返回 OperationDenied.CentralizedDeliveryConfigChanged。示例中的账号 UID 和地域需替换为查询结果。</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-1234567890123456-cn-shanghai</p>
         */
        public Builder targetProject(String targetProject) {
            this.putBodyParameter("TargetProject", targetProject);
            this.targetProject = targetProject;
            return this;
        }

        @Override
        public UpdateDataStorageDeliveryRequest build() {
            return new UpdateDataStorageDeliveryRequest(this);
        } 

    } 

}
