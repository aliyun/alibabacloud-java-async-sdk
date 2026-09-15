// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The IDs of the vulnerability whitelists. Separate multiple IDs with commas (,). This parameter is essentially required. If this parameter is not specified, the API returns an error response with Code: -101 (illegal parameter, param is ids).</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
