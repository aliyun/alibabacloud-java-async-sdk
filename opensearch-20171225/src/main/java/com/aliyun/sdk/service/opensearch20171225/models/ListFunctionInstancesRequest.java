// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionInstancesRequest</p>
 */
public class ListFunctionInstancesRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("functionType")
    private String functionType;

    @Query
    @NameInMap("modelType")
    private String modelType;

    @Query
    @NameInMap("output")
    private String output;

    @Query
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("source")
    private String source;

    private ListFunctionInstancesRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.functionType = builder.functionType;
        this.modelType = builder.modelType;
        this.output = builder.output;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListFunctionInstancesRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private String functionType; 
        private String modelType; 
        private String output; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionInstancesRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.functionName = request.functionName;
            this.functionType = request.functionType;
            this.modelType = request.modelType;
            this.output = request.output;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.source = request.source;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The name of the feature.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The type of the feature.
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * The type of the model.
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * The richness of the returned information. Valid values:
         * <p>
         * 
         * *   normal: displays information such as createParameters and cron. This is the default value.
         * *   simple: displays only the basic information.
         * *   detail: returns the details of the training task.
         */
        public Builder output(String output) {
            this.putQueryParameter("output", output);
            this.output = output;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * How the instance is created. Valid values:
         * <p>
         * 
         * *   builtin: The instance is created by system.
         * *   user: The instance is created by user. This is the default value.
         * *   all: all instances
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListFunctionInstancesRequest build() {
            return new ListFunctionInstancesRequest(this);
        } 

    } 

}
