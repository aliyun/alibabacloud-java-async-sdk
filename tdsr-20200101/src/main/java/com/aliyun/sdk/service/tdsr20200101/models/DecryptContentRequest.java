// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptContentRequest} extends {@link RequestModel}
 *
 * <p>DecryptContentRequest</p>
 */
public class DecryptContentRequest extends Request {
    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    private DecryptContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<DecryptContentRequest, Builder> {
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(DecryptContentRequest request) {
            super(request);
            this.content = request.content;
        } 

        /**
         * 需要加密的内容
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        @Override
        public DecryptContentRequest build() {
            return new DecryptContentRequest(this);
        } 

    } 

}
