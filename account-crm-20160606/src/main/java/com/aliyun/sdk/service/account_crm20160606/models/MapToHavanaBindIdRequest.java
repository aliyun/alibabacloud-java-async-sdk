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
 * {@link MapToHavanaBindIdRequest} extends {@link RequestModel}
 *
 * <p>MapToHavanaBindIdRequest</p>
 */
public class MapToHavanaBindIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HavanaBindStations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> havanaBindStations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    private MapToHavanaBindIdRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.havanaBindStations = builder.havanaBindStations;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MapToHavanaBindIdRequest create() {
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
     * @return havanaBindStations
     */
    public java.util.Map<String, ?> getHavanaBindStations() {
        return this.havanaBindStations;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<MapToHavanaBindIdRequest, Builder> {
        private String appName; 
        private java.util.Map<String, ?> havanaBindStations; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(MapToHavanaBindIdRequest request) {
            super(request);
            this.appName = request.appName;
            this.havanaBindStations = request.havanaBindStations;
            this.pk = request.pk;
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
        public Builder havanaBindStations(java.util.Map<String, ?> havanaBindStations) {
            String havanaBindStationsShrink = shrink(havanaBindStations, "HavanaBindStations", "json");
            this.putQueryParameter("HavanaBindStations", havanaBindStationsShrink);
            this.havanaBindStations = havanaBindStations;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public MapToHavanaBindIdRequest build() {
            return new MapToHavanaBindIdRequest(this);
        } 

    } 

}
