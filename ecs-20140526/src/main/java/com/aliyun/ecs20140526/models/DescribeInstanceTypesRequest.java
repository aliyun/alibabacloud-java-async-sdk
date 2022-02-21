// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypesRequest</p>
 */
public class DescribeInstanceTypesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    private DescribeInstanceTypesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.instanceTypes = builder.instanceTypes;
        this.instanceTypeFamily = builder.instanceTypeFamily;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceTypesRequest, Builder> {
        private String sourceRegionId; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < String > instanceTypes; 
        private String instanceTypeFamily; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.instanceTypes = response.instanceTypes;
            this.instanceTypeFamily = response.instanceTypeFamily;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The maximum number of entries to return on each page. Maximum Value: 1600
         * <p>
         * 
         * Default value: 1600
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Query the credential (Token). The value of this parameter is the NextToken value returned by the last call to the API. You do not need to set this parameter when you call the API for the first time.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The type of the instance. Valid values of N: 1 to 10. If this parameter is not specified, all instance types are queried by default.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * Instance dimension belongs instance dimension family. For more information, see [DescribeInstanceTypeFamilies](~~ 25621 ~~).
         * <p>
         * 
         * For more information about instance type families, see [instance type families](~~ 25378 ~~).
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        @Override
        public DescribeInstanceTypesRequest build() {
            return new DescribeInstanceTypesRequest(this);
        } 

    } 

}
