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
    @Path
    @NameInMap("key")
    private String key;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("versionId")
    private String versionId;

    @Header
    @NameInMap("x-oss-object-acl")
    private ObjectACL acl;


    private PutObjectAclRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.versionId = builder.versionId;
        this.acl = builder.acl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectAclRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return acl
     */
    public ObjectACL getAcl() {
        return this.acl;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String bucket; 
        private String versionId; 
        private ObjectACL acl; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
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

        /**
         * <p>x-oss-object-acl.</p>
         */
        public Builder acl(ObjectACL acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        public PutObjectAclRequest build() {
            return new PutObjectAclRequest(this);
        } 

    } 

}
