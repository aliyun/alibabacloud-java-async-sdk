// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInsRequest} extends {@link RequestModel}
 *
 * <p>CreateInsRequest</p>
 */
public class CreateInsRequest extends Request {
    @Query
    @NameInMap("Success")
    private String success;

    @Query
    @NameInMap("Test")
    private String test;

    @Query
    @NameInMap("new-param-1")
    private String newParam1;

    @Query
    @NameInMap("new-param-2")
    private String newParam2;

    private CreateInsRequest(Builder builder) {
        super(builder);
        this.success = builder.success;
        this.test = builder.test;
        this.newParam1 = builder.newParam1;
        this.newParam2 = builder.newParam2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return test
     */
    public String getTest() {
        return this.test;
    }

    /**
     * @return newParam1
     */
    public String getNewParam1() {
        return this.newParam1;
    }

    /**
     * @return newParam2
     */
    public String getNewParam2() {
        return this.newParam2;
    }

    public static final class Builder extends Request.Builder<CreateInsRequest, Builder> {
        private String success; 
        private String test; 
        private String newParam1; 
        private String newParam2; 

        private Builder() {
            super();
        } 

        private Builder(CreateInsRequest request) {
            super(request);
            this.success = request.success;
            this.test = request.test;
            this.newParam1 = request.newParam1;
            this.newParam2 = request.newParam2;
        } 

        /**
         * Success.
         */
        public Builder success(String success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        /**
         * Test.
         */
        public Builder test(String test) {
            this.putQueryParameter("Test", test);
            this.test = test;
            return this;
        }

        /**
         * new-param-1.
         */
        public Builder newParam1(String newParam1) {
            this.putQueryParameter("new-param-1", newParam1);
            this.newParam1 = newParam1;
            return this;
        }

        /**
         * new-param-2.
         */
        public Builder newParam2(String newParam2) {
            this.putQueryParameter("new-param-2", newParam2);
            this.newParam2 = newParam2;
            return this;
        }

        @Override
        public CreateInsRequest build() {
            return new CreateInsRequest(this);
        } 

    } 

}
