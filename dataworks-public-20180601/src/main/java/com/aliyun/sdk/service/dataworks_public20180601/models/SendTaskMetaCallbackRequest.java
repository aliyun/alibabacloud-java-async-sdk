// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link SendTaskMetaCallbackRequest} extends {@link RequestModel}
 *
 * <p>SendTaskMetaCallbackRequest</p>
 */
public class SendTaskMetaCallbackRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<String> resources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskEnvParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskEnvParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private SendTaskMetaCallbackRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
        this.connectionInfo = builder.connectionInfo;
        this.endTime = builder.endTime;
        this.resources = builder.resources;
        this.startTime = builder.startTime;
        this.subType = builder.subType;
        this.taskEnvParam = builder.taskEnvParam;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTaskMetaCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return connectionInfo
     */
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return resources
     */
    public java.util.List<String> getResources() {
        return this.resources;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return taskEnvParam
     */
    public String getTaskEnvParam() {
        return this.taskEnvParam;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<SendTaskMetaCallbackRequest, Builder> {
        private String regionId; 
        private String code; 
        private String connectionInfo; 
        private Long endTime; 
        private java.util.List<String> resources; 
        private Long startTime; 
        private String subType; 
        private String taskEnvParam; 
        private Long tenantId; 
        private String type; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(SendTaskMetaCallbackRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
            this.connectionInfo = request.connectionInfo;
            this.endTime = request.endTime;
            this.resources = request.resources;
            this.startTime = request.startTime;
            this.subType = request.subType;
            this.taskEnvParam = request.taskEnvParam;
            this.tenantId = request.tenantId;
            this.type = request.type;
            this.user = request.user;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder connectionInfo(String connectionInfo) {
            this.putBodyParameter("ConnectionInfo", connectionInfo);
            this.connectionInfo = connectionInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List<String> resources) {
            this.putBodyParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subType(String subType) {
            this.putBodyParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskEnvParam(String taskEnvParam) {
            this.putBodyParameter("TaskEnvParam", taskEnvParam);
            this.taskEnvParam = taskEnvParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * User.
         */
        public Builder user(String user) {
            this.putBodyParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public SendTaskMetaCallbackRequest build() {
            return new SendTaskMetaCallbackRequest(this);
        } 

    } 

}
