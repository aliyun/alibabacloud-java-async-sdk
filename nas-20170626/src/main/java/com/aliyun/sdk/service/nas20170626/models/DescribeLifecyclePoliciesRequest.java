// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeLifecyclePoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeLifecyclePoliciesRequest</p>
 */
public class DescribeLifecyclePoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyId")
    private String lifecyclePolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyName")
    private String lifecyclePolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicyType")
    private String lifecyclePolicyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private DescribeLifecyclePoliciesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.lifecyclePolicyId = builder.lifecyclePolicyId;
        this.lifecyclePolicyName = builder.lifecyclePolicyName;
        this.lifecyclePolicyType = builder.lifecyclePolicyType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLifecyclePoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return lifecyclePolicyId
     */
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
    }

    /**
     * @return lifecyclePolicyName
     */
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

    /**
     * @return lifecyclePolicyType
     */
    public String getLifecyclePolicyType() {
        return this.lifecyclePolicyType;
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

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<DescribeLifecyclePoliciesRequest, Builder> {
        private String description; 
        private String fileSystemId; 
        private String lifecyclePolicyId; 
        private String lifecyclePolicyName; 
        private String lifecyclePolicyType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String path; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLifecyclePoliciesRequest request) {
            super(request);
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.lifecyclePolicyId = request.lifecyclePolicyId;
            this.lifecyclePolicyName = request.lifecyclePolicyName;
            this.lifecyclePolicyType = request.lifecyclePolicyType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.storageType = request.storageType;
        } 

        /**
         * <p>The description of the policy.</p>
         * <blockquote>
         * <p>Only CPFS for Lingjun supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The ID of the lifecycle policy.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-xxx</p>
         */
        public Builder lifecyclePolicyId(String lifecyclePolicyId) {
            this.putQueryParameter("LifecyclePolicyId", lifecyclePolicyId);
            this.lifecyclePolicyId = lifecyclePolicyId;
            return this;
        }

        /**
         * <p>The lifecycle policy name. Naming rules:</p>
         * <p>The name must be 3 to 64 characters in length, must start with a letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
         * <blockquote>
         * <p>Optional for General-purpose NAS file systems. If specified, this parameter takes precedence. If not specified, LifecyclePolicyId is used instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lifecyclepolicy_01</p>
         */
        public Builder lifecyclePolicyName(String lifecyclePolicyName) {
            this.putQueryParameter("LifecyclePolicyName", lifecyclePolicyName);
            this.lifecyclePolicyName = lifecyclePolicyName;
            return this;
        }

        /**
         * <p>The policy type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Auto: Automatic execution.</li>
         * <li>OnDemand: On-demand execution.<blockquote>
         * <p>Only CPFS for Lingjun supports this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder lifecyclePolicyType(String lifecyclePolicyType) {
            this.putQueryParameter("LifecyclePolicyType", lifecyclePolicyType);
            this.lifecyclePolicyType = lifecyclePolicyType;
            return this;
        }

        /**
         * <p>The page number of the list.</p>
         * <p>Start value (default value): 1.</p>
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
         * <p>The number of lifecycle management policies on each page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
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
         * <p>Filters results by path.</p>
         * <blockquote>
         * <p>Only CPFS for Lingjun supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/abc/</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>InfrequentAccess: IA storage class.</li>
         * <li>Archive: Archive storage class.<blockquote>
         * <p>If StorageType is not specified, all lifecycle policies are returned.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public DescribeLifecyclePoliciesRequest build() {
            return new DescribeLifecyclePoliciesRequest(this);
        } 

    } 

}
