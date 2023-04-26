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
         * 没有多应用权限的视频ID
         */
        public Builder forbiddenMediaIds(String forbiddenMediaIds) {
            this.forbiddenMediaIds = forbiddenMediaIds;
            return this;
        }

        /**
         * Submits media refresh or prefetch tasks based on the media IDs.
         */
        public Builder mediaRefreshJobId(String mediaRefreshJobId) {
            this.mediaRefreshJobId = mediaRefreshJobId;
            return this;
        }

        /**
         * 不存在的媒资ID
         */
        public Builder nonExistMediaIds(String nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * RequestId.
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
