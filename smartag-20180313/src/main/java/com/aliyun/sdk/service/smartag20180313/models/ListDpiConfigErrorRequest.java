// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListDpiConfigErrorRequest} extends {@link RequestModel}
 *
 * <p>ListDpiConfigErrorRequest</p>
 */
public class ListDpiConfigErrorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DpiConfigType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dpiConfigType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleInstanceId")
    private String ruleInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    private ListDpiConfigErrorRequest(Builder builder) {
        super(builder);
        this.dpiConfigType = builder.dpiConfigType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.ruleInstanceId = builder.ruleInstanceId;
        this.smartAGId = builder.smartAGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDpiConfigErrorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dpiConfigType
     */
    public String getDpiConfigType() {
        return this.dpiConfigType;
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
     * @return ruleInstanceId
     */
    public String getRuleInstanceId() {
        return this.ruleInstanceId;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public static final class Builder extends Request.Builder<ListDpiConfigErrorRequest, Builder> {
        private String dpiConfigType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String ruleInstanceId; 
        private String smartAGId; 

        private Builder() {
            super();
        } 

        private Builder(ListDpiConfigErrorRequest request) {
            super(request);
            this.dpiConfigType = request.dpiConfigType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.ruleInstanceId = request.ruleInstanceId;
            this.smartAGId = request.smartAGId;
        } 

        /**
         * <p>The type of the instance for which the DPI feature is configured. Valid values:</p>
         * <ul>
         * <li><strong>acl</strong></li>
         * <li><strong>qos</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos</p>
         */
        public Builder dpiConfigType(String dpiConfigType) {
            this.putQueryParameter("DpiConfigType", dpiConfigType);
            this.dpiConfigType = dpiConfigType;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <p>Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the instance for which the DPI feature is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-1strcafl4wghpb****</p>
         */
        public Builder ruleInstanceId(String ruleInstanceId) {
            this.putQueryParameter("RuleInstanceId", ruleInstanceId);
            this.ruleInstanceId = ruleInstanceId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-1e8sgws6b133b8****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        @Override
        public ListDpiConfigErrorRequest build() {
            return new ListDpiConfigErrorRequest(this);
        } 

    } 

}
