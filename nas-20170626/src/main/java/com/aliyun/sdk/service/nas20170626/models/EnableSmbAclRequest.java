// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableSmbAclRequest} extends {@link RequestModel}
 *
 * <p>EnableSmbAclRequest</p>
 */
public class EnableSmbAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keytab")
    private String keytab;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeytabMd5")
    private String keytabMd5;

    private EnableSmbAclRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.keytab = builder.keytab;
        this.keytabMd5 = builder.keytabMd5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSmbAclRequest create() {
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
     * @return keytab
     */
    public String getKeytab() {
        return this.keytab;
    }

    /**
     * @return keytabMd5
     */
    public String getKeytabMd5() {
        return this.keytabMd5;
    }

    public static final class Builder extends Request.Builder<EnableSmbAclRequest, Builder> {
        private String fileSystemId; 
        private String keytab; 
        private String keytabMd5; 

        private Builder() {
            super();
        } 

        private Builder(EnableSmbAclRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.keytab = request.keytab;
            this.keytabMd5 = request.keytabMd5;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
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
         * <p>The string that is generated after the system encodes the keytab file by using Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>BQIAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAQAIqIx6v7p11oUAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAwAIqIx6v7p11oUAAABPAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAFwAQnQZWB3RAPHU7PMIJyBWePAAAAF8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQASACAGJ7F0s+bcBjf6jD5HlvlRLmPSOW+qDZe0Qk0lQcf8WwAAAE8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQARABDdFmanrSIatnDDhxxxxx</p>
         */
        public Builder keytab(String keytab) {
            this.putQueryParameter("Keytab", keytab);
            this.keytab = keytab;
            return this;
        }

        /**
         * <p>The string that is generated after the system encodes the keytab file by using MD5.</p>
         * 
         * <strong>example:</strong>
         * <p>E3CCF7E2416DF04FA958AA4513EAxxxx</p>
         */
        public Builder keytabMd5(String keytabMd5) {
            this.putQueryParameter("KeytabMd5", keytabMd5);
            this.keytabMd5 = keytabMd5;
            return this;
        }

        @Override
        public EnableSmbAclRequest build() {
            return new EnableSmbAclRequest(this);
        } 

    } 

}
