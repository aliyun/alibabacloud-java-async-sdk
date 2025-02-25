// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateAttachedMediaInfosResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAttachedMediaInfosResponseBody</p>
 */
public class UpdateAttachedMediaInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistMediaIds")
    private java.util.List<String> nonExistMediaIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAttachedMediaInfosResponseBody(Builder builder) {
        this.nonExistMediaIds = builder.nonExistMediaIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAttachedMediaInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistMediaIds
     */
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> nonExistMediaIds; 
        private String requestId; 

        /**
         * <p>The IDs of the auxiliary media assets that do not exist.</p>
         */
        public Builder nonExistMediaIds(java.util.List<String> nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4DF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAttachedMediaInfosResponseBody build() {
            return new UpdateAttachedMediaInfosResponseBody(this);
        } 

    } 

}
