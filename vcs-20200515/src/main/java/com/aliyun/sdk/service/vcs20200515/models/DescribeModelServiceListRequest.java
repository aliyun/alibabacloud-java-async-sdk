// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModelServiceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelServiceListRequest</p>
 */
public class DescribeModelServiceListRequest extends Request {
    @Body
    @NameInMap("AlgorithmCode")
    private String algorithmCode;

    @Body
    @NameInMap("IncludeDeleted")
    private Boolean includeDeleted;

    @Body
    @NameInMap("ModelServiceName")
    private String modelServiceName;

    @Body
    @NameInMap("PageNum")
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeModelServiceListRequest(Builder builder) {
        super(builder);
        this.algorithmCode = builder.algorithmCode;
        this.includeDeleted = builder.includeDeleted;
        this.modelServiceName = builder.modelServiceName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelServiceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmCode
     */
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

    /**
     * @return includeDeleted
     */
    public Boolean getIncludeDeleted() {
        return this.includeDeleted;
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
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

    public static final class Builder extends Request.Builder<DescribeModelServiceListRequest, Builder> {
        private String algorithmCode; 
        private Boolean includeDeleted; 
        private String modelServiceName; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelServiceListRequest response) {
            super(response);
            this.algorithmCode = response.algorithmCode;
            this.includeDeleted = response.includeDeleted;
            this.modelServiceName = response.modelServiceName;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
        } 

        /**
         * AlgorithmCode.
         */
        public Builder algorithmCode(String algorithmCode) {
            this.putBodyParameter("AlgorithmCode", algorithmCode);
            this.algorithmCode = algorithmCode;
            return this;
        }

        /**
         * IncludeDeleted.
         */
        public Builder includeDeleted(Boolean includeDeleted) {
            this.putBodyParameter("IncludeDeleted", includeDeleted);
            this.includeDeleted = includeDeleted;
            return this;
        }

        /**
         * ModelServiceName.
         */
        public Builder modelServiceName(String modelServiceName) {
            this.putBodyParameter("ModelServiceName", modelServiceName);
            this.modelServiceName = modelServiceName;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeModelServiceListRequest build() {
            return new DescribeModelServiceListRequest(this);
        } 

    } 

}
