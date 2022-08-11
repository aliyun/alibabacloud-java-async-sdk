// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestFlowStrategy01Request} extends {@link RequestModel}
 *
 * <p>TestFlowStrategy01Request</p>
 */
public class TestFlowStrategy01Request extends Request {
    @Body
    @NameInMap("Names")
    private java.util.Map < String, ? > names;

    private TestFlowStrategy01Request(Builder builder) {
        super(builder);
        this.names = builder.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestFlowStrategy01Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return names
     */
    public java.util.Map < String, ? > getNames() {
        return this.names;
    }

    public static final class Builder extends Request.Builder<TestFlowStrategy01Request, Builder> {
        private java.util.Map < String, ? > names; 

        private Builder() {
            super();
        } 

        private Builder(TestFlowStrategy01Request request) {
            super(request);
            this.names = request.names;
        } 

        /**
         * Names.
         */
        public Builder names(java.util.Map < String, ? > names) {
            String namesShrink = shrink(names, "Names", "json");
            this.putBodyParameter("Names", namesShrink);
            this.names = names;
            return this;
        }

        @Override
        public TestFlowStrategy01Request build() {
            return new TestFlowStrategy01Request(this);
        } 

    } 

}
