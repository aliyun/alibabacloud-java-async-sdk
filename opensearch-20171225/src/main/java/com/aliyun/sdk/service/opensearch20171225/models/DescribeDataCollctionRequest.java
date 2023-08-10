// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCollctionRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataCollctionRequest</p>
 */
public class DescribeDataCollctionRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("dataCollectionIdentity")
    @Validation(required = true)
    private String dataCollectionIdentity;

    private DescribeDataCollctionRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.dataCollectionIdentity = builder.dataCollectionIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCollctionRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDataCollctionRequest, Builder> {
        private String appGroupIdentity; 
        private String dataCollectionIdentity; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataCollctionRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.dataCollectionIdentity = request.dataCollectionIdentity;
        } 

        /**
         * my_app_group_name
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 286
         */
        public Builder dataCollectionIdentity(String dataCollectionIdentity) {
            this.putPathParameter("dataCollectionIdentity", dataCollectionIdentity);
            this.dataCollectionIdentity = dataCollectionIdentity;
            return this;
        }

        @Override
        public DescribeDataCollctionRequest build() {
            return new DescribeDataCollctionRequest(this);
        } 

    } 

}
