// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CreateSmsAppIcpRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsAppIcpRecordRequest</p>
 */
public class CreateSmsAppIcpRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppApprovalDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appApprovalDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIcpLicenseNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIcpLicenseNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIcpRecordPic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIcpRecordPic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppPrincipalUnitName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appPrincipalUnitName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appServiceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateSmsAppIcpRecordRequest(Builder builder) {
        super(builder);
        this.appApprovalDate = builder.appApprovalDate;
        this.appIcpLicenseNumber = builder.appIcpLicenseNumber;
        this.appIcpRecordPic = builder.appIcpRecordPic;
        this.appPrincipalUnitName = builder.appPrincipalUnitName;
        this.appServiceName = builder.appServiceName;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsAppIcpRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appApprovalDate
     */
    public String getAppApprovalDate() {
        return this.appApprovalDate;
    }

    /**
     * @return appIcpLicenseNumber
     */
    public String getAppIcpLicenseNumber() {
        return this.appIcpLicenseNumber;
    }

    /**
     * @return appIcpRecordPic
     */
    public String getAppIcpRecordPic() {
        return this.appIcpRecordPic;
    }

    /**
     * @return appPrincipalUnitName
     */
    public String getAppPrincipalUnitName() {
        return this.appPrincipalUnitName;
    }

    /**
     * @return appServiceName
     */
    public String getAppServiceName() {
        return this.appServiceName;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateSmsAppIcpRecordRequest, Builder> {
        private String appApprovalDate; 
        private String appIcpLicenseNumber; 
        private String appIcpRecordPic; 
        private String appPrincipalUnitName; 
        private String appServiceName; 
        private String domain; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsAppIcpRecordRequest request) {
            super(request);
            this.appApprovalDate = request.appApprovalDate;
            this.appIcpLicenseNumber = request.appIcpLicenseNumber;
            this.appIcpRecordPic = request.appIcpRecordPic;
            this.appPrincipalUnitName = request.appPrincipalUnitName;
            this.appServiceName = request.appServiceName;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>审核通过日期，示例2025-09-01</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-22</p>
         */
        public Builder appApprovalDate(String appApprovalDate) {
            this.putQueryParameter("AppApprovalDate", appApprovalDate);
            this.appApprovalDate = appApprovalDate;
            return this;
        }

        /**
         * <p>ICP备案/许可证号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder appIcpLicenseNumber(String appIcpLicenseNumber) {
            this.putQueryParameter("AppIcpLicenseNumber", appIcpLicenseNumber);
            this.appIcpLicenseNumber = appIcpLicenseNumber;
            return this;
        }

        /**
         * <p>app-icp备案详情截图osskey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456/test1719383196031.jpg</p>
         */
        public Builder appIcpRecordPic(String appIcpRecordPic) {
            this.putQueryParameter("AppIcpRecordPic", appIcpRecordPic);
            this.appIcpRecordPic = appIcpRecordPic;
            return this;
        }

        /**
         * <p>主办单位名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder appPrincipalUnitName(String appPrincipalUnitName) {
            this.putQueryParameter("AppPrincipalUnitName", appPrincipalUnitName);
            this.appPrincipalUnitName = appPrincipalUnitName;
            return this;
        }

        /**
         * <p>app服务名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder appServiceName(String appServiceName) {
            this.putQueryParameter("AppServiceName", appServiceName);
            this.appServiceName = appServiceName;
            return this;
        }

        /**
         * <p>APP应用商店链接</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alicom-ops.alibaba-inc.com/dyorder/audit-domain/rule_manage">https://alicom-ops.alibaba-inc.com/dyorder/audit-domain/rule_manage</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateSmsAppIcpRecordRequest build() {
            return new CreateSmsAppIcpRecordRequest(this);
        } 

    } 

}
