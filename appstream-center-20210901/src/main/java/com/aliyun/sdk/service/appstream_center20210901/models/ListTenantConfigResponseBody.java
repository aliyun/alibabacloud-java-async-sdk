// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTenantConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListTenantConfigResponseBody</p>
 */
public class ListTenantConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantConfigModel")
    private TenantConfigModel tenantConfigModel;

    private ListTenantConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantConfigModel = builder.tenantConfigModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantConfigModel
     */
    public TenantConfigModel getTenantConfigModel() {
        return this.tenantConfigModel;
    }

    public static final class Builder {
        private String requestId; 
        private TenantConfigModel tenantConfigModel; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TenantConfigModel.
         */
        public Builder tenantConfigModel(TenantConfigModel tenantConfigModel) {
            this.tenantConfigModel = tenantConfigModel;
            return this;
        }

        public ListTenantConfigResponseBody build() {
            return new ListTenantConfigResponseBody(this);
        } 

    } 

    public static class TenantConfigModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupExpireRemind")
        private Boolean appInstanceGroupExpireRemind;

        private TenantConfigModel(Builder builder) {
            this.appInstanceGroupExpireRemind = builder.appInstanceGroupExpireRemind;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantConfigModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupExpireRemind
         */
        public Boolean getAppInstanceGroupExpireRemind() {
            return this.appInstanceGroupExpireRemind;
        }

        public static final class Builder {
            private Boolean appInstanceGroupExpireRemind; 

            /**
             * AppInstanceGroupExpireRemind.
             */
            public Builder appInstanceGroupExpireRemind(Boolean appInstanceGroupExpireRemind) {
                this.appInstanceGroupExpireRemind = appInstanceGroupExpireRemind;
                return this;
            }

            public TenantConfigModel build() {
                return new TenantConfigModel(this);
            } 

        } 

    }
}
