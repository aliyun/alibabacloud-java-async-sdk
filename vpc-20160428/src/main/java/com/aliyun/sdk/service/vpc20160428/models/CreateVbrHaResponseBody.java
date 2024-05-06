// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVbrHaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVbrHaResponseBody</p>
 */
public class CreateVbrHaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VbrHaId")
    private String vbrHaId;

    private CreateVbrHaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vbrHaId = builder.vbrHaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVbrHaResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vbrHaId
     */
    public String getVbrHaId() {
        return this.vbrHaId;
    }

    public static final class Builder {
        private String requestId; 
        private String vbrHaId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the VBR failover group.
         */
        public Builder vbrHaId(String vbrHaId) {
            this.vbrHaId = vbrHaId;
            return this;
        }

        public CreateVbrHaResponseBody build() {
            return new CreateVbrHaResponseBody(this);
        } 

    } 

}
