// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The accounts that you want to add. The value is a JSON array. Valid values:
         * <p>
         * 
         * *   AccountId: the IDs of the accounts.
         * 
         * *   Imported: specifies whether to add the accounts. Valid values:
         * 
         *     *   0: no
         *     *   1: yes
         */
        public Builder accounts(String accounts) {
            this.putBodyParameter("Accounts", accounts);
            this.accounts = accounts;
            return this;
        }

        /**
         * Specifies whether to automatically add the account for which the logging feature is configured. Valid values:
         * <p>
         * 
         * *   1: yes
         * *   0: no
         */
        public Builder autoImported(Integer autoImported) {
            this.putBodyParameter("AutoImported", autoImported);
            this.autoImported = autoImported;
            return this;
        }

        /**
         * The code that is used for multi-cloud environments. Valid values:
         * <p>
         * 
         * *   qcloud: Tencent Cloud
         * *   aliyun: Alibaba Cloud
         * *   hcloud: Huawei Cloud
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * The logs that you want to collect. The value is a JSON array.
         */
        public Builder logCodes(String logCodes) {
            this.putBodyParameter("LogCodes", logCodes);
            this.logCodes = logCodes;
            return this;
        }

        /**
         * The code of the service.
         */
        public Builder prodCode(String prodCode) {
            this.putBodyParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the account that you switch from the management account.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view. Valid values:
         * <p>
         * - 0: the current Alibaba Cloud account
         * - 1: the global account
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
