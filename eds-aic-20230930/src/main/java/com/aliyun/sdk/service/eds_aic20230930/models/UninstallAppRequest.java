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
 * {@link UninstallAppRequest} extends {@link RequestModel}
 *
 * <p>UninstallAppRequest</p>
 */
public class UninstallAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIdList")
    private java.util.List<String> appIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIdList")
    private java.util.List<String> instanceGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    private java.util.List<String> instanceIdList;

    private UninstallAppRequest(Builder builder) {
        super(builder);
        this.appIdList = builder.appIdList;
        this.instanceGroupIdList = builder.instanceGroupIdList;
        this.instanceIdList = builder.instanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallAppRequest create() {
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

    public static final class Builder extends Request.Builder<UninstallAppRequest, Builder> {
        private java.util.List<String> appIdList; 
        private java.util.List<String> instanceGroupIdList; 
        private java.util.List<String> instanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(UninstallAppRequest request) {
            super(request);
            this.appIdList = request.appIdList;
            this.instanceGroupIdList = request.instanceGroupIdList;
            this.instanceIdList = request.instanceIdList;
        } 

        /**
         * <p>A list of application IDs.</p>
         */
        public Builder appIdList(java.util.List<String> appIdList) {
            this.putQueryParameter("AppIdList", appIdList);
            this.appIdList = appIdList;
            return this;
        }

        /**
         * <p>A list of instance group IDs. You must specify either this parameter or <code>InstanceIdList</code>. If you specify both, only <code>InstanceGroupIdList</code> takes precedence.</p>
         */
        public Builder instanceGroupIdList(java.util.List<String> instanceGroupIdList) {
            this.putQueryParameter("InstanceGroupIdList", instanceGroupIdList);
            this.instanceGroupIdList = instanceGroupIdList;
            return this;
        }

        /**
         * <p>A list of instance IDs. You must specify either this parameter or <code>InstanceGroupIdList</code>. If you specify both, only <code>InstanceGroupIdList</code> takes precedence.</p>
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        @Override
        public UninstallAppRequest build() {
            return new UninstallAppRequest(this);
        } 

    } 

}
