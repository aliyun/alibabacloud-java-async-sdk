// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaStorageClassResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaStorageClassResponseBody</p>
 */
public class UpdateMediaStorageClassResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenList")
    private ForbiddenList forbiddenList;

    @com.aliyun.core.annotation.NameInMap("IgnoredList")
    private IgnoredList ignoredList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateMediaStorageClassResponseBody(Builder builder) {
        this.forbiddenList = builder.forbiddenList;
        this.ignoredList = builder.ignoredList;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaStorageClassResponseBody create() {
        return builder().build();
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private ForbiddenList forbiddenList; 
        private IgnoredList ignoredList; 
        private String requestId; 
        private String status; 

        /**
         * The IDs of the media assets that failed to be processed.
         */
        public Builder forbiddenList(ForbiddenList forbiddenList) {
            this.forbiddenList = forbiddenList;
            return this;
        }

        /**
         * The IDs of the media assets that failed to be obtained.
         */
        public Builder ignoredList(IgnoredList ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state of the task. Valid values:
         * <p>
         * 
         * *   **Processing**
         * *   **Failed**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateMediaStorageClassResponseBody build() {
            return new UpdateMediaStorageClassResponseBody(this);
        } 

    } 

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

            /**
             * The ID of the media asset.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The reason for the failure.
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
    public static class ForbiddenList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaForbiddenReasonDTO")
        private java.util.List < MediaForbiddenReasonDTO> mediaForbiddenReasonDTO;

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
        public java.util.List < MediaForbiddenReasonDTO> getMediaForbiddenReasonDTO() {
            return this.mediaForbiddenReasonDTO;
        }

        public static final class Builder {
            private java.util.List < MediaForbiddenReasonDTO> mediaForbiddenReasonDTO; 

            /**
             * MediaForbiddenReasonDTO.
             */
            public Builder mediaForbiddenReasonDTO(java.util.List < MediaForbiddenReasonDTO> mediaForbiddenReasonDTO) {
                this.mediaForbiddenReasonDTO = mediaForbiddenReasonDTO;
                return this;
            }

            public ForbiddenList build() {
                return new ForbiddenList(this);
            } 

        } 

    }
    public static class IgnoredList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaId")
        private java.util.List < String > mediaId;

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
        public java.util.List < String > getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private java.util.List < String > mediaId; 

            /**
             * The ID of the media asset.
             */
            public Builder mediaId(java.util.List < String > mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public IgnoredList build() {
                return new IgnoredList(this);
            } 

        } 

    }
}
