// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSmbAclRequest} extends {@link RequestModel}
 *
 * <p>EnableSmbAclRequest</p>
 */
public class EnableSmbAclRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("Keytab")
    private String keytab;

    @Query
    @NameInMap("KeytabMd5")
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
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The string that is generated after the system encodes the keytab file by using Base64.
         */
        public Builder keytab(String keytab) {
            this.putQueryParameter("Keytab", keytab);
            this.keytab = keytab;
            return this;
        }

        /**
         * The string that is generated after the system encodes the keytab file by using MD5.
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
