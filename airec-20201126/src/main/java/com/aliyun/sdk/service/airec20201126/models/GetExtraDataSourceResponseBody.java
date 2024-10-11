// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetExtraDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetExtraDataSourceResponseBody</p>
 */
public class GetExtraDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private ExtraDataSource result;

    private GetExtraDataSourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExtraDataSourceResponseBody create() {
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
    public ExtraDataSource getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private ExtraDataSource result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(ExtraDataSource result) {
            this.result = result;
            return this;
        }

        public GetExtraDataSourceResponseBody build() {
            return new GetExtraDataSourceResponseBody(this);
        } 

    } 

}
