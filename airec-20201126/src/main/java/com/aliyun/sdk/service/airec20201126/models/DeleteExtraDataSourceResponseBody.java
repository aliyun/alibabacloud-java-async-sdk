// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteExtraDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteExtraDataSourceResponseBody</p>
 */
public class DeleteExtraDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private ExtraDataSource result;

    private DeleteExtraDataSourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExtraDataSourceResponseBody create() {
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
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>返回参数。</p>
         */
        public Builder result(ExtraDataSource result) {
            this.result = result;
            return this;
        }

        public DeleteExtraDataSourceResponseBody build() {
            return new DeleteExtraDataSourceResponseBody(this);
        } 

    } 

}
