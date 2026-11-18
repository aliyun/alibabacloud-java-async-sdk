// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoRemakeJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoRemakeJobRequest</p>
 */
public class SubmitVideoRemakeJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemakeParams")
    private String remakeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoRemakeJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.input = builder.input;
        this.remakeParams = builder.remakeParams;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoRemakeJobRequest create() {
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
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return remakeParams
     */
    public String getRemakeParams() {
        return this.remakeParams;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitVideoRemakeJobRequest, Builder> {
        private String regionId; 
        private String input; 
        private String remakeParams; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoRemakeJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.input = request.input;
            this.remakeParams = request.remakeParams;
            this.userData = request.userData;
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
         * <p>The input materials. The value is a JSON string with the following structure:</p>
         * <ul>
         * <li>Medias (Array<Object>, required): A non-empty list of media assets. This operation uses the first video in the list and does not support batch remakes. The first item contains the following fields:<ul>
         * <li>Type (String, required): The type of the media asset. For this operation, set the value to video for the first item. The value is case-insensitive.</li>
         * <li>Url (String, mutually exclusive with MediaId): The URL of the media asset. The URL must start with http:// or https:// and cannot exceed 2,048 characters in length. Unregistered URLs are automatically registered as media assets.</li>
         * <li>MediaId (String, mutually exclusive with Url): The ID of the registered media asset. If both Url and MediaId are specified, MediaId takes precedence.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Medias&quot;:[{&quot;Type&quot;:&quot;video&quot;,&quot;Url&quot;:&quot;<a href="https://example.com/source.mp4%22%7D%5D%7D">https://example.com/source.mp4&quot;}]}</a></p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The remake parameters. The value is a JSON string with the following structure:</p>
         * <ul>
         * <li>Product (Object, required): The product information, including the original product and the new product.<ul>
         * <li>OriginalProductName (String, optional): The name of the product or brand in the original video. This is used to locate and replace mentions of the original product.</li>
         * <li>NewProduct (Object, required): The information about the new product.<ul>
         * <li>ProductName (String, required): The name of the product or brand.</li>
         * <li>Description (String, optional): The description of the product.</li>
         * <li>ProductKnowledge (String, optional): The physical knowledge of the product, such as the material and usage.</li>
         * <li>ProductImages (Array\&lt;String\&gt;, required): The images of the new product. The list cannot be empty. Each item is an HTTP or HTTPS URL.</li>
         * <li>SellingPoints (Array\&lt;String\&gt;, optional): The list of selling points of the product.</li>
         * <li>OriginalPrice (String, optional): The original price.</li>
         * <li>CurrentPrice (String, optional): The current price.</li>
         * <li>Discount (String, optional): The discount information, such as &quot;50 off for orders over 200&quot; or &quot;buy one get one free&quot;.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li>AvatarList (Array\&lt;Object\&gt;, optional): The list of character replacements. Single-character and multi-character replacements are supported. Pass one item for single-character replacement and two to five items for multi-character replacement. Each item is an object that describes the replacement relationship between an original character and a new character. If this parameter is not passed or is an empty array, no characters are replaced.<ul>
         * <li>OriginalAvatarImage (String, required for each item in multi-character replacement, optional for single-character replacement): The reference image of the target character in the original video. HTTP and HTTPS URLs or registered image MediaIds are supported. The value cannot be duplicated within the same list.</li>
         * <li>NewAvatarImages (Array\&lt;String\&gt;, required for each item): The list of reference images for the new character. The list cannot be empty. HTTP and HTTPS URLs or registered image MediaIds are supported.</li>
         * <li>AvatarName (String, optional for each item): The role name of the replaced character in the generated script.</li>
         * </ul>
         * </li>
         * <li>VoiceoverLanguage (String, optional): The voiceover language. Explicitly specify the language, such as zh for Chinese or en for English.</li>
         * <li>AdditionalRequirements (String, optional): Additional remake requirements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Product&quot;: {
         *     &quot;OriginalProductName&quot;: &quot;Original Shapewear Bodysuit&quot;,
         *     &quot;NewProduct&quot;: {
         *       &quot;ProductName&quot;: &quot;Compression Shapewear Bodysuit&quot;,
         *       &quot;Description&quot;: &quot;Description of the new product.&quot;,
         *       &quot;ProductImages&quot;: [
         *         &quot;<a href="https://example.com/product-front.png">https://example.com/product-front.png</a>&quot;,
         *         &quot;<a href="https://example.com/product-side.png">https://example.com/product-side.png</a>&quot;,
         *         &quot;<a href="https://example.com/product-back.png">https://example.com/product-back.png</a>&quot;
         *       ],
         *       &quot;ProductKnowledge&quot;: &quot;Product materials, physical characteristics, and usage instructions.&quot;
         *     }
         *   },
         *   &quot;AvatarList&quot;: [
         *     {
         *       &quot;OriginalAvatarImage&quot;: &quot;<a href="https://example.com/original-avatar-a.png">https://example.com/original-avatar-a.png</a>&quot;,
         *       &quot;NewAvatarImages&quot;: [
         *         &quot;<a href="https://example.com/new-avatar-a.png">https://example.com/new-avatar-a.png</a>&quot;
         *       ],
         *       &quot;AvatarName&quot;: &quot;Alice&quot;
         *     },
         *     {
         *       &quot;OriginalAvatarImage&quot;: &quot;<a href="https://example.com/original-avatar-b.png">https://example.com/original-avatar-b.png</a>&quot;,
         *       &quot;NewAvatarImages&quot;: [
         *         &quot;<a href="https://example.com/new-avatar-b.png">https://example.com/new-avatar-b.png</a>&quot;
         *       ],
         *       &quot;AvatarName&quot;: &quot;Bob&quot;
         *     }
         *   ],
         *   &quot;VoiceoverLanguage&quot;: &quot;zh&quot;
         * }</p>
         */
        public Builder remakeParams(String remakeParams) {
            this.putQueryParameter("RemakeParams", remakeParams);
            this.remakeParams = remakeParams;
            return this;
        }

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;NotifyAddress&quot;: &quot;<a href="https://example.com/callback">https://example.com/callback</a>&quot;
         * }</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoRemakeJobRequest build() {
            return new SubmitVideoRemakeJobRequest(this);
        } 

    } 

}
