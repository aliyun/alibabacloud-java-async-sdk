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
         * <p>The job description, which can be up to 1,024 bytes in length and must be encoded in UTF-8.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The text generation configurations, including keywords and the requirements for the word count and number of output copies.</p>
         */
        public Builder generateConfig(String generateConfig) {
            this.putQueryParameter("GenerateConfig", generateConfig);
            this.generateConfig = generateConfig;
            return this;
        }

        /**
         * <p>The job title.</p>
         * <p>The job title can be up to 128 bytes in length.</p>
         * <p>The value must be encoded in UTF-8.</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The job type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>MarketingCopy: the marketing copy.</li>
         * <li>Title: the short video title.</li>
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
         * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
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
