// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeInterAuthStatisticsGlobalOverviewRequest} extends {@link RequestModel}
 *
 * <p>DescribeInterAuthStatisticsGlobalOverviewRequest</p>
 */
public class DescribeInterAuthStatisticsGlobalOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverviewPeriod")
    private String overviewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerRegion")
    private String serverRegion;

    private DescribeInterAuthStatisticsGlobalOverviewRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.overviewPeriod = builder.overviewPeriod;
        this.serverRegion = builder.serverRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInterAuthStatisticsGlobalOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return overviewPeriod
     */
    public String getOverviewPeriod() {
        return this.overviewPeriod;
    }

    /**
     * @return serverRegion
     */
    public String getServerRegion() {
        return this.serverRegion;
    }

    public static final class Builder extends Request.Builder<DescribeInterAuthStatisticsGlobalOverviewRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String overviewPeriod; 
        private String serverRegion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInterAuthStatisticsGlobalOverviewRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.overviewPeriod = request.overviewPeriod;
            this.serverRegion = request.serverRegion;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OverviewPeriod.
         */
        public Builder overviewPeriod(String overviewPeriod) {
            this.putQueryParameter("OverviewPeriod", overviewPeriod);
            this.overviewPeriod = overviewPeriod;
            return this;
        }

        /**
         * ServerRegion.
         */
        public Builder serverRegion(String serverRegion) {
            this.putQueryParameter("ServerRegion", serverRegion);
            this.serverRegion = serverRegion;
            return this;
        }

        @Override
        public DescribeInterAuthStatisticsGlobalOverviewRequest build() {
            return new DescribeInterAuthStatisticsGlobalOverviewRequest(this);
        } 

    } 

}
