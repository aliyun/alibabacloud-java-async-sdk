// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ActiveFlowLogResponseBody} extends {@link TeaModel}
 *
 * <p>ActiveFlowLogResponseBody</p>
 */
public class ActiveFlowLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;


    private ActiveFlowLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveFlowLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String success; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success.</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ActiveFlowLogResponseBody build() {
            return new ActiveFlowLogResponseBody(this);
        } 

    } 

}
