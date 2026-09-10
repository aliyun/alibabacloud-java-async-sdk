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
 * {@link AddDataCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>AddDataCheckTaskRequest</p>
 */
public class AddDataCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkTemplateId")
    private String checkTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer checkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstDsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dstDsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstDsName")
    private String dstDsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstDsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dstDsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcDsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDsName")
    private String srcDsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcDsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcDsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private AddDataCheckTaskRequest(Builder builder) {
        super(builder);
        this.checkTemplateId = builder.checkTemplateId;
        this.checkType = builder.checkType;
        this.dstDsId = builder.dstDsId;
        this.dstDsName = builder.dstDsName;
        this.dstDsType = builder.dstDsType;
        this.srcDsId = builder.srcDsId;
        this.srcDsName = builder.srcDsName;
        this.srcDsType = builder.srcDsType;
        this.taskMode = builder.taskMode;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataCheckTaskRequest create() {
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
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
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
     * @return taskMode
     */
    public Integer getTaskMode() {
        return this.taskMode;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<AddDataCheckTaskRequest, Builder> {
        private String checkTemplateId; 
        private Integer checkType; 
        private String dstDsId; 
        private String dstDsName; 
        private String dstDsType; 
        private String srcDsId; 
        private String srcDsName; 
        private String srcDsType; 
        private Integer taskMode; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(AddDataCheckTaskRequest request) {
            super(request);
            this.checkTemplateId = request.checkTemplateId;
            this.checkType = request.checkType;
            this.dstDsId = request.dstDsId;
            this.dstDsName = request.dstDsName;
            this.dstDsType = request.dstDsType;
            this.srcDsId = request.srcDsId;
            this.srcDsName = request.srcDsName;
            this.srcDsType = request.srcDsType;
            this.taskMode = request.taskMode;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The validation template ID. If not specified, the built-in default template is used.</p>
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
         * <p>The validation type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder checkType(Integer checkType) {
            this.putBodyParameter("checkType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The ID of the destination data source.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The ID of the source data source.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The table detail creation mode. Valid values:</p>
         * <ul>
         * <li>0: table-by-table fine-grained creation.</li>
         * <li>1: batch creation with the same schema.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder taskMode(Integer taskMode) {
            this.putBodyParameter("taskMode", taskMode);
            this.taskMode = taskMode;
            return this;
        }

        /**
         * <p>The task name. Only Chinese characters, English characters, and digits are supported.</p>
         * <p>This parameter is required.</p>
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
        public AddDataCheckTaskRequest build() {
            return new AddDataCheckTaskRequest(this);
        } 

    } 

}
