// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAclsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAclsRequest</p>
 */
public class DescribeAclsRequest extends Request {
    @Query
    @NameInMap("AclResourceName")
    @Validation(required = true)
    private String aclResourceName;

    @Query
    @NameInMap("AclResourcePatternType")
    private String aclResourcePatternType;

    @Query
    @NameInMap("AclResourceType")
    @Validation(required = true)
    private String aclResourceType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private DescribeAclsRequest(Builder builder) {
        super(builder);
        this.aclResourceName = builder.aclResourceName;
        this.aclResourcePatternType = builder.aclResourcePatternType;
        this.aclResourceType = builder.aclResourceType;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclResourceName
     */
    public String getAclResourceName() {
        return this.aclResourceName;
    }

    /**
     * @return aclResourcePatternType
     */
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    /**
     * @return aclResourceType
     */
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<DescribeAclsRequest, Builder> {
        private String aclResourceName; 
        private String aclResourcePatternType; 
        private String aclResourceType; 
        private String instanceId; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAclsRequest response) {
            super(response);
            this.aclResourceName = response.aclResourceName;
            this.aclResourcePatternType = response.aclResourcePatternType;
            this.aclResourceType = response.aclResourceType;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.username = response.username;
        } 

        /**
         * AclResourceName.
         */
        public Builder aclResourceName(String aclResourceName) {
            this.putQueryParameter("AclResourceName", aclResourceName);
            this.aclResourceName = aclResourceName;
            return this;
        }

        /**
         * AclResourcePatternType.
         */
        public Builder aclResourcePatternType(String aclResourcePatternType) {
            this.putQueryParameter("AclResourcePatternType", aclResourcePatternType);
            this.aclResourcePatternType = aclResourcePatternType;
            return this;
        }

        /**
         * AclResourceType.
         */
        public Builder aclResourceType(String aclResourceType) {
            this.putQueryParameter("AclResourceType", aclResourceType);
            this.aclResourceType = aclResourceType;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public DescribeAclsRequest build() {
            return new DescribeAclsRequest(this);
        } 

    } 

}
