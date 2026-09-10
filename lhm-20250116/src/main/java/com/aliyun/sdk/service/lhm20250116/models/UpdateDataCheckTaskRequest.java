// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link UpdateDataCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataCheckTaskRequest</p>
 */
public class UpdateDataCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkTemplateId")
    private String checkTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstDsId")
    private String dstDsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstDsName")
    private String dstDsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstDsType")
    private String dstDsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstEngineId")
    private String dstEngineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstEngineName")
    private String dstEngineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstEngineType")
    private String dstEngineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDsId")
    private String srcDsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDsName")
    private String srcDsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDsType")
    private String srcDsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcEngineId")
    private String srcEngineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcEngineName")
    private String srcEngineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcEngineType")
    private String srcEngineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private UpdateDataCheckTaskRequest(Builder builder) {
        super(builder);
        this.checkTemplateId = builder.checkTemplateId;
        this.dstDsId = builder.dstDsId;
        this.dstDsName = builder.dstDsName;
        this.dstDsType = builder.dstDsType;
        this.dstEngineId = builder.dstEngineId;
        this.dstEngineName = builder.dstEngineName;
        this.dstEngineType = builder.dstEngineType;
        this.id = builder.id;
        this.srcDsId = builder.srcDsId;
        this.srcDsName = builder.srcDsName;
        this.srcDsType = builder.srcDsType;
        this.srcEngineId = builder.srcEngineId;
        this.srcEngineName = builder.srcEngineName;
        this.srcEngineType = builder.srcEngineType;
        this.taskDescription = builder.taskDescription;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataCheckTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkTemplateId
     */
    public String getCheckTemplateId() {
        return this.checkTemplateId;
    }

    /**
     * @return dstDsId
     */
    public String getDstDsId() {
        return this.dstDsId;
    }

    /**
     * @return dstDsName
     */
    public String getDstDsName() {
        return this.dstDsName;
    }

    /**
     * @return dstDsType
     */
    public String getDstDsType() {
        return this.dstDsType;
    }

    /**
     * @return dstEngineId
     */
    public String getDstEngineId() {
        return this.dstEngineId;
    }

    /**
     * @return dstEngineName
     */
    public String getDstEngineName() {
        return this.dstEngineName;
    }

    /**
     * @return dstEngineType
     */
    public String getDstEngineType() {
        return this.dstEngineType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return srcDsId
     */
    public String getSrcDsId() {
        return this.srcDsId;
    }

    /**
     * @return srcDsName
     */
    public String getSrcDsName() {
        return this.srcDsName;
    }

    /**
     * @return srcDsType
     */
    public String getSrcDsType() {
        return this.srcDsType;
    }

    /**
     * @return srcEngineId
     */
    public String getSrcEngineId() {
        return this.srcEngineId;
    }

    /**
     * @return srcEngineName
     */
    public String getSrcEngineName() {
        return this.srcEngineName;
    }

    /**
     * @return srcEngineType
     */
    public String getSrcEngineType() {
        return this.srcEngineType;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateDataCheckTaskRequest, Builder> {
        private String checkTemplateId; 
        private String dstDsId; 
        private String dstDsName; 
        private String dstDsType; 
        private String dstEngineId; 
        private String dstEngineName; 
        private String dstEngineType; 
        private Long id; 
        private String srcDsId; 
        private String srcDsName; 
        private String srcDsType; 
        private String srcEngineId; 
        private String srcEngineName; 
        private String srcEngineType; 
        private String taskDescription; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataCheckTaskRequest request) {
            super(request);
            this.checkTemplateId = request.checkTemplateId;
            this.dstDsId = request.dstDsId;
            this.dstDsName = request.dstDsName;
            this.dstDsType = request.dstDsType;
            this.dstEngineId = request.dstEngineId;
            this.dstEngineName = request.dstEngineName;
            this.dstEngineType = request.dstEngineType;
            this.id = request.id;
            this.srcDsId = request.srcDsId;
            this.srcDsName = request.srcDsName;
            this.srcDsType = request.srcDsType;
            this.srcEngineId = request.srcEngineId;
            this.srcEngineName = request.srcEngineName;
            this.srcEngineType = request.srcEngineType;
            this.taskDescription = request.taskDescription;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The ID of the validation template. If this field is not specified, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder checkTemplateId(String checkTemplateId) {
            this.putBodyParameter("checkTemplateId", checkTemplateId);
            this.checkTemplateId = checkTemplateId;
            return this;
        }

        /**
         * <p>The ID of the destination data source.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        public Builder dstDsId(String dstDsId) {
            this.putBodyParameter("dstDsId", dstDsId);
            this.dstDsId = dstDsId;
            return this;
        }

        /**
         * <p>The name of the destination data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        public Builder dstDsName(String dstDsName) {
            this.putBodyParameter("dstDsName", dstDsName);
            this.dstDsName = dstDsName;
            return this;
        }

        /**
         * <p>The type of the destination data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        public Builder dstDsType(String dstDsType) {
            this.putBodyParameter("dstDsType", dstDsType);
            this.dstDsType = dstDsType;
            return this;
        }

        /**
         * <p>The ID of the destination validation engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        public Builder dstEngineId(String dstEngineId) {
            this.putBodyParameter("dstEngineId", dstEngineId);
            this.dstEngineId = dstEngineId;
            return this;
        }

        /**
         * <p>The name of the destination validation engine.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_demo</p>
         */
        public Builder dstEngineName(String dstEngineName) {
            this.putBodyParameter("dstEngineName", dstEngineName);
            this.dstEngineName = dstEngineName;
            return this;
        }

        /**
         * <p>The type of the destination validation engine.</p>
         * 
         * <strong>example:</strong>
         * <p>Tez</p>
         */
        public Builder dstEngineType(String dstEngineType) {
            this.putBodyParameter("dstEngineType", dstEngineType);
            this.dstEngineType = dstEngineType;
            return this;
        }

        /**
         * <p>The ID of the task to modify. This field is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the source data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder srcDsId(String srcDsId) {
            this.putBodyParameter("srcDsId", srcDsId);
            this.srcDsId = srcDsId;
            return this;
        }

        /**
         * <p>The name of the source data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        public Builder srcDsName(String srcDsName) {
            this.putBodyParameter("srcDsName", srcDsName);
            this.srcDsName = srcDsName;
            return this;
        }

        /**
         * <p>The type of the source data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        public Builder srcDsType(String srcDsType) {
            this.putBodyParameter("srcDsType", srcDsType);
            this.srcDsType = srcDsType;
            return this;
        }

        /**
         * <p>The ID of the source validation engine.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder srcEngineId(String srcEngineId) {
            this.putBodyParameter("srcEngineId", srcEngineId);
            this.srcEngineId = srcEngineId;
            return this;
        }

        /**
         * <p>The name of the source validation engine.</p>
         * 
         * <strong>example:</strong>
         * <p>engine_demo</p>
         */
        public Builder srcEngineName(String srcEngineName) {
            this.putBodyParameter("srcEngineName", srcEngineName);
            this.srcEngineName = srcEngineName;
            return this;
        }

        /**
         * <p>The type of the source validation engine.</p>
         * 
         * <strong>example:</strong>
         * <p>Tez</p>
         */
        public Builder srcEngineType(String srcEngineType) {
            this.putBodyParameter("srcEngineType", srcEngineType);
            this.srcEngineType = srcEngineType;
            return this;
        }

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Data validation task description</p>
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("taskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        /**
         * <p>The name of the task. Only Chinese characters, English letters, and digits are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>data_check_task_demo</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public UpdateDataCheckTaskRequest build() {
            return new UpdateDataCheckTaskRequest(this);
        } 

    } 

}
