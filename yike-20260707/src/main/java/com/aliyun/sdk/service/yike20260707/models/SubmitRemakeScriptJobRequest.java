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
 * {@link SubmitRemakeScriptJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitRemakeScriptJobRequest</p>
 */
public class SubmitRemakeScriptJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemakeParams")
    private String remakeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemakeType")
    private String remakeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitRemakeScriptJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.remakeParams = builder.remakeParams;
        this.remakeType = builder.remakeType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitRemakeScriptJobRequest create() {
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
     * @return remakeParams
     */
    public String getRemakeParams() {
        return this.remakeParams;
    }

    /**
     * @return remakeType
     */
    public String getRemakeType() {
        return this.remakeType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitRemakeScriptJobRequest, Builder> {
        private String regionId; 
        private String remakeParams; 
        private String remakeType; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitRemakeScriptJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.remakeParams = request.remakeParams;
            this.remakeType = request.remakeType;
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
         * <p>The remake parameters in JSON string format. The structure varies depending on the RemakeType. For faithful-remake, the structure is as follows:</p>
         * <ul>
         * <li>ComprehensionResult (String, required): The content understanding result, which is the URL of a JSON file.</li>
         * <li>Product (Object, required): The product information, including the original and new products.<ul>
         * <li>OriginalProductName (String, required): The product or brand name in the original video, used to locate and replace mentions of the original product.</li>
         * <li>NewProduct (Object, required): The new product information.<ul>
         * <li>ProductName (String, required): The product or brand name.</li>
         * <li>Description (String, required): The product description.</li>
         * <li>ProductKnowledge (String, optional): The physical knowledge of the product, such as the material and usage.</li>
         * <li>ProductImages (Array<String>, required): The images of the new product. This array cannot be empty, and each item must be an HTTP or HTTPS URL.</li>
         * <li>SellingPoints (Array<String>, optional): The list of product selling points.</li>
         * <li>OriginalPrice (String, optional): The original price.</li>
         * <li>CurrentPrice (String, optional): The current price.</li>
         * <li>Discount (String, optional): The discount information, such as &quot;50 off for orders over 200&quot; or &quot;buy one get one free&quot;.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li>AvatarList (Array<Object>, optional): The list of avatar replacements, supporting single and multiple avatar replacements. We recommend using this field. Pass one item for a single avatar and two to five items for multiple avatars. Each item is an object that describes the replacement relationship between an original avatar and a new avatar:<ul>
         * <li>OriginalAvatarName (String, required for each item): The name of the avatar to be replaced in the original video. Use the avatar name from the video breakdown result to locate the replacement target in the script or video. The original avatar names in the same list cannot be duplicated.</li>
         * <li>NewAvatarImages (Array<String>, required for each item): The list of reference images for the new avatar. This array cannot be empty. Images can be HTTP or HTTPS URLs or registered image MediaIds. Currently, only the first image is used.</li>
         * <li>AvatarName (String, optional for each item): The role name of the replaced avatar in the generated script.</li>
         * </ul>
         * </li>
         * <li>Avatar (Object, optional): The single avatar replacement information compatible with historical calls, retained as a transitional field. We recommend using AvatarList for new integrations and subsequent calls. The field structure is the same as a single item in AvatarList. When using this field, OriginalAvatarName and NewAvatarImages are required, and AvatarName is optional.</li>
         * <li>VoiceoverLanguage (String, optional): The voiceover language. Valid values: zh (Chinese), en (English), es (Spanish), pt (Portuguese), fr (French), de (German), ja (Japanese), ko (Korean), and ar (Arabic). We recommend explicitly specifying this parameter.</li>
         * <li>AdditionalRequirements (String, optional): Additional remake requirements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ComprehensionResult&quot;: &quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json">https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json</a>&quot;,
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
         *       &quot;OriginalAvatarName&quot;: &quot;Original Person A&quot;,
         *       &quot;NewAvatarImages&quot;: [
         *         &quot;<a href="https://example.com/new-avatar-a.png">https://example.com/new-avatar-a.png</a>&quot;
         *       ],
         *       &quot;AvatarName&quot;: &quot;Alice&quot;
         *     },
         *     {
         *       &quot;OriginalAvatarName&quot;: &quot;Original Person B&quot;,
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
         * <p>The remake type, which determines the structure of RemakeParams. Currently, only faithful-remake is supported. This type faithfully remakes the original viral video structure segment by segment, replacing the product and avatar.</p>
         * 
         * <strong>example:</strong>
         * <p>faithful-remake</p>
         */
        public Builder remakeType(String remakeType) {
            this.putQueryParameter("RemakeType", remakeType);
            this.remakeType = remakeType;
            return this;
        }

        /**
         * <p>The custom parameters in JSON string format, which are returned as-is in the callback result, such as newsKey. The system reserves the NotifyAddress field for the callback URL, which is invoked after the task is completed.</p>
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
        public SubmitRemakeScriptJobRequest build() {
            return new SubmitRemakeScriptJobRequest(this);
        } 

    } 

}
