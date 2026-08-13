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
 * {@link DeleteTenantDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTenantDirectoryResponseBody</p>
 */
public class DeleteTenantDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("deleteMode")
    private String deleteMode;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeleteTenantDirectoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.deleteMode = builder.deleteMode;
        this.directoryId = builder.directoryId;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTenantDirectoryResponseBody create() {
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
     * @return deleteMode
     */
    public String getDeleteMode() {
        return this.deleteMode;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String deleteMode; 
        private String directoryId; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteTenantDirectoryResponseBody model) {
            this.code = model.code;
            this.deleteMode = model.deleteMode;
            this.directoryId = model.directoryId;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * <p>实际使用的删除模式</p>
         * 
         * <strong>example:</strong>
         * <p>reject</p>
         */
        public Builder deleteMode(String deleteMode) {
            this.deleteMode = deleteMode;
            return this;
        }

        /**
         * <p>已删除的目录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
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

        public DeleteTenantDirectoryResponseBody build() {
            return new DeleteTenantDirectoryResponseBody(this);
        } 

    } 

}
