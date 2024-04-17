// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenDeliveryRequest} extends {@link RequestModel}
 *
 * <p>OpenDeliveryRequest</p>
 */
public class OpenDeliveryRequest extends Request {
    @Body
    @NameInMap("LogCode")
    private String logCode;

    @Body
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleFor")
    private Long roleFor;

    @Body
    @NameInMap("RoleType")
    private Integer roleType;

    private OpenDeliveryRequest(Builder builder) {
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

    public static OpenDeliveryRequest create() {
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

    public static final class Builder extends Request.Builder<OpenDeliveryRequest, Builder> {
        private String logCode; 
        private String productCode; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(OpenDeliveryRequest request) {
            super(request);
            this.logCode = request.logCode;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * The log code of the cloud service, such as the code of the process log for Security Center. If you leave this parameter empty, operations are performed on all logs of the cloud service.
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
         * *   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
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
        public OpenDeliveryRequest build() {
            return new OpenDeliveryRequest(this);
        } 

    } 

}
