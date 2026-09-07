// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeMfaDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMfaDevicesRequest</p>
 */
public class DescribeMfaDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumbers")
    private java.util.List<String> serialNumbers;

    private DescribeMfaDevicesRequest(Builder builder) {
        super(builder);
        this.adDomain = builder.adDomain;
        this.businessChannel = builder.businessChannel;
        this.endUserIds = builder.endUserIds;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.serialNumbers = builder.serialNumbers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMfaDevicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adDomain
     */
    public String getAdDomain() {
        return this.adDomain;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return serialNumbers
     */
    public java.util.List<String> getSerialNumbers() {
        return this.serialNumbers;
    }

    public static final class Builder extends Request.Builder<DescribeMfaDevicesRequest, Builder> {
        private String adDomain; 
        private String businessChannel; 
        private java.util.List<String> endUserIds; 
        private String filter; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List<String> serialNumbers; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMfaDevicesRequest request) {
            super(request);
            this.adDomain = request.adDomain;
            this.businessChannel = request.businessChannel;
            this.endUserIds = request.endUserIds;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.serialNumbers = request.serialNumbers;
        } 

        /**
         * <p>The AD domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn.misumi.pri</p>
         */
        public Builder adDomain(String adDomain) {
            this.putQueryParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * <p>The business channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>An array of end user usernames.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The maximum number of results to return per page. Valid range: 1–500.<br>Default value: 100.<br></p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page of results. This value is the <code>NextToken</code> returned from a previous call.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>An array of serial numbers for virtual MFA devices.</p>
         * 
         * <strong>example:</strong>
         * <p>c2d9ae94-a64b-4a0d-8024-9519ca50****</p>
         */
        public Builder serialNumbers(java.util.List<String> serialNumbers) {
            this.putQueryParameter("SerialNumbers", serialNumbers);
            this.serialNumbers = serialNumbers;
            return this;
        }

        @Override
        public DescribeMfaDevicesRequest build() {
            return new DescribeMfaDevicesRequest(this);
        } 

    } 

}
