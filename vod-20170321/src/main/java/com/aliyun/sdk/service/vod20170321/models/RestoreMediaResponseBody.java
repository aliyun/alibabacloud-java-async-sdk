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
 * {@link RestoreMediaResponseBody} extends {@link TeaModel}
 *
 * <p>RestoreMediaResponseBody</p>
 */
public class RestoreMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenList")
    private ForbiddenList forbiddenList;

    @com.aliyun.core.annotation.NameInMap("IgnoredList")
    private IgnoredList ignoredList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RestoreMediaResponseBody(Builder builder) {
        this.forbiddenList = builder.forbiddenList;
        this.ignoredList = builder.ignoredList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreMediaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forbiddenList
     */
    public ForbiddenList getForbiddenList() {
        return this.forbiddenList;
    }

    /**
     * @return ignoredList
     */
    public IgnoredList getIgnoredList() {
        return this.ignoredList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private ForbiddenList forbiddenList; 
        private IgnoredList ignoredList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RestoreMediaResponseBody model) {
            this.forbiddenList = model.forbiddenList;
            this.ignoredList = model.ignoredList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The IDs of the media asset that failed to be processed.</p>
         */
        public Builder forbiddenList(ForbiddenList forbiddenList) {
            this.forbiddenList = forbiddenList;
            return this;
        }

        /**
         * <p>The IDs of the media assets that failed to be obtained.</p>
         */
        public Builder ignoredList(IgnoredList ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8E70E3F8-E2EE-47BC-4677-379D6F28****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RestoreMediaResponseBody build() {
            return new RestoreMediaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RestoreMediaResponseBody} extends {@link TeaModel}
     *
     * <p>RestoreMediaResponseBody</p>
     */
    public static class MediaForbiddenReasonDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private MediaForbiddenReasonDTO(Builder builder) {
            this.mediaId = builder.mediaId;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaForbiddenReasonDTO create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String mediaId; 
            private String reason; 

            private Builder() {
            } 

            private Builder(MediaForbiddenReasonDTO model) {
                this.mediaId = model.mediaId;
                this.reason = model.reason;
            } 

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>fa10ee70898671edb99f6eb3690d****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Forbidden.RestoreMedia</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public MediaForbiddenReasonDTO build() {
                return new MediaForbiddenReasonDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestoreMediaResponseBody} extends {@link TeaModel}
     *
     * <p>RestoreMediaResponseBody</p>
     */
    public static class ForbiddenList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaForbiddenReasonDTO")
        private java.util.List<MediaForbiddenReasonDTO> mediaForbiddenReasonDTO;

        private ForbiddenList(Builder builder) {
            this.mediaForbiddenReasonDTO = builder.mediaForbiddenReasonDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForbiddenList create() {
            return builder().build();
        }

        /**
         * @return mediaForbiddenReasonDTO
         */
        public java.util.List<MediaForbiddenReasonDTO> getMediaForbiddenReasonDTO() {
            return this.mediaForbiddenReasonDTO;
        }

        public static final class Builder {
            private java.util.List<MediaForbiddenReasonDTO> mediaForbiddenReasonDTO; 

            private Builder() {
            } 

            private Builder(ForbiddenList model) {
                this.mediaForbiddenReasonDTO = model.mediaForbiddenReasonDTO;
            } 

            /**
             * MediaForbiddenReasonDTO.
             */
            public Builder mediaForbiddenReasonDTO(java.util.List<MediaForbiddenReasonDTO> mediaForbiddenReasonDTO) {
                this.mediaForbiddenReasonDTO = mediaForbiddenReasonDTO;
                return this;
            }

            public ForbiddenList build() {
                return new ForbiddenList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestoreMediaResponseBody} extends {@link TeaModel}
     *
     * <p>RestoreMediaResponseBody</p>
     */
    public static class IgnoredList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private java.util.List<String> mediaId;

        private IgnoredList(Builder builder) {
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IgnoredList create() {
            return builder().build();
        }

        /**
         * @return mediaId
         */
        public java.util.List<String> getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private java.util.List<String> mediaId; 

            private Builder() {
            } 

            private Builder(IgnoredList model) {
                this.mediaId = model.mediaId;
            } 

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>fa10ee70898671edb99f6eb3690d****</p>
             */
            public Builder mediaId(java.util.List<String> mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public IgnoredList build() {
                return new IgnoredList(this);
            } 

        } 

    }
}
