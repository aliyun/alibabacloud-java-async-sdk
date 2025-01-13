// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DsgUserGroupDeleteRequest} extends {@link RequestModel}
 *
 * <p>DsgUserGroupDeleteRequest</p>
 */
public class DsgUserGroupDeleteRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List<Long> ids;

    private DsgUserGroupDeleteRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgUserGroupDeleteRequest create() {
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
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DsgUserGroupDeleteRequest, Builder> {
        private String regionId; 
        private java.util.List<Long> ids; 

        private Builder() {
            super();
        } 

        private Builder(DsgUserGroupDeleteRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ids = request.ids;
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
         * <p>The information about the user group.</p>
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putQueryParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        @Override
        public DsgUserGroupDeleteRequest build() {
            return new DsgUserGroupDeleteRequest(this);
        } 

    } 

}
