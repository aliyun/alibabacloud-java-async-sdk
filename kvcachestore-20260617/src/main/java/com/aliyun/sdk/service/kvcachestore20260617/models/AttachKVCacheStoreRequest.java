// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link AttachKVCacheStoreRequest} extends {@link RequestModel}
 *
 * <p>AttachKVCacheStoreRequest</p>
 */
public class AttachKVCacheStoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arns")
    private java.util.List<Arns> arns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceIds> resourceIds;

    private AttachKVCacheStoreRequest(Builder builder) {
        super(builder);
        this.arns = builder.arns;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachKVCacheStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arns
     */
    public java.util.List<Arns> getArns() {
        return this.arns;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<ResourceIds> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<AttachKVCacheStoreRequest, Builder> {
        private java.util.List<Arns> arns; 
        private String clientToken; 
        private String regionId; 
        private java.util.List<ResourceIds> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(AttachKVCacheStoreRequest request) {
            super(request);
            this.arns = request.arns;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * Arns.
         */
        public Builder arns(java.util.List<Arns> arns) {
            this.putQueryParameter("Arns", arns);
            this.arns = arns;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceIds(java.util.List<ResourceIds> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public AttachKVCacheStoreRequest build() {
            return new AttachKVCacheStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachKVCacheStoreRequest} extends {@link TeaModel}
     *
     * <p>AttachKVCacheStoreRequest</p>
     */
    public static class Arns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private String assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleType;

        private Arns(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleArn = builder.roleArn;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arns create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        public static final class Builder {
            private String assumeRoleFor; 
            private String roleArn; 
            private String roleType; 

            private Builder() {
            } 

            private Builder(Arns model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.roleArn = model.roleArn;
                this.roleType = model.roleType;
            } 

            /**
             * AssumeRoleFor.
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1028257687084022:role/zeus-locationservicerole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public Arns build() {
                return new Arns(this);
            } 

        } 

    }
    /**
     * 
     * {@link AttachKVCacheStoreRequest} extends {@link TeaModel}
     *
     * <p>AttachKVCacheStoreRequest</p>
     */
    public static class ResourceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KvcsId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String kvcsId;

        @com.aliyun.core.annotation.NameInMap("VscId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vscId;

        private ResourceIds(Builder builder) {
            this.kvcsId = builder.kvcsId;
            this.vscId = builder.vscId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIds create() {
            return builder().build();
        }

        /**
         * @return kvcsId
         */
        public String getKvcsId() {
            return this.kvcsId;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        public static final class Builder {
            private String kvcsId; 
            private String vscId; 

            private Builder() {
            } 

            private Builder(ResourceIds model) {
                this.kvcsId = model.kvcsId;
                this.vscId = model.vscId;
            } 

            /**
             * <p>KVCacheStore KvcsId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>kvcs-your-resource-id</p>
             */
            public Builder kvcsId(String kvcsId) {
                this.kvcsId = kvcsId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-uf6acaf6k6mt1ts95to6al</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            public ResourceIds build() {
                return new ResourceIds(this);
            } 

        } 

    }
}
