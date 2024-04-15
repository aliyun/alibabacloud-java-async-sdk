// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateImageProtocolResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateImageProtocolResponseBody</p>
 */
public class MigrateImageProtocolResponseBody extends TeaModel {
    @NameInMap("FailedIds")
    private java.util.List < String > failedIds;

    @NameInMap("RequestId")
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
    public java.util.List < String > getFailedIds() {
        return this.failedIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > failedIds; 
        private String requestId; 

        /**
         * The IDs of the images whose protocols failed to be updated.
         */
        public Builder failedIds(java.util.List < String > failedIds) {
            this.failedIds = failedIds;
            return this;
        }

        /**
         * The request ID.
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
