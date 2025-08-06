// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddFilterConfigsRequest} extends {@link RequestModel}
 *
 * <p>AddFilterConfigsRequest</p>
 */
public class AddFilterConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterName")
    private String filterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemConfigs")
    private String itemConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AddFilterConfigsRequest(Builder builder) {
        super(builder);
        this.filterName = builder.filterName;
        this.itemConfigs = builder.itemConfigs;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFilterConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterName
     */
    public String getFilterName() {
        return this.filterName;
    }

    /**
     * @return itemConfigs
     */
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddFilterConfigsRequest, Builder> {
        private String filterName; 
        private String itemConfigs; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddFilterConfigsRequest request) {
            super(request);
            this.filterName = request.filterName;
            this.itemConfigs = request.itemConfigs;
            this.type = request.type;
        } 

        /**
         * FilterName.
         */
        public Builder filterName(String filterName) {
            this.putQueryParameter("FilterName", filterName);
            this.filterName = filterName;
            return this;
        }

        /**
         * ItemConfigs.
         */
        public Builder itemConfigs(String itemConfigs) {
            this.putQueryParameter("ItemConfigs", itemConfigs);
            this.itemConfigs = itemConfigs;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddFilterConfigsRequest build() {
            return new AddFilterConfigsRequest(this);
        } 

    } 

}
