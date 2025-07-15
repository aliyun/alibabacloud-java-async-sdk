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
 * {@link ModifyStudioLayoutRequest} extends {@link RequestModel}
 *
 * <p>ModifyStudioLayoutRequest</p>
 */
public class ModifyStudioLayoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgImageConfig")
    private String bgImageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonConfig")
    private String commonConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayerOrderConfigList")
    private String layerOrderConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutName")
    private String layoutName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaInputConfigList")
    private String mediaInputConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScreenInputConfigList")
    private String screenInputConfigList;

    private ModifyStudioLayoutRequest(Builder builder) {
        super(builder);
        this.bgImageConfig = builder.bgImageConfig;
        this.casterId = builder.casterId;
        this.commonConfig = builder.commonConfig;
        this.layerOrderConfigList = builder.layerOrderConfigList;
        this.layoutId = builder.layoutId;
        this.layoutName = builder.layoutName;
        this.mediaInputConfigList = builder.mediaInputConfigList;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.screenInputConfigList = builder.screenInputConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStudioLayoutRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bgImageConfig
     */
    public String getBgImageConfig() {
        return this.bgImageConfig;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return commonConfig
     */
    public String getCommonConfig() {
        return this.commonConfig;
    }

    /**
     * @return layerOrderConfigList
     */
    public String getLayerOrderConfigList() {
        return this.layerOrderConfigList;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return layoutName
     */
    public String getLayoutName() {
        return this.layoutName;
    }

    /**
     * @return mediaInputConfigList
     */
    public String getMediaInputConfigList() {
        return this.mediaInputConfigList;
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
     * @return screenInputConfigList
     */
    public String getScreenInputConfigList() {
        return this.screenInputConfigList;
    }

    public static final class Builder extends Request.Builder<ModifyStudioLayoutRequest, Builder> {
        private String bgImageConfig; 
        private String casterId; 
        private String commonConfig; 
        private String layerOrderConfigList; 
        private String layoutId; 
        private String layoutName; 
        private String mediaInputConfigList; 
        private Long ownerId; 
        private String regionId; 
        private String screenInputConfigList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStudioLayoutRequest request) {
            super(request);
            this.bgImageConfig = request.bgImageConfig;
            this.casterId = request.casterId;
            this.commonConfig = request.commonConfig;
            this.layerOrderConfigList = request.layerOrderConfigList;
            this.layoutId = request.layoutId;
            this.layoutName = request.layoutName;
            this.mediaInputConfigList = request.mediaInputConfigList;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.screenInputConfigList = request.screenInputConfigList;
        } 

        /**
         * <p>The background material configurations. The value is a JSON string. For more information, see <strong>BgImageConfig</strong>.</p>
         * <blockquote>
         * <p> This parameter is required only if you set LayoutType to studio.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;MaterialId&quot;:&quot;f080575eb5f4427684fc0715159a****&quot; }</p>
         */
        public Builder bgImageConfig(String bgImageConfig) {
            this.putQueryParameter("BgImageConfig", bgImageConfig);
            this.bgImageConfig = bgImageConfig;
            return this;
        }

        /**
         * <p>The ID of the production studio.</p>
         * <blockquote>
         * <p> The production studio must be a virtual studio that you create in advance.</p>
         * </blockquote>
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
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The common layout configurations. The value is a JSON string. For more information, see <strong>CommonConfig</strong>.</p>
         * <blockquote>
         * <p> This parameter is required only if you set LayoutType to common.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;ChannelId&quot;:&quot;RV01&quot; }</p>
         */
        public Builder commonConfig(String commonConfig) {
            this.putQueryParameter("CommonConfig", commonConfig);
            this.commonConfig = commonConfig;
            return this;
        }

        /**
         * <p>The layer sorting configurations. The value is a JSON string. For more information, see <strong>layerOrderConfig</strong>. You can sort layers of background and multimedia materials. The chroma key layer cannot be sorted. A layer that is in the front of the code is placed behind other layers in the layout.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;Type&quot;:&quot;media&quot;, &quot;Id&quot;:&quot;k12kj31****&quot; }, { &quot;Type&quot;:&quot;media&quot;, &quot;Id&quot;:&quot;k12kj31****&quot; } ]</p>
         */
        public Builder layerOrderConfigList(String layerOrderConfigList) {
            this.putQueryParameter("LayerOrderConfigList", layerOrderConfigList);
            this.layerOrderConfigList = layerOrderConfigList;
            return this;
        }

        /**
         * <p>The ID of the layout. If the layout was added by calling the <a href="https://help.aliyun.com/document_detail/2848062.html">AddStudioLayout</a> operation, check the value of the response parameter LayoutId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * <p>The name of the layout.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the layout.</p>
         */
        public Builder layoutName(String layoutName) {
            this.putQueryParameter("LayoutName", layoutName);
            this.layoutName = layoutName;
            return this;
        }

        /**
         * <p>The multimedia input configurations. The value is a JSON string. For more information, see <strong>MediaInputConfig</strong>.</p>
         * <blockquote>
         * <p> This parameter is optional and takes effect only if you set LayoutType to studio.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;Index&quot;:&quot;1&quot;, &quot;ChannelId&quot;:&quot;RV01&quot;, &quot;FillMode&quot;:&quot;none&quot;, &quot;PositionRefer&quot;:&quot;topLeft&quot;, &quot;WidthNormalized&quot;:&quot;0.4&quot;, &quot;HeightNormalized&quot;:&quot;0.4&quot;, &quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; }, { &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;Index&quot;:&quot;2&quot;, &quot;ImageMaterialId&quot;:&quot;lkajsdfsa8fd89asd8****&quot;, &quot;FillMode&quot;:&quot;none&quot;, &quot;PositionRefer&quot;:&quot;topLeft&quot;, &quot;WidthNormalized&quot;:&quot;0.6&quot;, &quot;HeightNormalized&quot;:&quot;0.4&quot;, &quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; } ]</p>
         */
        public Builder mediaInputConfigList(String mediaInputConfigList) {
            this.putQueryParameter("MediaInputConfigList", mediaInputConfigList);
            this.mediaInputConfigList = mediaInputConfigList;
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
         * <p>The input configurations for chroma key. The value is a JSON string. For more information, see <strong>ScreenInputConfig</strong>.</p>
         * <blockquote>
         * <p> This parameter is required only if you set LayoutType to studio.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;Index&quot;:&quot;1&quot;, &quot;ChannelId&quot;:&quot;RV01&quot;, &quot;Color&quot;:&quot;green&quot;, &quot;PositionX&quot;:&quot;0.1&quot;, &quot;PositionY&quot;:&quot;0.2&quot;, &quot;HeightNormalized&quot;:&quot;0.4&quot; } ]</p>
         */
        public Builder screenInputConfigList(String screenInputConfigList) {
            this.putQueryParameter("ScreenInputConfigList", screenInputConfigList);
            this.screenInputConfigList = screenInputConfigList;
            return this;
        }

        @Override
        public ModifyStudioLayoutRequest build() {
            return new ModifyStudioLayoutRequest(this);
        } 

    } 

}
