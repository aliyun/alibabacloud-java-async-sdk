// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link UploadAgentConversationLogRequest} extends {@link RequestModel}
 *
 * <p>UploadAgentConversationLogRequest</p>
 */
public class UploadAgentConversationLogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("conversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentGzipB64")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 5242880, minLength = 1)
    private String contentGzipB64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 1)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeRangeEnd")
    private String timeRangeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeRangeStart")
    private String timeRangeStart;

    private UploadAgentConversationLogRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.contentGzipB64 = builder.contentGzipB64;
        this.fileName = builder.fileName;
        this.timeRangeEnd = builder.timeRangeEnd;
        this.timeRangeStart = builder.timeRangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAgentConversationLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return contentGzipB64
     */
    public String getContentGzipB64() {
        return this.contentGzipB64;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return timeRangeEnd
     */
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    /**
     * @return timeRangeStart
     */
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

    public static final class Builder extends Request.Builder<UploadAgentConversationLogRequest, Builder> {
        private String conversationId; 
        private String contentGzipB64; 
        private String fileName; 
        private String timeRangeEnd; 
        private String timeRangeStart; 

        private Builder() {
            super();
        } 

        private Builder(UploadAgentConversationLogRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.contentGzipB64 = request.contentGzipB64;
            this.fileName = request.fileName;
            this.timeRangeEnd = request.timeRangeEnd;
            this.timeRangeStart = request.timeRangeStart;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0198c8a91f4d7f01a3c21e97</p>
         */
        public Builder conversationId(String conversationId) {
            this.putPathParameter("conversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>H4sIAAAAAAAAEzMyMDLTNbDUNTQKMTSwMgAhbQMLKwMDBU8/N3+F4sq8kozUksxkheSczNS8EoWc/HSF4pLEohIuIwydhgR1pualcAEAN/JXaXIAAAA=</p>
         */
        public Builder contentGzipB64(String contentGzipB64) {
            this.putBodyParameter("contentGzipB64", contentGzipB64);
            this.contentGzipB64 = contentGzipB64;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client.log</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * timeRangeEnd.
         */
        public Builder timeRangeEnd(String timeRangeEnd) {
            this.putBodyParameter("timeRangeEnd", timeRangeEnd);
            this.timeRangeEnd = timeRangeEnd;
            return this;
        }

        /**
         * timeRangeStart.
         */
        public Builder timeRangeStart(String timeRangeStart) {
            this.putBodyParameter("timeRangeStart", timeRangeStart);
            this.timeRangeStart = timeRangeStart;
            return this;
        }

        @Override
        public UploadAgentConversationLogRequest build() {
            return new UploadAgentConversationLogRequest(this);
        } 

    } 

}
