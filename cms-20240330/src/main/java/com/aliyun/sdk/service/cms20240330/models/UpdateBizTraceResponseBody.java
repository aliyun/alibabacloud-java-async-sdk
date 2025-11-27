// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateBizTraceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBizTraceResponseBody</p>
 */
public class UpdateBizTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizTraceId")
    private String bizTraceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateBizTraceResponseBody(Builder builder) {
        this.bizTraceId = builder.bizTraceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizTraceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTraceId
     */
    public String getBizTraceId() {
        return this.bizTraceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bizTraceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateBizTraceResponseBody model) {
            this.bizTraceId = model.bizTraceId;
            this.requestId = model.requestId;
        } 

        /**
         * bizTraceId.
         */
        public Builder bizTraceId(String bizTraceId) {
            this.bizTraceId = bizTraceId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBizTraceResponseBody build() {
            return new UpdateBizTraceResponseBody(this);
        } 

    } 

}
