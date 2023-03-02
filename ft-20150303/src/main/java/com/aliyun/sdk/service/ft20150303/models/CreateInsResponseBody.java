// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInsResponseBody</p>
 */
public class CreateInsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Success")
    private String success;

    private CreateInsResponseBody(Builder builder) {
        this.code = builder.code;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateInsResponseBody build() {
            return new CreateInsResponseBody(this);
        } 

    } 

}
