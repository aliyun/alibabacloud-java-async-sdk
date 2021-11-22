// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateChangeSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChangeSetResponseBody</p>
 */
public class CreateChangeSetResponseBody extends TeaModel {
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackId")
    private String stackId;


    private CreateChangeSetResponseBody(Builder builder) {
        this.changeSetId = builder.changeSetId;
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChangeSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder {
        private String changeSetId; 
        private String requestId; 
        private String stackId; 

        /**
         * <p>ChangeSetId.</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public CreateChangeSetResponseBody build() {
            return new CreateChangeSetResponseBody(this);
        } 

    } 

}
