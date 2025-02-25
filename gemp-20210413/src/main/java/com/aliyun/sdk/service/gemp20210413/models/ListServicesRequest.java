// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesRequest} extends {@link RequestModel}
 *
 * <p>ListServicesRequest</p>
 */
public class ListServicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    private ListServicesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesRequest create() {
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

    public static final class Builder extends Request.Builder<ListServicesRequest, Builder> {
        private String clientToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListServicesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListServicesRequest build() {
            return new ListServicesRequest(this);
        } 

    } 

}
