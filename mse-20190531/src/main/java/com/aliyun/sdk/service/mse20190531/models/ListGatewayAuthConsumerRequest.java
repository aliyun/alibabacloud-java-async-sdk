// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayAuthConsumerRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayAuthConsumerRequest</p>
 */
public class ListGatewayAuthConsumerRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConsumerStatus")
    private Boolean consumerStatus;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private String pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Type")
    private String type;

    private ListGatewayAuthConsumerRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.consumerStatus = builder.consumerStatus;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayAuthConsumerRequest create() {
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
     * @return consumerStatus
     */
    public Boolean getConsumerStatus() {
        return this.consumerStatus;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListGatewayAuthConsumerRequest, Builder> {
        private String acceptLanguage; 
        private Boolean consumerStatus; 
        private String gatewayUniqueId; 
        private String name; 
        private String pageNum; 
        private String pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayAuthConsumerRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.consumerStatus = request.consumerStatus;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.type = request.type;
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
         * ConsumerStatus.
         */
        public Builder consumerStatus(Boolean consumerStatus) {
            this.putQueryParameter("ConsumerStatus", consumerStatus);
            this.consumerStatus = consumerStatus;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListGatewayAuthConsumerRequest build() {
            return new ListGatewayAuthConsumerRequest(this);
        } 

    } 

}
