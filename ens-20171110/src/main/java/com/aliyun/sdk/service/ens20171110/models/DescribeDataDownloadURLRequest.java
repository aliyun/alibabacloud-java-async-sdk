// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataDownloadURLRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataDownloadURLRequest</p>
 */
public class DescribeDataDownloadURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTimeout")
    private Long expireTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerFilterStrategy")
    private String serverFilterStrategy;

    private DescribeDataDownloadURLRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataName = builder.dataName;
        this.dataVersion = builder.dataVersion;
        this.expireTimeout = builder.expireTimeout;
        this.serverFilterStrategy = builder.serverFilterStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataDownloadURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dataName
     */
    public String getDataName() {
        return this.dataName;
    }

    /**
     * @return dataVersion
     */
    public String getDataVersion() {
        return this.dataVersion;
    }

    /**
     * @return expireTimeout
     */
    public Long getExpireTimeout() {
        return this.expireTimeout;
    }

    /**
     * @return serverFilterStrategy
     */
    public String getServerFilterStrategy() {
        return this.serverFilterStrategy;
    }

    public static final class Builder extends Request.Builder<DescribeDataDownloadURLRequest, Builder> {
        private String appId; 
        private String dataName; 
        private String dataVersion; 
        private Long expireTimeout; 
        private String serverFilterStrategy; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataDownloadURLRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataName = request.dataName;
            this.dataVersion = request.dataVersion;
            this.expireTimeout = request.expireTimeout;
            this.serverFilterStrategy = request.serverFilterStrategy;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the data file.
         */
        public Builder dataName(String dataName) {
            this.putQueryParameter("DataName", dataName);
            this.dataName = dataName;
            return this;
        }

        /**
         * The version number of the data file.
         */
        public Builder dataVersion(String dataVersion) {
            this.putQueryParameter("DataVersion", dataVersion);
            this.dataVersion = dataVersion;
            return this;
        }

        /**
         * This parameter is reserved.
         */
        public Builder expireTimeout(Long expireTimeout) {
            this.putQueryParameter("ExpireTimeout", expireTimeout);
            this.expireTimeout = expireTimeout;
            return this;
        }

        /**
         * The condition that you want to use to filter file servers. You can specify multiple canary release policies. By default, all resources are queried.
         */
        public Builder serverFilterStrategy(String serverFilterStrategy) {
            this.putQueryParameter("ServerFilterStrategy", serverFilterStrategy);
            this.serverFilterStrategy = serverFilterStrategy;
            return this;
        }

        @Override
        public DescribeDataDownloadURLRequest build() {
            return new DescribeDataDownloadURLRequest(this);
        } 

    } 

}
