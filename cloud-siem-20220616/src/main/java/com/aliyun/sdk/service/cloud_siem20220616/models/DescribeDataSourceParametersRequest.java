// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourceParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSourceParametersRequest</p>
 */
public class DescribeDataSourceParametersRequest extends Request {
    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Body
    @NameInMap("RegionId")
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
         * CloudCode.
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * RegionId.
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