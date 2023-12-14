// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataSourceLogRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataSourceLogRequest</p>
 */
public class ModifyDataSourceLogRequest extends Request {
    @Body
    @NameInMap("AccountId")
    private String accountId;

    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("DataSourceInstanceId")
    @Validation(required = true)
    private String dataSourceInstanceId;

    @Body
    @NameInMap("DataSourceInstanceLogs")
    @Validation(required = true)
    private String dataSourceInstanceLogs;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("LogCode")
    private String logCode;

    @Body
    @NameInMap("LogInstanceId")
    @Validation(required = true)
    private String logInstanceId;

    @Body
    @NameInMap("RegionId")
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
         * DataSourceInstanceId.
         */
        public Builder dataSourceInstanceId(String dataSourceInstanceId) {
            this.putBodyParameter("DataSourceInstanceId", dataSourceInstanceId);
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }

        /**
         * DataSourceInstanceLogs.
         */
        public Builder dataSourceInstanceLogs(String dataSourceInstanceLogs) {
            this.putBodyParameter("DataSourceInstanceLogs", dataSourceInstanceLogs);
            this.dataSourceInstanceLogs = dataSourceInstanceLogs;
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
         * LogCode.
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * LogInstanceId.
         */
        public Builder logInstanceId(String logInstanceId) {
            this.putBodyParameter("LogInstanceId", logInstanceId);
            this.logInstanceId = logInstanceId;
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
        public ModifyDataSourceLogRequest build() {
            return new ModifyDataSourceLogRequest(this);
        } 

    } 

}
