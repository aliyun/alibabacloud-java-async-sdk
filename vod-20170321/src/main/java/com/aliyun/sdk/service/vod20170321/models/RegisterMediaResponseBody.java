// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMediaResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterMediaResponseBody</p>
 */
public class RegisterMediaResponseBody extends TeaModel {
    @NameInMap("FailedFileURLs")
    private java.util.List < String > failedFileURLs;

    @NameInMap("RegisteredMediaList")
    private java.util.List < RegisteredMediaList> registeredMediaList;

    @NameInMap("RequestId")
    private String requestId;

    private RegisterMediaResponseBody(Builder builder) {
        this.failedFileURLs = builder.failedFileURLs;
        this.registeredMediaList = builder.registeredMediaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedFileURLs
     */
    public java.util.List < String > getFailedFileURLs() {
        return this.failedFileURLs;
    }

    /**
     * @return registeredMediaList
     */
    public java.util.List < RegisteredMediaList> getRegisteredMediaList() {
        return this.registeredMediaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > failedFileURLs; 
        private java.util.List < RegisteredMediaList> registeredMediaList; 
        private String requestId; 

        /**
         * The URLs of the media files that failed to be registered.
         */
        public Builder failedFileURLs(java.util.List < String > failedFileURLs) {
            this.failedFileURLs = failedFileURLs;
            return this;
        }

        /**
         * The media files that are registered, including newly registered and repeatedly registered media files.
         */
        public Builder registeredMediaList(java.util.List < RegisteredMediaList> registeredMediaList) {
            this.registeredMediaList = registeredMediaList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterMediaResponseBody build() {
            return new RegisterMediaResponseBody(this);
        } 

    } 

    public static class RegisteredMediaList extends TeaModel {
        @NameInMap("FileURL")
        private String fileURL;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("NewRegister")
        private Boolean newRegister;

        private RegisteredMediaList(Builder builder) {
            this.fileURL = builder.fileURL;
            this.mediaId = builder.mediaId;
            this.newRegister = builder.newRegister;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegisteredMediaList create() {
            return builder().build();
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return newRegister
         */
        public Boolean getNewRegister() {
            return this.newRegister;
        }

        public static final class Builder {
            private String fileURL; 
            private String mediaId; 
            private Boolean newRegister; 

            /**
             * The OSS URL of the media file.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * The ID of the media file that is registered with ApsaraVideo VOD. If the registered media file is an audio or video file, the value of the VideoId parameter returned by ApsaraVideo VOD takes effect.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * Indicates whether the media file is newly registered or repeatedly registered. Valid values:  
             * <p>
             * - **true**: The media file is newly registered.
             * - **false**: The media file is repeatedly registered.
             */
            public Builder newRegister(Boolean newRegister) {
                this.newRegister = newRegister;
                return this;
            }

            public RegisteredMediaList build() {
                return new RegisteredMediaList(this);
            } 

        } 

    }
}
