// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestGrayRequest} extends {@link RequestModel}
 *
 * <p>TestGrayRequest</p>
 */
public class TestGrayRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private TestGrayRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestGrayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<TestGrayRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(TestGrayRequest response) {
            super(response);
            this.name = response.name;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public TestGrayRequest build() {
            return new TestGrayRequest(this);
        } 

    } 

}
