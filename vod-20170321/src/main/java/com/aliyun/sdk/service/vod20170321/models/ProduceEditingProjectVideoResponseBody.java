// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProduceEditingProjectVideoResponseBody} extends {@link TeaModel}
 *
 * <p>ProduceEditingProjectVideoResponseBody</p>
 */
public class ProduceEditingProjectVideoResponseBody extends TeaModel {
    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("RequestId")
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
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * RequestId.
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
