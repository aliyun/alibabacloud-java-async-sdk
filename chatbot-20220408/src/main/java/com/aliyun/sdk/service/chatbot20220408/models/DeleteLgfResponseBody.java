// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLgfResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLgfResponseBody</p>
 */
public class DeleteLgfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LgfId")
    private Long lgfId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteLgfResponseBody(Builder builder) {
        this.lgfId = builder.lgfId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLgfResponseBody create() {
        return builder().build();
    }

    /**
     * @return lgfId
     */
    public Long getLgfId() {
        return this.lgfId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long lgfId; 
        private String requestId; 

        /**
         * <p>LGF ID</p>
         * 
         * <strong>example:</strong>
         * <p>2342424</p>
         */
        public Builder lgfId(Long lgfId) {
            this.lgfId = lgfId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLgfResponseBody build() {
            return new DeleteLgfResponseBody(this);
        } 

    } 

}
