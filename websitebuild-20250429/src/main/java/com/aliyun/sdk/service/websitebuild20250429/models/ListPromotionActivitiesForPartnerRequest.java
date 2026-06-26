// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListPromotionActivitiesForPartnerRequest} extends {@link RequestModel}
 *
 * <p>ListPromotionActivitiesForPartnerRequest</p>
 */
public class ListPromotionActivitiesForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmployeeCode")
    private String employeeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListPromotionActivitiesForPartnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channel = builder.channel;
        this.employeeCode = builder.employeeCode;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPromotionActivitiesForPartnerRequest create() {
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
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return this.employeeCode;
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

    public static final class Builder extends Request.Builder<ListPromotionActivitiesForPartnerRequest, Builder> {
        private String regionId; 
        private String channel; 
        private String employeeCode; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListPromotionActivitiesForPartnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channel = request.channel;
            this.employeeCode = request.employeeCode;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
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
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * EmployeeCode.
         */
        public Builder employeeCode(String employeeCode) {
            this.putQueryParameter("EmployeeCode", employeeCode);
            this.employeeCode = employeeCode;
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

        @Override
        public ListPromotionActivitiesForPartnerRequest build() {
            return new ListPromotionActivitiesForPartnerRequest(this);
        } 

    } 

}
