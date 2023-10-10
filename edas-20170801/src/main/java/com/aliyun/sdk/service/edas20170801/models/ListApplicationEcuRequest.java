// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationEcuRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationEcuRequest</p>
 */
public class ListApplicationEcuRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("LogicalRegionId")
    private String logicalRegionId;

    private ListApplicationEcuRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.logicalRegionId = builder.logicalRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationEcuRequest create() {
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
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public static final class Builder extends Request.Builder<ListApplicationEcuRequest, Builder> {
        private String appId; 
        private String logicalRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationEcuRequest request) {
            super(request);
            this.appId = request.appId;
            this.logicalRegionId = request.logicalRegionId;
        } 

        /**
         * The ID of the application whose ECUs you want to query. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the microservices namespace.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        @Override
        public ListApplicationEcuRequest build() {
            return new ListApplicationEcuRequest(this);
        } 

    } 

}
