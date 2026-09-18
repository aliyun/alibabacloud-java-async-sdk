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
 * {@link MoveGroupResourceResponseBody} extends {@link TeaModel}
 *
 * <p>MoveGroupResourceResponseBody</p>
 */
public class MoveGroupResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceDirectoryId")
    private String sourceDirectoryId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("targetDirectoryId")
    private String targetDirectoryId;

    private MoveGroupResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.groupId = builder.groupId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sourceDirectoryId = builder.sourceDirectoryId;
        this.sourceId = builder.sourceId;
        this.targetDirectoryId = builder.targetDirectoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveGroupResourceResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceDirectoryId
     */
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return targetDirectoryId
     */
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    public static final class Builder {
        private String code; 
        private String groupId; 
        private String message; 
        private String requestId; 
        private String sourceDirectoryId; 
        private String sourceId; 
        private String targetDirectoryId; 

        private Builder() {
        } 

        private Builder(MoveGroupResourceResponseBody model) {
            this.code = model.code;
            this.groupId = model.groupId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sourceDirectoryId = model.sourceDirectoryId;
            this.sourceId = model.sourceId;
            this.targetDirectoryId = model.targetDirectoryId;
        } 

        /**
         * <p>业务状态码，成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>协作空间 ID</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>移动前的目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceDirectoryId(String sourceDirectoryId) {
            this.sourceDirectoryId = sourceDirectoryId;
            return this;
        }

        /**
         * <p>移动的资料 ID，移动前后保持不变</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>移动后的目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder targetDirectoryId(String targetDirectoryId) {
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }

        public MoveGroupResourceResponseBody build() {
            return new MoveGroupResourceResponseBody(this);
        } 

    } 

}
