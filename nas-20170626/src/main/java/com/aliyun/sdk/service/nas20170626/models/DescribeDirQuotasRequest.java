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
 * {@link DescribeDirQuotasRequest} extends {@link RequestModel}
 *
 * <p>DescribeDirQuotasRequest</p>
 */
public class DescribeDirQuotasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

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

    private DescribeDirQuotasRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirQuotasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
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

    public static final class Builder extends Request.Builder<DescribeDirQuotasRequest, Builder> {
        private String fileSystemId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDirQuotasRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.path = request.path;
        } 

        /**
         * <p>The ID of the file system.</p>
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
         * <p>The page number.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10.</p>
         * <p>Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The absolute path of a directory.</p>
         * <p>If you do not specify this parameter, all directories for which quotas are created are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/sub1</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public DescribeDirQuotasRequest build() {
            return new DescribeDirQuotasRequest(this);
        } 

    } 

}
