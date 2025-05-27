// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link SubmitImportLogTasksRequest} extends {@link RequestModel}
 *
 * <p>SubmitImportLogTasksRequest</p>
 */
public class SubmitImportLogTasksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private String accounts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoImported")
    private Integer autoImported;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCodes")
    private String logCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prodCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private SubmitImportLogTasksRequest(Builder builder) {
        super(builder);
        this.accounts = builder.accounts;
        this.autoImported = builder.autoImported;
        this.cloudCode = builder.cloudCode;
        this.logCodes = builder.logCodes;
        this.prodCode = builder.prodCode;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImportLogTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public String getAccounts() {
        return this.accounts;
    }

    /**
     * @return autoImported
     */
    public Integer getAutoImported() {
        return this.autoImported;
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
    }

    /**
     * @return logCodes
     */
    public String getLogCodes() {
        return this.logCodes;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<SubmitImportLogTasksRequest, Builder> {
        private String accounts; 
        private Integer autoImported; 
        private String cloudCode; 
        private String logCodes; 
        private String prodCode; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImportLogTasksRequest request) {
            super(request);
            this.accounts = request.accounts;
            this.autoImported = request.autoImported;
            this.cloudCode = request.cloudCode;
            this.logCodes = request.logCodes;
            this.prodCode = request.prodCode;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>The accounts that you want to add. The value is a JSON array. Valid values:</p>
         * <ul>
         * <li><p>AccountId: the IDs of the accounts.</p>
         * </li>
         * <li><p>Imported: specifies whether to add the accounts. Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;AccountId&quot;:&quot;123123&quot;,&quot;Imported&quot;:1}]</p>
         */
        public Builder accounts(String accounts) {
            this.putBodyParameter("Accounts", accounts);
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>Specifies whether to automatically add the account for which the logging feature is configured. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cloud_siem_qcloud_cfw_alert_log&quot;]</p>
         */
        public Builder autoImported(Integer autoImported) {
            this.putBodyParameter("AutoImported", autoImported);
            this.autoImported = autoImported;
            return this;
        }

        /**
         * <p>The code that is used for multi-cloud environments. Valid values:</p>
         * <ul>
         * <li>qcloud: Tencent Cloud</li>
         * <li>aliyun: Alibaba Cloud</li>
         * <li>hcloud: Huawei Cloud</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hcloud</p>
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * <p>The logs that you want to collect. The value is a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cloud_siem_qcloud_cfw_alert_log&quot;]</p>
         */
        public Builder logCodes(String logCodes) {
            this.putBodyParameter("LogCodes", logCodes);
            this.logCodes = logCodes;
            return this;
        }

        /**
         * <p>The code of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qcloud_waf</p>
         */
        public Builder prodCode(String prodCode) {
            this.putBodyParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions inside China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
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
         * <p>The ID of the account that you switch from the management account.</p>
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
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public SubmitImportLogTasksRequest build() {
            return new SubmitImportLogTasksRequest(this);
        } 

    } 

}
