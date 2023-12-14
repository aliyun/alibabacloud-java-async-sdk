// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataSourceRequest} extends {@link RequestModel}
 *
 * <p>AddDataSourceRequest</p>
 */
public class AddDataSourceRequest extends Request {
    @Body
    @NameInMap("AccountId")
    private String accountId;

    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("DataSourceInstanceName")
    private String dataSourceInstanceName;

    @Body
    @NameInMap("DataSourceInstanceParams")
    private String dataSourceInstanceParams;

    @Body
    @NameInMap("DataSourceInstanceRemark")
    private String dataSourceInstanceRemark;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("RegionId")
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
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
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
         * DataSourceInstanceName.
         */
        public Builder dataSourceInstanceName(String dataSourceInstanceName) {
            this.putBodyParameter("DataSourceInstanceName", dataSourceInstanceName);
            this.dataSourceInstanceName = dataSourceInstanceName;
            return this;
        }

        /**
         * DataSourceInstanceParams.
         */
        public Builder dataSourceInstanceParams(String dataSourceInstanceParams) {
            this.putBodyParameter("DataSourceInstanceParams", dataSourceInstanceParams);
            this.dataSourceInstanceParams = dataSourceInstanceParams;
            return this;
        }

        /**
         * DataSourceInstanceRemark.
         */
        public Builder dataSourceInstanceRemark(String dataSourceInstanceRemark) {
            this.putBodyParameter("DataSourceInstanceRemark", dataSourceInstanceRemark);
            this.dataSourceInstanceRemark = dataSourceInstanceRemark;
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
        public AddDataSourceRequest build() {
            return new AddDataSourceRequest(this);
        } 

    } 

}
