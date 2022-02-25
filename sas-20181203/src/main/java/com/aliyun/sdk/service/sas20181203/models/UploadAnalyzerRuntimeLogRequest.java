// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadAnalyzerRuntimeLogRequest} extends {@link RequestModel}
 *
 * <p>UploadAnalyzerRuntimeLogRequest</p>
 */
public class UploadAnalyzerRuntimeLogRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("ExtendedContent")
    private java.util.Map < String, ? > extendedContent;

    @Body
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("Token")
    private String token;

    private UploadAnalyzerRuntimeLogRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.extendedContent = builder.extendedContent;
        this.level = builder.level;
        this.sourceIp = builder.sourceIp;
        this.taskId = builder.taskId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAnalyzerRuntimeLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return extendedContent
     */
    public java.util.Map < String, ? > getExtendedContent() {
        return this.extendedContent;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<UploadAnalyzerRuntimeLogRequest, Builder> {
        private String content; 
        private java.util.Map < String, ? > extendedContent; 
        private String level; 
        private String sourceIp; 
        private String taskId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(UploadAnalyzerRuntimeLogRequest response) {
            super(response);
            this.content = response.content;
            this.extendedContent = response.extendedContent;
            this.level = response.level;
            this.sourceIp = response.sourceIp;
            this.taskId = response.taskId;
            this.token = response.token;
        } 

        /**
         * 日志内容
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * 扩展内容
         */
        public Builder extendedContent(java.util.Map < String, ? > extendedContent) {
            this.putBodyParameter("ExtendedContent", extendedContent);
            this.extendedContent = extendedContent;
            return this;
        }

        /**
         * 日志级别
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * 任务 id
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * token
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public UploadAnalyzerRuntimeLogRequest build() {
            return new UploadAnalyzerRuntimeLogRequest(this);
        } 

    } 

}
