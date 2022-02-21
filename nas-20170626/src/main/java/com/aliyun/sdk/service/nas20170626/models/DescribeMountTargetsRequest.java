// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMountTargetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMountTargetsRequest</p>
 */
public class DescribeMountTargetsRequest extends Request {
    @Query
    @NameInMap("DualStackMountTargetDomain")
    private String dualStackMountTargetDomain;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
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

        private Builder(DescribeMountTargetsRequest response) {
            super(response);
            this.dualStackMountTargetDomain = response.dualStackMountTargetDomain;
            this.fileSystemId = response.fileSystemId;
            this.mountTargetDomain = response.mountTargetDomain;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * DualStackMountTargetDomain.
         */
        public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
            this.putQueryParameter("DualStackMountTargetDomain", dualStackMountTargetDomain);
            this.dualStackMountTargetDomain = dualStackMountTargetDomain;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * MountTargetDomain.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.putQueryParameter("MountTargetDomain", mountTargetDomain);
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
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
