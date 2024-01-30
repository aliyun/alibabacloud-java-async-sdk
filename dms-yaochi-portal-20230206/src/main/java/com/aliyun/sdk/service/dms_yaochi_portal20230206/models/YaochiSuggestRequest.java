// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link YaochiSuggestRequest} extends {@link RequestModel}
 *
 * <p>YaochiSuggestRequest</p>
 */
public class YaochiSuggestRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SuggestText")
    private String suggestText;

    private YaochiSuggestRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.suggestText = builder.suggestText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static YaochiSuggestRequest create() {
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
     * @return suggestText
     */
    public String getSuggestText() {
        return this.suggestText;
    }

    public static final class Builder extends Request.Builder<YaochiSuggestRequest, Builder> {
        private String regionId; 
        private String suggestText; 

        private Builder() {
            super();
        } 

        private Builder(YaochiSuggestRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.suggestText = request.suggestText;
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
         * SuggestText.
         */
        public Builder suggestText(String suggestText) {
            this.putQueryParameter("SuggestText", suggestText);
            this.suggestText = suggestText;
            return this;
        }

        @Override
        public YaochiSuggestRequest build() {
            return new YaochiSuggestRequest(this);
        } 

    } 

}
