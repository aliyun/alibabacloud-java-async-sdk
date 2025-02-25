// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDcdnRealTimeLogProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDcdnRealTimeLogProjectResponseBody</p>
 */
public class DeleteDcdnRealTimeLogProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteDcdnRealTimeLogProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnRealTimeLogProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDcdnRealTimeLogProjectResponseBody build() {
            return new DeleteDcdnRealTimeLogProjectResponseBody(this);
        } 

    } 

}
