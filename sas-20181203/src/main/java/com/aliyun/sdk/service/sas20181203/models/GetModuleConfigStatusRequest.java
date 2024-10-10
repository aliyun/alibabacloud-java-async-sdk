// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetModuleConfigStatusRequest} extends {@link RequestModel}
 *
 * <p>GetModuleConfigStatusRequest</p>
 */
public class GetModuleConfigStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > moduleNames;

    private GetModuleConfigStatusRequest(Builder builder) {
        super(builder);
        this.moduleNames = builder.moduleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleConfigStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleNames
     */
    public java.util.List < String > getModuleNames() {
        return this.moduleNames;
    }

    public static final class Builder extends Request.Builder<GetModuleConfigStatusRequest, Builder> {
        private java.util.List < String > moduleNames; 

        private Builder() {
            super();
        } 

        private Builder(GetModuleConfigStatusRequest request) {
            super(request);
            this.moduleNames = request.moduleNames;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder moduleNames(java.util.List < String > moduleNames) {
            String moduleNamesShrink = shrink(moduleNames, "ModuleNames", "json");
            this.putQueryParameter("ModuleNames", moduleNamesShrink);
            this.moduleNames = moduleNames;
            return this;
        }

        @Override
        public GetModuleConfigStatusRequest build() {
            return new GetModuleConfigStatusRequest(this);
        } 

    } 

}
