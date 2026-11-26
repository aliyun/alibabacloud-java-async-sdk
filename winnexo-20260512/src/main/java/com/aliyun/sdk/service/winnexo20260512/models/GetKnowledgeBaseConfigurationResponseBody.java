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
 * {@link GetKnowledgeBaseConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBaseConfigurationResponseBody</p>
 */
public class GetKnowledgeBaseConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("changeRecordEnabled")
    private Boolean changeRecordEnabled;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ooVisibilityMode")
    private String ooVisibilityMode;

    @com.aliyun.core.annotation.NameInMap("operatingObjectNames")
    private java.util.List<String> operatingObjectNames;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetKnowledgeBaseConfigurationResponseBody(Builder builder) {
        this.changeRecordEnabled = builder.changeRecordEnabled;
        this.code = builder.code;
        this.directoryId = builder.directoryId;
        this.message = builder.message;
        this.ooVisibilityMode = builder.ooVisibilityMode;
        this.operatingObjectNames = builder.operatingObjectNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeRecordEnabled
     */
    public Boolean getChangeRecordEnabled() {
        return this.changeRecordEnabled;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ooVisibilityMode
     */
    public String getOoVisibilityMode() {
        return this.ooVisibilityMode;
    }

    /**
     * @return operatingObjectNames
     */
    public java.util.List<String> getOperatingObjectNames() {
        return this.operatingObjectNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean changeRecordEnabled; 
        private String code; 
        private String directoryId; 
        private String message; 
        private String ooVisibilityMode; 
        private java.util.List<String> operatingObjectNames; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBaseConfigurationResponseBody model) {
            this.changeRecordEnabled = model.changeRecordEnabled;
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.message = model.message;
            this.ooVisibilityMode = model.ooVisibilityMode;
            this.operatingObjectNames = model.operatingObjectNames;
            this.requestId = model.requestId;
        } 

        /**
         * <p>是否开启后续内容更新的 AI 版本摘要</p>
         */
        public Builder changeRecordEnabled(Boolean changeRecordEnabled) {
            this.changeRecordEnabled = changeRecordEnabled;
            return this;
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
         * <p>企业知识库根目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>kb-example</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>错误描述，成功时为 success</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>数字员工可见模式；历史未显式设置 ALL 的配置按 SPECIFIED 返回</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        public Builder ooVisibilityMode(String ooVisibilityMode) {
            this.ooVisibilityMode = ooVisibilityMode;
            return this;
        }

        /**
         * <p>显式关联的数字员工名称；ALL 返回空数组，SPECIFIED 空数组表示没有关联员工</p>
         */
        public Builder operatingObjectNames(java.util.List<String> operatingObjectNames) {
            this.operatingObjectNames = operatingObjectNames;
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

        public GetKnowledgeBaseConfigurationResponseBody build() {
            return new GetKnowledgeBaseConfigurationResponseBody(this);
        } 

    } 

}
