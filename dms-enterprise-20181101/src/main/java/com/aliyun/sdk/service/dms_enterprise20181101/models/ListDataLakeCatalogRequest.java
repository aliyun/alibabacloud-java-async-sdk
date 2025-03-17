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
 * {@link ListDataLakeCatalogRequest} extends {@link RequestModel}
 *
 * <p>ListDataLakeCatalogRequest</p>
 */
public class ListDataLakeCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionToken")
    private String sessionToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListDataLakeCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataRegion = builder.dataRegion;
        this.searchKey = builder.searchKey;
        this.sessionToken = builder.sessionToken;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataLakeCatalogRequest create() {
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
     * @return dataRegion
     */
    public String getDataRegion() {
        return this.dataRegion;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return sessionToken
     */
    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListDataLakeCatalogRequest, Builder> {
        private String regionId; 
        private String dataRegion; 
        private String searchKey; 
        private String sessionToken; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListDataLakeCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataRegion = request.dataRegion;
            this.searchKey = request.searchKey;
            this.sessionToken = request.sessionToken;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dataRegion(String dataRegion) {
            this.putQueryParameter("DataRegion", dataRegion);
            this.dataRegion = dataRegion;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SessionToken.
         */
        public Builder sessionToken(String sessionToken) {
            this.putQueryParameter("SessionToken", sessionToken);
            this.sessionToken = sessionToken;
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
        public ListDataLakeCatalogRequest build() {
            return new ListDataLakeCatalogRequest(this);
        } 

    } 

}
