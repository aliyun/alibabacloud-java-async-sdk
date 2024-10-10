// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeComponentsRequest} extends {@link RequestModel}
 *
 * <p>DescribeComponentsRequest</p>
 */
public class DescribeComponentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeComponentsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeComponentsRequest, Builder> {
        private String appId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComponentsRequest request) {
            super(request);
            this.appId = request.appId;
            this.type = request.type;
        } 

        /**
         * <p>TOMCAT</p>
         * 
         * <strong>example:</strong>
         * <p>d700e680-aa4d-4ec1-afc2-6566b5ff****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TOMCAT</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeComponentsRequest build() {
            return new DescribeComponentsRequest(this);
        } 

    } 

}
