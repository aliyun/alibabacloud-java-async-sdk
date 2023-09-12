// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GoodsShippingNoticeCreateResult} extends {@link TeaModel}
 *
 * <p>GoodsShippingNoticeCreateResult</p>
 */
public class GoodsShippingNoticeCreateResult extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private String result;

    private GoodsShippingNoticeCreateResult(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GoodsShippingNoticeCreateResult create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public GoodsShippingNoticeCreateResult build() {
            return new GoodsShippingNoticeCreateResult(this);
        } 

    } 

}
