// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataSourceLogRequest} extends {@link RequestModel}
 *
 * <p>AddDataSourceLogRequest</p>
 */
public class AddDataSourceLogRequest extends Request {
    @Body
    @NameInMap("AccountId")
    @Validation(required = true)
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
    @NameInMap("LogCode")
    private String logCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private AddDataSourceLogRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.cloudCode = builder.cloudCode;
        this.dataSourceInstanceId = builder.dataSourceInstanceId;
        this.dataSourceInstanceLogs = builder.dataSourceInstanceLogs;
        this.logCode = builder.logCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataSourceLogRequest create() {
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
     * @return logCode
     */
    public String getLogCode() {
        return this.logCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddDataSourceLogRequest, Builder> {
        private String accountId; 
        private String cloudCode; 
        private String dataSourceInstanceId; 
        private String dataSourceInstanceLogs; 
        private String logCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddDataSourceLogRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.cloudCode = request.cloudCode;
            this.dataSourceInstanceId = request.dataSourceInstanceId;
            this.dataSourceInstanceLogs = request.dataSourceInstanceLogs;
            this.logCode = request.logCode;
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
         * LogCode.
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
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
        public AddDataSourceLogRequest build() {
            return new AddDataSourceLogRequest(this);
        } 

    } 

}
