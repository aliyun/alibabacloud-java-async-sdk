// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDomainStatusCodeListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainStatusCodeListRequest</p>
 */
public class DescribeDomainStatusCodeListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeDomainStatusCodeListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.queryType = builder.queryType;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainStatusCodeListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDomainStatusCodeListRequest, Builder> {
        private String regionId; 
        private String domain; 
        private Long endTime; 
        private Long interval; 
        private String queryType; 
        private String resourceGroupId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainStatusCodeListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.queryType = request.queryType;
            this.resourceGroupId = request.resourceGroupId;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The domain name of the website. If you do not specify this parameter, the statistics on response status codes of all domain names are queried.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <blockquote>
         * <p>This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1583683200</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The interval for returning data. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The source of the statistics. Valid values:</p>
         * <ul>
         * <li><strong>gf</strong>: Anti-DDoS Pro or Anti-DDoS Premium</li>
         * <li><strong>upstrem</strong>: origin server</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gf</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The start time of the event. The value is a UNIX timestamp. Unit: seconds.</p>
         * <blockquote>
         * <p>This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1582992000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDomainStatusCodeListRequest build() {
            return new DescribeDomainStatusCodeListRequest(this);
        } 

    } 

}
