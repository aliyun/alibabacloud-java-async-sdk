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
 * {@link EnableDataInsightRequest} extends {@link RequestModel}
 *
 * <p>EnableDataInsightRequest</p>
 */
public class EnableDataInsightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private EnableDataInsightRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableDataInsightRequest create() {
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

    public static final class Builder extends Request.Builder<EnableDataInsightRequest, Builder> {
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(EnableDataInsightRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * <p>The ID of the file system. The ID must start with <code>bmcpfs-</code>, such as bmcpfs-125487****. You can obtain the ID by purchasing a file system through the NAS console or by calling the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> operation and setting FileSystemType to bmcpfs.</p>
         * <blockquote>
         * <p>This feature is supported only by CPFS for Lingjun file systems.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290w65p03ok64y*****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public EnableDataInsightRequest build() {
            return new EnableDataInsightRequest(this);
        } 

    } 

}
