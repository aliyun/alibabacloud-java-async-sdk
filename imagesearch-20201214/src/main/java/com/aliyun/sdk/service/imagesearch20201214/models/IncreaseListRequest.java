// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link IncreaseListRequest} extends {@link RequestModel}
 *
 * <p>IncreaseListRequest</p>
 */
public class IncreaseListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    private IncreaseListRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.id = builder.id;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncreaseListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<IncreaseListRequest, Builder> {
        private String bucketName; 
        private Long id; 
        private String instanceName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(IncreaseListRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.id = request.id;
            this.instanceName = request.instanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.path = request.path;
        } 

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>bucketName</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The ID of the batch task.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demoinstance1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of images to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The absolute path to the increment.meta file in the bucket. The path must start with a forward slash (/) and cannot end with a forward slash (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/xxx/xxx</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public IncreaseListRequest build() {
            return new IncreaseListRequest(this);
        } 

    } 

}
