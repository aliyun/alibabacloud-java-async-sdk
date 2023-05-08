// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConcernNecessityRequest} extends {@link RequestModel}
 *
 * <p>DescribeConcernNecessityRequest</p>
 */
public class DescribeConcernNecessityRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeConcernNecessityRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConcernNecessityRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeConcernNecessityRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConcernNecessityRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeConcernNecessityRequest build() {
            return new DescribeConcernNecessityRequest(this);
        } 

    } 

}
