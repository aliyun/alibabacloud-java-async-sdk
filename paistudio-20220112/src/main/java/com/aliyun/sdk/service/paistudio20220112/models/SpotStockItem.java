// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link SpotStockItem} extends {@link TeaModel}
 *
 * <p>SpotStockItem</p>
 */
public class SpotStockItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("internalInfo")
    private java.util.List<SpotStockInternalInfo> internalInfo;

    @com.aliyun.core.annotation.NameInMap("stockStatus")
    private String stockStatus;

    private SpotStockItem(Builder builder) {
        this.instanceType = builder.instanceType;
        this.internalInfo = builder.internalInfo;
        this.stockStatus = builder.stockStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotStockItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internalInfo
     */
    public java.util.List<SpotStockInternalInfo> getInternalInfo() {
        return this.internalInfo;
    }

    /**
     * @return stockStatus
     */
    public String getStockStatus() {
        return this.stockStatus;
    }

    public static final class Builder {
        private String instanceType; 
        private java.util.List<SpotStockInternalInfo> internalInfo; 
        private String stockStatus; 

        private Builder() {
        } 

        private Builder(SpotStockItem model) {
            this.instanceType = model.instanceType;
            this.internalInfo = model.internalInfo;
            this.stockStatus = model.stockStatus;
        } 

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * internalInfo.
         */
        public Builder internalInfo(java.util.List<SpotStockInternalInfo> internalInfo) {
            this.internalInfo = internalInfo;
            return this;
        }

        /**
         * stockStatus.
         */
        public Builder stockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
            return this;
        }

        public SpotStockItem build() {
            return new SpotStockItem(this);
        } 

    } 

}
