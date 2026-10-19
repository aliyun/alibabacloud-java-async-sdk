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
 * {@link DeleteAppResourcePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAppResourcePermissionsResponseBody</p>
 */
public class DeleteAppResourcePermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("deletedCount")
    private Long deletedCount;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeleteAppResourcePermissionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.deletedCount = builder.deletedCount;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppResourcePermissionsResponseBody create() {
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
     * @return deletedCount
     */
    public Long getDeletedCount() {
        return this.deletedCount;
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
        private Long deletedCount; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAppResourcePermissionsResponseBody model) {
            this.code = model.code;
            this.deletedCount = model.deletedCount;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码；成功为 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>删除的权限记录数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder deletedCount(Long deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }

        /**
         * <p>错误描述；成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
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

        public DeleteAppResourcePermissionsResponseBody build() {
            return new DeleteAppResourcePermissionsResponseBody(this);
        } 

    } 

}
