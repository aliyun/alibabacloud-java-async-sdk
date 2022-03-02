// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutObjectAclRequest} extends {@link RequestModel}
 *
 * <p>PutObjectAclRequest</p>
 */
public class PutObjectAclRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("versionId")
    private String versionId;

    @Header
    @NameInMap("x-oss-object-acl")
    @Validation(required = true)
    private String acl;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getAcl() {
        return this.acl;
    }

    public static final class Builder extends Request.Builder<PutObjectAclRequest, Builder> {
        private String key; 
        private String bucket; 
        private String versionId; 
        private String acl; 

        private Builder() {
            super();
        } 

        private Builder(PutObjectAclRequest request) {
            super(request);
            this.key = request.key;
            this.bucket = request.bucket;
            this.versionId = request.versionId;
            this.acl = request.acl;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * x-oss-object-acl.
         */
        public Builder acl(String acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * x-oss-object-acl.
         */
        public Builder acl(ObjectACL acl) {
            this.putHeaderParameter("x-oss-object-acl", acl.getValue());
            this.acl = acl.getValue();
            return this;
        }

        @Override
        public PutObjectAclRequest build() {
            return new PutObjectAclRequest(this);
        } 

    } 

}
