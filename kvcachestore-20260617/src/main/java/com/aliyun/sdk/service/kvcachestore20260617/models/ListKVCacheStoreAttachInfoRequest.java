// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link ListKVCacheStoreAttachInfoRequest} extends {@link RequestModel}
 *
 * <p>ListKVCacheStoreAttachInfoRequest</p>
 */
public class ListKVCacheStoreAttachInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvcsIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> kvcsIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VscId")
    private String vscId;

    private ListKVCacheStoreAttachInfoRequest(Builder builder) {
        super(builder);
        this.kvcsIds = builder.kvcsIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.vscId = builder.vscId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKVCacheStoreAttachInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kvcsIds
     */
    public java.util.List<String> getKvcsIds() {
        return this.kvcsIds;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vscId
     */
    public String getVscId() {
        return this.vscId;
    }

    public static final class Builder extends Request.Builder<ListKVCacheStoreAttachInfoRequest, Builder> {
        private java.util.List<String> kvcsIds; 
        private Long maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String vscId; 

        private Builder() {
            super();
        } 

        private Builder(ListKVCacheStoreAttachInfoRequest request) {
            super(request);
            this.kvcsIds = request.kvcsIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.vscId = request.vscId;
        } 

        /**
         * <p>The list of KvcsIds of the KVCacheStores to query. You can specify up to 100 KvcsIds.</p>
         * <p>This parameter is required.</p>
         */
        public Builder kvcsIds(java.util.List<String> kvcsIds) {
            this.putQueryParameter("KvcsIds", kvcsIds);
            this.kvcsIds = kvcsIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in a single call. Valid values: 1 to 500.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The query token. Set the value to the NextToken value returned from the last call to this operation. You do not need to specify this parameter for the first call. If NextToken is specified, the PageSize and PageNumber request parameters become invalid, and the TotalCount value in the response is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>your-client-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number for a paging query. This parameter is used together with PageSize. If the specified page number exceeds the total number of pages, the last page is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for a paging query.</p>
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
         * <p>The region ID, such as cn-hangzhou.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the compute-side VSC. If you specify this parameter, the mount records are filtered by the specified VSC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-dhag651dsda</p>
         */
        public Builder vscId(String vscId) {
            this.putQueryParameter("VscId", vscId);
            this.vscId = vscId;
            return this;
        }

        @Override
        public ListKVCacheStoreAttachInfoRequest build() {
            return new ListKVCacheStoreAttachInfoRequest(this);
        } 

    } 

}
