// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSDGResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSDGResponseBody</p>
 */
public class CreateSDGResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SDGId")
    private String SDGId;

    private CreateSDGResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSDGResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder {
        private String requestId; 
        private String SDGId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the generated SDG.
         */
        public Builder SDGId(String SDGId) {
            this.SDGId = SDGId;
            return this;
        }

        public CreateSDGResponseBody build() {
            return new CreateSDGResponseBody(this);
        } 

    } 

}
