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
 * {@link RegisterMediaResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterMediaResponseBody</p>
 */
public class RegisterMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedFileURLs")
    private java.util.List<String> failedFileURLs;

    @com.aliyun.core.annotation.NameInMap("RegisteredMediaList")
    private java.util.List<RegisteredMediaList> registeredMediaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedFileURLs
     */
    public java.util.List<String> getFailedFileURLs() {
        return this.failedFileURLs;
    }

    /**
     * @return registeredMediaList
     */
    public java.util.List<RegisteredMediaList> getRegisteredMediaList() {
        return this.registeredMediaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> failedFileURLs; 
        private java.util.List<RegisteredMediaList> registeredMediaList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterMediaResponseBody model) {
            this.failedFileURLs = model.failedFileURLs;
            this.registeredMediaList = model.registeredMediaList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The URLs of the media files that failed to be registered.</p>
         */
        public Builder failedFileURLs(java.util.List<String> failedFileURLs) {
            this.failedFileURLs = failedFileURLs;
            return this;
        }

        /**
         * <p>The media files that are registered, including newly registered and repeatedly registered media files.</p>
         */
        public Builder registeredMediaList(java.util.List<RegisteredMediaList> registeredMediaList) {
            this.registeredMediaList = registeredMediaList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14F43C5C-8033-448B-AD04F64E5098****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterMediaResponseBody build() {
            return new RegisterMediaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RegisterMediaResponseBody} extends {@link TeaModel}
     *
     * <p>RegisterMediaResponseBody</p>
     */
    public static class RegisteredMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("NewRegister")
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

            private Builder() {
            } 

            private Builder(RegisteredMediaList model) {
                this.fileURL = model.fileURL;
                this.mediaId = model.mediaId;
                this.newRegister = model.newRegister;
            } 

            /**
             * <p>The URL of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>http://****.oss-cn-shanghai.aliyuncs.com/vod_sample_01.mp4</p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The ID of the media file that is registered with ApsaraVideo VOD. If the registered media file is an audio or video file, the value of this parameter is the same as that of the VideoId parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>d97af32828084d1896683b1aa38****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>Indicates whether the media file is newly registered or repeatedly registered. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The media file is newly registered.</li>
             * <li><strong>false</strong>: The media file is repeatedly registered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
