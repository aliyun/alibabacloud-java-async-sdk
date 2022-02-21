// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCoreWordRequest} extends {@link RequestModel}
 *
 * <p>DescribeCoreWordRequest</p>
 */
public class DescribeCoreWordRequest extends Request {
    @Query
    @NameInMap("CoreWordName")
    @Validation(required = true)
    private String coreWordName;

    private DescribeCoreWordRequest(Builder builder) {
        super(builder);
        this.coreWordName = builder.coreWordName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCoreWordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coreWordName
     */
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public static final class Builder extends Request.Builder<DescribeCoreWordRequest, Builder> {
        private String coreWordName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCoreWordRequest response) {
            super(response);
            this.coreWordName = response.coreWordName;
        } 

        /**
         * CoreWordName.
         */
        public Builder coreWordName(String coreWordName) {
            this.putQueryParameter("CoreWordName", coreWordName);
            this.coreWordName = coreWordName;
            return this;
        }

        @Override
        public DescribeCoreWordRequest build() {
            return new DescribeCoreWordRequest(this);
        } 

    } 

}
