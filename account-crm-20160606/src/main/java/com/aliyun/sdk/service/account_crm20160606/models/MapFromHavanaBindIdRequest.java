// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link MapFromHavanaBindIdRequest} extends {@link RequestModel}
 *
 * <p>MapFromHavanaBindIdRequest</p>
 */
public class MapFromHavanaBindIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HavanaBindId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String havanaBindId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HavanaBindStations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> havanaBindStations;

    private MapFromHavanaBindIdRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.havanaBindId = builder.havanaBindId;
        this.havanaBindStations = builder.havanaBindStations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MapFromHavanaBindIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return havanaBindId
     */
    public String getHavanaBindId() {
        return this.havanaBindId;
    }

    /**
     * @return havanaBindStations
     */
    public java.util.Map<String, ?> getHavanaBindStations() {
        return this.havanaBindStations;
    }

    public static final class Builder extends Request.Builder<MapFromHavanaBindIdRequest, Builder> {
        private String appName; 
        private String havanaBindId; 
        private java.util.Map<String, ?> havanaBindStations; 

        private Builder() {
            super();
        } 

        private Builder(MapFromHavanaBindIdRequest request) {
            super(request);
            this.appName = request.appName;
            this.havanaBindId = request.havanaBindId;
            this.havanaBindStations = request.havanaBindStations;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder havanaBindId(String havanaBindId) {
            this.putQueryParameter("HavanaBindId", havanaBindId);
            this.havanaBindId = havanaBindId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder havanaBindStations(java.util.Map<String, ?> havanaBindStations) {
            String havanaBindStationsShrink = shrink(havanaBindStations, "HavanaBindStations", "json");
            this.putQueryParameter("HavanaBindStations", havanaBindStationsShrink);
            this.havanaBindStations = havanaBindStations;
            return this;
        }

        @Override
        public MapFromHavanaBindIdRequest build() {
            return new MapFromHavanaBindIdRequest(this);
        } 

    } 

}
