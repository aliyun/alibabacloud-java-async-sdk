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
 * {@link GetFilesetRequest} extends {@link RequestModel}
 *
 * <p>GetFilesetRequest</p>
 */
public class GetFilesetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsetId;

    private GetFilesetRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.fsetId = builder.fsetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFilesetRequest create() {
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
     * @return fsetId
     */
    public String getFsetId() {
        return this.fsetId;
    }

    public static final class Builder extends Request.Builder<GetFilesetRequest, Builder> {
        private String fileSystemId; 
        private String fsetId; 

        private Builder() {
            super();
        } 

        private Builder(GetFilesetRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.fsetId = request.fsetId;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487****.</li>
         * <li>The IDs of CPFS for Lingjun file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-0015****.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The fileset ID.</p>
         * <blockquote>
         * <p> This parameter is required for CPFS file systems.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        public Builder fsetId(String fsetId) {
            this.putQueryParameter("FsetId", fsetId);
            this.fsetId = fsetId;
            return this;
        }

        @Override
        public GetFilesetRequest build() {
            return new GetFilesetRequest(this);
        } 

    } 

}
