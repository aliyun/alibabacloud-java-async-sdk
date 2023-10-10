// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeleteK8sApplicationRequest</p>
 */
public class DeleteK8sApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    private DeleteK8sApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteK8sApplicationRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<DeleteK8sApplicationRequest, Builder> {
        private String appId; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(DeleteK8sApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.force = request.force;
        } 

        /**
         * The ID of the application that you want to delete. You can call the ListApplication operation to query the application ID.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Specifies whether to forcibly delete the application and disable application deletion protection.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        @Override
        public DeleteK8sApplicationRequest build() {
            return new DeleteK8sApplicationRequest(this);
        } 

    } 

}
