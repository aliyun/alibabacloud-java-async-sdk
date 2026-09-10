// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the resource source. Valid values:</p>
         * <ul>
         * <li><p>ExportTaskId: resource export ID</p>
         * </li>
         * <li><p>TaskId: Module execution task ID</p>
         * </li>
         * <li><p>StatePath: the OSS path where the resource state is stored.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskId</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The specific value of the resource source.</p>
         * <ul>
         * <li><p>If sourceType is set to ExportTaskId, the format is ExportTaskId:Version.</p>
         * </li>
         * <li><p>If sourceType is set to TaskId, the format is TaskId.</p>
         * </li>
         * <li><p>If sourceType is set to StatePath, the format is the download URL of the State file.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-235436dsfdgd</p>
         */
        public Builder sourceValue(String sourceValue) {
            this.putQueryParameter("sourceValue", sourceValue);
            this.sourceValue = sourceValue;
            return this;
        }

        /**
         * <p>The specification that resource properties follow in the response. Valid values: CloudSpec, Terraform.
         * Default value: CloudSpec.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudSpec</p>
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
