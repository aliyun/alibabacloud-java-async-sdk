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
 * {@link GetGraphSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetGraphSchemaResponseBody</p>
 */
public class GetGraphSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schemaId")
    private String schemaId;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("yamlEdit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yamlEdit;

    private GetGraphSchemaResponseBody(Builder builder) {
        this.code = builder.code;
        this.graphName = builder.graphName;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schemaId = builder.schemaId;
        this.schemaVersion = builder.schemaVersion;
        this.yamlEdit = builder.yamlEdit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGraphSchemaResponseBody create() {
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
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemaId
     */
    public String getSchemaId() {
        return this.schemaId;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return yamlEdit
     */
    public String getYamlEdit() {
        return this.yamlEdit;
    }

    public static final class Builder {
        private String code; 
        private String graphName; 
        private String message; 
        private String requestId; 
        private String schemaId; 
        private String schemaVersion; 
        private String yamlEdit; 

        private Builder() {
        } 

        private Builder(GetGraphSchemaResponseBody model) {
            this.code = model.code;
            this.graphName = model.graphName;
            this.message = model.message;
            this.requestId = model.requestId;
            this.schemaId = model.schemaId;
            this.schemaVersion = model.schemaVersion;
            this.yamlEdit = model.yamlEdit;
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
         * <p>图谱名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
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
         * <p>graph 对应的 active QueryAgent 注册 schema ID；尚未注册时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>schema_123456</p>
         */
        public Builder schemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        /**
         * <p>当前 active Graph Schema 版本</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>按 READ 权限裁剪的 Graph Schema 原始 YAML 文本，保留授权子图内的 $ref</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder yamlEdit(String yamlEdit) {
            this.yamlEdit = yamlEdit;
            return this;
        }

        public GetGraphSchemaResponseBody build() {
            return new GetGraphSchemaResponseBody(this);
        } 

    } 

}
