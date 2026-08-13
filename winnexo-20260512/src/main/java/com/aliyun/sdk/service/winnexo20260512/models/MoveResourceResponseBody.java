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
 * {@link MoveResourceResponseBody} extends {@link TeaModel}
 *
 * <p>MoveResourceResponseBody</p>
 */
public class MoveResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceDirectoryId")
    private String sourceDirectoryId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("targetDirectoryId")
    private String targetDirectoryId;

    private MoveResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sourceDirectoryId = builder.sourceDirectoryId;
        this.sourceId = builder.sourceId;
        this.success = builder.success;
        this.targetDirectoryId = builder.targetDirectoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveResourceResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return targetDirectoryId
     */
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String sourceDirectoryId; 
        private String sourceId; 
        private Boolean success; 
        private String targetDirectoryId; 

        private Builder() {
        } 

        private Builder(MoveResourceResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sourceDirectoryId = model.sourceDirectoryId;
            this.sourceId = model.sourceId;
            this.success = model.success;
            this.targetDirectoryId = model.targetDirectoryId;
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
         * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>源目录 ID（echo 回入参）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceDirectoryId</p>
         */
        public Builder sourceDirectoryId(String sourceDirectoryId) {
            this.sourceDirectoryId = sourceDirectoryId;
            return this;
        }

        /**
         * <p>资源 ID（echo 回入参）</p>
         * 
         * <strong>example:</strong>
         * <p>2000627</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>操作是否成功</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>目标目录 ID（echo 回入参）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTargetDirectoryId</p>
         */
        public Builder targetDirectoryId(String targetDirectoryId) {
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }

        public MoveResourceResponseBody build() {
            return new MoveResourceResponseBody(this);
        } 

    } 

}
