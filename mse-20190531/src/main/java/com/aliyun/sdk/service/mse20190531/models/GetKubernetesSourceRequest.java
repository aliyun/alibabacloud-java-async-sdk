// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetKubernetesSourceRequest} extends {@link RequestModel}
 *
 * <p>GetKubernetesSourceRequest</p>
 */
public class GetKubernetesSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAll")
    private Boolean isAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private GetKubernetesSourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.isAll = builder.isAll;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKubernetesSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return isAll
     */
    public Boolean getIsAll() {
        return this.isAll;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<GetKubernetesSourceRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Boolean isAll; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(GetKubernetesSourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.isAll = request.isAll;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-c5d1aadb7df646cfb7065fbf75c1****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>Specifies whether to obtain the information about all Kubernetes clusters. If you set the value to false, only the information about unassociated clusters is obtained.</p>
         */
        public Builder isAll(Boolean isAll) {
            this.putQueryParameter("IsAll", isAll);
            this.isAll = isAll;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1t50e045b5g7i3p****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public GetKubernetesSourceRequest build() {
            return new GetKubernetesSourceRequest(this);
        } 

    } 

}
