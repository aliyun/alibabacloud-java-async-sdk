// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPlansRequest} extends {@link RequestModel}
 *
 * <p>ListEscalationPlansRequest</p>
 */
public class ListEscalationPlansRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("escalationPlanName")
    private String escalationPlanName;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    @Body
    @NameInMap("serviceName")
    private String serviceName;

    private ListEscalationPlansRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanName = builder.escalationPlanName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEscalationPlansRequest create() {
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
     * @return escalationPlanName
     */
    public String getEscalationPlanName() {
        return this.escalationPlanName;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListEscalationPlansRequest, Builder> {
        private String clientToken; 
        private String escalationPlanName; 
        private Long pageNumber; 
        private Long pageSize; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListEscalationPlansRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.escalationPlanName = response.escalationPlanName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.serviceName = response.serviceName;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 升级计划名
         */
        public Builder escalationPlanName(String escalationPlanName) {
            this.putBodyParameter("escalationPlanName", escalationPlanName);
            this.escalationPlanName = escalationPlanName;
            return this;
        }

        /**
         * pageNumber
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 服务名称
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListEscalationPlansRequest build() {
            return new ListEscalationPlansRequest(this);
        } 

    } 

}
