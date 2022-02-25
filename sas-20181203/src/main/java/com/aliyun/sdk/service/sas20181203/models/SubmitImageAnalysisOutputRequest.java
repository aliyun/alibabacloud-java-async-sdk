// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitImageAnalysisOutputRequest} extends {@link RequestModel}
 *
 * <p>SubmitImageAnalysisOutputRequest</p>
 */
public class SubmitImageAnalysisOutputRequest extends Request {
    @Body
    @NameInMap("Body")
    private String body;

    @Body
    @NameInMap("IsCompress")
    private Boolean isCompress;

    @Body
    @NameInMap("IsEncrypt")
    private Boolean isEncrypt;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("Token")
    private String token;

    @Body
    @NameInMap("Type")
    private String type;

    private SubmitImageAnalysisOutputRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.isCompress = builder.isCompress;
        this.isEncrypt = builder.isEncrypt;
        this.sourceIp = builder.sourceIp;
        this.taskId = builder.taskId;
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImageAnalysisOutputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return isCompress
     */
    public Boolean getIsCompress() {
        return this.isCompress;
    }

    /**
     * @return isEncrypt
     */
    public Boolean getIsEncrypt() {
        return this.isEncrypt;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SubmitImageAnalysisOutputRequest, Builder> {
        private String body; 
        private Boolean isCompress; 
        private Boolean isEncrypt; 
        private String sourceIp; 
        private String taskId; 
        private String token; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImageAnalysisOutputRequest response) {
            super(response);
            this.body = response.body;
            this.isCompress = response.isCompress;
            this.isEncrypt = response.isEncrypt;
            this.sourceIp = response.sourceIp;
            this.taskId = response.taskId;
            this.token = response.token;
            this.type = response.type;
        } 

        /**
         * 等同 msgBody
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * 是否gzip压缩
         */
        public Builder isCompress(Boolean isCompress) {
            this.putBodyParameter("IsCompress", isCompress);
            this.isCompress = isCompress;
            return this;
        }

        /**
         * 是否加密
         */
        public Builder isEncrypt(Boolean isEncrypt) {
            this.putBodyParameter("IsEncrypt", isEncrypt);
            this.isEncrypt = isEncrypt;
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

        /**
         * 等同 handler code
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SubmitImageAnalysisOutputRequest build() {
            return new SubmitImageAnalysisOutputRequest(this);
        } 

    } 

}
