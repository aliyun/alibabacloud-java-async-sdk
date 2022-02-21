// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSetResponseBody</p>
 */
public class DeleteSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    private DeleteSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder {
        private String requestId; 
        private String setId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        public DeleteSetResponseBody build() {
            return new DeleteSetResponseBody(this);
        } 

    } 

}
