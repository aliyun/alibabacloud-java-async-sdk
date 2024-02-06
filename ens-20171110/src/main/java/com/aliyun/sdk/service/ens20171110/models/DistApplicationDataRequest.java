// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DistApplicationDataRequest} extends {@link RequestModel}
 *
 * <p>DistApplicationDataRequest</p>
 */
public class DistApplicationDataRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("DistStrategy")
    private String distStrategy;

    private DistApplicationDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.data = builder.data;
        this.distStrategy = builder.distStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistApplicationDataRequest create() {
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
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return distStrategy
     */
    public String getDistStrategy() {
        return this.distStrategy;
    }

    public static final class Builder extends Request.Builder<DistApplicationDataRequest, Builder> {
        private String appId; 
        private String data; 
        private String distStrategy; 

        private Builder() {
            super();
        } 

        private Builder(DistApplicationDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.data = request.data;
            this.distStrategy = request.distStrategy;
        } 

        /**
         * The ID of the application. To obtain the application ID, call the ListApplications operation.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The list of data files that you want to distribute. The value must be a JSON string.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The canary release policy. The value must be a JSON string. You can specify multiple distribution policies. By default, all data files are distributed.
         */
        public Builder distStrategy(String distStrategy) {
            this.putQueryParameter("DistStrategy", distStrategy);
            this.distStrategy = distStrategy;
            return this;
        }

        @Override
        public DistApplicationDataRequest build() {
            return new DistApplicationDataRequest(this);
        } 

    } 

}
