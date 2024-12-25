// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link RegionType} extends {@link TeaModel}
 *
 * <p>RegionType</p>
 */
public class RegionType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LocalName")
    private String localName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private RegionType(Builder builder) {
        this.localName = builder.localName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegionType create() {
        return builder().build();
    }

    /**
     * @return localName
     */
    public String getLocalName() {
        return this.localName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder {
        private String localName; 
        private String regionId; 

        /**
         * LocalName.
         */
        public Builder localName(String localName) {
            this.localName = localName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public RegionType build() {
            return new RegionType(this);
        } 

    } 

}
