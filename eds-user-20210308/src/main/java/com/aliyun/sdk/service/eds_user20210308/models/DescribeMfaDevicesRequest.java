// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMfaDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMfaDevicesRequest</p>
 */
public class DescribeMfaDevicesRequest extends Request {
    @Query
    @NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("SerialNumbers")
    private java.util.List < String > serialNumbers;

    private DescribeMfaDevicesRequest(Builder builder) {
        super(builder);
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
        private java.util.List < String > endUserIds; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < String > serialNumbers; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMfaDevicesRequest response) {
            super(response);
            this.endUserIds = response.endUserIds;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.serialNumbers = response.serialNumbers;
        } 

        /**
         * EndUserIds.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SerialNumbers.
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
