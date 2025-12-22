// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveDataCollectionRequest} extends {@link RequestModel}
 *
 * <p>RemoveDataCollectionRequest</p>
 */
public class RemoveDataCollectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataCollectionIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(RemoveDataCollectionRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.dataCollectionIdentity = request.dataCollectionIdentity;
        } 

        /**
         * <p>The name of the application</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>“my_app_group_name”</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The data collection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>286</p>
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
