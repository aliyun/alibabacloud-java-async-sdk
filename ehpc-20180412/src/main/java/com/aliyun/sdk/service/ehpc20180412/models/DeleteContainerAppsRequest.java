// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContainerAppsRequest} extends {@link RequestModel}
 *
 * <p>DeleteContainerAppsRequest</p>
 */
public class DeleteContainerAppsRequest extends Request {
    @Query
    @NameInMap("ContainerApp")
    @Validation(required = true)
    private java.util.List < ContainerApp> containerApp;

    private DeleteContainerAppsRequest(Builder builder) {
        super(builder);
        this.containerApp = builder.containerApp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContainerAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerApp
     */
    public java.util.List < ContainerApp> getContainerApp() {
        return this.containerApp;
    }

    public static final class Builder extends Request.Builder<DeleteContainerAppsRequest, Builder> {
        private java.util.List < ContainerApp> containerApp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContainerAppsRequest request) {
            super(request);
            this.containerApp = request.containerApp;
        } 

        /**
         * The information about containers.
         */
        public Builder containerApp(java.util.List < ContainerApp> containerApp) {
            this.putQueryParameter("ContainerApp", containerApp);
            this.containerApp = containerApp;
            return this;
        }

        @Override
        public DeleteContainerAppsRequest build() {
            return new DeleteContainerAppsRequest(this);
        } 

    } 

    public static class ContainerApp extends TeaModel {
        @NameInMap("Id")
        private String id;

        private ContainerApp(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerApp create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * The ID of the containerized application that you want to delete. Valid values of N: 1 to 100.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public ContainerApp build() {
                return new ContainerApp(this);
            } 

        } 

    }
}
