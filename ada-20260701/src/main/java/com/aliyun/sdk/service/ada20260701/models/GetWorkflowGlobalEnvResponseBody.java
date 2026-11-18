// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link GetWorkflowGlobalEnvResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkflowGlobalEnvResponseBody</p>
 */
public class GetWorkflowGlobalEnvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.NameInMap("Exists")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean exists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    private GetWorkflowGlobalEnvResponseBody(Builder builder) {
        this.content = builder.content;
        this.exists = builder.exists;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowGlobalEnvResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return exists
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String content; 
        private Boolean exists; 
        private String requestId; 
        private Long size; 
        private Boolean success; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(GetWorkflowGlobalEnvResponseBody model) {
            this.content = model.content;
            this.exists = model.exists;
            this.requestId = model.requestId;
            this.size = model.size;
            this.success = model.success;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The configuration content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MODE=demo</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Indicates whether the configuration is saved.</p>
         * <p>This parameter is required.</p>
         */
        public Builder exists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01A0677A-49CB-1605-AC3A-26761045B614</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of UTF-8 bytes in the configuration content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * <p>This parameter is required.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The timestamp of the last modification in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetWorkflowGlobalEnvResponseBody build() {
            return new GetWorkflowGlobalEnvResponseBody(this);
        } 

    } 

}
