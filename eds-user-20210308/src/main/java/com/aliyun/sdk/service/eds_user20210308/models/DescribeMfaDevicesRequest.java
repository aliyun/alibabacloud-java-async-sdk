// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumbers")
    private java.util.List < String > serialNumbers;

    private DescribeMfaDevicesRequest(Builder builder) {
        super(builder);
        this.adDomain = builder.adDomain;
        this.endUserIds = builder.endUserIds;
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
     * @return endUserIds
     */
    public java.util.List < String > getEndUserIds() {
        return this.endUserIds;
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
    public java.util.List < String > getSerialNumbers() {
        return this.serialNumbers;
    }

    public static final class Builder extends Request.Builder<DescribeMfaDevicesRequest, Builder> {
        private String adDomain; 
        private java.util.List < String > endUserIds; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < String > serialNumbers; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMfaDevicesRequest request) {
            super(request);
            this.adDomain = request.adDomain;
            this.endUserIds = request.endUserIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.serialNumbers = request.serialNumbers;
        } 

        /**
         * <p>The domain of the Active Directory (AD) workspace.</p>
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
         * <p>The usernames of the convenience users.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Valid values: 1 to 500.<br>Default value: 100.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Set the value to the token that is obtained from the previous query.</p>
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
         * <p>The serial numbers of the virtual MFA devices.</p>
         * 
         * <strong>example:</strong>
         * <p>c2d9ae94-a64b-4a0d-8024-9519ca50****</p>
         */
        public Builder serialNumbers(java.util.List < String > serialNumbers) {
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
