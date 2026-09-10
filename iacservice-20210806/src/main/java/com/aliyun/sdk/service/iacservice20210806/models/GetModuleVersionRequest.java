// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetModuleVersionRequest} extends {@link RequestModel}
 *
 * <p>GetModuleVersionRequest</p>
 */
public class GetModuleVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleId")
    private String moduleId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    private String moduleVersion;

    private GetModuleVersionRequest(Builder builder) {
        super(builder);
        this.moduleId = builder.moduleId;
        this.moduleVersion = builder.moduleVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public static final class Builder extends Request.Builder<GetModuleVersionRequest, Builder> {
        private String moduleId; 
        private String moduleVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetModuleVersionRequest request) {
            super(request);
            this.moduleId = request.moduleId;
            this.moduleVersion = request.moduleVersion;
        } 

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-14e80de4866bf71c92a04fe353b1</p>
         */
        public Builder moduleId(String moduleId) {
            this.putPathParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * <p>The template version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putPathParameter("moduleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        @Override
        public GetModuleVersionRequest build() {
            return new GetModuleVersionRequest(this);
        } 

    } 

}
