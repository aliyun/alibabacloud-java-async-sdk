// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link IdpAttrMapConfig} extends {@link TeaModel}
 *
 * <p>IdpAttrMapConfig</p>
 */
public class IdpAttrMapConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MapItems")
    private java.util.List<IdpAttrMapConfigItem> mapItems;

    private IdpAttrMapConfig(Builder builder) {
        this.mapItems = builder.mapItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpAttrMapConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mapItems
     */
    public java.util.List<IdpAttrMapConfigItem> getMapItems() {
        return this.mapItems;
    }

    public static final class Builder {
        private java.util.List<IdpAttrMapConfigItem> mapItems; 

        private Builder() {
        } 

        private Builder(IdpAttrMapConfig model) {
            this.mapItems = model.mapItems;
        } 

        /**
         * MapItems.
         */
        public Builder mapItems(java.util.List<IdpAttrMapConfigItem> mapItems) {
            this.mapItems = mapItems;
            return this;
        }

        public IdpAttrMapConfig build() {
            return new IdpAttrMapConfig(this);
        } 

    } 

}
