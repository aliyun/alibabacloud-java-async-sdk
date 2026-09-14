// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListProcessDefinitionsRequest} extends {@link RequestModel}
 *
 * <p>ListProcessDefinitionsRequest</p>
 */
public class ListProcessDefinitionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListProcessDefinitionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProcessDefinitionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListProcessDefinitionsRequest, Builder> {
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListProcessDefinitionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the process definition. Valid values:</p>
         * <ul>
         * <li><p>MaxCompute</p>
         * </li>
         * <li><p>DataService</p>
         * </li>
         * <li><p>Extension</p>
         * </li>
         * <li><p>Hologres</p>
         * </li>
         * <li><p>EMR (You cannot create custom definitions for this type.)</p>
         * </li>
         * <li><p>DataAssetGovernance (You cannot create custom definitions for this type.)</p>
         * </li>
         * <li><p>Lindorm (You cannot create custom definitions for this type.)</p>
         * </li>
         * <li><p>DlfNext (You cannot create custom definitions for this type.)</p>
         * </li>
         * <li><p>DlfV1 (You cannot create custom definitions for this type.)</p>
         * </li>
         * <li><p>StarRocks (You cannot create custom definitions for this type.)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListProcessDefinitionsRequest build() {
            return new ListProcessDefinitionsRequest(this);
        } 

    } 

}
