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
         * <p>The remake parameters (JSON string). The structure varies depending on <code>RemakeType</code>. For <code>faithful-remake</code>, the structure is as follows:</p>
         * <ul>
         * <li><p>ComprehensionResult (string, required): The content comprehension result. A URL to a JSON file.</p>
         * </li>
         * <li><p>Product (Object, required): The product information (original product + new product).</p>
         * <ul>
         * <li><p>OriginalProductName (String, required): The product or brand name in the original video (the object to be replaced). Used to locate and replace mentions of the original product in the script.</p>
         * </li>
         * <li><p>NewProduct (Object, required): The new product information. </p>
         * <ul>
         * <li>ProductName (String, required): The product or brand name.</li>
         * <li>Description (String, required): The product description.</li>
         * <li>ProductKnowledge (String, required): The physical knowledge of the product, such as material and usage instructions.</li>
         * <li>ProductImages (Array\&lt;String\&gt;, required): The images of the new product. Must not be empty. Each item is an http(s) URL.</li>
         * <li>SellingPoints (Array\&lt;String\&gt;, optional): The list of product selling points.</li>
         * <li>OriginalPrice (String, optional): The original price.</li>
         * <li>CurrentPrice (String, optional): The current price.</li>
         * <li>Discount (String, optional): The discount information, such as &quot;50 off 200&quot; or &quot;buy one get one free&quot;.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>Avatar (Object, required): The model information (original model + new model).</p>
         * <ul>
         * <li>NewAvatarImages (Array\&lt;String\&gt;, required): The list of new model images. Must not be empty. Each item is a media asset ID or an image URL (when a URL is provided, the system automatically registers it as a media asset). <strong>Currently, only 1 image is supported</strong> (only the first element of the array is used). The array format is reserved for future expansion.</li>
         * <li>OriginalAvatarName (String, required): The name of the model in the original video (the object to be replaced). Used to locate and replace the original model in the script and visuals.</li>
         * </ul>
         * </li>
         * <li><p>VoiceoverLanguage (String, optional): The voiceover language. Valid values: <code>zh</code> (Chinese), <code>en</code> (English), <code>es</code> (Spanish), <code>pt</code> (Portuguese), <code>fr</code> (French), <code>de</code> (German), <code>ja</code> (Japanese), <code>ko</code> (Korean), <code>ar</code> (Arabic). Default value: <code>zh</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ComprehensionResult&quot;: &quot;<a href="http://xxxx.json">http://xxxx.json</a>&quot;,
         *     &quot;Product&quot;:
         *     {
         *         &quot;OriginalProductName&quot;: &quot;xxxx&quot;,
         *         &quot;NewProduct&quot;:
         *         {
         *             &quot;ProductName&quot;: &quot;xxxx&quot;,
         *             &quot;Description&quot;: &quot;xxxx&quot;,
         *             &quot;ProductImages&quot;:
         *             [
         *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;,
         *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;,
         *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;
         *             ],
         *             &quot;ProductKnowledge&quot;: &quot;xxxx&quot;
         *         }
         *     },
         *     &quot;Avatar&quot;:
         *     {
         *         &quot;NewAvatarImages&quot;:
         *         [
         *             &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;
         *         ],
         *         &quot;OriginalAvatarName&quot;: &quot;xxxx&quot;
         *     },
         *     &quot;VoiceoverLanguage&quot;: &quot;zh&quot;
         * }</p>
         */
        public Builder remakeParams(String remakeParams) {
            this.putQueryParameter("RemakeParams", remakeParams);
            this.remakeParams = remakeParams;
            return this;
        }

        /**
         * <p>The remake type, which determines the structure of <code>RemakeParams</code>. Currently, only <code>faithful-remake</code> is supported (faithful remake: remakes the original hit video segment by segment, replacing the product and model).</p>
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
         * <p>The custom parameters in JSON format. These parameters are returned as-is in the callback result (for example, newsKey). The system reserved field NotifyAddress specifies the callback URL. The system sends a callback to this URL after the task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
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
