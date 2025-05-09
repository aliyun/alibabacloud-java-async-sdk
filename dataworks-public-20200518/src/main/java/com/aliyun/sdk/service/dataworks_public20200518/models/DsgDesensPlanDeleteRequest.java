// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DsgDesensPlanDeleteRequest} extends {@link RequestModel}
 *
 * <p>DsgDesensPlanDeleteRequest</p>
 */
public class DsgDesensPlanDeleteRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    private DsgDesensPlanDeleteRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ids = builder.ids;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgDesensPlanDeleteRequest create() {
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
     * @return ids
     */
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<DsgDesensPlanDeleteRequest, Builder> {
        private String regionId; 
        private java.util.List<Integer> ids; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(DsgDesensPlanDeleteRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ids = request.ids;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>A collection of data masking rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ids(java.util.List<Integer> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putQueryParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The code of the level-1 data masking scenario to which the rule belongs. Valid values:</p>
         * <ul>
         * <li>dataworks_display_desense_code: masking of displayed data in DataStudio and Data Map</li>
         * <li>maxcompute_desense_code: data masking at the MaxCompute compute engine layer</li>
         * <li>maxcompute_new_desense_code: data masking at the MaxCompute compute engine layer (new)</li>
         * <li>hologres_display_desense_code: data masking at the Hologres compute engine layer</li>
         * <li>dataworks_data_integration_desense_code: static data masking in Data Integration</li>
         * <li>dataworks_analysis_desense_code: masking of displayed data in DataAnalysis</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks_display_desense_code</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public DsgDesensPlanDeleteRequest build() {
            return new DsgDesensPlanDeleteRequest(this);
        } 

    } 

}
