// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesRequest</p>
 */
public class ListResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("specType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specType;

    private ListResourcesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sourceType = builder.sourceType;
        this.sourceValue = builder.sourceValue;
        this.specType = builder.specType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceValue
     */
    public String getSourceValue() {
        return this.sourceValue;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    public static final class Builder extends Request.Builder<ListResourcesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sourceType; 
        private String sourceValue; 
        private String specType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sourceType = request.sourceType;
            this.sourceValue = request.sourceValue;
            this.specType = request.specType;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * sourceValue.
         */
        public Builder sourceValue(String sourceValue) {
            this.putQueryParameter("sourceValue", sourceValue);
            this.sourceValue = sourceValue;
            return this;
        }

        /**
         * specType.
         */
        public Builder specType(String specType) {
            this.putQueryParameter("specType", specType);
            this.specType = specType;
            return this;
        }

        @Override
        public ListResourcesRequest build() {
            return new ListResourcesRequest(this);
        } 

    } 

}
