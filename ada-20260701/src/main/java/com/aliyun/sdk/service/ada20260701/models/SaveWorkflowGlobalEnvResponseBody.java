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
 * {@link SaveWorkflowGlobalEnvResponseBody} extends {@link TeaModel}
 *
 * <p>SaveWorkflowGlobalEnvResponseBody</p>
 */
public class SaveWorkflowGlobalEnvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private SaveWorkflowGlobalEnvResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWorkflowGlobalEnvResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private Long size; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SaveWorkflowGlobalEnvResponseBody model) {
            this.requestId = model.requestId;
            this.size = model.size;
            this.success = model.success;
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

        public SaveWorkflowGlobalEnvResponseBody build() {
            return new SaveWorkflowGlobalEnvResponseBody(this);
        } 

    } 

}
