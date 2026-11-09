// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeInstanceAutoRenewalAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAutoRenewalAttributeRequest</p>
 */
public class DescribeInstanceAutoRenewalAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    private java.util.List<String> instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypeList")
    private java.util.List<String> resourceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    private DescribeInstanceAutoRenewalAttributeRequest(Builder builder) {
        super(builder);
        this.autoRenewal = builder.autoRenewal;
        this.instanceIdList = builder.instanceIdList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.resourceTypeList = builder.resourceTypeList;
        this.searchRegionId = builder.searchRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewalAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return instanceIdList
     */
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
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
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceTypeList
     */
    public java.util.List<String> getResourceTypeList() {
        return this.resourceTypeList;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceAutoRenewalAttributeRequest, Builder> {
        private Boolean autoRenewal; 
        private java.util.List<String> instanceIdList; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceType; 
        private java.util.List<String> resourceTypeList; 
        private String searchRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceAutoRenewalAttributeRequest request) {
            super(request);
            this.autoRenewal = request.autoRenewal;
            this.instanceIdList = request.instanceIdList;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.resourceTypeList = request.resourceTypeList;
            this.searchRegionId = request.searchRegionId;
        } 

        /**
         * <p>The auto-renewal status. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal is enabled.</li>
         * <li>false: Auto-renewal is disabled.</li>
         * </ul>
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putQueryParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The list of instance IDs for which to query the auto-renewal status.</p>
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The mark for paging. Leave this parameter empty for the first query. For subsequent paging, pass the NextToken value returned in the previous response as is. Do not construct or decode the value.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6k=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Maximum value: 500. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The resource type. Example: CorePackage indicates a core-hour package.</p>
         * 
         * <strong>example:</strong>
         * <p>CorePackage</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of resource types.</p>
         */
        public Builder resourceTypeList(java.util.List<String> resourceTypeList) {
            this.putQueryParameter("ResourceTypeList", resourceTypeList);
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        /**
         * <p>The region ID used to filter instances.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        @Override
        public DescribeInstanceAutoRenewalAttributeRequest build() {
            return new DescribeInstanceAutoRenewalAttributeRequest(this);
        } 

    } 

}
