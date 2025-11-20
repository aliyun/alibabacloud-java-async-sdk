// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationMseServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationMseServiceRequest</p>
 */
public class DescribeApplicationMseServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAhas")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableAhas;

    private DescribeApplicationMseServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.enableAhas = builder.enableAhas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationMseServiceRequest create() {
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
     * @return enableAhas
     */
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationMseServiceRequest, Builder> {
        private String appId; 
        private Boolean enableAhas; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationMseServiceRequest request) {
            super(request);
            this.appId = request.appId;
            this.enableAhas = request.enableAhas;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Specifies whether to enable traffic limiting and degradation. Set to true to check traffic limiting and degradation permissions when accessing related APIs; set to false otherwise.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAhas(Boolean enableAhas) {
            this.putQueryParameter("EnableAhas", enableAhas);
            this.enableAhas = enableAhas;
            return this;
        }

        @Override
        public DescribeApplicationMseServiceRequest build() {
            return new DescribeApplicationMseServiceRequest(this);
        } 

    } 

}
