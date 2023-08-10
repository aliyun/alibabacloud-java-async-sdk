// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompileSortScriptRequest} extends {@link RequestModel}
 *
 * <p>CompileSortScriptRequest</p>
 */
public class CompileSortScriptRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("scriptName")
    @Validation(required = true)
    private String scriptName;

    @Path
    @NameInMap("appVersionId")
    private String appVersionId;

    private CompileSortScriptRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.scriptName = builder.scriptName;
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompileSortScriptRequest create() {
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
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public static final class Builder extends Request.Builder<CompileSortScriptRequest, Builder> {
        private String appGroupIdentity; 
        private String scriptName; 
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(CompileSortScriptRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.scriptName = request.scriptName;
            this.appVersionId = request.appVersionId;
        } 

        /**
         * search
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * script
         */
        public Builder scriptName(String scriptName) {
            this.putPathParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * 1234567
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        @Override
        public CompileSortScriptRequest build() {
            return new CompileSortScriptRequest(this);
        } 

    } 

}
