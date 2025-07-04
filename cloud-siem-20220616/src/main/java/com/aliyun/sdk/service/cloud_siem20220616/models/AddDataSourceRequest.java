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
 * {@link AddDataSourceRequest} extends {@link RequestModel}
 *
 * <p>AddDataSourceRequest</p>
 */
public class AddDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceInstanceName")
    private String dataSourceInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceInstanceParams")
    private String dataSourceInstanceParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceInstanceRemark")
    private String dataSourceInstanceRemark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddDataSourceRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.cloudCode = builder.cloudCode;
        this.dataSourceInstanceName = builder.dataSourceInstanceName;
        this.dataSourceInstanceParams = builder.dataSourceInstanceParams;
        this.dataSourceInstanceRemark = builder.dataSourceInstanceRemark;
        this.dataSourceType = builder.dataSourceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
    }

    /**
     * @return dataSourceInstanceName
     */
    public String getDataSourceInstanceName() {
        return this.dataSourceInstanceName;
    }

    /**
     * @return dataSourceInstanceParams
     */
    public String getDataSourceInstanceParams() {
        return this.dataSourceInstanceParams;
    }

    /**
     * @return dataSourceInstanceRemark
     */
    public String getDataSourceInstanceRemark() {
        return this.dataSourceInstanceRemark;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddDataSourceRequest, Builder> {
        private String accountId; 
        private String cloudCode; 
        private String dataSourceInstanceName; 
        private String dataSourceInstanceParams; 
        private String dataSourceInstanceRemark; 
        private String dataSourceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddDataSourceRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.cloudCode = request.cloudCode;
            this.dataSourceInstanceName = request.dataSourceInstanceName;
            this.dataSourceInstanceParams = request.dataSourceInstanceParams;
            this.dataSourceInstanceRemark = request.dataSourceInstanceRemark;
            this.dataSourceType = request.dataSourceType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxxxxx</p>
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The code of the cloud service provider.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>qcloud</li>
         * <li>hcloud</li>
         * <li>aliyun</li>
         * </ul>
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
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing_waf_kafka</p>
         */
        public Builder dataSourceInstanceName(String dataSourceInstanceName) {
            this.putBodyParameter("DataSourceInstanceName", dataSourceInstanceName);
            this.dataSourceInstanceName = dataSourceInstanceName;
            return this;
        }

        /**
         * <p>The parameters of the data source. Set this parameter to a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;paraCode&quot;:&quot;region_code&quot;,&quot;paraValue&quot;:&quot;ap-guangzhou&quot;}]</p>
         */
        public Builder dataSourceInstanceParams(String dataSourceInstanceParams) {
            this.putBodyParameter("DataSourceInstanceParams", dataSourceInstanceParams);
            this.dataSourceInstanceParams = dataSourceInstanceParams;
            return this;
        }

        /**
         * <p>The remarks on the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_alert_log</p>
         */
        public Builder dataSourceInstanceRemark(String dataSourceInstanceRemark) {
            this.putBodyParameter("DataSourceInstanceRemark", dataSourceInstanceRemark);
            this.dataSourceInstanceRemark = dataSourceInstanceRemark;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>obs: Huawei Cloud Object Storage Service (OBS)</li>
         * <li>wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</li>
         * <li>ckafka: Tencent Cloud Kafka (CKafka)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>obs</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
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

        @Override
        public AddDataSourceRequest build() {
            return new AddDataSourceRequest(this);
        } 

    } 

}
