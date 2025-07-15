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
 * {@link AddStudioLayoutRequest} extends {@link RequestModel}
 *
 * <p>AddStudioLayoutRequest</p>
 */
public class AddStudioLayoutRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("LayoutName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutType;

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

    private AddStudioLayoutRequest(Builder builder) {
        super(builder);
        this.bgImageConfig = builder.bgImageConfig;
        this.casterId = builder.casterId;
        this.commonConfig = builder.commonConfig;
        this.layerOrderConfigList = builder.layerOrderConfigList;
        this.layoutName = builder.layoutName;
        this.layoutType = builder.layoutType;
        this.mediaInputConfigList = builder.mediaInputConfigList;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.screenInputConfigList = builder.screenInputConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStudioLayoutRequest create() {
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
     * @return layoutName
     */
    public String getLayoutName() {
        return this.layoutName;
    }

    /**
     * @return layoutType
     */
    public String getLayoutType() {
        return this.layoutType;
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

    public static final class Builder extends Request.Builder<AddStudioLayoutRequest, Builder> {
        private String bgImageConfig; 
        private String casterId; 
        private String commonConfig; 
        private String layerOrderConfigList; 
        private String layoutName; 
        private String layoutType; 
        private String mediaInputConfigList; 
        private Long ownerId; 
        private String regionId; 
        private String screenInputConfigList; 

        private Builder() {
            super();
        } 

        private Builder(AddStudioLayoutRequest request) {
            super(request);
            this.bgImageConfig = request.bgImageConfig;
            this.casterId = request.casterId;
            this.commonConfig = request.commonConfig;
            this.layerOrderConfigList = request.layerOrderConfigList;
            this.layoutName = request.layoutName;
            this.layoutType = request.layoutType;
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
         * <p> The production studio must be a virtual studio that you create in advance. You can use the ApsaraVideo Live console or call the CreateCaster operation to create a virtual studio.</p>
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
         * <p>{&quot;ChannelId&quot;:&quot;RV01&quot; }</p>
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
         * <p>[ 	{ 	&quot;Type&quot;:&quot;media&quot;, 	&quot;Id&quot;:&quot;k12kj31****&quot; 	}, 	{ 	&quot;Type&quot;:&quot;media&quot;, 	&quot;Id&quot;:&quot;k12kj31****&quot; 	} ]</p>
         */
        public Builder layerOrderConfigList(String layerOrderConfigList) {
            this.putQueryParameter("LayerOrderConfigList", layerOrderConfigList);
            this.layerOrderConfigList = layerOrderConfigList;
            return this;
        }

        /**
         * <p>The name of the layout.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test layout</p>
         */
        public Builder layoutName(String layoutName) {
            this.putQueryParameter("LayoutName", layoutName);
            this.layoutName = layoutName;
            return this;
        }

        /**
         * <p>The type of the layout. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: If you set this parameter to common, you must specify the CommonConfig parameter.</li>
         * <li><strong>studio</strong>: If you set this parameter to studio, you must specify the BgImageConfig and ScreenInputConfigList parameters. The MediaInputConfigList parameter is optional.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>studio</p>
         */
        public Builder layoutType(String layoutType) {
            this.putQueryParameter("LayoutType", layoutType);
            this.layoutType = layoutType;
            return this;
        }

        /**
         * <p>The multimedia input configurations. The value is a JSON string. For more information, see <strong>MediaInputConfig</strong>.</p>
         * <blockquote>
         * <p> This parameter is optional and is valid only if you set LayoutType to studio.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[ 	{ 	&quot;Id&quot;:&quot;k12kj31****&quot;, 	&quot;Index&quot;:&quot;1&quot;, 	&quot;ChannelId&quot;:&quot;RV01&quot;, 	&quot;FillMode&quot;:&quot;none&quot;, 	&quot;PositionRefer&quot;:&quot;topLeft&quot;, 	&quot;WidthNormalized&quot;:&quot;0.4&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot;, 	&quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; 	},   { 	&quot;Id&quot;:&quot;k12kj31****&quot;, 	&quot;Index&quot;:&quot;2&quot;, 	&quot;ImageMaterialId&quot;:&quot;lkajsdfsa8fd89asd8****&quot;, 	&quot;FillMode&quot;:&quot;none&quot;, 	&quot;PositionRefer&quot;:&quot;topLeft&quot;, 	&quot;WidthNormalized&quot;:&quot;0.6&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot;, 	&quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; 	} ]</p>
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
         * <p>[ 	{ 	&quot;Index&quot;:&quot;1&quot;, 	&quot;ChannelId&quot;:&quot;RV01&quot;, 	&quot;Color&quot;:&quot;green&quot;, 	&quot;PositionX&quot;:&quot;0.1&quot;, 	&quot;PositionY&quot;:&quot;0.2&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot; 	} ]</p>
         */
        public Builder screenInputConfigList(String screenInputConfigList) {
            this.putQueryParameter("ScreenInputConfigList", screenInputConfigList);
            this.screenInputConfigList = screenInputConfigList;
            return this;
        }

        @Override
        public AddStudioLayoutRequest build() {
            return new AddStudioLayoutRequest(this);
        } 

    } 

}
