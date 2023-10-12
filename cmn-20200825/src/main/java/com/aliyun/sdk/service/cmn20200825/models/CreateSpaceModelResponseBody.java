// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpaceModelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSpaceModelResponseBody</p>
 */
public class CreateSpaceModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceModelId")
    private String spaceModelId;

    private CreateSpaceModelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spaceModelId = builder.spaceModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpaceModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaceModelId
     */
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    public static final class Builder {
        private String requestId; 
        private String spaceModelId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpaceModelId.
         */
        public Builder spaceModelId(String spaceModelId) {
            this.spaceModelId = spaceModelId;
            return this;
        }

        public CreateSpaceModelResponseBody build() {
            return new CreateSpaceModelResponseBody(this);
        } 

    } 

}
