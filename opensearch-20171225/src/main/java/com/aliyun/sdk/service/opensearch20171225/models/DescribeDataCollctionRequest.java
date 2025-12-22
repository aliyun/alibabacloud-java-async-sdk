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
 * {@link DescribeDataCollctionRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataCollctionRequest</p>
 */
public class DescribeDataCollctionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataCollectionIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_app_group_name</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The ID of the data collection task.</p>
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
        public DescribeDataCollctionRequest build() {
            return new DescribeDataCollctionRequest(this);
        } 

    } 

}
