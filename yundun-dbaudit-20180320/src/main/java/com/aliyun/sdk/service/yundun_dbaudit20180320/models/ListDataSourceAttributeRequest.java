// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link ListDataSourceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceAttributeRequest</p>
 */
public class ListDataSourceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbIds")
    private java.util.List<String> dbIds;

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

    private ListDataSourceAttributeRequest(Builder builder) {
        super(builder);
        this.dbIds = builder.dbIds;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbIds
     */
    public java.util.List<String> getDbIds() {
        return this.dbIds;
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

    public static final class Builder extends Request.Builder<ListDataSourceAttributeRequest, Builder> {
        private java.util.List<String> dbIds; 
        private String instanceId; 
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceAttributeRequest request) {
            super(request);
            this.dbIds = request.dbIds;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.regionId = request.regionId;
        } 

        /**
         * DbIds.
         */
        public Builder dbIds(java.util.List<String> dbIds) {
            this.putQueryParameter("DbIds", dbIds);
            this.dbIds = dbIds;
            return this;
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

        @Override
        public ListDataSourceAttributeRequest build() {
            return new ListDataSourceAttributeRequest(this);
        } 

    } 

}
