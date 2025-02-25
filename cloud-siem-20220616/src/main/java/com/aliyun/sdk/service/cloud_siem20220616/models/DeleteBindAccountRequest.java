// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBindAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteBindAccountRequest</p>
 */
public class DeleteBindAccountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindId")
    private Long bindId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private DeleteBindAccountRequest(Builder builder) {
        super(builder);
        this.accessId = builder.accessId;
        this.accountId = builder.accountId;
        this.bindId = builder.bindId;
        this.cloudCode = builder.cloudCode;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBindAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return bindId
     */
    public Long getBindId() {
        return this.bindId;
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
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

    public static final class Builder extends Request.Builder<DeleteBindAccountRequest, Builder> {
        private String accessId; 
        private String accountId; 
        private Long bindId; 
        private String cloudCode; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBindAccountRequest request) {
            super(request);
            this.accessId = request.accessId;
            this.accountId = request.accountId;
            this.bindId = request.bindId;
            this.cloudCode = request.cloudCode;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * The AccessKey ID of the cloud account.
         */
        public Builder accessId(String accessId) {
            this.putBodyParameter("AccessId", accessId);
            this.accessId = accessId;
            return this;
        }

        /**
         * The ID of the cloud account.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The ID generated when the account is added to the threat analysis feature. You can call the [ListBindAccount](https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854\&activeTabKey=api%7CListBindAccount) operation to query the ID.
         */
        public Builder bindId(Long bindId) {
            this.putBodyParameter("BindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * The code of the cloud service provider. Valid values:
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
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DeleteBindAccountRequest build() {
            return new DeleteBindAccountRequest(this);
        } 

    } 

}
