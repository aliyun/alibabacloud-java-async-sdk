// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunClusterCheckResponseBody} extends {@link TeaModel}
 *
 * <p>RunClusterCheckResponseBody</p>
 */
public class RunClusterCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("check_id")
    private String checkId;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private RunClusterCheckResponseBody(Builder builder) {
        this.checkId = builder.checkId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunClusterCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String checkId; 
        private String requestId; 

        /**
         * The ID of the cluster check task.
         */
        public Builder checkId(String checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunClusterCheckResponseBody build() {
            return new RunClusterCheckResponseBody(this);
        } 

    } 

}
