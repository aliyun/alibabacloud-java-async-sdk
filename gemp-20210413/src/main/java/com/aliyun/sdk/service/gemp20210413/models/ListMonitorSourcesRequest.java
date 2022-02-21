// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMonitorSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListMonitorSourcesRequest</p>
 */
public class ListMonitorSourcesRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    private ListMonitorSourcesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMonitorSourcesRequest create() {
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

    public static final class Builder extends Request.Builder<ListMonitorSourcesRequest, Builder> {
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(ListMonitorSourcesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public ListMonitorSourcesRequest build() {
            return new ListMonitorSourcesRequest(this);
        } 

    } 

}
