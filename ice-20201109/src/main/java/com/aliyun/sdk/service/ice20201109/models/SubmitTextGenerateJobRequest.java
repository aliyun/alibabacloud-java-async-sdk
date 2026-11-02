// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitTextGenerateJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTextGenerateJobRequest</p>
 */
public class SubmitTextGenerateJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateConfig")
    private String generateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitTextGenerateJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.generateConfig = builder.generateConfig;
        this.title = builder.title;
        this.type = builder.type;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTextGenerateJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return generateConfig
     */
    public String getGenerateConfig() {
        return this.generateConfig;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitTextGenerateJobRequest, Builder> {
        private String description; 
        private String generateConfig; 
        private String title; 
        private String type; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTextGenerateJobRequest request) {
            super(request);
            this.description = request.description;
            this.generateConfig = request.generateConfig;
            this.title = request.title;
            this.type = request.type;
            this.userData = request.userData;
        } 

        /**
         * <p>The description of the task. The description can be up to 1,024 bytes in length and must be encoded in UTF-8.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The generation configuration. When Type is set to Title or MarketingCopy, you must specify the following fields:</p>
         * <ul>
         * <li>keywords: the keywords used to generate the title or marketing copy. Required.</li>
         * <li>textLength: the word count of the generated copy. Valid values: 5 to 1000. The actual word count of the generated copy may be slightly less than or equal to this value, but will not exceed it. Required.</li>
         * <li>targetCount: the number of copies to generate. Valid values: 1 to 1000. Required.</li>
         * </ul>
         * <p>When Type is set to StoryboardScript, you must specify the following field:</p>
         * <ul>
         * <li>originText: the original copy used to generate the storyboard script. Required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;keywords&quot;:&quot;New store cake,Animal cream&quot;,&quot;textLength&quot;:100,&quot;targetCount&quot;:3} or {&quot;originText&quot;: &quot;A new cake shop has opened on the street,Selling cream cakes,Fruit cake,Bread,Muffins, etc..A coffee shop has opened across from the cake shop,An endless stream of customers.&quot;}</p>
         */
        public Builder generateConfig(String generateConfig) {
            this.putQueryParameter("GenerateConfig", generateConfig);
            this.generateConfig = generateConfig;
            return this;
        }

        /**
         * <p>The title of the task.</p>
         * <ul>
         * <li><p>The length cannot exceed 128 bytes.</p>
         * </li>
         * <li><p>The title must be encoded in UTF-8.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test Title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li>MarketingCopy: marketing copy</li>
         * <li>Title: short video title</li>
         * <li>StoryboardScript: storyboard script generated from copy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MarketingCopy</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The custom settings in JSON format. The length cannot exceed 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitTextGenerateJobRequest build() {
            return new SubmitTextGenerateJobRequest(this);
        } 

    } 

}
