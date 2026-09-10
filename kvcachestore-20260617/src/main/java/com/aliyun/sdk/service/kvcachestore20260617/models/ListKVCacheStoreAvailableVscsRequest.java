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
 * {@link ListKVCacheStoreAvailableVscsRequest} extends {@link RequestModel}
 *
 * <p>ListKVCacheStoreAvailableVscsRequest</p>
 */
public class ListKVCacheStoreAvailableVscsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arns")
    private java.util.List<Arns> arns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvcsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kvcsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListKVCacheStoreAvailableVscsRequest(Builder builder) {
        super(builder);
        this.arns = builder.arns;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.kvcsId = builder.kvcsId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKVCacheStoreAvailableVscsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return kvcsId
     */
    public String getKvcsId() {
        return this.kvcsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListKVCacheStoreAvailableVscsRequest, Builder> {
        private java.util.List<Arns> arns; 
        private String instanceId; 
        private String instanceType; 
        private String kvcsId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListKVCacheStoreAvailableVscsRequest request) {
            super(request);
            this.arns = request.arns;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.kvcsId = request.kvcsId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cross-account authorization role chain, used for cross-account VSC queries in ecs or eflo scenarios.</p>
         */
        public Builder arns(java.util.List<Arns> arns) {
            this.putQueryParameter("Arns", arns);
            this.arns = arns;
            return this;
        }

        /**
         * <p>The ID of the compute instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-55kl5wq6j6kvtl4xu5tgunddu</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the compute instance. Valid values:</p>
         * <ul>
         * <li>ecs</li>
         * <li>eflo</li>
         * <li>innerECS</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The ID of the KVCacheStore instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kvcs-cn-5y44vuqiz001</p>
         */
        public Builder kvcsId(String kvcsId) {
            this.putQueryParameter("KvcsId", kvcsId);
            this.kvcsId = kvcsId;
            return this;
        }

        /**
         * <p>The region ID, such as cn-hangzhou.</p>
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

        @Override
        public ListKVCacheStoreAvailableVscsRequest build() {
            return new ListKVCacheStoreAvailableVscsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListKVCacheStoreAvailableVscsRequest} extends {@link TeaModel}
     *
     * <p>ListKVCacheStoreAvailableVscsRequest</p>
     */
    public static class Arns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The UID of the target account for role assumption.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1193522024229156</p>
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
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
             * <p>The type of the role. Valid values:</p>
             * <ul>
             * <li>service</li>
             * <li>user</li>
             * </ul>
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
}
