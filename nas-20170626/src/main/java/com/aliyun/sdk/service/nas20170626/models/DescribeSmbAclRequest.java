// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmbAclRequest} extends {@link RequestModel}
 *
 * <p>DescribeSmbAclRequest</p>
 */
public class DescribeSmbAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private DescribeSmbAclRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmbAclRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSmbAclRequest, Builder> {
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSmbAclRequest request) {
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
        public DescribeSmbAclRequest build() {
            return new DescribeSmbAclRequest(this);
        } 

    } 

}
