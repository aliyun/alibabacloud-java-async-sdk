// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLoginUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginUserInfoResponseBody</p>
 */
public class GetLoginUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("result")
    private BucUser result;

    private GetLoginUserInfoResponseBody(Builder builder) {
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginUserInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return result
     */
    public BucUser getResult() {
        return this.result;
    }

    public static final class Builder {
        private BucUser result; 

        private Builder() {
        } 

        private Builder(GetLoginUserInfoResponseBody model) {
            this.result = model.result;
        } 

        /**
         * result.
         */
        public Builder result(BucUser result) {
            this.result = result;
            return this;
        }

        public GetLoginUserInfoResponseBody build() {
            return new GetLoginUserInfoResponseBody(this);
        } 

    } 

}
