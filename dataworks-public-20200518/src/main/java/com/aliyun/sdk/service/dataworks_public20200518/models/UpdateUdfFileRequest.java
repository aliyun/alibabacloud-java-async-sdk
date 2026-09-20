// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link UpdateUdfFileRequest} extends {@link RequestModel}
 *
 * <p>UpdateUdfFileRequest</p>
 */
public class UpdateUdfFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClassName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String className;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CmdDescription")
    private String cmdDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Example")
    private String example;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileFolderPath")
    private String fileFolderPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FunctionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParameterDescription")
    private String parameterDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReturnValue")
    private String returnValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UdfDescription")
    private String udfDescription;

    private UpdateUdfFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.className = builder.className;
        this.cmdDescription = builder.cmdDescription;
        this.example = builder.example;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileId = builder.fileId;
        this.functionType = builder.functionType;
        this.parameterDescription = builder.parameterDescription;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.resources = builder.resources;
        this.returnValue = builder.returnValue;
        this.udfDescription = builder.udfDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUdfFileRequest create() {
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
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return cmdDescription
     */
    public String getCmdDescription() {
        return this.cmdDescription;
    }

    /**
     * @return example
     */
    public String getExample() {
        return this.example;
    }

    /**
     * @return fileFolderPath
     */
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return parameterDescription
     */
    public String getParameterDescription() {
        return this.parameterDescription;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return returnValue
     */
    public String getReturnValue() {
        return this.returnValue;
    }

    /**
     * @return udfDescription
     */
    public String getUdfDescription() {
        return this.udfDescription;
    }

    public static final class Builder extends Request.Builder<UpdateUdfFileRequest, Builder> {
        private String regionId; 
        private String className; 
        private String cmdDescription; 
        private String example; 
        private String fileFolderPath; 
        private String fileId; 
        private String functionType; 
        private String parameterDescription; 
        private Long projectId; 
        private String projectIdentifier; 
        private String resources; 
        private String returnValue; 
        private String udfDescription; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUdfFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.className = request.className;
            this.cmdDescription = request.cmdDescription;
            this.example = request.example;
            this.fileFolderPath = request.fileFolderPath;
            this.fileId = request.fileId;
            this.functionType = request.functionType;
            this.parameterDescription = request.parameterDescription;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.resources = request.resources;
            this.returnValue = request.returnValue;
            this.udfDescription = request.udfDescription;
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
         * <p>The name of the class where the function is defined, which corresponds to the Class Name field in the Create Function form.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.DataWorks.api.udf.StringConcat</p>
         */
        public Builder className(String className) {
            this.putBodyParameter("ClassName", className);
            this.className = className;
            return this;
        }

        /**
         * <p>The command format for calling the function, which corresponds to the Command Format field in the Create Function form.</p>
         * 
         * <strong>example:</strong>
         * <p>StringConcat(String... substrs)</p>
         */
        public Builder cmdDescription(String cmdDescription) {
            this.putBodyParameter("CmdDescription", cmdDescription);
            this.cmdDescription = cmdDescription;
            return this;
        }

        /**
         * <p>The example of calling the function, which corresponds to the Example field in the Create Function form.</p>
         * 
         * <strong>example:</strong>
         * <p>StringConcat(\&quot;a\&quot;, \&quot;b\&quot;, \&quot;c\&quot;)</p>
         */
        public Builder example(String example) {
            this.putBodyParameter("Example", example);
            this.example = example;
            return this;
        }

        /**
         * <p>The path of the folder where the function file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>Business_process/First_Business_Process/function/string_processing_function</p>
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * <p>The ID of the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000112</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The categorization of the function, which corresponds to the udf type field in the Create Function form. Valid values:</p>
         * <ul>
         * <li>MATH: mathematical operation function.</li>
         * <li>AGGREGATE: aggregate functions.</li>
         * <li>STRING: character string processing function.</li>
         * <li>DATE: date processing function.</li>
         * <li>ANALYTIC: window function.</li>
         * <li>OTHER: other function.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        public Builder functionType(String functionType) {
            this.putBodyParameter("FunctionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * <p>The description of the function input parameters, which corresponds to the metric description field in the Create Function form.</p>
         * 
         * <strong>example:</strong>
         * <p>List of strings to be connected</p>
         */
        public Builder parameterDescription(String parameterDescription) {
            this.putBodyParameter("ParameterDescription", parameterDescription);
            this.parameterDescription = parameterDescription;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can click the small wrench icon in the upper-right corner of the page to go to the storage management page and view the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The unique identifier of the DataWorks workspace, which is the English identifier displayed in the workspace switcher at the top of the DataStudio page.</p>
         * <p>You must specify either this parameter or the ProjectId parameter to determine the DataWorks workspace for this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project</p>
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>The list of resource names referenced by the function, separated by commas (,). This corresponds to the resources field in the Create Function form.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string-concat-1.0.0.jar,commons-lang-2.6.jar</p>
         */
        public Builder resources(String resources) {
            this.putBodyParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The description of the function return value, which corresponds to the Return Value field in the Create Function form.</p>
         * 
         * <strong>example:</strong>
         * <p>New strings generated by concatenating all strings before and after the input order</p>
         */
        public Builder returnValue(String returnValue) {
            this.putBodyParameter("ReturnValue", returnValue);
            this.returnValue = returnValue;
            return this;
        }

        /**
         * <p>The description of the function purpose, which corresponds to the Description field in the Create Function form.</p>
         * 
         * <strong>example:</strong>
         * <p>Concatenate several strings to generate a new string</p>
         */
        public Builder udfDescription(String udfDescription) {
            this.putBodyParameter("UdfDescription", udfDescription);
            this.udfDescription = udfDescription;
            return this;
        }

        @Override
        public UpdateUdfFileRequest build() {
            return new UpdateUdfFileRequest(this);
        } 

    } 

}
