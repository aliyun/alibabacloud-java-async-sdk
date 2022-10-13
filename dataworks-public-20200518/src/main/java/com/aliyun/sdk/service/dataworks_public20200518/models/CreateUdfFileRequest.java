// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUdfFileRequest} extends {@link RequestModel}
 *
 * <p>CreateUdfFileRequest</p>
 */
public class CreateUdfFileRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ClassName")
    @Validation(required = true)
    private String className;

    @Body
    @NameInMap("CmdDescription")
    private String cmdDescription;

    @Body
    @NameInMap("Example")
    private String example;

    @Body
    @NameInMap("FileFolderPath")
    private String fileFolderPath;

    @Body
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Body
    @NameInMap("FunctionType")
    @Validation(required = true)
    private String functionType;

    @Body
    @NameInMap("ParameterDescription")
    private String parameterDescription;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Body
    @NameInMap("Resources")
    @Validation(required = true)
    private String resources;

    @Body
    @NameInMap("ReturnValue")
    private String returnValue;

    @Body
    @NameInMap("UdfDescription")
    private String udfDescription;

    private CreateUdfFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.className = builder.className;
        this.cmdDescription = builder.cmdDescription;
        this.example = builder.example;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileName = builder.fileName;
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

    public static CreateUdfFileRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
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

    public static final class Builder extends Request.Builder<CreateUdfFileRequest, Builder> {
        private String regionId; 
        private String className; 
        private String cmdDescription; 
        private String example; 
        private String fileFolderPath; 
        private String fileName; 
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

        private Builder(CreateUdfFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.className = request.className;
            this.cmdDescription = request.cmdDescription;
            this.example = request.example;
            this.fileFolderPath = request.fileFolderPath;
            this.fileName = request.fileName;
            this.functionType = request.functionType;
            this.parameterDescription = request.parameterDescription;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.resources = request.resources;
            this.returnValue = request.returnValue;
            this.udfDescription = request.udfDescription;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClassName.
         */
        public Builder className(String className) {
            this.putBodyParameter("ClassName", className);
            this.className = className;
            return this;
        }

        /**
         * CmdDescription.
         */
        public Builder cmdDescription(String cmdDescription) {
            this.putBodyParameter("CmdDescription", cmdDescription);
            this.cmdDescription = cmdDescription;
            return this;
        }

        /**
         * Example.
         */
        public Builder example(String example) {
            this.putBodyParameter("Example", example);
            this.example = example;
            return this;
        }

        /**
         * FileFolderPath.
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FunctionType.
         */
        public Builder functionType(String functionType) {
            this.putBodyParameter("FunctionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * ParameterDescription.
         */
        public Builder parameterDescription(String parameterDescription) {
            this.putBodyParameter("ParameterDescription", parameterDescription);
            this.parameterDescription = parameterDescription;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectIdentifier.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(String resources) {
            this.putBodyParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * ReturnValue.
         */
        public Builder returnValue(String returnValue) {
            this.putBodyParameter("ReturnValue", returnValue);
            this.returnValue = returnValue;
            return this;
        }

        /**
         * UdfDescription.
         */
        public Builder udfDescription(String udfDescription) {
            this.putBodyParameter("UdfDescription", udfDescription);
            this.udfDescription = udfDescription;
            return this;
        }

        @Override
        public CreateUdfFileRequest build() {
            return new CreateUdfFileRequest(this);
        } 

    } 

}
