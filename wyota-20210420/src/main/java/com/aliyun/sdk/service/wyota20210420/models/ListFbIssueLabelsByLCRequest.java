// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFbIssueLabelsByLCRequest} extends {@link RequestModel}
 *
 * <p>ListFbIssueLabelsByLCRequest</p>
 */
public class ListFbIssueLabelsByLCRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LanguageType")
    private String languageType;

    private ListFbIssueLabelsByLCRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.languageType = builder.languageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFbIssueLabelsByLCRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return languageType
     */
    public String getLanguageType() {
        return this.languageType;
    }

    public static final class Builder extends Request.Builder<ListFbIssueLabelsByLCRequest, Builder> {
        private String caller; 
        private String languageType; 

        private Builder() {
            super();
        } 

        private Builder(ListFbIssueLabelsByLCRequest request) {
            super(request);
            this.caller = request.caller;
            this.languageType = request.languageType;
        } 

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putBodyParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * LanguageType.
         */
        public Builder languageType(String languageType) {
            this.putBodyParameter("LanguageType", languageType);
            this.languageType = languageType;
            return this;
        }

        @Override
        public ListFbIssueLabelsByLCRequest build() {
            return new ListFbIssueLabelsByLCRequest(this);
        } 

    } 

}
