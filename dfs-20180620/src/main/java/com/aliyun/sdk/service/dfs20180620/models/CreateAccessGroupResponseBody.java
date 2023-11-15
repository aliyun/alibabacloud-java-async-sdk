// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessGroupResponseBody</p>
 */
public class CreateAccessGroupResponseBody extends TeaModel {
    @NameInMap("AccessGroupId")
    private String accessGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAccessGroupResponseBody(Builder builder) {
        this.accessGroupId = builder.accessGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessGroupId
     */
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessGroupId; 
        private String requestId; 

        /**
         * AccessGroupId.
         */
        public Builder accessGroupId(String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessGroupResponseBody build() {
            return new CreateAccessGroupResponseBody(this);
        } 

    } 

}
