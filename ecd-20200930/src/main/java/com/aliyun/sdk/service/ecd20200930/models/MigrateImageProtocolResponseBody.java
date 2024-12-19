// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MigrateImageProtocolResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateImageProtocolResponseBody</p>
 */
public class MigrateImageProtocolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedIds")
    private java.util.List<String> failedIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private MigrateImageProtocolResponseBody(Builder builder) {
        this.failedIds = builder.failedIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateImageProtocolResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedIds
     */
    public java.util.List<String> getFailedIds() {
        return this.failedIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> failedIds; 
        private String requestId; 

        /**
         * <p>The IDs of the images whose protocols failed to be updated.</p>
         */
        public Builder failedIds(java.util.List<String> failedIds) {
            this.failedIds = failedIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4D4E5AF5-DF28-5FE7-85C7-9F98315B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MigrateImageProtocolResponseBody build() {
            return new MigrateImageProtocolResponseBody(this);
        } 

    } 

}
