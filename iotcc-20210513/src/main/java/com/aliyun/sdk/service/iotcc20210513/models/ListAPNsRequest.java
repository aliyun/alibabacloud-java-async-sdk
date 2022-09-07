// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAPNsRequest} extends {@link RequestModel}
 *
 * <p>ListAPNsRequest</p>
 */
public class ListAPNsRequest extends Request {
    @Query
    @NameInMap("APN")
    private String APN;

    @Query
    @NameInMap("ISP")
    private String ISP;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 50, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    private String type;

    private ListAPNsRequest(Builder builder) {
        super(builder);
        this.APN = builder.APN;
        this.ISP = builder.ISP;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAPNsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APN
     */
    public String getAPN() {
        return this.APN;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAPNsRequest, Builder> {
        private String APN; 
        private String ISP; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAPNsRequest request) {
            super(request);
            this.APN = request.APN;
            this.ISP = request.ISP;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * APN.
         */
        public Builder APN(String APN) {
            this.putQueryParameter("APN", APN);
            this.APN = APN;
            return this;
        }

        /**
         * ISP.
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAPNsRequest build() {
            return new ListAPNsRequest(this);
        } 

    } 

}
