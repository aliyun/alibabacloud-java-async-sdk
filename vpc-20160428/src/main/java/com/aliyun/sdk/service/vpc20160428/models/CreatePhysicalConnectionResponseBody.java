// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreatePhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionResponseBody</p>
 */
public class CreatePhysicalConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    private String physicalConnectionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePhysicalConnectionResponseBody(Builder builder) {
        this.physicalConnectionId = builder.physicalConnectionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String physicalConnectionId; 
        private String requestId; 

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ciz7ekd2grn1as****</p>
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8A6A5EC5-6F6C-4906-9689-56ACE58A13E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhysicalConnectionResponseBody build() {
            return new CreatePhysicalConnectionResponseBody(this);
        } 

    } 

}
