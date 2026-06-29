// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link MaterialInspectionRequest} extends {@link RequestModel}
 *
 * <p>MaterialInspectionRequest</p>
 */
public class MaterialInspectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRefer")
    private String imageRefer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    private String rules;

    private MaterialInspectionRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.imageRefer = builder.imageRefer;
        this.imageUrl = builder.imageUrl;
        this.reqId = builder.reqId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaterialInspectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return imageRefer
     */
    public String getImageRefer() {
        return this.imageRefer;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<MaterialInspectionRequest, Builder> {
        private String apiId; 
        private String imageRefer; 
        private String imageUrl; 
        private String reqId; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(MaterialInspectionRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.imageRefer = request.imageRefer;
            this.imageUrl = request.imageUrl;
            this.reqId = request.reqId;
            this.rules = request.rules;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * ImageRefer.
         */
        public Builder imageRefer(String imageRefer) {
            this.putQueryParameter("ImageRefer", imageRefer);
            this.imageRefer = imageRefer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/store.jpg">https://example.com/store.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * ReqId.
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public MaterialInspectionRequest build() {
            return new MaterialInspectionRequest(this);
        } 

    } 

}
