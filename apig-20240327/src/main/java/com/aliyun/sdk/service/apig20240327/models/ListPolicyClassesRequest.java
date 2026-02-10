// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListPolicyClassesRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyClassesRequest</p>
 */
public class ListPolicyClassesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceId")
    private String attachResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListPolicyClassesRequest(Builder builder) {
        super(builder);
        this.attachResourceId = builder.attachResourceId;
        this.attachResourceType = builder.attachResourceType;
        this.direction = builder.direction;
        this.gatewayId = builder.gatewayId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyClassesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachResourceId
     */
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPolicyClassesRequest, Builder> {
        private String attachResourceId; 
        private String attachResourceType; 
        private String direction; 
        private String gatewayId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyClassesRequest request) {
            super(request);
            this.attachResourceId = request.attachResourceId;
            this.attachResourceType = request.attachResourceType;
            this.direction = request.direction;
            this.gatewayId = request.gatewayId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * <p>The resource ID to attach the policy</p>
         * 
         * <strong>example:</strong>
         * <p>route-001</p>
         */
        public Builder attachResourceId(String attachResourceId) {
            this.putQueryParameter("attachResourceId", attachResourceId);
            this.attachResourceId = attachResourceId;
            return this;
        }

        /**
         * <p>The supported mount point type. Valid values:</p>
         * <ul>
         * <li>HttpApi: an HTTP API</li>
         * <li>Operation: an operation in an HTTP API</li>
         * <li>GatewayRoute: a route</li>
         * <li>GatewayService: a service</li>
         * <li>GatewayServicePort: a service port</li>
         * <li>Domain: a domain name</li>
         * <li>Gateway: an instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Operation</p>
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putQueryParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * <p>The direction of traffic on which the policy takes effect. Valid values:</p>
         * <ul>
         * <li>OutBound</li>
         * <li>InBound</li>
         * <li>Both</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InBound</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The gateway ID</p>
         * 
         * <strong>example:</strong>
         * <p>gw-001</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The page number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The template type.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowControl</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPolicyClassesRequest build() {
            return new ListPolicyClassesRequest(this);
        } 

    } 

}
