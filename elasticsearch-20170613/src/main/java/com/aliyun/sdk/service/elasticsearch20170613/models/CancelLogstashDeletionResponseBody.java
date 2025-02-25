// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelLogstashDeletionResponseBody} extends {@link TeaModel}
 *
 * <p>CancelLogstashDeletionResponseBody</p>
 */
public class CancelLogstashDeletionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private CancelLogstashDeletionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelLogstashDeletionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>23EBF56B-2DC0-4507-8BE5-B87395DB0FEB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the cluster is restored. Valid values:</p>
         * <ul>
         * <li>true: The cluster is restored.</li>
         * <li>false: The cluster is not restored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public CancelLogstashDeletionResponseBody build() {
            return new CancelLogstashDeletionResponseBody(this);
        } 

    } 

}
