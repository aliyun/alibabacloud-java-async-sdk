// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgWhiteListDeleteListRequest} extends {@link RequestModel}
 *
 * <p>DsgWhiteListDeleteListRequest</p>
 */
public class DsgWhiteListDeleteListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Integer > ids;

    private DsgWhiteListDeleteListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgWhiteListDeleteListRequest create() {
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
    public java.util.List < Integer > getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DsgWhiteListDeleteListRequest, Builder> {
        private String regionId; 
        private java.util.List < Integer > ids; 

        private Builder() {
            super();
        } 

        private Builder(DsgWhiteListDeleteListRequest request) {
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
         * Ids.
         */
        public Builder ids(java.util.List < Integer > ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putQueryParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        @Override
        public DsgWhiteListDeleteListRequest build() {
            return new DsgWhiteListDeleteListRequest(this);
        } 

    } 

}
