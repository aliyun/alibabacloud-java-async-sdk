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
 * {@link CreatePersonalVoiceMeetingRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalVoiceMeetingRequest</p>
 */
public class CreatePersonalVoiceMeetingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreatePersonalVoiceMeetingRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.fileUrl = builder.fileUrl;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalVoiceMeetingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreatePersonalVoiceMeetingRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String fileUrl; 
        private String name; 
        private String operatingObjectName; 
        private String requestId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalVoiceMeetingRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.fileUrl = request.fileUrl;
            this.name = request.name;
            this.operatingObjectName = request.operatingObjectName;
            this.requestId = request.requestId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>资源描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>update-JNQ9csEc6ArPPSXANH7O</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目标个人目录 ID；不传时自动绑定到当前数字员工默认根目录，传入时必须是当前用户在当前数字员工下的已有个人目录</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>离线会议音频文件 URL（必填）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://emas-devops-cdn.aliyuncs.com/job/PJ859733644657824768/apk/release/com.czmp.vitanexusoff_release_v331.178.14-signed.apk">https://emas-devops-cdn.aliyuncs.com/job/PJ859733644657824768/apk/release/com.czmp.vitanexusoff_release_v331.178.14-signed.apk</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("fileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>资源显示名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-toolset-2a1461ff-59c1-4baa-9e19-966ec7c00004</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>数字员工名称（已废弃：不再作为个人资源隔离条件，仅保留用于来源追溯）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0B6F0F99-EB17-51D5-AAC8-AD78A26E18DD</p>
         */
        public Builder requestId(String requestId) {
            this.putHeaderParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>474379246158592</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePersonalVoiceMeetingRequest build() {
            return new CreatePersonalVoiceMeetingRequest(this);
        } 

    } 

}
