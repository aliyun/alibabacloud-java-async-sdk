// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecExamplesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisecExamplesRequest</p>
 */
public class DescribeApisecExamplesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbnormalTag")
    private String abnormalTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExampleType")
    private String exampleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 5, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestSensitiveTypeList")
    private java.util.List<String> requestSensitiveTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseSensitiveTypeList")
    private java.util.List<String> responseSensitiveTypeList;

    private DescribeApisecExamplesRequest(Builder builder) {
        super(builder);
        this.abnormalTag = builder.abnormalTag;
        this.apiId = builder.apiId;
        this.clusterId = builder.clusterId;
        this.exampleType = builder.exampleType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.requestSensitiveTypeList = builder.requestSensitiveTypeList;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.responseSensitiveTypeList = builder.responseSensitiveTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecExamplesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalTag
     */
    public String getAbnormalTag() {
        return this.abnormalTag;
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return exampleType
     */
    public String getExampleType() {
        return this.exampleType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return requestSensitiveTypeList
     */
    public java.util.List<String> getRequestSensitiveTypeList() {
        return this.requestSensitiveTypeList;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return responseSensitiveTypeList
     */
    public java.util.List<String> getResponseSensitiveTypeList() {
        return this.responseSensitiveTypeList;
    }

    public static final class Builder extends Request.Builder<DescribeApisecExamplesRequest, Builder> {
        private String abnormalTag; 
        private String apiId; 
        private String clusterId; 
        private String exampleType; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List<String> requestSensitiveTypeList; 
        private String resourceManagerResourceGroupId; 
        private java.util.List<String> responseSensitiveTypeList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisecExamplesRequest request) {
            super(request);
            this.abnormalTag = request.abnormalTag;
            this.apiId = request.apiId;
            this.clusterId = request.clusterId;
            this.exampleType = request.exampleType;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.requestSensitiveTypeList = request.requestSensitiveTypeList;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.responseSensitiveTypeList = request.responseSensitiveTypeList;
        } 

        /**
         * <p>The risk type.</p>
         * 
         * <strong>example:</strong>
         * <p>LackOfSpeedLimit</p>
         */
        public Builder abnormalTag(String abnormalTag) {
            this.putQueryParameter("AbnormalTag", abnormalTag);
            this.abnormalTag = abnormalTag;
            return this;
        }

        /**
         * <p>The ID of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>867ade***24ee6e205b8da82b8f84</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query hybrid cloud cluster information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>176</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The type of the sample.</p>
         * 
         * <strong>example:</strong>
         * <p>sensitive</p>
         */
        public Builder exampleType(String exampleType) {
            this.putQueryParameter("ExampleType", exampleType);
            this.exampleType = exampleType;
            return this;
        }

        /**
         * <p>Instance ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbqtm005</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 5. Default value: 5. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
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
         * <p>The list of request sensitive information types.</p>
         */
        public Builder requestSensitiveTypeList(java.util.List<String> requestSensitiveTypeList) {
            this.putQueryParameter("RequestSensitiveTypeList", requestSensitiveTypeList);
            this.requestSensitiveTypeList = requestSensitiveTypeList;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The list of response sensitive information types.</p>
         */
        public Builder responseSensitiveTypeList(java.util.List<String> responseSensitiveTypeList) {
            this.putQueryParameter("ResponseSensitiveTypeList", responseSensitiveTypeList);
            this.responseSensitiveTypeList = responseSensitiveTypeList;
            return this;
        }

        @Override
        public DescribeApisecExamplesRequest build() {
            return new DescribeApisecExamplesRequest(this);
        } 

    } 

}
