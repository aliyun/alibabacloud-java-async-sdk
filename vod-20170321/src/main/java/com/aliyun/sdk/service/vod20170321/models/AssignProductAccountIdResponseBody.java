// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AssignProductAccountIdResponseBody} extends {@link TeaModel}
 *
 * <p>AssignProductAccountIdResponseBody</p>
 */
public class AssignProductAccountIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductAccountId")
    private Long productAccountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssignProductAccountIdResponseBody(Builder builder) {
        this.productAccountId = builder.productAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignProductAccountIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productAccountId
     */
    public Long getProductAccountId() {
        return this.productAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long productAccountId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssignProductAccountIdResponseBody model) {
            this.productAccountId = model.productAccountId;
            this.requestId = model.requestId;
        } 

        /**
         * ProductAccountId.
         */
        public Builder productAccountId(Long productAccountId) {
            this.productAccountId = productAccountId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssignProductAccountIdResponseBody build() {
            return new AssignProductAccountIdResponseBody(this);
        } 

    } 

}
