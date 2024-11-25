// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCustomLineResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomLineResponseBody</p>
 */
public class UpdateCustomLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LineId")
    private String lineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCustomLineResponseBody(Builder builder) {
        this.lineId = builder.lineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String lineId; 
        private String requestId; 

        /**
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>765001</p>
         */
        public Builder lineId(String lineId) {
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCustomLineResponseBody build() {
            return new UpdateCustomLineResponseBody(this);
        } 

    } 

}
