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
         * <p>The list of accounts for log ingestion. The value must be a JSON array. Valid values:</p>
         * <ul>
         * <li><p>AccountId: The ID of the account.</p>
         * </li>
         * <li><p>Imported: Specifies whether to enable or disable log ingestion for the account. Valid values:</p>
         * <ul>
         * <li><p>0: Disable ingestion.</p>
         * </li>
         * <li><p>1: Enable ingestion.</p>
         * </li>
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
         * <p>Specifies whether to automatically enable log ingestion for accounts that are configured with the specified log. Valid values:</p>
         * <ul>
         * <li><p>1: Yes.</p>
         * </li>
         * <li><p>0: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoImported(Integer autoImported) {
            this.putBodyParameter("AutoImported", autoImported);
            this.autoImported = autoImported;
            return this;
        }

        /**
         * <p>The code of the cloud service provider.</p>
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
         * <p>The list of logs to be ingested. The value must be a JSON array.</p>
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
         * <p>The code of the product.</p>
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
         * <p>The region where the data management center for Threat Analysis is located. Select a region based on the location of your assets. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or Hong Kong (China).</p>
         * </li>
         * <li><p>ap-southeast-1: Your assets are outside China.</p>
         * </li>
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
         * <p>The user ID of the member that the administrator wants to access.</p>
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
         * <p>The type of view. Valid values:</p>
         * <ul>
         * <li><p>0: The view of the current Alibaba Cloud account.</p>
         * </li>
         * <li><p>1: The view of all accounts within the enterprise.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
