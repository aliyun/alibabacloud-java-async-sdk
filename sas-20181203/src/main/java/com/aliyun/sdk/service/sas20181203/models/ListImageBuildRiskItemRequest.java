// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageBuildRiskItemRequest} extends {@link RequestModel}
 *
 * <p>ListImageBuildRiskItemRequest</p>
 */
public class ListImageBuildRiskItemRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private ListImageBuildRiskItemRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageBuildRiskItemRequest create() {
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

    public static final class Builder extends Request.Builder<ListImageBuildRiskItemRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ListImageBuildRiskItemRequest request) {
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
        public ListImageBuildRiskItemRequest build() {
            return new ListImageBuildRiskItemRequest(this);
        } 

    } 

}
