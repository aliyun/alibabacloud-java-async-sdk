// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordingResponseBody</p>
 */
public class DescribeRecordingResponseBody extends TeaModel {
    @NameInMap("FileName")
    private String fileName;

    @NameInMap("FilePath")
    private String filePath;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VoiceSliceRecordingListJson")
    private String voiceSliceRecordingListJson;

    private DescribeRecordingResponseBody(Builder builder) {
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.requestId = builder.requestId;
        this.voiceSliceRecordingListJson = builder.voiceSliceRecordingListJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordingResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return voiceSliceRecordingListJson
     */
    public String getVoiceSliceRecordingListJson() {
        return this.voiceSliceRecordingListJson;
    }

    public static final class Builder {
        private String fileName; 
        private String filePath; 
        private String requestId; 
        private String voiceSliceRecordingListJson; 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
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
         * VoiceSliceRecordingListJson.
         */
        public Builder voiceSliceRecordingListJson(String voiceSliceRecordingListJson) {
            this.voiceSliceRecordingListJson = voiceSliceRecordingListJson;
            return this;
        }

        public DescribeRecordingResponseBody build() {
            return new DescribeRecordingResponseBody(this);
        } 

    } 

}
