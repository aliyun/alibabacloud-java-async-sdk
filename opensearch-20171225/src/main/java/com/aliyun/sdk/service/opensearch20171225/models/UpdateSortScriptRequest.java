// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link UpdateSortScriptRequest} extends {@link RequestModel}
 *
 * <p>UpdateSortScriptRequest</p>
 */
public class UpdateSortScriptRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("scriptName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private UpdateSortScriptRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appVersionId = builder.appVersionId;
        this.scriptName = builder.scriptName;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSortScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateSortScriptRequest, Builder> {
        private String appGroupIdentity; 
        private String appVersionId; 
        private String scriptName; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSortScriptRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appVersionId = request.appVersionId;
            this.scriptName = request.scriptName;
            this.description = request.description;
        } 

        /**
         * <p>The name of the application or the ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_app</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The version number of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * <p>The name of the script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_cava</p>
         */
        public Builder scriptName(String scriptName) {
            this.putPathParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateSortScriptRequest build() {
            return new UpdateSortScriptRequest(this);
        } 

    } 

}
