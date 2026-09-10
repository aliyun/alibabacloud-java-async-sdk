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
 * {@link GetDataCheckTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCheckTemplateListResponseBody</p>
 */
public class GetDataCheckTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetDataCheckTemplateListResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckTemplateListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataCheckTemplateListResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data list returned by the operation. For the structure of each element, see the child field descriptions.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call failed. Check errCode and errMessage for details.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCheckTemplateListResponseBody build() {
            return new GetDataCheckTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCheckTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCheckTemplateListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("checkTypeExport")
        private String checkTypeExport;

        @com.aliyun.core.annotation.NameInMap("checkTypeName")
        private Integer checkTypeName;

        @com.aliyun.core.annotation.NameInMap("dsTypes")
        private String dsTypes;

        @com.aliyun.core.annotation.NameInMap("engineTypes")
        private String engineTypes;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("isBuiltin")
        private Integer isBuiltin;

        @com.aliyun.core.annotation.NameInMap("isUsedByTask")
        private Boolean isUsedByTask;

        @com.aliyun.core.annotation.NameInMap("templateDesc")
        private String templateDesc;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        private Data(Builder builder) {
            this.checkType = builder.checkType;
            this.checkTypeExport = builder.checkTypeExport;
            this.checkTypeName = builder.checkTypeName;
            this.dsTypes = builder.dsTypes;
            this.engineTypes = builder.engineTypes;
            this.gmtModified = builder.gmtModified;
            this.isBuiltin = builder.isBuiltin;
            this.isUsedByTask = builder.isUsedByTask;
            this.templateDesc = builder.templateDesc;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return checkTypeExport
         */
        public String getCheckTypeExport() {
            return this.checkTypeExport;
        }

        /**
         * @return checkTypeName
         */
        public Integer getCheckTypeName() {
            return this.checkTypeName;
        }

        /**
         * @return dsTypes
         */
        public String getDsTypes() {
            return this.dsTypes;
        }

        /**
         * @return engineTypes
         */
        public String getEngineTypes() {
            return this.engineTypes;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isBuiltin
         */
        public Integer getIsBuiltin() {
            return this.isBuiltin;
        }

        /**
         * @return isUsedByTask
         */
        public Boolean getIsUsedByTask() {
            return this.isUsedByTask;
        }

        /**
         * @return templateDesc
         */
        public String getTemplateDesc() {
            return this.templateDesc;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private Integer checkType; 
            private String checkTypeExport; 
            private Integer checkTypeName; 
            private String dsTypes; 
            private String engineTypes; 
            private String gmtModified; 
            private Integer isBuiltin; 
            private Boolean isUsedByTask; 
            private String templateDesc; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkType = model.checkType;
                this.checkTypeExport = model.checkTypeExport;
                this.checkTypeName = model.checkTypeName;
                this.dsTypes = model.dsTypes;
                this.engineTypes = model.engineTypes;
                this.gmtModified = model.gmtModified;
                this.isBuiltin = model.isBuiltin;
                this.isUsedByTask = model.isUsedByTask;
                this.templateDesc = model.templateDesc;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The validation rule type. Valid values:</p>
             * <ul>
             * <li>0: data volume comparison.</li>
             * <li>1: metric comparison.</li>
             * <li>2: weak content comparison.</li>
             * <li>3: custom comparison.</li>
             * <li>4: full-text comparison.</li>
             * <li>5: null rate comparison.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The display name of the check type, used in exported reports.</p>
             * 
             * <strong>example:</strong>
             * <p>Metric Comparison</p>
             */
            public Builder checkTypeExport(String checkTypeExport) {
                this.checkTypeExport = checkTypeExport;
                return this;
            }

            /**
             * <p>The name of the check type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkTypeName(Integer checkTypeName) {
                this.checkTypeName = checkTypeName;
                return this;
            }

            /**
             * <p>The list of covered data source types. Multiple values are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>Hive,MaxCompute</p>
             */
            public Builder dsTypes(String dsTypes) {
                this.dsTypes = dsTypes;
                return this;
            }

            /**
             * <p>The list of covered validation engine types, such as Tez and MapReduce. When returned as a string, multiple values are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>Tez,MapReduce</p>
             */
            public Builder engineTypes(String engineTypes) {
                this.engineTypes = engineTypes;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Specifies whether the template is built-in. Valid values:</p>
             * <ul>
             * <li>0: No. The template is a custom template.</li>
             * <li>1: Yes. The template is a built-in template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isBuiltin(Integer isBuiltin) {
                this.isBuiltin = isBuiltin;
                return this;
            }

            /**
             * <p>Indicates whether the template is referenced by a validation task. Valid values:</p>
             * <ul>
             * <li>true: The template is referenced.</li>
             * <li>false: The template is not referenced.
             * The delete operation does not verify this reference relationship. Confirm before deleting.</li>
             * </ul>
             */
            public Builder isUsedByTask(Boolean isUsedByTask) {
                this.isUsedByTask = isUsedByTask;
                return this;
            }

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description of the data volume validation template</p>
             */
            public Builder templateDesc(String templateDesc) {
                this.templateDesc = templateDesc;
                return this;
            }

            /**
             * <p>The validation template ID (logical foreign key) that uniquely identifies a validation template.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the validation template.</p>
             * 
             * <strong>example:</strong>
             * <p>DataVolumeValidationTemplate</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
