// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAttachedMediaInfosResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAttachedMediaInfosResponseBody</p>
 */
public class UpdateAttachedMediaInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistMediaIds")
    private java.util.List < String > nonExistMediaIds;

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
    public java.util.List < String > getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > nonExistMediaIds; 
        private String requestId; 

        /**
         * The IDs of the auxiliary media assets that do not exist.
         */
        public Builder nonExistMediaIds(java.util.List < String > nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * The ID of the request.
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
