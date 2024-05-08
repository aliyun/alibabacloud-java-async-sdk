// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantHonorResponseBody} extends {@link TeaModel}
 *
 * <p>GrantHonorResponseBody</p>
 */
public class GrantHonorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failedUserIds")
    private java.util.List < String > failedUserIds;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("successUserIds")
    private java.util.List < String > successUserIds;

    private GrantHonorResponseBody(Builder builder) {
        this.failedUserIds = builder.failedUserIds;
        this.requestId = builder.requestId;
        this.successUserIds = builder.successUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantHonorResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedUserIds
     */
    public java.util.List < String > getFailedUserIds() {
        return this.failedUserIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successUserIds
     */
    public java.util.List < String > getSuccessUserIds() {
        return this.successUserIds;
    }

    public static final class Builder {
        private java.util.List < String > failedUserIds; 
        private String requestId; 
        private java.util.List < String > successUserIds; 

        /**
         * failedUserIds.
         */
        public Builder failedUserIds(java.util.List < String > failedUserIds) {
            this.failedUserIds = failedUserIds;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * successUserIds.
         */
        public Builder successUserIds(java.util.List < String > successUserIds) {
            this.successUserIds = successUserIds;
            return this;
        }

        public GrantHonorResponseBody build() {
            return new GrantHonorResponseBody(this);
        } 

    } 

}
