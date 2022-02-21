// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcListInstanceRequest} extends {@link RequestModel}
 *
 * <p>RpcListInstanceRequest</p>
 */
public class RpcListInstanceRequest extends Request {
    @Query
    @NameInMap("esVersion")
    private String esVersion;

    @Query
    @NameInMap("vpcId")
    private String vpcId;

    @Query
    @NameInMap("vswitchId")
    private String vswitchId;

    private RpcListInstanceRequest(Builder builder) {
        super(builder);
        this.esVersion = builder.esVersion;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcListInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return esVersion
     */
    public String getEsVersion() {
        return this.esVersion;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<RpcListInstanceRequest, Builder> {
        private String esVersion; 
        private String vpcId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(RpcListInstanceRequest response) {
            super(response);
            this.esVersion = response.esVersion;
            this.vpcId = response.vpcId;
            this.vswitchId = response.vswitchId;
        } 

        /**
         * esVersion.
         */
        public Builder esVersion(String esVersion) {
            this.putQueryParameter("esVersion", esVersion);
            this.esVersion = esVersion;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * vswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("vswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public RpcListInstanceRequest build() {
            return new RpcListInstanceRequest(this);
        } 

    } 

}
