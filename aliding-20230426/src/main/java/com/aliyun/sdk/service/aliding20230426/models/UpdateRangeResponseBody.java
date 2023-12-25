// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRangeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRangeResponseBody</p>
 */
public class UpdateRangeResponseBody extends TeaModel {
    @NameInMap("a1Notation")
    private String a1Notation;

    @NameInMap("requestId")
    private String requestId;

    private UpdateRangeResponseBody(Builder builder) {
        this.a1Notation = builder.a1Notation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return a1Notation
     */
    public String getA1Notation() {
        return this.a1Notation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String a1Notation; 
        private String requestId; 

        /**
         * a1Notation.
         */
        public Builder a1Notation(String a1Notation) {
            this.a1Notation = a1Notation;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateRangeResponseBody build() {
            return new UpdateRangeResponseBody(this);
        } 

    } 

}
