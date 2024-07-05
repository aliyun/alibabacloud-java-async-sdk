// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVideoInfosResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVideoInfosResponseBody</p>
 */
public class UpdateVideoInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenVideoIds")
    private java.util.List < String > forbiddenVideoIds;

    @com.aliyun.core.annotation.NameInMap("NonExistVideoIds")
    private java.util.List < String > nonExistVideoIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateVideoInfosResponseBody(Builder builder) {
        this.forbiddenVideoIds = builder.forbiddenVideoIds;
        this.nonExistVideoIds = builder.nonExistVideoIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return forbiddenVideoIds
     */
    public java.util.List < String > getForbiddenVideoIds() {
        return this.forbiddenVideoIds;
    }

    /**
     * @return nonExistVideoIds
     */
    public java.util.List < String > getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > forbiddenVideoIds; 
        private java.util.List < String > nonExistVideoIds; 
        private String requestId; 

        /**
         * The IDs of the videos that cannot be modified. Generally, videos cannot be modified if you do not have required [permissions](~~113600~~).
         */
        public Builder forbiddenVideoIds(java.util.List < String > forbiddenVideoIds) {
            this.forbiddenVideoIds = forbiddenVideoIds;
            return this;
        }

        /**
         * The IDs of the videos that do not exist.
         */
        public Builder nonExistVideoIds(java.util.List < String > nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateVideoInfosResponseBody build() {
            return new UpdateVideoInfosResponseBody(this);
        } 

    } 

}
