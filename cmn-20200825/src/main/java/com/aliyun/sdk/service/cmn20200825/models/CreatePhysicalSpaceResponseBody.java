// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhysicalSpaceResponseBody</p>
 */
public class CreatePhysicalSpaceResponseBody extends TeaModel {
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePhysicalSpaceResponseBody(Builder builder) {
        this.physicalSpaceId = builder.physicalSpaceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalSpaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String physicalSpaceId; 
        private String requestId; 

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhysicalSpaceResponseBody build() {
            return new CreatePhysicalSpaceResponseBody(this);
        } 

    } 

}
