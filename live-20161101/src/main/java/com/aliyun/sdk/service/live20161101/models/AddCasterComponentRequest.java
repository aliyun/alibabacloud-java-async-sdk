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
 * {@link AddCasterComponentRequest} extends {@link RequestModel}
 *
 * <p>AddCasterComponentRequest</p>
 */
public class AddCasterComponentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaptionLayerContent")
    private String captionLayerContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentLayer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentName")
    private String componentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Effect")
    private String effect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HtmlLayerContent")
    private String htmlLayerContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageLayerContent")
    private String imageLayerContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayerOrder")
    private String layerOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String locationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextLayerContent")
    private String textLayerContent;

    private AddCasterComponentRequest(Builder builder) {
        super(builder);
        this.captionLayerContent = builder.captionLayerContent;
        this.casterId = builder.casterId;
        this.componentLayer = builder.componentLayer;
        this.componentName = builder.componentName;
        this.componentType = builder.componentType;
        this.effect = builder.effect;
        this.htmlLayerContent = builder.htmlLayerContent;
        this.imageLayerContent = builder.imageLayerContent;
        this.layerOrder = builder.layerOrder;
        this.locationId = builder.locationId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.textLayerContent = builder.textLayerContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterComponentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captionLayerContent
     */
    public String getCaptionLayerContent() {
        return this.captionLayerContent;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return componentLayer
     */
    public String getComponentLayer() {
        return this.componentLayer;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return componentType
     */
    public String getComponentType() {
        return this.componentType;
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return htmlLayerContent
     */
    public String getHtmlLayerContent() {
        return this.htmlLayerContent;
    }

    /**
     * @return imageLayerContent
     */
    public String getImageLayerContent() {
        return this.imageLayerContent;
    }

    /**
     * @return layerOrder
     */
    public String getLayerOrder() {
        return this.layerOrder;
    }

    /**
     * @return locationId
     */
    public String getLocationId() {
        return this.locationId;
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
     * @return textLayerContent
     */
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

    public static final class Builder extends Request.Builder<AddCasterComponentRequest, Builder> {
        private String captionLayerContent; 
        private String casterId; 
        private String componentLayer; 
        private String componentName; 
        private String componentType; 
        private String effect; 
        private String htmlLayerContent; 
        private String imageLayerContent; 
        private String layerOrder; 
        private String locationId; 
        private Long ownerId; 
        private String regionId; 
        private String textLayerContent; 

        private Builder() {
            super();
        } 

        private Builder(AddCasterComponentRequest request) {
            super(request);
            this.captionLayerContent = request.captionLayerContent;
            this.casterId = request.casterId;
            this.componentLayer = request.componentLayer;
            this.componentName = request.componentName;
            this.componentType = request.componentType;
            this.effect = request.effect;
            this.htmlLayerContent = request.htmlLayerContent;
            this.imageLayerContent = request.imageLayerContent;
            this.layerOrder = request.layerOrder;
            this.locationId = request.locationId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.textLayerContent = request.textLayerContent;
        } 

        /**
         * <p>The information about the caption layer. This parameter contains the following fields:</p>
         * <blockquote>
         * <p> This parameter is required when the ComponentType parameter is set to caption.</p>
         * </blockquote>
         * <ul>
         * <li><strong>SizeNormalized</strong>: the normalized font size. The font size is set to font_size/output_height. The value range is <code>[0,1]</code> and accurate to two decimal places. If the font size calculated by the system based on the normalization method is greater than <strong>1024</strong>, <strong>1024</strong> is used.</li>
         * <li><strong>BorderWidthNormalized</strong>: the normalized value of the text border width, which is calculated based on the size of the text, namely &quot;BorderWidth/FontSize&quot;. The value range is <code>[0,1]</code> and accurate to two decimal places. If the value calculated according to the normalization method exceeds <strong>16</strong>, <strong>16</strong> is used. The default value is <strong>0</strong>.</li>
         * <li><strong>FontName</strong>: the font name. For more information about the value, see <strong>Font description</strong>. The default font name is KaiTi.</li>
         * <li><strong>BorderColor</strong>: the color of the text border. Valid values: 0x000000 to 0xffffff. By default, this parameter is not set. In this case, the color of the text border is transparent.</li>
         * <li><strong>LocationId</strong>: the channel ID of the source subtitle.</li>
         * <li><strong>SourceLan</strong>: the source language of the audio in the source video. Valid values: en, cn, es, and ru, which indicate English, Chinese, Spanish, and Russian respectively. Default value: cn.</li>
         * <li><strong>TargetLan</strong>: the target audio language in the source video. If you do not specify this field, speech recognition is used. If you specify this field, translation is used. Valid values: en, cn, es, and ru, which indicate English, Chinese, Spanish, and Russian respectively. Default value: cn.</li>
         * <li><strong>ShowSourceLan</strong>: specifies whether to display the source language. Valid values: true: displays the source language. false: hides the source language. Default value: false.</li>
         * <li><strong>Truncation</strong>: specifies whether to allow caption truncation. Valid values: true: specifies that the caption can be truncated. false: specifies that the caption cannot be truncated. Default value: false.</li>
         * <li><strong>SourceLanPerLineWordCount</strong>: the number of words displayed in each line when the subtitle is in the source language. Default value: 20.</li>
         * <li><strong>TargetLanPerLineWordCount</strong>: the number of words displayed in each line when the subtitle is in the destination language. Default value: 20.</li>
         * <li><strong>SourceLanReservePages</strong>: the number of lines reserved when the subtitle is in the source language. This field takes effect only when the Truncation field is set to true. Default value: 2.</li>
         * <li><strong>TargetLanReservePages</strong>: the number of lines reserved when the subtitle is in the destination language. This field takes effect only when the Truncation field is set to true. Default value: 2.</li>
         * </ul>
         * <p>The value is a JSON string. Use upper camel case for field names.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;BorderWidthNormalized&quot;:0.01,&quot;SizeNormalized&quot;:0.05,&quot;Color&quot;:&quot;0x000000&quot;,&quot;LocationId&quot;:&quot;RV01&quot;,&quot;SourceLan&quot;:&quot;cn&quot;,&quot;FontName&quot;:&quot;KaiTi&quot;,&quot;BorderColor&quot;:&quot;0xffffff&quot;}</p>
         */
        public Builder captionLayerContent(String captionLayerContent) {
            this.putQueryParameter("CaptionLayerContent", captionLayerContent);
            this.captionLayerContent = captionLayerContent;
            return this;
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
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The information about the component layer, such as the size and layout. This parameter contains the following fields:</p>
         * <ul>
         * <li><strong>HeightNormalized</strong>: the normalized value of heights for the elements in the component layer</li>
         * <li><strong>WidthNormalized</strong>: the normalized value of widths for the elements in the component layer</li>
         * <li><strong>PositionNormalized</strong>: the normalized value of the coordinates of the component layer</li>
         * <li><strong>PositionRefer</strong>: the reference coordinates of the component layer.</li>
         * </ul>
         * <p>The value is a JSON string. Use upper camel case for field names.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HeightNormalized&quot;:&quot;1&quot;,&quot;PositionRefer&quot;:&quot;topRight&quot;,&quot;WidthNormalized&quot;:&quot;0&quot;,&quot;PositionNormalized&quot;:[&quot;0.1&quot;,&quot;0.2&quot;]}</p>
         */
        public Builder componentLayer(String componentLayer) {
            this.putQueryParameter("ComponentLayer", componentLayer);
            this.componentLayer = componentLayer;
            return this;
        }

        /**
         * <p>The component name. By default, the component name is the component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>text01</p>
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * <p>The component type. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: a text component. If you set ComponentType to text, you must also specify TextLayerContent.</li>
         * <li><strong>image</strong>: an image component. If you set ComponentType to image, you must also specify ImageLayerContent.</li>
         * <li><strong>caption</strong>: a caption component. If you set ComponentType to caption, you must also specify CaptionLayerContent.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder componentType(String componentType) {
            this.putQueryParameter("ComponentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * <p>The effect of the component. Valid values:</p>
         * <ul>
         * <li><strong>none (default)</strong></li>
         * <li><strong>animateH</strong>: horizontal scrolling</li>
         * <li><strong>animateV</strong>: vertical scrolling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>animateH</p>
         */
        public Builder effect(String effect) {
            this.putQueryParameter("Effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * <p>The information about the HTML5 layer.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;htmlUrl&quot;:<a href="http://caster.example.com%7D">http://caster.example.com}</a></p>
         */
        public Builder htmlLayerContent(String htmlLayerContent) {
            this.putQueryParameter("HtmlLayerContent", htmlLayerContent);
            this.htmlLayerContent = htmlLayerContent;
            return this;
        }

        /**
         * <p>The information about the image layer. This parameter contains the following fields:</p>
         * <blockquote>
         * <p> This parameter is required when the ComponentType parameter is set to image.</p>
         * </blockquote>
         * <p>MaterialId: the ID of the asset from the media asset library. The name that you set when you upload an asset is the ID of the asset.</p>
         * <p>The value is a JSON string. Use upper camel case for field names.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MaterialId&quot;:&quot;6cf724c6ebfd4a59b5b3cec6f10d****&quot;}</p>
         */
        public Builder imageLayerContent(String imageLayerContent) {
            this.putQueryParameter("ImageLayerContent", imageLayerContent);
            this.imageLayerContent = imageLayerContent;
            return this;
        }

        /**
         * <p>The layer stacking order of the component. Valid values:</p>
         * <ul>
         * <li>cover</li>
         * <li>background</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cover</p>
         */
        public Builder layerOrder(String layerOrder) {
            this.putQueryParameter("LayerOrder", layerOrder);
            this.layerOrder = layerOrder;
            return this;
        }

        /**
         * <p>The location ID of the component. Each location ID can be assigned to only one component and must be in the RC[Number] format. The values specified by this parameter must be in ascending order, such as RC01 to RC99.</p>
         * <blockquote>
         * <p> If the ComponentType parameter is set to caption, the LocationId parameter specifies the location ID of the video source referenced by the component.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RC01</p>
         */
        public Builder locationId(String locationId) {
            this.putQueryParameter("LocationId", locationId);
            this.locationId = locationId;
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
         * <p>The information about the text layer. This parameter contains the following fields:</p>
         * <blockquote>
         * <p> This parameter is available and required only when the ComponentType parameter is set to text.</p>
         * </blockquote>
         * <ul>
         * <li><strong>SizeNormalized</strong>: the normalized font size. The font size is set to font_size/output_height. The value range is <code>[0,1]</code>. If the font size calculated by the system based on the normalization method is greater than 1024, 1024 is used.</li>
         * <li><strong>BorderWidthNormalized</strong>: the normalized value of the text border width. The normalized value is calculated based on the size of the text, that is, &quot;BorderWidth/FontSize&quot;. The value range is <code>[0,1]</code>. If the value calculated based on the normalization method exceeds 16, 16 is used. The default value is 0.</li>
         * <li><strong>FontName</strong>: the font name. For more information about the value, see <strong>Font description</strong>. The default value is KaiTi.</li>
         * <li><strong>BorderColor</strong>: the color of the text border. Valid values: 0x000000 to 0xffffff. By default, this parameter is not set. In this case, the color of the text border is transparent.</li>
         * <li><strong>Text</strong>: the content of the text. By default, this parameter is not set. In this case, the text contains no content.</li>
         * <li><strong>Color</strong>: the color of the text. The default value is 0xff0000, which indicates that the text is in red.</li>
         * </ul>
         * <p>The value is a JSON string. Use upper camel case for field names.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;BorderWidthNormalized&quot;:&quot;1&quot;,&quot;SizeNormalized&quot;:&quot;0.2&quot;,&quot;Color&quot;:&quot;0x000000&quot;,&quot;FontName&quot;:&quot;KaiTi&quot;,&quot;BorderColor&quot;:&quot;0x000000&quot;,&quot;Text&quot;:&quot;hello world!&quot;}</p>
         */
        public Builder textLayerContent(String textLayerContent) {
            this.putQueryParameter("TextLayerContent", textLayerContent);
            this.textLayerContent = textLayerContent;
            return this;
        }

        @Override
        public AddCasterComponentRequest build() {
            return new AddCasterComponentRequest(this);
        } 

    } 

}
