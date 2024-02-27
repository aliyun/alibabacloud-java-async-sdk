// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlrRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateSlrRoleRequest</p>
 */
public class CreateSlrRoleRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private CreateSlrRoleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlrRoleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateSlrRoleRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlrRoleRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public CreateSlrRoleRequest build() {
            return new CreateSlrRoleRequest(this);
        } 

    } 

}
