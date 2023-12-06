// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductInstanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListProductInstanceConfigsRequest</p>
 */
public class ListProductInstanceConfigsRequest extends Request {
    @Query
    @NameInMap("componentReleaseName")
    private String componentReleaseName;

    @Query
    @NameInMap("environmentUID")
    @Validation(required = true)
    private String environmentUID;

    @Query
    @NameInMap("fuzzy")
    private String fuzzy;

    @Query
    @NameInMap("pageNum")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("paramType")
    @Validation(required = true)
    private String paramType;

    @Query
    @NameInMap("parameter")
    private String parameter;

    @Query
    @NameInMap("productVersionUID")
    @Validation(required = true)
    private String productVersionUID;

    private ListProductInstanceConfigsRequest(Builder builder) {
        super(builder);
        this.componentReleaseName = builder.componentReleaseName;
        this.environmentUID = builder.environmentUID;
        this.fuzzy = builder.fuzzy;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.paramType = builder.paramType;
        this.parameter = builder.parameter;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductInstanceConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentReleaseName
     */
    public String getComponentReleaseName() {
        return this.componentReleaseName;
    }

    /**
     * @return environmentUID
     */
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    /**
     * @return fuzzy
     */
    public String getFuzzy() {
        return this.fuzzy;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return parameter
     */
    public String getParameter() {
        return this.parameter;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<ListProductInstanceConfigsRequest, Builder> {
        private String componentReleaseName; 
        private String environmentUID; 
        private String fuzzy; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String paramType; 
        private String parameter; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(ListProductInstanceConfigsRequest request) {
            super(request);
            this.componentReleaseName = request.componentReleaseName;
            this.environmentUID = request.environmentUID;
            this.fuzzy = request.fuzzy;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.paramType = request.paramType;
            this.parameter = request.parameter;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * componentReleaseName.
         */
        public Builder componentReleaseName(String componentReleaseName) {
            this.putQueryParameter("componentReleaseName", componentReleaseName);
            this.componentReleaseName = componentReleaseName;
            return this;
        }

        /**
         * environmentUID.
         */
        public Builder environmentUID(String environmentUID) {
            this.putQueryParameter("environmentUID", environmentUID);
            this.environmentUID = environmentUID;
            return this;
        }

        /**
         * fuzzy.
         */
        public Builder fuzzy(String fuzzy) {
            this.putQueryParameter("fuzzy", fuzzy);
            this.fuzzy = fuzzy;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * paramType.
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("paramType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * parameter.
         */
        public Builder parameter(String parameter) {
            this.putQueryParameter("parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public ListProductInstanceConfigsRequest build() {
            return new ListProductInstanceConfigsRequest(this);
        } 

    } 

}
