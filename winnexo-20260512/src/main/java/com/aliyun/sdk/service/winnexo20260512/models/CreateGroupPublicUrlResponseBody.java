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
 * {@link CreateGroupPublicUrlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupPublicUrlResponseBody</p>
 */
public class CreateGroupPublicUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("originalUrl")
    private String originalUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreateGroupPublicUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.directoryId = builder.directoryId;
        this.gmtCreate = builder.gmtCreate;
        this.groupId = builder.groupId;
        this.message = builder.message;
        this.name = builder.name;
        this.originalUrl = builder.originalUrl;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.sourceId = builder.sourceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupPublicUrlResponseBody create() {
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return originalUrl
     */
    public String getOriginalUrl() {
        return this.originalUrl;
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
        private String gmtCreate; 
        private String groupId; 
        private String message; 
        private String name; 
        private String originalUrl; 
        private String requestId; 
        private String scope; 
        private String sourceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateGroupPublicUrlResponseBody model) {
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.gmtCreate = model.gmtCreate;
            this.groupId = model.groupId;
            this.message = model.message;
            this.name = model.name;
            this.originalUrl = model.originalUrl;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.sourceId = model.sourceId;
            this.status = model.status;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-12T03:08:56Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The project group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_delivery</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The knowledge base name.</p>
         * 
         * <strong>example:</strong>
         * <p>p-toolset-80a4520e-b35c-4e8b-acf7-3a01c7307522</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The URL of the web page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mp.weixin.qq.com/s/iHqLKhkJcOyHNCOGejO32A">https://mp.weixin.qq.com/s/iHqLKhkJcOyHNCOGejO32A</a></p>
         */
        public Builder originalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The permission scope.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>The source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The refund status. If a refund is in progress, query to confirm the refund status. Valid values:</p>
         * <ul>
         * <li>SUCCESS: All succeeded.</li>
         * <li>FAIL: Failed.</li>
         * <li>WAIT_PAY: Waiting for refund.</li>
         * <li>EXPIRE: Expired.</li>
         * <li>PAYING: Refund in progress.</li>
         * <li>TERMINATE: Refund terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateGroupPublicUrlResponseBody build() {
            return new CreateGroupPublicUrlResponseBody(this);
        } 

    } 

}
