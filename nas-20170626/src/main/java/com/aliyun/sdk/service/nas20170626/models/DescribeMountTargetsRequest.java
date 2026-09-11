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
 * {@link DescribeMountTargetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMountTargetsRequest</p>
 */
public class DescribeMountTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DualStackMountTargetDomain")
    private String dualStackMountTargetDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private DescribeMountTargetsRequest(Builder builder) {
        super(builder);
        this.dualStackMountTargetDomain = builder.dualStackMountTargetDomain;
        this.fileSystemId = builder.fileSystemId;
        this.mountTargetDomain = builder.mountTargetDomain;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMountTargetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dualStackMountTargetDomain
     */
    public String getDualStackMountTargetDomain() {
        return this.dualStackMountTargetDomain;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return mountTargetDomain
     */
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
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

    public static final class Builder extends Request.Builder<DescribeMountTargetsRequest, Builder> {
        private String dualStackMountTargetDomain; 
        private String fileSystemId; 
        private String mountTargetDomain; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMountTargetsRequest request) {
            super(request);
            this.dualStackMountTargetDomain = request.dualStackMountTargetDomain;
            this.fileSystemId = request.fileSystemId;
            this.mountTargetDomain = request.mountTargetDomain;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The IPv4 and IPv6 dual-stack mount target.</p>
         * <blockquote>
         * <p>Currently, only Extreme NAS in regions in the Chinese mainland supports IPv6.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1ca404****-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.putQueryParameter("DualStackMountTargetDomain", dualStackMountTargetDomain);
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>General-purpose NAS: 31a8e4\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>Extreme NAS: must start with <code>extreme-</code>, for example, extreme-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS: must start with <code>cpfs-</code>, for example, cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The mount target address.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****-x****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.putQueryParameter("MountTargetDomain", mountTargetDomain);
            this.mountTargetDomain = mountTargetDomain;
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
         * <p>The number of mount targets on each page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeMountTargetsRequest build() {
            return new DescribeMountTargetsRequest(this);
        } 

    } 

}
