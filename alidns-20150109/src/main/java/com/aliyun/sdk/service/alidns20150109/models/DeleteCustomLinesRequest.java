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

        private Builder(DeleteCustomLinesRequest response) {
            super(response);
            this.lang = response.lang;
            this.lineIds = response.lineIds;
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
         * LineIds.
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
