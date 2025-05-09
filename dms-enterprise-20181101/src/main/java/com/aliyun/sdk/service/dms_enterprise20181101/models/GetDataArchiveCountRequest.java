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
 * {@link GetDataArchiveCountRequest} extends {@link RequestModel}
 *
 * <p>GetDataArchiveCountRequest</p>
 */
public class GetDataArchiveCountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderResultType")
    private String orderResultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginType")
    private String pluginType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchDateType")
    private String searchDateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
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
         * <p>The type of the identity. Default value: AS_ADMIN.</p>
         * 
         * <strong>example:</strong>
         * <p>AS_ADMIN</p>
         */
        public Builder orderResultType(String orderResultType) {
            this.putQueryParameter("OrderResultType", orderResultType);
            this.orderResultType = orderResultType;
            return this;
        }

        /**
         * <p>The plugin type. Default value: DATA_ARCHIVE.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_ARCHIVE</p>
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
            return this;
        }

        /**
         * <p>The time when the ticket is modified or created. The statistics of data archiving tickets are calculated based on the creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_TIME</p>
         */
        public Builder searchDateType(String searchDateType) {
            this.putQueryParameter("SearchDateType", searchDateType);
            this.searchDateType = searchDateType;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <blockquote>
         * <p> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2****</p>
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
