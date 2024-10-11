// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The IDs of the media assets that failed to be processed.</p>
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
         * <p>30FA0B7C-3A81-5449-93CD-ACA149E6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the task. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong></li>
         * <li><strong>Failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateMediaStorageClassResponseBody build() {
            return new UpdateMediaStorageClassResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMediaStorageClassResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMediaStorageClassResponseBody</p>
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

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>19e231ee6e3e417fbf2e92ec2680****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>TargetStorageClassInconsistent</p>
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
     * {@link UpdateMediaStorageClassResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMediaStorageClassResponseBody</p>
     */
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
    /**
     * 
     * {@link UpdateMediaStorageClassResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMediaStorageClassResponseBody</p>
     */
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
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>19e231ee6e3e417fbf2e92ec2680****</p>
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
