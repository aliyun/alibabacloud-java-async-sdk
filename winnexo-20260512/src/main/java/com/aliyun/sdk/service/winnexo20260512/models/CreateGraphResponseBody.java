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
 * {@link CreateGraphResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGraphResponseBody</p>
 */
public class CreateGraphResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    private Long dataSourceId;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("syncStatus")
    private String syncStatus;

    private CreateGraphResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataSourceId = builder.dataSourceId;
        this.graphName = builder.graphName;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schemaVersion = builder.schemaVersion;
        this.syncStatus = builder.syncStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGraphResponseBody create() {
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
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
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
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return syncStatus
     */
    public String getSyncStatus() {
        return this.syncStatus;
    }

    public static final class Builder {
        private String code; 
        private Long dataSourceId; 
        private String graphName; 
        private String message; 
        private String requestId; 
        private String schemaVersion; 
        private String syncStatus; 

        private Builder() {
        } 

        private Builder(CreateGraphResponseBody model) {
            this.code = model.code;
            this.dataSourceId = model.dataSourceId;
            this.graphName = model.graphName;
            this.message = model.message;
            this.requestId = model.requestId;
            this.schemaVersion = model.schemaVersion;
            this.syncStatus = model.syncStatus;
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
         * <p>创建时绑定的数据源 ID</p>
         * 
         * <strong>example:</strong>
         * <p>198001</p>
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>图谱名称</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
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
         * <p>Schema 版本；快建路径固定 0.0.0，正式版本经控制台发布产生</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>同步状态，快建成功为 SUCCESS</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder syncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }

        public CreateGraphResponseBody build() {
            return new CreateGraphResponseBody(this);
        } 

    } 

}
