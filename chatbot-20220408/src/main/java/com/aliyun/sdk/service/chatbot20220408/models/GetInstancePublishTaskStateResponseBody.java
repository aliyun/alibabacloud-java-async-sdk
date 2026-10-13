// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link GetInstancePublishTaskStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstancePublishTaskStateResponseBody</p>
 */
public class GetInstancePublishTaskStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizTypeList")
    private java.util.List<String> bizTypeList;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("Errors")
    private java.util.Map<String, ?> errors;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Response")
    private String response;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Warnings")
    private java.util.Map<String, ?> warnings;

    private GetInstancePublishTaskStateResponseBody(Builder builder) {
        this.bizTypeList = builder.bizTypeList;
        this.createTime = builder.createTime;
        this.error = builder.error;
        this.errors = builder.errors;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.response = builder.response;
        this.status = builder.status;
        this.warnings = builder.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstancePublishTaskStateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypeList
     */
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return errors
     */
    public java.util.Map<String, ?> getErrors() {
        return this.errors;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return response
     */
    public String getResponse() {
        return this.response;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return warnings
     */
    public java.util.Map<String, ?> getWarnings() {
        return this.warnings;
    }

    public static final class Builder {
        private java.util.List<String> bizTypeList; 
        private String createTime; 
        private String error; 
        private java.util.Map<String, ?> errors; 
        private Long id; 
        private String modifyTime; 
        private String requestId; 
        private String response; 
        private String status; 
        private java.util.Map<String, ?> warnings; 

        private Builder() {
        } 

        private Builder(GetInstancePublishTaskStateResponseBody model) {
            this.bizTypeList = model.bizTypeList;
            this.createTime = model.createTime;
            this.error = model.error;
            this.errors = model.errors;
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.requestId = model.requestId;
            this.response = model.response;
            this.status = model.status;
            this.warnings = model.warnings;
        } 

        /**
         * <p>The list of business types.</p>
         */
        public Builder bizTypeList(java.util.List<String> bizTypeList) {
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * <p>The UTC time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-12T06:30:17Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The job failure information.</p>
         * 
         * <strong>example:</strong>
         * <p>An error occurred while checking whether the module to be published is idle, faq</p>
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The fault information for each sub-publish module. The key is the sub-publish module and the value is the fault information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;robot_ds&quot;: [
         *         &quot;{\&quot;dialogName\&quot;:\&quot;TEST\&quot;,\&quot;errorMessage\&quot;:[\&quot;<a href="mailto:medusa@invocation.error.service.offline">medusa@invocation.error.service.offline</a>@请发布对话流所引用服务后重试！\&quot;],\&quot;needRefresh\&quot;:false,\&quot;success\&quot;:false}&quot;
         *     ]
         * }</p>
         */
        public Builder errors(java.util.Map<String, ?> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8522</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The UTC time when the task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-12T06:30:33Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CBF0581-EAE7-1DC4-95C6-A089656A1E2D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8522</p>
         */
        public Builder response(String response) {
            this.response = response;
            return this;
        }

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>FE_RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The warning information for each sub-publish module. The key is the sub-publish module and the value is the warning information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;category_bind_faq&quot;: [
         *         &quot;The following categories have not been published to the production environment: Project Delivery category&quot;
         *     ]
         * }</p>
         */
        public Builder warnings(java.util.Map<String, ?> warnings) {
            this.warnings = warnings;
            return this;
        }

        public GetInstancePublishTaskStateResponseBody build() {
            return new GetInstancePublishTaskStateResponseBody(this);
        } 

    } 

}
