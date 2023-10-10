// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMethodsRequest} extends {@link RequestModel}
 *
 * <p>ListMethodsRequest</p>
 */
public class ListMethodsRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private ListMethodsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMethodsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListMethodsRequest, Builder> {
        private String appId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListMethodsRequest request) {
            super(request);
            this.appId = request.appId;
            this.serviceName = request.serviceName;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListMethodsRequest build() {
            return new ListMethodsRequest(this);
        } 

    } 

}
