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
 * {@link ModifyDataSourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataSourceRequest</p>
 */
public class ModifyDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceInstanceId;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyDataSourceRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.cloudCode = builder.cloudCode;
        this.dataSourceInstanceId = builder.dataSourceInstanceId;
        this.dataSourceInstanceName = builder.dataSourceInstanceName;
        this.dataSourceInstanceParams = builder.dataSourceInstanceParams;
        this.dataSourceInstanceRemark = builder.dataSourceInstanceRemark;
        this.dataSourceType = builder.dataSourceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataSourceRequest create() {
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
     * @return dataSourceInstanceId
     */
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
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

    public static final class Builder extends Request.Builder<ModifyDataSourceRequest, Builder> {
        private String accountId; 
        private String cloudCode; 
        private String dataSourceInstanceId; 
        private String dataSourceInstanceName; 
        private String dataSourceInstanceParams; 
        private String dataSourceInstanceRemark; 
        private String dataSourceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataSourceRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.cloudCode = request.cloudCode;
            this.dataSourceInstanceId = request.dataSourceInstanceId;
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
         * <p>123xxxxxx</p>
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The code of the cloud service provider. Valid values:</p>
         * <ul>
         * <li>qcloud: Tencent Cloud</li>
         * <li>aliyun: Alibaba Cloud</li>
         * <li>hcloud: Huawei Cloud</li>
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
         * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters. You can call the <a href="https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854&activeTabKey=api%7CDescribeDataSourceInstance">DescribeDataSourceInstance</a> operation to query the IDs of data sources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
         */
        public Builder dataSourceInstanceId(String dataSourceInstanceId) {
            this.putBodyParameter("DataSourceInstanceId", dataSourceInstanceId);
            this.dataSourceInstanceId = dataSourceInstanceId;
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
         * <p>The parameters of the data source in the JSON string format.</p>
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
         * <li>ckafka: Tencent Cloud Kafka (CKafka)</li>
         * <li>obs: Huawei Cloud Object Storage Service (OBS)</li>
         * <li>wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        public ModifyDataSourceRequest build() {
            return new ModifyDataSourceRequest(this);
        } 

    } 

}
