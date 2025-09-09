// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link CreateRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRuleResponseBody</p>
 */
public class CreateRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRuleResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRuleResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique ID of the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>208B016D-4CB9-4A85-96A5-0B8ED1EBF271</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRuleResponseBody build() {
            return new CreateRuleResponseBody(this);
        } 

    } 

}
