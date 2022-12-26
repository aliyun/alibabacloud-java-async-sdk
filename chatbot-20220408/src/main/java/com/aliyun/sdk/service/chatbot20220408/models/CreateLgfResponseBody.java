// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLgfResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLgfResponseBody</p>
 */
public class CreateLgfResponseBody extends TeaModel {
    @NameInMap("LgfId")
    private Long lgfId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateLgfResponseBody(Builder builder) {
        this.lgfId = builder.lgfId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLgfResponseBody create() {
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
         * LGF ID
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

        public CreateLgfResponseBody build() {
            return new CreateLgfResponseBody(this);
        } 

    } 

}
