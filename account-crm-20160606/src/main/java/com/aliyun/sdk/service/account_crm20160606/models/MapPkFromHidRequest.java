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
 * {@link MapPkFromHidRequest} extends {@link RequestModel}
 *
 * <p>MapPkFromHidRequest</p>
 */
public class MapPkFromHidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MappingScenes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mappingScenes;

    private MapPkFromHidRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.bid = builder.bid;
        this.hid = builder.hid;
        this.mappingScenes = builder.mappingScenes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MapPkFromHidRequest create() {
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
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return hid
     */
    public String getHid() {
        return this.hid;
    }

    /**
     * @return mappingScenes
     */
    public String getMappingScenes() {
        return this.mappingScenes;
    }

    public static final class Builder extends Request.Builder<MapPkFromHidRequest, Builder> {
        private String appName; 
        private String bid; 
        private String hid; 
        private String mappingScenes; 

        private Builder() {
            super();
        } 

        private Builder(MapPkFromHidRequest request) {
            super(request);
            this.appName = request.appName;
            this.bid = request.bid;
            this.hid = request.hid;
            this.mappingScenes = request.mappingScenes;
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
         * Bid.
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hid(String hid) {
            this.putQueryParameter("Hid", hid);
            this.hid = hid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mappingScenes(String mappingScenes) {
            this.putQueryParameter("MappingScenes", mappingScenes);
            this.mappingScenes = mappingScenes;
            return this;
        }

        @Override
        public MapPkFromHidRequest build() {
            return new MapPkFromHidRequest(this);
        } 

    } 

}
