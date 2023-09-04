// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupMonitorSourceTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceGroupMonitorSourceTemplatesRequest</p>
 */
public class ListServiceGroupMonitorSourceTemplatesRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("requestId")
    private String requestId;

    @Body
    @NameInMap("serviceGroupId")
    private Long serviceGroupId;

    private ListServiceGroupMonitorSourceTemplatesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.requestId = builder.requestId;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceGroupMonitorSourceTemplatesRequest create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<ListServiceGroupMonitorSourceTemplatesRequest, Builder> {
        private String clientToken; 
        private String requestId; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceGroupMonitorSourceTemplatesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.requestId = request.requestId;
            this.serviceGroupId = request.serviceGroupId;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public ListServiceGroupMonitorSourceTemplatesRequest build() {
            return new ListServiceGroupMonitorSourceTemplatesRequest(this);
        } 

    } 

}
