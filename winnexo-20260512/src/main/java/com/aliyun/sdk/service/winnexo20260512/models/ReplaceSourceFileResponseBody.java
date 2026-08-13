// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ReplaceSourceFileResponseBody} extends {@link TeaModel}
 *
 * <p>ReplaceSourceFileResponseBody</p>
 */
public class ReplaceSourceFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("filePath")
    private String filePath;

    @com.aliyun.core.annotation.NameInMap("filePublicUrl")
    private String filePublicUrl;

    @com.aliyun.core.annotation.NameInMap("fileRecordId")
    private String fileRecordId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ReplaceSourceFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.filePath = builder.filePath;
        this.filePublicUrl = builder.filePublicUrl;
        this.fileRecordId = builder.fileRecordId;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceSourceFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return filePublicUrl
     */
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    /**
     * @return fileRecordId
     */
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private String filePath; 
        private String filePublicUrl; 
        private String fileRecordId; 
        private String message; 
        private String name; 
        private String requestId; 
        private String sourceId; 
        private String sourceType; 
        private String status; 

        private Builder() {
        } 

        private Builder(ReplaceSourceFileResponseBody model) {
            this.code = model.code;
            this.filePath = model.filePath;
            this.filePublicUrl = model.filePublicUrl;
            this.fileRecordId = model.fileRecordId;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.status = model.status;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>替换后的文件 OSS 持久化地址</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>替换后的文件公开访问 URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder filePublicUrl(String filePublicUrl) {
            this.filePublicUrl = filePublicUrl;
            return this;
        }

        /**
         * <p>替换后的文件记录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileRecordId</p>
         */
        public Builder fileRecordId(String fileRecordId) {
            this.fileRecordId = fileRecordId;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>文件名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>数据源 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>数据源类型，固定为 FILE</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>重新解析后的数据源状态</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ReplaceSourceFileResponseBody build() {
            return new ReplaceSourceFileResponseBody(this);
        } 

    } 

}
