// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgDesensPlanUpdateStatusRequest} extends {@link RequestModel}
 *
 * <p>DsgDesensPlanUpdateStatusRequest</p>
 */
public class DsgDesensPlanUpdateStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Integer > ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private DsgDesensPlanUpdateStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ids = builder.ids;
        this.sceneCode = builder.sceneCode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgDesensPlanUpdateStatusRequest create() {
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
    public java.util.List < Integer > getIds() {
        return this.ids;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DsgDesensPlanUpdateStatusRequest, Builder> {
        private String regionId; 
        private java.util.List < Integer > ids; 
        private String sceneCode; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DsgDesensPlanUpdateStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ids = request.ids;
            this.sceneCode = request.sceneCode;
            this.status = request.status;
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
         * Ids.
         */
        public Builder ids(java.util.List < Integer > ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putQueryParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DsgDesensPlanUpdateStatusRequest build() {
            return new DsgDesensPlanUpdateStatusRequest(this);
        } 

    } 

}
