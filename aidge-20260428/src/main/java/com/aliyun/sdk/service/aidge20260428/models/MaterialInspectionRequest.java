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
         * <p>apiId</p>
         * 
         * <strong>example:</strong>
         * <p>fb0012f49b004f889207a3c5e6ef8da9</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The URL of the reference image. This parameter is optional. If a non-empty value is specified, multi-image differential comparison is performed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/reference.jpg">https://example.com/reference.jpg</a></p>
         */
        public Builder imageRefer(String imageRefer) {
            this.putQueryParameter("ImageRefer", imageRefer);
            this.imageRefer = imageRefer;
            return this;
        }

        /**
         * <p>The URL of the target image.</p>
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
         * <p>The business request identity. This parameter is optional. The value is returned as-is in the response for Tracing Analysis purposes.</p>
         * 
         * <strong>example:</strong>
         * <p>req-2026-06-04-001</p>
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        /**
         * <p>The rule prompt in natural language.</p>
         * 
         * <strong>example:</strong>
         * <p>The door-shaped display stand must be placed in the entrance area; the functional card stand must be placed on the counter surface</p>
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
