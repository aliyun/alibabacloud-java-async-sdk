// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDeliveryRequest} extends {@link RequestModel}
 *
 * <p>CloseDeliveryRequest</p>
 */
public class CloseDeliveryRequest extends Request {
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

    private CloseDeliveryRequest(Builder builder) {
        super(builder);
        this.logCode = builder.logCode;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<CloseDeliveryRequest, Builder> {
        private String logCode; 
        private String productCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CloseDeliveryRequest request) {
            super(request);
            this.logCode = request.logCode;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
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
         * *   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CloseDeliveryRequest build() {
            return new CloseDeliveryRequest(this);
        } 

    } 

}
