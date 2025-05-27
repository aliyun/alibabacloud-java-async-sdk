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
         * <p>The log code of the cloud service, such as the code of the process log for Security Center. You can obtain the log code from the response of the ListDelivery operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_proc</p>
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * <p>The code of the cloud service. Valid values:</p>
         * <ul>
         * <li>qcloud_waf</li>
         * <li>qlcoud_cfw</li>
         * <li>hcloud_waf</li>
         * <li>hcloud_cfw</li>
         * <li>ddos</li>
         * <li>sas</li>
         * <li>cfw</li>
         * <li>config</li>
         * <li>csk</li>
         * <li>fc</li>
         * <li>rds</li>
         * <li>nas</li>
         * <li>apigateway</li>
         * <li>cdn</li>
         * <li>mongodb</li>
         * <li>eip</li>
         * <li>slb</li>
         * <li>vpc</li>
         * <li>actiontrail</li>
         * <li>waf</li>
         * <li>bastionhost</li>
         * <li>oss</li>
         * <li>polardb</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
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
         * <p>1</p>
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
