// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentOverviewsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentOverviewsRequest</p>
 */
public class ListEnvironmentOverviewsRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Source")
    private String source;

    private ListEnvironmentOverviewsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentOverviewsRequest create() {
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentOverviewsRequest, Builder> {
        private String appId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentOverviewsRequest request) {
            super(request);
            this.appId = request.appId;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListEnvironmentOverviewsRequest build() {
            return new ListEnvironmentOverviewsRequest(this);
        } 

    } 

}
