// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListWorkFlowNodesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkFlowNodesRequest</p>
 */
public class ListWorkFlowNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchName")
    private String searchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
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

        private Builder(ListWorkFlowNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.searchName = request.searchName;
            this.tid = request.tid;
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
         * <p>The name that is used to search for approval nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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
