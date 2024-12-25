// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>474bdef0-d149-4695-abfb-52912d9143f0</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the data file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mirror_file/pk-1642597182026-878199448832413.tar</p>
         */
        public Builder dataName(String dataName) {
            this.putQueryParameter("DataName", dataName);
            this.dataName = dataName;
            return this;
        }

        /**
         * <p>The version number of the data file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7895</p>
         */
        public Builder dataVersion(String dataVersion) {
            this.putQueryParameter("DataVersion", dataVersion);
            this.dataVersion = dataVersion;
            return this;
        }

        /**
         * <p>This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder expireTimeout(Long expireTimeout) {
            this.putQueryParameter("ExpireTimeout", expireTimeout);
            this.expireTimeout = expireTimeout;
            return this;
        }

        /**
         * <p>The condition that you want to use to filter file servers. You can specify multiple canary release policies. By default, all resources are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;: &quot;ScheduleToRegionId&quot;,&quot;parameters&quot;:{&quot;operator&quot;: &quot;In&quot;,&quot;values&quot;: [&quot;cn-shijiazhuang-telecom_unicom_cmcc&quot;]}}</p>
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
