// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageVulWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageVulWhitelistRequest</p>
 */
public class DeleteImageVulWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DeleteImageVulWhitelistRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageVulWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DeleteImageVulWhitelistRequest, Builder> {
        private String ids; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageVulWhitelistRequest request) {
            super(request);
            this.ids = request.ids;
            this.lang = request.lang;
        } 

        /**
         * The ID of the whitelist. Separate multiple IDs with commas (,).
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
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

        @Override
        public DeleteImageVulWhitelistRequest build() {
            return new DeleteImageVulWhitelistRequest(this);
        } 

    } 

}
