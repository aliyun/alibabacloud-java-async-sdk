// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEnterpriseDataRequest} extends {@link RequestModel}
 *
 * <p>SearchEnterpriseDataRequest</p>
 */
public class SearchEnterpriseDataRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("DataIdList")
    private java.util.List < String > dataIdList;

    @Query
    @NameInMap("EnableRank")
    private Boolean enableRank;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Query")
    private String query;

    @Query
    @NameInMap("StoreId")
    private Long storeId;

    @Query
    @NameInMap("TagIdList")
    private java.util.List < Long > tagIdList;

    private SearchEnterpriseDataRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dataIdList = builder.dataIdList;
        this.enableRank = builder.enableRank;
        this.ownerId = builder.ownerId;
        this.query = builder.query;
        this.storeId = builder.storeId;
        this.tagIdList = builder.tagIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEnterpriseDataRequest create() {
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
     * @return dataIdList
     */
    public java.util.List < String > getDataIdList() {
        return this.dataIdList;
    }

    /**
     * @return enableRank
     */
    public Boolean getEnableRank() {
        return this.enableRank;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return storeId
     */
    public Long getStoreId() {
        return this.storeId;
    }

    /**
     * @return tagIdList
     */
    public java.util.List < Long > getTagIdList() {
        return this.tagIdList;
    }

    public static final class Builder extends Request.Builder<SearchEnterpriseDataRequest, Builder> {
        private String agentKey; 
        private java.util.List < String > dataIdList; 
        private Boolean enableRank; 
        private Long ownerId; 
        private String query; 
        private Long storeId; 
        private java.util.List < Long > tagIdList; 

        private Builder() {
            super();
        } 

        private Builder(SearchEnterpriseDataRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dataIdList = request.dataIdList;
            this.enableRank = request.enableRank;
            this.ownerId = request.ownerId;
            this.query = request.query;
            this.storeId = request.storeId;
            this.tagIdList = request.tagIdList;
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
         * DataIdList.
         */
        public Builder dataIdList(java.util.List < String > dataIdList) {
            String dataIdListShrink = shrink(dataIdList, "DataIdList", "json");
            this.putQueryParameter("DataIdList", dataIdListShrink);
            this.dataIdList = dataIdList;
            return this;
        }

        /**
         * EnableRank.
         */
        public Builder enableRank(Boolean enableRank) {
            this.putQueryParameter("EnableRank", enableRank);
            this.enableRank = enableRank;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(Long storeId) {
            this.putQueryParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * TagIdList.
         */
        public Builder tagIdList(java.util.List < Long > tagIdList) {
            String tagIdListShrink = shrink(tagIdList, "TagIdList", "json");
            this.putQueryParameter("TagIdList", tagIdListShrink);
            this.tagIdList = tagIdList;
            return this;
        }

        @Override
        public SearchEnterpriseDataRequest build() {
            return new SearchEnterpriseDataRequest(this);
        } 

    } 

}
