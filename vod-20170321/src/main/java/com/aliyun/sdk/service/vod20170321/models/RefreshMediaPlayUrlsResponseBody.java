// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshMediaPlayUrlsResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshMediaPlayUrlsResponseBody</p>
 */
public class RefreshMediaPlayUrlsResponseBody extends TeaModel {
    @NameInMap("ForbiddenMediaIds")
    private String forbiddenMediaIds;

    @NameInMap("MediaRefreshJobId")
    private String mediaRefreshJobId;

    @NameInMap("NonExistMediaIds")
    private String nonExistMediaIds;

    @NameInMap("RequestId")
    private String requestId;

    private RefreshMediaPlayUrlsResponseBody(Builder builder) {
        this.forbiddenMediaIds = builder.forbiddenMediaIds;
        this.mediaRefreshJobId = builder.mediaRefreshJobId;
        this.nonExistMediaIds = builder.nonExistMediaIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshMediaPlayUrlsResponseBody create() {
        return builder().build();
    }

    /**
     * @return forbiddenMediaIds
     */
    public String getForbiddenMediaIds() {
        return this.forbiddenMediaIds;
    }

    /**
     * @return mediaRefreshJobId
     */
    public String getMediaRefreshJobId() {
        return this.mediaRefreshJobId;
    }

    /**
     * @return nonExistMediaIds
     */
    public String getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String forbiddenMediaIds; 
        private String mediaRefreshJobId; 
        private String nonExistMediaIds; 
        private String requestId; 

        /**
         * The IDs of the media files that cannot be operated on. In most cases, media files cannot be operated on because you are not authorized to perform the operations. For more information, see [Overview](~~113600~~).
         */
        public Builder forbiddenMediaIds(String forbiddenMediaIds) {
            this.forbiddenMediaIds = forbiddenMediaIds;
            return this;
        }

        /**
         * The ID of the refresh or prefetch task.
         */
        public Builder mediaRefreshJobId(String mediaRefreshJobId) {
            this.mediaRefreshJobId = mediaRefreshJobId;
            return this;
        }

        /**
         * The IDs of the media files that do not exist.
         */
        public Builder nonExistMediaIds(String nonExistMediaIds) {
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

        public RefreshMediaPlayUrlsResponseBody build() {
            return new RefreshMediaPlayUrlsResponseBody(this);
        } 

    } 

}
