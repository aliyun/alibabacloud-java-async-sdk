// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetKnowledgeRecallRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeRecallRequest</p>
 */
public class GetKnowledgeRecallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Images")
    private String images;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Question")
    @com.aliyun.core.annotation.Validation(required = true)
    private String question;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SemanticRules")
    private String semanticRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topk")
    private Integer topk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private GetKnowledgeRecallRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.images = builder.images;
        this.path = builder.path;
        this.question = builder.question;
        this.semanticRules = builder.semanticRules;
        this.tags = builder.tags;
        this.topk = builder.topk;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeRecallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return images
     */
    public String getImages() {
        return this.images;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return semanticRules
     */
    public String getSemanticRules() {
        return this.semanticRules;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return topk
     */
    public Integer getTopk() {
        return this.topk;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<GetKnowledgeRecallRequest, Builder> {
        private String DBClusterId; 
        private String images; 
        private String path; 
        private String question; 
        private String semanticRules; 
        private String tags; 
        private Integer topk; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeRecallRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.images = request.images;
            this.path = request.path;
            this.question = request.question;
            this.semanticRules = request.semanticRules;
            this.tags = request.tags;
            this.topk = request.topk;
            this.user = request.user;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp19aaaaaa****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The array of images to search for image retrieval. Currently, only one image is supported. The image must be Base64-encoded and passed in JSON format. Set the base64 key to the encoded image and the mime_type key to the image format. For more information, see the examples.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;base64&quot;: &quot;/9j/4AAQSkZJRgABAQ...&quot;, &quot;mime_type&quot;: &quot;image/jpeg&quot;}]</p>
         */
        public Builder images(String images) {
            this.putBodyParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * <p>The file path prefix. Only files that match the path prefix are retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucketName/path/prefix/</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The question for knowledge base retrieval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>What are the reports for the clothing category this month?</p>
         */
        public Builder question(String question) {
            this.putQueryParameter("Question", question);
            this.question = question;
            return this;
        }

        /**
         * <p>The semantic rules. Currently, only &quot;all&quot; and &quot;&quot; are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder semanticRules(String semanticRules) {
            this.putQueryParameter("SemanticRules", semanticRules);
            this.semanticRules = semanticRules;
            return this;
        }

        /**
         * <p>The list of tags in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;tag_key1&quot;: [&quot;tag_key1_value1&quot;, &quot;tag_key1_value2&quot;],   &quot;tag_key2&quot;: [&quot;tag_key2_value&quot;] }</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The top K value for retrieving associated files.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder topk(Integer topk) {
            this.putQueryParameter("Topk", topk);
            this.topk = topk;
            return this;
        }

        /**
         * <p>The username. Only files that the user has permissions to access are retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>user_name1</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public GetKnowledgeRecallRequest build() {
            return new GetKnowledgeRecallRequest(this);
        } 

    } 

}
