// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DataStorageItem} extends {@link TeaModel}
 *
 * <p>DataStorageItem</p>
 */
public class DataStorageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("storeName")
    private String storeName;

    @com.aliyun.core.annotation.NameInMap("storeType")
    private String storeType;

    private DataStorageItem(Builder builder) {
        this.dataType = builder.dataType;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.storeName = builder.storeName;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataStorageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    public static final class Builder {
        private String dataType; 
        private String project; 
        private String regionId; 
        private String storeName; 
        private String storeType; 

        private Builder() {
        } 

        private Builder(DataStorageItem model) {
            this.dataType = model.dataType;
            this.project = model.project;
            this.regionId = model.regionId;
            this.storeName = model.storeName;
            this.storeType = model.storeType;
        } 

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * storeName.
         */
        public Builder storeName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        /**
         * storeType.
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        public DataStorageItem build() {
            return new DataStorageItem(this);
        } 

    } 

}
