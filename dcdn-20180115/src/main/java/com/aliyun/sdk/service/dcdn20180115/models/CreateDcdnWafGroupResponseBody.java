// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDcdnWafGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDcdnWafGroupResponseBody</p>
 */
public class CreateDcdnWafGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDcdnWafGroupResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnWafGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long id; 
        private String requestId; 

        /**
         * <p>The ID of the created WAF rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>30000166</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>675F4820-400E-5929-8B03-2C031A5D5391</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDcdnWafGroupResponseBody build() {
            return new CreateDcdnWafGroupResponseBody(this);
        } 

    } 

}
