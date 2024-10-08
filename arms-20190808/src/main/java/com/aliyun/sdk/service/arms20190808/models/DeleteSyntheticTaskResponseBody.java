// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSyntheticTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSyntheticTaskResponseBody</p>
 */
public class DeleteSyntheticTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private DeleteSyntheticTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSyntheticTaskResponseBody create() {
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
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the specified tasks are deleted.
         * <p>
         * 
         * *   `true`: The tasks are deleted.
         * *   `false`: The tasks fail to be deleted.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public DeleteSyntheticTaskResponseBody build() {
            return new DeleteSyntheticTaskResponseBody(this);
        } 

    } 

}
