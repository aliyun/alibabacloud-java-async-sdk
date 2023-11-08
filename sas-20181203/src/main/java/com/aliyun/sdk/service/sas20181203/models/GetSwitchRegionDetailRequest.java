// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwitchRegionDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSwitchRegionDetailRequest</p>
 */
public class GetSwitchRegionDetailRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private GetSwitchRegionDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwitchRegionDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetSwitchRegionDetailRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetSwitchRegionDetailRequest request) {
            super(request);
            this.lang = request.lang;
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

        @Override
        public GetSwitchRegionDetailRequest build() {
            return new GetSwitchRegionDetailRequest(this);
        } 

    } 

}
