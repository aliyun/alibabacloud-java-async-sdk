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
 * {@link OpenDeliveryRequest} extends {@link RequestModel}
 *
 * <p>OpenDeliveryRequest</p>
 */
public class OpenDeliveryRequest extends Request {
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
         * <p>The code for a specific log of the cloud service, such as the process log of Security Center. This parameter is optional. If you do not specify this parameter, the operation applies to all logs of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_cfw_flow</p>
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * <p>The code of the cloud service. Valid values:</p>
         * <ul>
         * <li><p>qcloud_waf</p>
         * </li>
         * <li><p>qcloud_cfw</p>
         * </li>
         * <li><p>hcloud_waf</p>
         * </li>
         * <li><p>hcloud_cfw</p>
         * </li>
         * <li><p>ddos</p>
         * </li>
         * <li><p>sas</p>
         * </li>
         * <li><p>cfw</p>
         * </li>
         * <li><p>config</p>
         * </li>
         * <li><p>csk</p>
         * </li>
         * <li><p>fc</p>
         * </li>
         * <li><p>rds</p>
         * </li>
         * <li><p>nas</p>
         * </li>
         * <li><p>apigateway</p>
         * </li>
         * <li><p>cdn</p>
         * </li>
         * <li><p>mongodb</p>
         * </li>
         * <li><p>eip</p>
         * </li>
         * <li><p>slb</p>
         * </li>
         * <li><p>vpc</p>
         * </li>
         * <li><p>actiontrail</p>
         * </li>
         * <li><p>waf</p>
         * </li>
         * <li><p>bastionhost</p>
         * </li>
         * <li><p>oss</p>
         * </li>
         * <li><p>polardb</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The region where the Data Management center of threat analysis is located. Select a region based on the location of your assets. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Select this value if your assets are in the Chinese mainland or China (Hong Kong).</p>
         * </li>
         * <li><p>ap-southeast-1: Select this value if your assets are in a region outside China.</p>
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
         * <p>The ID of the member account that the administrator wants to access.</p>
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
        public OpenDeliveryRequest build() {
            return new OpenDeliveryRequest(this);
        } 

    } 

}
