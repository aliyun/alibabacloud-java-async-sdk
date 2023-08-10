// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompileSortScriptResponseBody} extends {@link TeaModel}
 *
 * <p>CompileSortScriptResponseBody</p>
 */
public class CompileSortScriptResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private CompileSortScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompileSortScriptResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CompileSortScriptResponseBody build() {
            return new CompileSortScriptResponseBody(this);
        } 

    } 

}
