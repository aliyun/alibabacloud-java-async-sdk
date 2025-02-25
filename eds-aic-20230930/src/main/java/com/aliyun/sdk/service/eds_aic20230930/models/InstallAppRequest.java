// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link InstallAppRequest} extends {@link RequestModel}
 *
 * <p>InstallAppRequest</p>
 */
public class InstallAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIdList")
    private java.util.List<String> appIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIdList")
    private java.util.List<String> instanceGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    private java.util.List<String> instanceIdList;

    private InstallAppRequest(Builder builder) {
        super(builder);
        this.appIdList = builder.appIdList;
        this.instanceGroupIdList = builder.instanceGroupIdList;
        this.instanceIdList = builder.instanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIdList
     */
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    /**
     * @return instanceGroupIdList
     */
    public java.util.List<String> getInstanceGroupIdList() {
        return this.instanceGroupIdList;
    }

    /**
     * @return instanceIdList
     */
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public static final class Builder extends Request.Builder<InstallAppRequest, Builder> {
        private java.util.List<String> appIdList; 
        private java.util.List<String> instanceGroupIdList; 
        private java.util.List<String> instanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(InstallAppRequest request) {
            super(request);
            this.appIdList = request.appIdList;
            this.instanceGroupIdList = request.instanceGroupIdList;
            this.instanceIdList = request.instanceIdList;
        } 

        /**
         * AppIdList.
         */
        public Builder appIdList(java.util.List<String> appIdList) {
            this.putQueryParameter("AppIdList", appIdList);
            this.appIdList = appIdList;
            return this;
        }

        /**
         * InstanceGroupIdList.
         */
        public Builder instanceGroupIdList(java.util.List<String> instanceGroupIdList) {
            this.putQueryParameter("InstanceGroupIdList", instanceGroupIdList);
            this.instanceGroupIdList = instanceGroupIdList;
            return this;
        }

        /**
         * InstanceIdList.
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        @Override
        public InstallAppRequest build() {
            return new InstallAppRequest(this);
        } 

    } 

}
