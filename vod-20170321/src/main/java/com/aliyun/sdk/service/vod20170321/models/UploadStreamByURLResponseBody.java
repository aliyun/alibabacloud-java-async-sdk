// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadStreamByURLResponseBody} extends {@link TeaModel}
 *
 * <p>UploadStreamByURLResponseBody</p>
 */
public class UploadStreamByURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceURL")
    private String sourceURL;

    @com.aliyun.core.annotation.NameInMap("StreamJobId")
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
         * <p>The URL of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-31059bcee7810a200163e1c8dba****.oss-cn-shanghai.aliyuncs.com/lesson-01.mp4">http://outin-31059bcee7810a200163e1c8dba****.oss-cn-shanghai.aliyuncs.com/lesson-01.mp4</a></p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7AE96389-DF1E-598D-816B-7B40F13B4620</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The URL of the input stream. This parameter is used when you call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/lesson-01.mp4">https://example.com/lesson-01.mp4</a></p>
         */
        public Builder sourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }

        /**
         * <p>The ID of the stream upload job. This parameter is used when you call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
         * <p>In ApsaraVideo VOD, you can upload only one transcoded stream in an upload job. For more information, see the PlayInfo: the playback information about a video stream section in <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>e304b34fb3d959f92baef97b6496****</p>
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
