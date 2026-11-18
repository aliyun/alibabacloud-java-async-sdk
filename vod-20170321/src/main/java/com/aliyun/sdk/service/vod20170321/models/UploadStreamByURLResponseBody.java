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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UploadStreamByURLResponseBody model) {
            this.fileURL = model.fileURL;
            this.requestId = model.requestId;
            this.sourceURL = model.sourceURL;
            this.streamJobId = model.streamJobId;
        } 

        /**
         * <p>The OSS file URL of the transcoded stream.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-31059bcee7810a200163e1c8dba****.oss-cn-shanghai.aliyuncs.com/lesson-01.mp4">http://outin-31059bcee7810a200163e1c8dba****.oss-cn-shanghai.aliyuncs.com/lesson-01.mp4</a></p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7AE96389-DF1E-598D-816B-7B40F13B4620</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The input URL of the transcoded stream. You can use this value as a request parameter of the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/lesson-01.mp4">https://example.com/lesson-01.mp4</a></p>
         */
        public Builder sourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }

        /**
         * <p>The job ID of the transcoded stream. You can use this value as a request parameter of the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
         * <p>ApsaraVideo VOD uses the job ID to uniquely identify a transcoded stream file. For more information, see <a href="https://help.aliyun.com/document_detail/52839.html">Basic data types - PlayInfo</a>.</p>
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
