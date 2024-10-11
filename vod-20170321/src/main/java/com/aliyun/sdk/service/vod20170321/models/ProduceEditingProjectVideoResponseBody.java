// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the produced video.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is returned for each request.</li>
         * <li>If a value is returned for this parameter, the video production task is being asynchronously processed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>006204a11bb386bb25491f95f****</p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>fb2101bf24b4cb318787dc****</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
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
