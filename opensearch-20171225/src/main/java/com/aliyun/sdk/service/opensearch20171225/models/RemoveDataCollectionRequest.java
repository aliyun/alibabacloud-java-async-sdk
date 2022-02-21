// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveDataCollectionRequest} extends {@link RequestModel}
 *
 * <p>RemoveDataCollectionRequest</p>
 */
public class RemoveDataCollectionRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("dataCollectionIdentity")
    @Validation(required = true)
    private String dataCollectionIdentity;

    private RemoveDataCollectionRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.dataCollectionIdentity = builder.dataCollectionIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDataCollectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return dataCollectionIdentity
     */
    public String getDataCollectionIdentity() {
        return this.dataCollectionIdentity;
    }

    public static final class Builder extends Request.Builder<RemoveDataCollectionRequest, Builder> {
        private String appGroupIdentity; 
        private String dataCollectionIdentity; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDataCollectionRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.dataCollectionIdentity = response.dataCollectionIdentity;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * dataCollectionIdentity.
         */
        public Builder dataCollectionIdentity(String dataCollectionIdentity) {
            this.putPathParameter("dataCollectionIdentity", dataCollectionIdentity);
            this.dataCollectionIdentity = dataCollectionIdentity;
            return this;
        }

        @Override
        public RemoveDataCollectionRequest build() {
            return new RemoveDataCollectionRequest(this);
        } 

    } 

}
