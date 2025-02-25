// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDiagnosisItemsRequest} extends {@link RequestModel}
 *
 * <p>ListDiagnosisItemsRequest</p>
 */
public class ListDiagnosisItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    private ListDiagnosisItemsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosisItemsRequest create() {
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

    public static final class Builder extends Request.Builder<ListDiagnosisItemsRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ListDiagnosisItemsRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ListDiagnosisItemsRequest build() {
            return new ListDiagnosisItemsRequest(this);
        } 

    } 

}
