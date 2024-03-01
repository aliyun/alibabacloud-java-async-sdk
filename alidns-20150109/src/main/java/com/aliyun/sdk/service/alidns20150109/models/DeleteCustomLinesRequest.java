// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomLinesRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomLinesRequest</p>
 */
public class DeleteCustomLinesRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LineIds")
    @Validation(required = true)
    private String lineIds;

    private DeleteCustomLinesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.lineIds = builder.lineIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomLinesRequest create() {
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
     * @return lineIds
     */
    public String getLineIds() {
        return this.lineIds;
    }

    public static final class Builder extends Request.Builder<DeleteCustomLinesRequest, Builder> {
        private String lang; 
        private String lineIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomLinesRequest request) {
            super(request);
            this.lang = request.lang;
            this.lineIds = request.lineIds;
        } 

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The unique IDs of the custom lines that you want to delete. Separate the unique IDs with commas (,).
         */
        public Builder lineIds(String lineIds) {
            this.putQueryParameter("LineIds", lineIds);
            this.lineIds = lineIds;
            return this;
        }

        @Override
        public DeleteCustomLinesRequest build() {
            return new DeleteCustomLinesRequest(this);
        } 

    } 

}
