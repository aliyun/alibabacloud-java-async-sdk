// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataArchiveCountRequest} extends {@link RequestModel}
 *
 * <p>GetDataArchiveCountRequest</p>
 */
public class GetDataArchiveCountRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OrderResultType")
    private String orderResultType;

    @Query
    @NameInMap("PluginType")
    private String pluginType;

    @Query
    @NameInMap("SearchDateType")
    private String searchDateType;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetDataArchiveCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.orderResultType = builder.orderResultType;
        this.pluginType = builder.pluginType;
        this.searchDateType = builder.searchDateType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataArchiveCountRequest create() {
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
     * @return orderResultType
     */
    public String getOrderResultType() {
        return this.orderResultType;
    }

    /**
     * @return pluginType
     */
    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * @return searchDateType
     */
    public String getSearchDateType() {
        return this.searchDateType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetDataArchiveCountRequest, Builder> {
        private String regionId; 
        private String orderResultType; 
        private String pluginType; 
        private String searchDateType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetDataArchiveCountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.orderResultType = request.orderResultType;
            this.pluginType = request.pluginType;
            this.searchDateType = request.searchDateType;
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
         * OrderResultType.
         */
        public Builder orderResultType(String orderResultType) {
            this.putQueryParameter("OrderResultType", orderResultType);
            this.orderResultType = orderResultType;
            return this;
        }

        /**
         * PluginType.
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
            return this;
        }

        /**
         * SearchDateType.
         */
        public Builder searchDateType(String searchDateType) {
            this.putQueryParameter("SearchDateType", searchDateType);
            this.searchDateType = searchDateType;
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
        public GetDataArchiveCountRequest build() {
            return new GetDataArchiveCountRequest(this);
        } 

    } 

}
