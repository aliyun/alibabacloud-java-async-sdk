// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
    @NameInMap("AccessGroupName")
    private String accessGroupName;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAccessGroupResponseBody(Builder builder) {
        this.accessGroupName = builder.accessGroupName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessGroupName; 
        private String requestId; 

        /**
         * AccessGroupName.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
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
