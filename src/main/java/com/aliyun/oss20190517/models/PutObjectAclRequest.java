// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutObjectAclRequest} extends {@link RequestModel}
 *
 * <p>PutObjectAclRequest</p>
 */
public class PutObjectAclRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("x-oss-object-acl")
    private ObjectACL acl;

    @Query
    @NameInMap("versionId")
    private String versionId;


    private PutObjectAclRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.acl = builder.acl;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectAclRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return acl
     */
    public ObjectACL acl() {
        return this.acl;
    }

    /**
     * @return versionId
     */
    public String versionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<PutObjectAclRequest.Builder> {
        private String bucket; 
        private String key; 
        private ObjectACL acl; 
        private String versionId; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>x-oss-object-acl.</p>
         */
        public Builder acl(ObjectACL acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>versionId.</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        public PutObjectAclRequest build() {
            return new PutObjectAclRequest(this);
        } 

    } 

}
