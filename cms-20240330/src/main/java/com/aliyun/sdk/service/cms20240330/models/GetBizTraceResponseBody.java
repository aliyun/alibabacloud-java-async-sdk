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
 * {@link GetBizTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GetBizTraceResponseBody</p>
 */
public class GetBizTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("item")
    private BizTraceConfig item;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetBizTraceResponseBody(Builder builder) {
        this.item = builder.item;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBizTraceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return item
     */
    public BizTraceConfig getItem() {
        return this.item;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BizTraceConfig item; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetBizTraceResponseBody model) {
            this.item = model.item;
            this.requestId = model.requestId;
        } 

        /**
         * item.
         */
        public Builder item(BizTraceConfig item) {
            this.item = item;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBizTraceResponseBody build() {
            return new GetBizTraceResponseBody(this);
        } 

    } 

}
