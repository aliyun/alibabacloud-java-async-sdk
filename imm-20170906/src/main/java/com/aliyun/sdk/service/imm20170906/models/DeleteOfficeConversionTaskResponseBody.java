// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOfficeConversionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteOfficeConversionTaskResponseBody</p>
 */
public class DeleteOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteOfficeConversionTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOfficeConversionTaskResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteOfficeConversionTaskResponseBody build() {
            return new DeleteOfficeConversionTaskResponseBody(this);
        } 

    } 

}
