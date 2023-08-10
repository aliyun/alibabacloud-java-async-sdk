// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecondRankResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecondRankResponseBody</p>
 */
public class CreateSecondRankResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("result")
    private java.util.Map < String, ? > result;

    private CreateSecondRankResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecondRankResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.Map < String, ? > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the fine sort expression.
         */
        public Builder result(java.util.Map < String, ? > result) {
            this.result = result;
            return this;
        }

        public CreateSecondRankResponseBody build() {
            return new CreateSecondRankResponseBody(this);
        } 

    } 

}
