// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateStackGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStackGroupResponseBody</p>
 */
public class CreateStackGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackGroupId")
    private String stackGroupId;


    private CreateStackGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackGroupId = builder.stackGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStackGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackGroupId
     */
    public String getStackGroupId() {
        return this.stackGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String stackGroupId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>StackGroupId.</p>
         */
        public Builder stackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }

        public CreateStackGroupResponseBody build() {
            return new CreateStackGroupResponseBody(this);
        } 

    } 

}
