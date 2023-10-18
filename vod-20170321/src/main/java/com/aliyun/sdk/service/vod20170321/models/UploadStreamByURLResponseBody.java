// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadStreamByURLResponseBody} extends {@link TeaModel}
 *
 * <p>UploadStreamByURLResponseBody</p>
 */
public class UploadStreamByURLResponseBody extends TeaModel {
    @NameInMap("FileURL")
    private String fileURL;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceURL")
    private String sourceURL;

    @NameInMap("StreamJobId")
    private String streamJobId;

    private UploadStreamByURLResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.requestId = builder.requestId;
        this.sourceURL = builder.sourceURL;
        this.streamJobId = builder.streamJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadStreamByURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceURL
     */
    public String getSourceURL() {
        return this.sourceURL;
    }

    /**
     * @return streamJobId
     */
    public String getStreamJobId() {
        return this.streamJobId;
    }

    public static final class Builder {
        private String fileURL; 
        private String requestId; 
        private String sourceURL; 
        private String streamJobId; 

        /**
         * The URL of the OSS object.
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
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
         * The URL of the input stream. This parameter is used when you call the [GetURLUploadInfos](~~106830~~) operation.
         */
        public Builder sourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }

        /**
         * The ID of the stream upload job. This parameter is used when you call the [GetURLUploadInfos](~~106830~~) operation.
         * <p>
         * 
         * In ApsaraVideo VOD, you can upload only one transcoded stream in an upload job. For more information, see the PlayInfo: the playback information about a video stream section in [Basic structures](~~52839~~).
         */
        public Builder streamJobId(String streamJobId) {
            this.streamJobId = streamJobId;
            return this;
        }

        public UploadStreamByURLResponseBody build() {
            return new UploadStreamByURLResponseBody(this);
        } 

    } 

}
