// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProduceEditingProjectVideoResponseBody} extends {@link TeaModel}
 *
 * <p>ProduceEditingProjectVideoResponseBody</p>
 */
public class ProduceEditingProjectVideoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ProduceEditingProjectVideoResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProduceEditingProjectVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mediaId; 
        private String projectId; 
        private String requestId; 

        /**
         * The ID of the produced video.
         * <p>
         * 
         * > *   This parameter is returned for each request.
         * > *   If a value is returned for this parameter, the video production task is being asynchronously processed.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The ID of the online editing project.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ProduceEditingProjectVideoResponseBody build() {
            return new ProduceEditingProjectVideoResponseBody(this);
        } 

    } 

}
