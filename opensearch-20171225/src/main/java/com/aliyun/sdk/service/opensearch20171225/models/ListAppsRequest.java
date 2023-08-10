// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsRequest} extends {@link RequestModel}
 *
 * <p>ListAppsRequest</p>
 */
public class ListAppsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("group")
    private Boolean group;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListAppsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.group = builder.group;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsRequest create() {
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
     * @return group
     */
    public Boolean getGroup() {
        return this.group;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListAppsRequest, Builder> {
        private String regionId; 
        private Boolean group; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListAppsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.group = request.group;
            this.page = request.page;
            this.size = request.size;
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
         * true
         */
        public Builder group(Boolean group) {
            this.putQueryParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * 0
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * 0
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAppsRequest build() {
            return new ListAppsRequest(this);
        } 

    } 

}
