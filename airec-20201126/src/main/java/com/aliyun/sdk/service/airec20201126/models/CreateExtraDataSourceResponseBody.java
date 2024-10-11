// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateExtraDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExtraDataSourceResponseBody</p>
 */
public class CreateExtraDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private ExtraDataSource result;

    private CreateExtraDataSourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExtraDataSourceResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(ExtraDataSource result) {
            this.result = result;
            return this;
        }

        public CreateExtraDataSourceResponseBody build() {
            return new CreateExtraDataSourceResponseBody(this);
        } 

    } 

}
