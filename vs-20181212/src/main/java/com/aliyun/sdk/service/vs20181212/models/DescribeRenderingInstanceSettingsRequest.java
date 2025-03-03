// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeRenderingInstanceSettingsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRenderingInstanceSettingsRequest</p>
 */
public class DescribeRenderingInstanceSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttributeNames")
    private java.util.List<String> attributeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    private DescribeRenderingInstanceSettingsRequest(Builder builder) {
        super(builder);
        this.attributeNames = builder.attributeNames;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingInstanceSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeNames
     */
    public java.util.List<String> getAttributeNames() {
        return this.attributeNames;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeRenderingInstanceSettingsRequest, Builder> {
        private java.util.List<String> attributeNames; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRenderingInstanceSettingsRequest request) {
            super(request);
            this.attributeNames = request.attributeNames;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * AttributeNames.
         */
        public Builder attributeNames(java.util.List<String> attributeNames) {
            String attributeNamesShrink = shrink(attributeNames, "AttributeNames", "json");
            this.putQueryParameter("AttributeNames", attributeNamesShrink);
            this.attributeNames = attributeNames;
            return this;
        }

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public DescribeRenderingInstanceSettingsRequest build() {
            return new DescribeRenderingInstanceSettingsRequest(this);
        } 

    } 

}
