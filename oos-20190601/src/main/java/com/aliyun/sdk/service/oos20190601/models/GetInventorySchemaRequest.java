// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInventorySchemaRequest} extends {@link RequestModel}
 *
 * <p>GetInventorySchemaRequest</p>
 */
public class GetInventorySchemaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Aggregator")
    private Boolean aggregator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    private GetInventorySchemaRequest(Builder builder) {
        super(builder);
        this.aggregator = builder.aggregator;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.typeName = builder.typeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventorySchemaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregator
     */
    public Boolean getAggregator() {
        return this.aggregator;
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
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    public static final class Builder extends Request.Builder<GetInventorySchemaRequest, Builder> {
        private Boolean aggregator; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String typeName; 

        private Builder() {
            super();
        } 

        private Builder(GetInventorySchemaRequest request) {
            super(request);
            this.aggregator = request.aggregator;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.typeName = request.typeName;
        } 

        /**
         * <p>Specifies whether to return only properties that support the aggregate feature in the configuration list. Valid values:</p>
         * <ul>
         * <li>true: only returns properties that support the aggregate feature in the configuration list.</li>
         * <li>false: returns all properties in the configuration list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder aggregator(Boolean aggregator) {
            this.putQueryParameter("Aggregator", aggregator);
            this.aggregator = aggregator;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>gAAAAABfh8MVLQI9AuKGACLgjbsXbWs-Mna47IDM6tr6wK7TZ1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The configuration list type name. Valid values:</p>
         * <ul>
         * <li>ACS:InstanceInformation</li>
         * <li>ACS:Application</li>
         * <li>ACS:File</li>
         * <li>ACS:Network</li>
         * <li>ACS:WindowsRole</li>
         * <li>ACS:Service</li>
         * <li>ACS:WindowsUpdate</li>
         * <li>ACS:WindowsRegistry</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACS:Application</p>
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        @Override
        public GetInventorySchemaRequest build() {
            return new GetInventorySchemaRequest(this);
        } 

    } 

}
