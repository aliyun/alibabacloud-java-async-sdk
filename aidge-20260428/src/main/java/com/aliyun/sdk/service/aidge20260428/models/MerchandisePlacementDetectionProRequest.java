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
 * {@link MerchandisePlacementDetectionProRequest} extends {@link RequestModel}
 *
 * <p>MerchandisePlacementDetectionProRequest</p>
 */
public class MerchandisePlacementDetectionProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private MerchandisePlacementDetectionProRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.rule = builder.rule;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MerchandisePlacementDetectionProRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<MerchandisePlacementDetectionProRequest, Builder> {
        private String imageUrl; 
        private String rule; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(MerchandisePlacementDetectionProRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.rule = request.rule;
            this.type = request.type;
        } 

        /**
         * <p>The HTTPS URL of the display image to detect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The detection rule. When non-empty, this value takes priority as the model prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Identify all Genki Forest beverages on the shelf and mark their positions</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>The product type. This parameter must be set to Genki Forest when Rule is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>元气森林</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public MerchandisePlacementDetectionProRequest build() {
            return new MerchandisePlacementDetectionProRequest(this);
        } 

    } 

}
