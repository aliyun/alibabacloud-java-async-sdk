// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteK8sServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteK8sServiceRequest</p>
 */
public class DeleteK8sServiceRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DeleteK8sServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteK8sServiceRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteK8sServiceRequest, Builder> {
        private String appId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteK8sServiceRequest request) {
            super(request);
            this.appId = request.appId;
            this.name = request.name;
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
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteK8sServiceRequest build() {
            return new DeleteK8sServiceRequest(this);
        } 

    } 

}
