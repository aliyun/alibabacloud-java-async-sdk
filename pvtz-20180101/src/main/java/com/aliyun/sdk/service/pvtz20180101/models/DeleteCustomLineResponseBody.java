// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteCustomLineResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCustomLineResponseBody</p>
 */
public class DeleteCustomLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LineId")
    private String lineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCustomLineResponseBody(Builder builder) {
        this.lineId = builder.lineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomLineResponseBody create() {
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
         * <p>520002</p>
         */
        public Builder lineId(String lineId) {
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A73F3BD0-B1A8-42A9-A9B6-689BBABC4891</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCustomLineResponseBody build() {
            return new DeleteCustomLineResponseBody(this);
        } 

    } 

}
