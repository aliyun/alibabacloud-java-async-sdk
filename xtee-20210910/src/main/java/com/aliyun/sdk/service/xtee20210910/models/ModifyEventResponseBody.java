// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyEventResponseBody</p>
 */
public class ModifyEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private Boolean resultObject;

    private ModifyEventResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(Boolean resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public ModifyEventResponseBody build() {
            return new ModifyEventResponseBody(this);
        } 

    } 

}
