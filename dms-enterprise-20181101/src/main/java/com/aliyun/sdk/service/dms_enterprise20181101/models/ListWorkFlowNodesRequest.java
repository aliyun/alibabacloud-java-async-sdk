// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkFlowNodesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkFlowNodesRequest</p>
 */
public class ListWorkFlowNodesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SearchName")
    private String searchName;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ListWorkFlowNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.searchName = builder.searchName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkFlowNodesRequest create() {
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
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListWorkFlowNodesRequest, Builder> {
        private String regionId; 
        private String searchName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkFlowNodesRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.searchName = response.searchName;
            this.tid = response.tid;
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
         * SearchName.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListWorkFlowNodesRequest build() {
            return new ListWorkFlowNodesRequest(this);
        } 

    } 

}
