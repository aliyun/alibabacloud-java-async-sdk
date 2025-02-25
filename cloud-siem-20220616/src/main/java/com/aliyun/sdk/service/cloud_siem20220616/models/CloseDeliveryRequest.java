// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDeliveryRequest} extends {@link RequestModel}
 *
 * <p>CloseDeliveryRequest</p>
 */
public class CloseDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCode")
    private String logCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private CloseDeliveryRequest(Builder builder) {
        super(builder);
        this.logCode = builder.logCode;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logCode
     */
    public String getLogCode() {
        return this.logCode;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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

    public static final class Builder extends Request.Builder<CloseDeliveryRequest, Builder> {
        private String logCode; 
        private String productCode; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(CloseDeliveryRequest request) {
            super(request);
            this.logCode = request.logCode;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * The log code of the cloud service, such as the code of the process log for Security Center. You can obtain the log code from the response of the ListDelivery operation.
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * The code of the cloud service. Valid values:
         * <p>
         * 
         * *   qcloud_waf
         * *   qlcoud_cfw
         * *   hcloud_waf
         * *   hcloud_cfw
         * *   ddos
         * *   sas
         * *   cfw
         * *   config
         * *   csk
         * *   fc
         * *   rds
         * *   nas
         * *   apigateway
         * *   cdn
         * *   mongodb
         * *   eip
         * *   slb
         * *   vpc
         * *   actiontrail
         * *   waf
         * *   bastionhost
         * *   oss
         * *   polardb
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:
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
        public CloseDeliveryRequest build() {
            return new CloseDeliveryRequest(this);
        } 

    } 

}
