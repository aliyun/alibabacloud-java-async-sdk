// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationConfigsRequest</p>
 */
public class ListIntegrationConfigsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("monitorSourceName")
    private String monitorSourceName;

    private ListIntegrationConfigsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.monitorSourceName = builder.monitorSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationConfigsRequest create() {
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
     * @return monitorSourceName
     */
    public String getMonitorSourceName() {
        return this.monitorSourceName;
    }

    public static final class Builder extends Request.Builder<ListIntegrationConfigsRequest, Builder> {
        private String clientToken; 
        private String monitorSourceName; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationConfigsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.monitorSourceName = request.monitorSourceName;
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
         * monitorSourceName.
         */
        public Builder monitorSourceName(String monitorSourceName) {
            this.putBodyParameter("monitorSourceName", monitorSourceName);
            this.monitorSourceName = monitorSourceName;
            return this;
        }

        @Override
        public ListIntegrationConfigsRequest build() {
            return new ListIntegrationConfigsRequest(this);
        } 

    } 

}
