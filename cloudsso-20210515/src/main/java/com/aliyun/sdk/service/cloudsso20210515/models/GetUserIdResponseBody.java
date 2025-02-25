// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserIdResponseBody</p>
 */
public class GetUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetUserIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String requestId; 
        private String userId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3A41736-A050-50B6-ABC5-590F376A0044</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the CloudSSO user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-d8d1iox****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetUserIdResponseBody build() {
            return new GetUserIdResponseBody(this);
        } 

    } 

}
