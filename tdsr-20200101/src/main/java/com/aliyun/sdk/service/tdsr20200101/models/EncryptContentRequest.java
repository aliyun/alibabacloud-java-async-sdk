// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncryptContentRequest} extends {@link RequestModel}
 *
 * <p>EncryptContentRequest</p>
 */
public class EncryptContentRequest extends Request {
    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    private EncryptContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptContentRequest create() {
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

    public static final class Builder extends Request.Builder<EncryptContentRequest, Builder> {
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(EncryptContentRequest request) {
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
        public EncryptContentRequest build() {
            return new EncryptContentRequest(this);
        } 

    } 

}
