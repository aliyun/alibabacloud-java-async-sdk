// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcDescribeAccessesRequest} extends {@link RequestModel}
 *
 * <p>VpcDescribeAccessesRequest</p>
 */
public class VpcDescribeAccessesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstancePort")
    private String instancePort;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private VpcDescribeAccessesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instancePort = builder.instancePort;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VpcDescribeAccessesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instancePort
     */
    public String getInstancePort() {
        return this.instancePort;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<VpcDescribeAccessesRequest, Builder> {
        private String instanceId; 
        private String instancePort; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(VpcDescribeAccessesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instancePort = request.instancePort;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
            this.vpcId = request.vpcId;
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
         * InstancePort.
         */
        public Builder instancePort(String instancePort) {
            this.putQueryParameter("InstancePort", instancePort);
            this.instancePort = instancePort;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public VpcDescribeAccessesRequest build() {
            return new VpcDescribeAccessesRequest(this);
        } 

    } 

}
