// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNfsAclRequest} extends {@link RequestModel}
 *
 * <p>DescribeNfsAclRequest</p>
 */
public class DescribeNfsAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private DescribeNfsAclRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNfsAclRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeNfsAclRequest, Builder> {
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNfsAclRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public DescribeNfsAclRequest build() {
            return new DescribeNfsAclRequest(this);
        } 

    } 

}
