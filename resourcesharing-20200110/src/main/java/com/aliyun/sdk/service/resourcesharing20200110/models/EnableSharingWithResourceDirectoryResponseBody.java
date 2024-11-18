// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableSharingWithResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>EnableSharingWithResourceDirectoryResponseBody</p>
 */
public class EnableSharingWithResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableSharingWithResourceDirectoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSharingWithResourceDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F23CFB6-A721-4E90-AC1E-0E30FA8B45DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableSharingWithResourceDirectoryResponseBody build() {
            return new EnableSharingWithResourceDirectoryResponseBody(this);
        } 

    } 

}
