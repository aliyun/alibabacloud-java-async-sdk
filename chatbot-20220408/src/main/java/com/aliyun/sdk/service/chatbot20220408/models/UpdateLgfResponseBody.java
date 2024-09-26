// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateLgfResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLgfResponseBody</p>
 */
public class UpdateLgfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LgfId")
    private Long lgfId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateLgfResponseBody(Builder builder) {
        this.lgfId = builder.lgfId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLgfResponseBody create() {
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
         * LgfId.
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

        public UpdateLgfResponseBody build() {
            return new UpdateLgfResponseBody(this);
        } 

    } 

}
