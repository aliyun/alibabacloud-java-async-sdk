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
 * {@link DescribeInterAuthStatisticsHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeInterAuthStatisticsHistoryRequest</p>
 */
public class DescribeInterAuthStatisticsHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rcode")
    private String rcode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerRegion")
    private String serverRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    private Long startTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticalType")
    private String statisticalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private DescribeInterAuthStatisticsHistoryRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTimestamp = builder.endTimestamp;
        this.rcode = builder.rcode;
        this.serverRegion = builder.serverRegion;
        this.startTimestamp = builder.startTimestamp;
        this.statisticalType = builder.statisticalType;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInterAuthStatisticsHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return rcode
     */
    public String getRcode() {
        return this.rcode;
    }

    /**
     * @return serverRegion
     */
    public String getServerRegion() {
        return this.serverRegion;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return statisticalType
     */
    public String getStatisticalType() {
        return this.statisticalType;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<DescribeInterAuthStatisticsHistoryRequest, Builder> {
        private String domainName; 
        private Long endTimestamp; 
        private String rcode; 
        private String serverRegion; 
        private Long startTimestamp; 
        private String statisticalType; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInterAuthStatisticsHistoryRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTimestamp = request.endTimestamp;
            this.rcode = request.rcode;
            this.serverRegion = request.serverRegion;
            this.startTimestamp = request.startTimestamp;
            this.statisticalType = request.statisticalType;
            this.zoneName = request.zoneName;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * Rcode.
         */
        public Builder rcode(String rcode) {
            this.putQueryParameter("Rcode", rcode);
            this.rcode = rcode;
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
         * StartTimestamp.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * StatisticalType.
         */
        public Builder statisticalType(String statisticalType) {
            this.putQueryParameter("StatisticalType", statisticalType);
            this.statisticalType = statisticalType;
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
        public DescribeInterAuthStatisticsHistoryRequest build() {
            return new DescribeInterAuthStatisticsHistoryRequest(this);
        } 

    } 

}
