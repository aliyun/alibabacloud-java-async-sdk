// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link QueryClusterInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterInfoRequest</p>
 */
public class QueryClusterInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclSwitch")
    private Boolean aclSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    private QueryClusterInfoRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aclSwitch = builder.aclSwitch;
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterInfoRequest create() {
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
     * @return aclSwitch
     */
    public Boolean getAclSwitch() {
        return this.aclSwitch;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<QueryClusterInfoRequest, Builder> {
        private String acceptLanguage; 
        private Boolean aclSwitch; 
        private String clusterId; 
        private String instanceId; 
        private String orderId; 
        private String regionId; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterInfoRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.aclSwitch = request.aclSwitch;
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
            this.orderId = request.orderId;
            this.regionId = request.regionId;
            this.requestPars = request.requestPars;
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
         * <p>Specifies whether to query the configuration of a public IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder aclSwitch(Boolean aclSwitch) {
            this.putQueryParameter("AclSwitch", aclSwitch);
            this.aclSwitch = aclSwitch;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-09k1q11****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-7mz2t63ci03</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>20574710974****</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
         * <p>The extended request parameters in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public QueryClusterInfoRequest build() {
            return new QueryClusterInfoRequest(this);
        } 

    } 

}
