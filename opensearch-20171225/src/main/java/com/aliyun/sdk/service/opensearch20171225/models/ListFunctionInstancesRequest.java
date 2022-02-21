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

        private Builder(ListFunctionInstancesRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.functionName = response.functionName;
            this.functionType = response.functionType;
            this.modelType = response.modelType;
            this.output = response.output;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.source = response.source;
        } 

        /**
         * 实例名称
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 功能名称
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * 功能类型
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * 模型类型
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * 返回信息的丰富度
         */
        public Builder output(String output) {
            this.putQueryParameter("output", output);
            this.output = output;
            return this;
        }

        /**
         * 页码
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页大小
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 实例来源
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
