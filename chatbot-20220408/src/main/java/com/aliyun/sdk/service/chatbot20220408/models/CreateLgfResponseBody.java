// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLgfResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLgfResponseBody</p>
 */
public class CreateLgfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LgfId")
    private Long lgfId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateLgfResponseBody model) {
            this.lgfId = model.lgfId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>LGF ID</p>
         * 
         * <strong>example:</strong>
         * <p>123453433453</p>
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
