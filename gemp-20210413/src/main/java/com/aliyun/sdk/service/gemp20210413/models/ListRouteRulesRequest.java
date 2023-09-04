// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesRequest} extends {@link RequestModel}
 *
 * <p>ListRouteRulesRequest</p>
 */
public class ListRouteRulesRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("notFilterRouteRuleDeleted")
    private Boolean notFilterRouteRuleDeleted;

    @Body
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    @Body
    @NameInMap("routeType")
    private Long routeType;

    @Body
    @NameInMap("ruleName")
    private byte[] ruleName;

    @Body
    @NameInMap("serviceName")
    private byte[] serviceName;

    private ListRouteRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.notFilterRouteRuleDeleted = builder.notFilterRouteRuleDeleted;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.routeType = builder.routeType;
        this.ruleName = builder.ruleName;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return notFilterRouteRuleDeleted
     */
    public Boolean getNotFilterRouteRuleDeleted() {
        return this.notFilterRouteRuleDeleted;
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
     * @return routeType
     */
    public Long getRouteType() {
        return this.routeType;
    }

    /**
     * @return ruleName
     */
    public byte[] getRuleName() {
        return this.ruleName;
    }

    /**
     * @return serviceName
     */
    public byte[] getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListRouteRulesRequest, Builder> {
        private String clientToken; 
        private Boolean notFilterRouteRuleDeleted; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long routeType; 
        private byte[] ruleName; 
        private byte[] serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListRouteRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.notFilterRouteRuleDeleted = request.notFilterRouteRuleDeleted;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.routeType = request.routeType;
            this.ruleName = request.ruleName;
            this.serviceName = request.serviceName;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * notFilterRouteRuleDeleted.
         */
        public Builder notFilterRouteRuleDeleted(Boolean notFilterRouteRuleDeleted) {
            this.putBodyParameter("notFilterRouteRuleDeleted", notFilterRouteRuleDeleted);
            this.notFilterRouteRuleDeleted = notFilterRouteRuleDeleted;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * routeType.
         */
        public Builder routeType(Long routeType) {
            this.putBodyParameter("routeType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(byte[] ruleName) {
            this.putBodyParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(byte[] serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListRouteRulesRequest build() {
            return new ListRouteRulesRequest(this);
        } 

    } 

}
