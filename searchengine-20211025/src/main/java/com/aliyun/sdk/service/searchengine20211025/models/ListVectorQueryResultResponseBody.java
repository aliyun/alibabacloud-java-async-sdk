// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListVectorQueryResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListVectorQueryResultResponseBody</p>
 */
public class ListVectorQueryResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Object result;

    private ListVectorQueryResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVectorQueryResultResponseBody create() {
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
    public Object getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Object result; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        public ListVectorQueryResultResponseBody build() {
            return new ListVectorQueryResultResponseBody(this);
        } 

    } 

}
