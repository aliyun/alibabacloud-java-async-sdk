// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRegionRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRegionRequest</p>
 */
public class ListInstanceRegionRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListInstanceRegionRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListInstanceRegionRequest, Builder> {
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRegionRequest response) {
            super(response);
            this.lang = response.lang;
            this.regionId = response.regionId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListInstanceRegionRequest build() {
            return new ListInstanceRegionRequest(this);
        } 

    } 

}
