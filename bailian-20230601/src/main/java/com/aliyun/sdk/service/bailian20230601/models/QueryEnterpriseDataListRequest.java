// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEnterpriseDataListRequest} extends {@link RequestModel}
 *
 * <p>QueryEnterpriseDataListRequest</p>
 */
public class QueryEnterpriseDataListRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("DataName")
    private String dataName;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StoreType")
    private String storeType;

    @Query
    @NameInMap("Tags")
    private java.util.List < String > tags;

    private QueryEnterpriseDataListRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dataName = builder.dataName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.storeType = builder.storeType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEnterpriseDataListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return dataName
     */
    public String getDataName() {
        return this.dataName;
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
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<QueryEnterpriseDataListRequest, Builder> {
        private String agentKey; 
        private String dataName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String storeType; 
        private java.util.List < String > tags; 

        private Builder() {
            super();
        } 

        private Builder(QueryEnterpriseDataListRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dataName = request.dataName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.storeType = request.storeType;
            this.tags = request.tags;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DataName.
         */
        public Builder dataName(String dataName) {
            this.putQueryParameter("DataName", dataName);
            this.dataName = dataName;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StoreType.
         */
        public Builder storeType(String storeType) {
            this.putQueryParameter("StoreType", storeType);
            this.storeType = storeType;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public QueryEnterpriseDataListRequest build() {
            return new QueryEnterpriseDataListRequest(this);
        } 

    } 

}
