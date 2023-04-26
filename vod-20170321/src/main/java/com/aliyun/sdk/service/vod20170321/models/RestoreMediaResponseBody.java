// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreMediaResponseBody} extends {@link TeaModel}
 *
 * <p>RestoreMediaResponseBody</p>
 */
public class RestoreMediaResponseBody extends TeaModel {
    @NameInMap("ForbiddenList")
    private ForbiddenList forbiddenList;

    @NameInMap("IgnoredList")
    private IgnoredList ignoredList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * ForbiddenList.
         */
        public Builder forbiddenList(ForbiddenList forbiddenList) {
            this.forbiddenList = forbiddenList;
            return this;
        }

        /**
         * IgnoredList.
         */
        public Builder ignoredList(IgnoredList ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RestoreMediaResponseBody build() {
            return new RestoreMediaResponseBody(this);
        } 

    } 

    public static class MediaForbiddenReasonDTO extends TeaModel {
        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("Reason")
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
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * Reason.
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
        @NameInMap("MediaForbiddenReasonDTO")
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
        @NameInMap("MediaId")
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
             * MediaId.
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
