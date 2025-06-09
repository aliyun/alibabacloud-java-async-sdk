// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link CallAiToolsRequest} extends {@link RequestModel}
 *
 * <p>CallAiToolsRequest</p>
 */
public class CallAiToolsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private java.util.Map<String, String> params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("toolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toolName;

    private CallAiToolsRequest(Builder builder) {
        super(builder);
        this.params = builder.params;
        this.regionId = builder.regionId;
        this.toolName = builder.toolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CallAiToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return params
     */
    public java.util.Map<String, String> getParams() {
        return this.params;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    public static final class Builder extends Request.Builder<CallAiToolsRequest, Builder> {
        private java.util.Map<String, String> params; 
        private String regionId; 
        private String toolName; 

        private Builder() {
            super();
        } 

        private Builder(CallAiToolsRequest request) {
            super(request);
            this.params = request.params;
            this.regionId = request.regionId;
            this.toolName = request.toolName;
        } 

        /**
         * params.
         */
        public Builder params(java.util.Map<String, String> params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder toolName(String toolName) {
            this.putBodyParameter("toolName", toolName);
            this.toolName = toolName;
            return this;
        }

        @Override
        public CallAiToolsRequest build() {
            return new CallAiToolsRequest(this);
        } 

    } 

}
