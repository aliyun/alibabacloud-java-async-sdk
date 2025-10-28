// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListApplicationEcuRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationEcuRequest</p>
 */
public class ListApplicationEcuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
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
         * <p>The ID of the application whose ECUs you want to query. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>e809****-43d7-4c6b-8e01-b0d9d1db****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the microservices namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:***wei</p>
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
