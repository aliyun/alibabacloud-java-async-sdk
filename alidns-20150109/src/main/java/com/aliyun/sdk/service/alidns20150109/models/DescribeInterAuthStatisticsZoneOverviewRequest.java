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
 * {@link DescribeInterAuthStatisticsZoneOverviewRequest} extends {@link RequestModel}
 *
 * <p>DescribeInterAuthStatisticsZoneOverviewRequest</p>
 */
public class DescribeInterAuthStatisticsZoneOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverviewPeriod")
    private String overviewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerRegion")
    private String serverRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private DescribeInterAuthStatisticsZoneOverviewRequest(Builder builder) {
        super(builder);
        this.overviewPeriod = builder.overviewPeriod;
        this.serverRegion = builder.serverRegion;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInterAuthStatisticsZoneOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<DescribeInterAuthStatisticsZoneOverviewRequest, Builder> {
        private String overviewPeriod; 
        private String serverRegion; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInterAuthStatisticsZoneOverviewRequest request) {
            super(request);
            this.overviewPeriod = request.overviewPeriod;
            this.serverRegion = request.serverRegion;
            this.zoneName = request.zoneName;
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

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public DescribeInterAuthStatisticsZoneOverviewRequest build() {
            return new DescribeInterAuthStatisticsZoneOverviewRequest(this);
        } 

    } 

}
