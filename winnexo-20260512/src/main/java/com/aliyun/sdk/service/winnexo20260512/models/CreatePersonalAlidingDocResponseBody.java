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
 * {@link CreatePersonalAlidingDocResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePersonalAlidingDocResponseBody</p>
 */
public class CreatePersonalAlidingDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("filePublicUrl")
    private String filePublicUrl;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreatePersonalAlidingDocResponseBody(Builder builder) {
        this.code = builder.code;
        this.directoryId = builder.directoryId;
        this.filePublicUrl = builder.filePublicUrl;
        this.gmtCreate = builder.gmtCreate;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.sourceId = builder.sourceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalAlidingDocResponseBody create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return filePublicUrl
     */
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private String directoryId; 
        private String filePublicUrl; 
        private String gmtCreate; 
        private String message; 
        private String name; 
        private String requestId; 
        private String scope; 
        private String sourceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreatePersonalAlidingDocResponseBody model) {
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.filePublicUrl = model.filePublicUrl;
            this.gmtCreate = model.gmtCreate;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.sourceId = model.sourceId;
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
         * <p>绑定的目录 ID（请求体传入时 echo 回；缺省走默认根目录时为 null）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>文档公开 URL（echo 回入参，便于调用方对齐）</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder filePublicUrl(String filePublicUrl) {
            this.filePublicUrl = filePublicUrl;
            return this;
        }

        /**
         * <p>创建时间 ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-22T08:15:28.000+00:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>user_paswd_104</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>资源 scope，固定为 PERSONAL</p>
         * 
         * <strong>example:</strong>
         * <p>user_info projects pull_requests hook gists emails</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>新建资源 ID</p>
         * 
         * <strong>example:</strong>
         * <p>2000413</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>资源状态（创建链路初始多为 PENDING；on_create 失败则为 FAILED）</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;servicesInstances&quot;: {}, &quot;servicesWithPendingChanges&quot;: []}</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreatePersonalAlidingDocResponseBody build() {
            return new CreatePersonalAlidingDocResponseBody(this);
        } 

    } 

}
