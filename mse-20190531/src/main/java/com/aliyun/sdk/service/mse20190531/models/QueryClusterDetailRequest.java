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
 * {@link QueryClusterDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterDetailRequest</p>
 */
public class QueryClusterDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclSwitch")
    private Boolean aclSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
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
         * <p>Specifies whether to query access control lists (ACLs).</p>
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
         * <p>mse-cn-st21ri2****</p>
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
         * <p>20576750143****</p>
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
