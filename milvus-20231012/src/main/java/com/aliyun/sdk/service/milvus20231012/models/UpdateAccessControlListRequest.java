// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccessControlListRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessControlListRequest</p>
 */
public class UpdateAccessControlListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private UpdateAccessControlListRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.aclId = builder.aclId;
        this.cidr = builder.cidr;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccessControlListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateAccessControlListRequest, Builder> {
        private String region; 
        private String aclId; 
        private String cidr; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccessControlListRequest request) {
            super(request);
            this.region = request.region;
            this.aclId = request.aclId;
            this.cidr = request.cidr;
            this.instanceId = request.instanceId;
        } 

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putHostParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * Cidr.
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateAccessControlListRequest build() {
            return new UpdateAccessControlListRequest(this);
        } 

    } 

}
