// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ModifyIndexResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyIndexResponseBody</p>
 */
public class ModifyIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Object result;

    private ModifyIndexResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIndexResponseBody create() {
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
         * <p>93A9E542-8CF8-5BA6-99AB-94C0FE520429</p>
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

        public ModifyIndexResponseBody build() {
            return new ModifyIndexResponseBody(this);
        } 

    } 

}
