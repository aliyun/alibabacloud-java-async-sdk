// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20191209.models;

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
 * {@link ClearInstanceStorageRequest} extends {@link RequestModel}
 *
 * <p>ClearInstanceStorageRequest</p>
 */
public class ClearInstanceStorageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageSpace;

    private ClearInstanceStorageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.storageCategory = builder.storageCategory;
        this.storageSpace = builder.storageSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearInstanceStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return storageCategory
     */
    public String getStorageCategory() {
        return this.storageCategory;
    }

    /**
     * @return storageSpace
     */
    public String getStorageSpace() {
        return this.storageSpace;
    }

    public static final class Builder extends Request.Builder<ClearInstanceStorageRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String regionId; 
        private String storageCategory; 
        private String storageSpace; 

        private Builder() {
            super();
        } 

        private Builder(ClearInstanceStorageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.storageCategory = request.storageCategory;
            this.storageSpace = request.storageSpace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-cn-78v1gc****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-audit-dbaudit-cn-78v1gc****</p>
         */
        public Builder storageCategory(String storageCategory) {
            this.putQueryParameter("StorageCategory", storageCategory);
            this.storageCategory = storageCategory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-cn-78v1gc****</p>
         */
        public Builder storageSpace(String storageSpace) {
            this.putQueryParameter("StorageSpace", storageSpace);
            this.storageSpace = storageSpace;
            return this;
        }

        @Override
        public ClearInstanceStorageRequest build() {
            return new ClearInstanceStorageRequest(this);
        } 

    } 

}
