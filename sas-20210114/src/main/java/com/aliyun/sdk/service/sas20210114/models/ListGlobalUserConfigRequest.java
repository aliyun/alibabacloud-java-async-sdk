// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link ListGlobalUserConfigRequest} extends {@link RequestModel}
 *
 * <p>ListGlobalUserConfigRequest</p>
 */
public class ListGlobalUserConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleList")
    private java.util.List<String> moduleList;

    private ListGlobalUserConfigRequest(Builder builder) {
        super(builder);
        this.moduleList = builder.moduleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGlobalUserConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleList
     */
    public java.util.List<String> getModuleList() {
        return this.moduleList;
    }

    public static final class Builder extends Request.Builder<ListGlobalUserConfigRequest, Builder> {
        private java.util.List<String> moduleList; 

        private Builder() {
            super();
        } 

        private Builder(ListGlobalUserConfigRequest request) {
            super(request);
            this.moduleList = request.moduleList;
        } 

        /**
         * ModuleList.
         */
        public Builder moduleList(java.util.List<String> moduleList) {
            String moduleListShrink = shrink(moduleList, "ModuleList", "json");
            this.putQueryParameter("ModuleList", moduleListShrink);
            this.moduleList = moduleList;
            return this;
        }

        @Override
        public ListGlobalUserConfigRequest build() {
            return new ListGlobalUserConfigRequest(this);
        } 

    } 

}
