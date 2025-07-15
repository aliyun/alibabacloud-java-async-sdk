// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateCasterSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateCasterSceneConfigRequest</p>
 */
public class UpdateCasterSceneConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private java.util.List<String> componentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private UpdateCasterSceneConfigRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.layoutId = builder.layoutId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCasterSceneConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return componentId
     */
    public java.util.List<String> getComponentId() {
        return this.componentId;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdateCasterSceneConfigRequest, Builder> {
        private String casterId; 
        private java.util.List<String> componentId; 
        private String layoutId; 
        private Long ownerId; 
        private String regionId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCasterSceneConfigRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.componentId = request.componentId;
            this.layoutId = request.layoutId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80787064-1c94-4dc1-85ce-9409960a****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The IDs of the components. Components in the scene are listed from the bottom to the top in an array.</p>
         * <blockquote>
         * <p> N indicates a sequence number. Examples:<br>ComponentId.1 indicates the ID of the first component.<br>ComponentId.2 indicates the ID of the second component.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;98778372-c30f-4442-85ba-2e3e4e3d****&quot;]</p>
         */
        public Builder componentId(java.util.List<String> componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * <p>The ID of the layout. If you call the <a href="https://help.aliyun.com/document_detail/2848028.html">DescribeCasterLayouts</a> operation to query the layouts of the production studio, check the value of the response parameter LayoutId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eeab74fb-379d-4599-a93d-86d16a05****</p>
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * <p>The ID of the scene.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>242b4e2c-c30f-4442-85ba-2e3e4e3d****</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public UpdateCasterSceneConfigRequest build() {
            return new UpdateCasterSceneConfigRequest(this);
        } 

    } 

}
