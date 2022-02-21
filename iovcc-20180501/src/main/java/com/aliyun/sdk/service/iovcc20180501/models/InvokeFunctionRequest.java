// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeFunctionRequest} extends {@link RequestModel}
 *
 * <p>InvokeFunctionRequest</p>
 */
public class InvokeFunctionRequest extends Request {
    @Query
    @NameInMap("Env")
    @Validation(required = true)
    private Integer env;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private Long fileId;

    @Query
    @NameInMap("FunctionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("Parameters")
    @Validation(required = true)
    private String parameters;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private InvokeFunctionRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
        this.fileId = builder.fileId;
        this.functionName = builder.functionName;
        this.parameters = builder.parameters;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public Integer getEnv() {
        return this.env;
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InvokeFunctionRequest, Builder> {
        private Integer env; 
        private Long fileId; 
        private String functionName; 
        private String parameters; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InvokeFunctionRequest response) {
            super(response);
            this.env = response.env;
            this.fileId = response.fileId;
            this.functionName = response.functionName;
            this.parameters = response.parameters;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * Env.
         */
        public Builder env(Integer env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InvokeFunctionRequest build() {
            return new InvokeFunctionRequest(this);
        } 

    } 

}
