// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterDetailRequest</p>
 */
public class QueryClusterDetailRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AclSwitch")
    private Boolean aclSwitch;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    private QueryClusterDetailRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aclSwitch = builder.aclSwitch;
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterDetailRequest create() {
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

    public static final class Builder extends Request.Builder<QueryClusterDetailRequest, Builder> {
        private String acceptLanguage; 
        private Boolean aclSwitch; 
        private String instanceId; 
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterDetailRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.aclSwitch = request.aclSwitch;
            this.instanceId = request.instanceId;
            this.orderId = request.orderId;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to query access control lists (ACLs).
         */
        public Builder aclSwitch(Boolean aclSwitch) {
            this.putQueryParameter("AclSwitch", aclSwitch);
            this.aclSwitch = aclSwitch;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public QueryClusterDetailRequest build() {
            return new QueryClusterDetailRequest(this);
        } 

    } 

}
