// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRuleRequest</p>
 */
public class DeleteRuleRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DeleteRuleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DeleteRuleRequest, Builder> {
        private Long id; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRuleRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
        } 

        /**
         * The ID of the sensitive data detection rule.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values: **zh** and **en**. The value zh indicates Chinese, and the value en indicates English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DeleteRuleRequest build() {
            return new DeleteRuleRequest(this);
        } 

    } 

}
