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
 * {@link ListAccountsByLogRequest} extends {@link RequestModel}
 *
 * <p>ListAccountsByLogRequest</p>
 */
public class ListAccountsByLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> logCodes;

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

    private ListAccountsByLogRequest(Builder builder) {
        super(builder);
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

    public static ListAccountsByLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getLogCodes() {
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

    public static final class Builder extends Request.Builder<ListAccountsByLogRequest, Builder> {
        private String cloudCode; 
        private java.util.List<String> logCodes; 
        private String prodCode; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(ListAccountsByLogRequest request) {
            super(request);
            this.cloudCode = request.cloudCode;
            this.logCodes = request.logCodes;
            this.prodCode = request.prodCode;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>The code that is used for multi-cloud environments.</p>
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
         * <p>The codes of logs. The value is a JSON array.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cloud_siem_hcloud_waf_alert_log&quot;]</p>
         */
        public Builder logCodes(java.util.List<String> logCodes) {
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
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public ListAccountsByLogRequest build() {
            return new ListAccountsByLogRequest(this);
        } 

    } 

}
