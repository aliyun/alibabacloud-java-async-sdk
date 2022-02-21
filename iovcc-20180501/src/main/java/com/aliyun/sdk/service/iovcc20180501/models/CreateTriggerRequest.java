// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateTriggerRequest</p>
 */
public class CreateTriggerRequest extends Request {
    @Query
    @NameInMap("FileIds")
    @Validation(required = true)
    private String fileIds;

    @Query
    @NameInMap("FunctionIds")
    @Validation(required = true)
    private String functionIds;

    @Query
    @NameInMap("InvocationMode")
    @Validation(required = true)
    private Integer invocationMode;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Production")
    private Integer production;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Sandbox")
    private Integer sandbox;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    private CreateTriggerRequest(Builder builder) {
        super(builder);
        this.fileIds = builder.fileIds;
        this.functionIds = builder.functionIds;
        this.invocationMode = builder.invocationMode;
        this.namespace = builder.namespace;
        this.production = builder.production;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.sandbox = builder.sandbox;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileIds
     */
    public String getFileIds() {
        return this.fileIds;
    }

    /**
     * @return functionIds
     */
    public String getFunctionIds() {
        return this.functionIds;
    }

    /**
     * @return invocationMode
     */
    public Integer getInvocationMode() {
        return this.invocationMode;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return production
     */
    public Integer getProduction() {
        return this.production;
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

    /**
     * @return sandbox
     */
    public Integer getSandbox() {
        return this.sandbox;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateTriggerRequest, Builder> {
        private String fileIds; 
        private String functionIds; 
        private Integer invocationMode; 
        private String namespace; 
        private Integer production; 
        private String projectId; 
        private String regionId; 
        private Integer sandbox; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateTriggerRequest response) {
            super(response);
            this.fileIds = response.fileIds;
            this.functionIds = response.functionIds;
            this.invocationMode = response.invocationMode;
            this.namespace = response.namespace;
            this.production = response.production;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.sandbox = response.sandbox;
            this.source = response.source;
        } 

        /**
         * FileIds.
         */
        public Builder fileIds(String fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * FunctionIds.
         */
        public Builder functionIds(String functionIds) {
            this.putQueryParameter("FunctionIds", functionIds);
            this.functionIds = functionIds;
            return this;
        }

        /**
         * InvocationMode.
         */
        public Builder invocationMode(Integer invocationMode) {
            this.putQueryParameter("InvocationMode", invocationMode);
            this.invocationMode = invocationMode;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Production.
         */
        public Builder production(Integer production) {
            this.putQueryParameter("Production", production);
            this.production = production;
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

        /**
         * Sandbox.
         */
        public Builder sandbox(Integer sandbox) {
            this.putQueryParameter("Sandbox", sandbox);
            this.sandbox = sandbox;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateTriggerRequest build() {
            return new CreateTriggerRequest(this);
        } 

    } 

}
