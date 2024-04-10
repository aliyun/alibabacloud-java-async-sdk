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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private ListInstanceRegionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lang = builder.lang;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ListInstanceRegionRequest, Builder> {
        private String regionId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRegionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lang = request.lang;
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
         * The language used for response parameters. Set this parameter to `zh-CN`.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ListInstanceRegionRequest build() {
            return new ListInstanceRegionRequest(this);
        } 

    } 

}
