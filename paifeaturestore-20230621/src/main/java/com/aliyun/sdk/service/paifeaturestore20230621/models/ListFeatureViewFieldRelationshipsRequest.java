// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListFeatureViewFieldRelationshipsRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureViewFieldRelationshipsRequest</p>
 */
public class ListFeatureViewFieldRelationshipsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureViewId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FieldName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListFeatureViewFieldRelationshipsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.featureViewId = builder.featureViewId;
        this.fieldName = builder.fieldName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewFieldRelationshipsRequest create() {
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
     * @return featureViewId
     */
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListFeatureViewFieldRelationshipsRequest, Builder> {
        private String instanceId; 
        private String featureViewId; 
        private String fieldName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListFeatureViewFieldRelationshipsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.featureViewId = request.featureViewId;
            this.fieldName = request.fieldName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder featureViewId(String featureViewId) {
            this.putPathParameter("FeatureViewId", featureViewId);
            this.featureViewId = featureViewId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        public Builder fieldName(String fieldName) {
            this.putPathParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListFeatureViewFieldRelationshipsRequest build() {
            return new ListFeatureViewFieldRelationshipsRequest(this);
        } 

    } 

}
