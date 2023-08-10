// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSortScriptFileRequest} extends {@link RequestModel}
 *
 * <p>GetSortScriptFileRequest</p>
 */
public class GetSortScriptFileRequest extends Request {
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
    @Validation(required = true)
    private String appVersionId;

    @Path
    @NameInMap("fileName")
    @Validation(required = true)
    private String fileName;

    private GetSortScriptFileRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.scriptName = builder.scriptName;
        this.appVersionId = builder.appVersionId;
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSortScriptFileRequest create() {
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

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<GetSortScriptFileRequest, Builder> {
        private String appGroupIdentity; 
        private String scriptName; 
        private String appVersionId; 
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(GetSortScriptFileRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.scriptName = request.scriptName;
            this.appVersionId = request.appVersionId;
            this.fileName = request.fileName;
        } 

        /**
         * my_app
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * UserScorer.cava
         */
        public Builder scriptName(String scriptName) {
            this.putPathParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * 123456
         */
        public Builder appVersionId(String appVersionId) {
            this.putPathParameter("appVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * script1
         */
        public Builder fileName(String fileName) {
            this.putPathParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public GetSortScriptFileRequest build() {
            return new GetSortScriptFileRequest(this);
        } 

    } 

}
