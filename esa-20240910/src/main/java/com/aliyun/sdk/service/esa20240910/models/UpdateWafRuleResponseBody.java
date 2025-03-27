// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateWafRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWafRuleResponseBody</p>
 */
public class UpdateWafRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateWafRuleResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWafRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateWafRuleResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>WAF rule ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850237.html">ListWafRules</a> interface.</p>
         * 
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateWafRuleResponseBody build() {
            return new UpdateWafRuleResponseBody(this);
        } 

    } 

}
