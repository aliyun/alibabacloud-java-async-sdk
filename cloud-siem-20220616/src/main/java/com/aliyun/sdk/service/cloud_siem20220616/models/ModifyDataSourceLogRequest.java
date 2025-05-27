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
 * {@link ModifyDataSourceLogRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataSourceLogRequest</p>
 */
public class ModifyDataSourceLogRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DataSourceInstanceLogs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceInstanceLogs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCode")
    private String logCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyDataSourceLogRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.cloudCode = builder.cloudCode;
        this.dataSourceInstanceId = builder.dataSourceInstanceId;
        this.dataSourceInstanceLogs = builder.dataSourceInstanceLogs;
        this.dataSourceType = builder.dataSourceType;
        this.logCode = builder.logCode;
        this.logInstanceId = builder.logInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataSourceLogRequest create() {
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
     * @return dataSourceInstanceLogs
     */
    public String getDataSourceInstanceLogs() {
        return this.dataSourceInstanceLogs;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return logCode
     */
    public String getLogCode() {
        return this.logCode;
    }

    /**
     * @return logInstanceId
     */
    public String getLogInstanceId() {
        return this.logInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDataSourceLogRequest, Builder> {
        private String accountId; 
        private String cloudCode; 
        private String dataSourceInstanceId; 
        private String dataSourceInstanceLogs; 
        private String dataSourceType; 
        private String logCode; 
        private String logInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataSourceLogRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.cloudCode = request.cloudCode;
            this.dataSourceInstanceId = request.dataSourceInstanceId;
            this.dataSourceInstanceLogs = request.dataSourceInstanceLogs;
            this.dataSourceType = request.dataSourceType;
            this.logCode = request.logCode;
            this.logInstanceId = request.logInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxxxx</p>
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
         * <p>ef33097c9d1fdb0b9c7e8c7ca320pkl1</p>
         */
        public Builder dataSourceInstanceId(String dataSourceInstanceId) {
            this.putBodyParameter("DataSourceInstanceId", dataSourceInstanceId);
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }

        /**
         * <p>The parameters of the data source. Set this parameter to a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LogCode&quot;:&quot;cloud_siem_qcloud_waf_alert_log&quot;,&quot;LogParas&quot;:&quot;[{&quot;ParaCode&quot;:&quot;api_name&quot;,&quot;ParaValue&quot;:&quot;GetAttackDownloadRecords&quot;}]&quot;}]</p>
         */
        public Builder dataSourceInstanceLogs(String dataSourceInstanceLogs) {
            this.putBodyParameter("DataSourceInstanceLogs", dataSourceInstanceLogs);
            this.dataSourceInstanceLogs = dataSourceInstanceLogs;
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
         * <p>The log code.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_waf_xxxxx</p>
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * <p>The ID of the log. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters. You can call the <a href="https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854&activeTabKey=api%7CListDataSourceLogs">ListDataSourceLogs</a> to query log IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ef33097c9d1fdb0b9c7e8c7ca320pkl1</p>
         */
        public Builder logInstanceId(String logInstanceId) {
            this.putBodyParameter("LogInstanceId", logInstanceId);
            this.logInstanceId = logInstanceId;
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
        public ModifyDataSourceLogRequest build() {
            return new ModifyDataSourceLogRequest(this);
        } 

    } 

}
