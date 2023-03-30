// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayAuthConsumerResourceRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayAuthConsumerResourceRequest</p>
 */
public class ListGatewayAuthConsumerResourceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConsumerId")
    @Validation(required = true)
    private Long consumerId;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private String pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("ResourceStatus")
    private Boolean resourceStatus;

    @Query
    @NameInMap("RouteName")
    private String routeName;

    private ListGatewayAuthConsumerResourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.consumerId = builder.consumerId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.resourceStatus = builder.resourceStatus;
        this.routeName = builder.routeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayAuthConsumerResourceRequest create() {
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
     * @return consumerId
     */
    public Long getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceStatus
     */
    public Boolean getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * @return routeName
     */
    public String getRouteName() {
        return this.routeName;
    }

    public static final class Builder extends Request.Builder<ListGatewayAuthConsumerResourceRequest, Builder> {
        private String acceptLanguage; 
        private Long consumerId; 
        private String gatewayUniqueId; 
        private String pageNum; 
        private String pageSize; 
        private Boolean resourceStatus; 
        private String routeName; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayAuthConsumerResourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.consumerId = request.consumerId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.resourceStatus = request.resourceStatus;
            this.routeName = request.routeName;
        } 

        /**
         * 返回结果显示的语言。取值：zh-CN（默认值）：中文，en-US：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ConsumerId.
         */
        public Builder consumerId(Long consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceStatus.
         */
        public Builder resourceStatus(Boolean resourceStatus) {
            this.putQueryParameter("ResourceStatus", resourceStatus);
            this.resourceStatus = resourceStatus;
            return this;
        }

        /**
         * RouteName.
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        @Override
        public ListGatewayAuthConsumerResourceRequest build() {
            return new ListGatewayAuthConsumerResourceRequest(this);
        } 

    } 

}
