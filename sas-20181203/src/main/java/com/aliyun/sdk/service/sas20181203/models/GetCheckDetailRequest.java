// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCheckDetailRequest</p>
 */
public class GetCheckDetailRequest extends Request {
    @Query
    @NameInMap("CheckId")
    @Validation(required = true)
    private Long checkId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetCheckDetailRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
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

    public static final class Builder extends Request.Builder<GetCheckDetailRequest, Builder> {
        private Long checkId; 
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckDetailRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.lang = request.lang;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the check item.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetCheckDetailRequest build() {
            return new GetCheckDetailRequest(this);
        } 

    } 

}
