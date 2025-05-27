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
 * {@link DescribeDataSourceParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSourceParametersRequest</p>
 */
public class DescribeDataSourceParametersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeDataSourceParametersRequest(Builder builder) {
        super(builder);
        this.cloudCode = builder.cloudCode;
        this.dataSourceType = builder.dataSourceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceParametersRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDataSourceParametersRequest, Builder> {
        private String cloudCode; 
        private String dataSourceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSourceParametersRequest request) {
            super(request);
            this.cloudCode = request.cloudCode;
            this.dataSourceType = request.dataSourceType;
            this.regionId = request.regionId;
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
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ckafka</strong>: Tencent Cloud TDMQ for CKafka</li>
         * <li><strong>obs</strong>: Huawei Cloud Object Storage Service (OBS)</li>
         * <li><strong>wafApi</strong>: download API of Tencent Cloud Web Application Firewall (WAF)</li>
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
        public DescribeDataSourceParametersRequest build() {
            return new DescribeDataSourceParametersRequest(this);
        } 

    } 

}
