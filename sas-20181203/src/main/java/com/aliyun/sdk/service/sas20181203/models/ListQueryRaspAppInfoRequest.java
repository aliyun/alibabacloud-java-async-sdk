// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryRaspAppInfoRequest} extends {@link RequestModel}
 *
 * <p>ListQueryRaspAppInfoRequest</p>
 */
public class ListQueryRaspAppInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private ListQueryRaspAppInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryRaspAppInfoRequest create() {
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
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ListQueryRaspAppInfoRequest, Builder> {
        private String lang; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ListQueryRaspAppInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.uuids = request.uuids;
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
         * uuids 列表，逗号分割
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ListQueryRaspAppInfoRequest build() {
            return new ListQueryRaspAppInfoRequest(this);
        } 

    } 

}
