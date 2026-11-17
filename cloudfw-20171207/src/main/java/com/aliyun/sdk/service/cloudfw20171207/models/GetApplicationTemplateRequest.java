// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link GetApplicationTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationTemplateRequest</p>
 */
public class GetApplicationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuiltInApplicationActionType")
    private String builtInApplicationActionType;

    private GetApplicationTemplateRequest(Builder builder) {
        super(builder);
        this.applicationTemplateId = builder.applicationTemplateId;
        this.builtInApplicationActionType = builder.builtInApplicationActionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    /**
     * @return builtInApplicationActionType
     */
    public String getBuiltInApplicationActionType() {
        return this.builtInApplicationActionType;
    }

    public static final class Builder extends Request.Builder<GetApplicationTemplateRequest, Builder> {
        private String applicationTemplateId; 
        private String builtInApplicationActionType; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationTemplateRequest request) {
            super(request);
            this.applicationTemplateId = request.applicationTemplateId;
            this.builtInApplicationActionType = request.builtInApplicationActionType;
        } 

        /**
         * <p>The ID of the application template to query. The template must exist within the current Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ati-4f0691c56b8d4f06</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * <p>The return scope for built-in application actions. Valid values:</p>
         * <ul>
         * <li><strong>Custom</strong>: returns only applications whose actions have been customized by the user. This is the default value.</li>
         * <li><strong>All</strong>: returns all built-in applications.
         * The priority of action effectiveness is: user customization &gt; template default &gt; application library default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder builtInApplicationActionType(String builtInApplicationActionType) {
            this.putQueryParameter("BuiltInApplicationActionType", builtInApplicationActionType);
            this.builtInApplicationActionType = builtInApplicationActionType;
            return this;
        }

        @Override
        public GetApplicationTemplateRequest build() {
            return new GetApplicationTemplateRequest(this);
        } 

    } 

}
