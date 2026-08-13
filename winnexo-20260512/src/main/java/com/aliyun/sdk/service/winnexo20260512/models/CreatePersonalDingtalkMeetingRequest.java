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
 * {@link CreatePersonalDingtalkMeetingRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalDingtalkMeetingRequest</p>
 */
public class CreatePersonalDingtalkMeetingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notes")
    private String notes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roomCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roomCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreatePersonalDingtalkMeetingRequest(Builder builder) {
        super(builder);
        this.credentialId = builder.credentialId;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.name = builder.name;
        this.notes = builder.notes;
        this.operatingObjectName = builder.operatingObjectName;
        this.roomCode = builder.roomCode;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalDingtalkMeetingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return roomCode
     */
    public String getRoomCode() {
        return this.roomCode;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreatePersonalDingtalkMeetingRequest, Builder> {
        private String credentialId; 
        private String description; 
        private String directoryId; 
        private String name; 
        private String notes; 
        private String operatingObjectName; 
        private String roomCode; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalDingtalkMeetingRequest request) {
            super(request);
            this.credentialId = request.credentialId;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.name = request.name;
            this.notes = request.notes;
            this.operatingObjectName = request.operatingObjectName;
            this.roomCode = request.roomCode;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>凭证 ID（不传则使用系统默认配置）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCredentialId</p>
         */
        public Builder credentialId(String credentialId) {
            this.putBodyParameter("credentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>资源描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>Watchlist Monitor Layer</p>
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
         * <p>资源显示名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-default-007735a2-58f5-47a5-9e37-ea3fd64e0899</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>会议笔记内容（可选），会参与辅助分析</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
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
         * <p>钉钉会议号（必填）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>356 776 973</p>
         */
        public Builder roomCode(String roomCode) {
            this.putBodyParameter("roomCode", roomCode);
            this.roomCode = roomCode;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>520539530998273</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePersonalDingtalkMeetingRequest build() {
            return new CreatePersonalDingtalkMeetingRequest(this);
        } 

    } 

}
