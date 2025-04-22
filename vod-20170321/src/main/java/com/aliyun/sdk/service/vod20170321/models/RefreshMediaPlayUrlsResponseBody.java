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
 * {@link RefreshMediaPlayUrlsResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshMediaPlayUrlsResponseBody</p>
 */
public class RefreshMediaPlayUrlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenMediaIds")
    private String forbiddenMediaIds;

    @com.aliyun.core.annotation.NameInMap("MediaRefreshJobId")
    private String mediaRefreshJobId;

    @com.aliyun.core.annotation.NameInMap("NonExistMediaIds")
    private String nonExistMediaIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RefreshMediaPlayUrlsResponseBody model) {
            this.forbiddenMediaIds = model.forbiddenMediaIds;
            this.mediaRefreshJobId = model.mediaRefreshJobId;
            this.nonExistMediaIds = model.nonExistMediaIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the media files that cannot be operated on. In most cases, media files cannot be operated on because you are not authorized to perform the operations. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>a6e49sfgd23p5g9ja7095863****</p>
         */
        public Builder forbiddenMediaIds(String forbiddenMediaIds) {
            this.forbiddenMediaIds = forbiddenMediaIds;
            return this;
        }

        /**
         * <p>The ID of the refresh or prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>41d465e31957****</p>
         */
        public Builder mediaRefreshJobId(String mediaRefreshJobId) {
            this.mediaRefreshJobId = mediaRefreshJobId;
            return this;
        }

        /**
         * <p>The IDs of the media files that do not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>ca3a8f6e4957b658067095869****</p>
         */
        public Builder nonExistMediaIds(String nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-04D5-D7393642****</p>
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
