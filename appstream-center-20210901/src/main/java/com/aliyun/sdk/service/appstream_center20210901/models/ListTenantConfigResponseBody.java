// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListTenantConfigResponseBody model) {
            this.requestId = model.requestId;
            this.tenantConfigModel = model.tenantConfigModel;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The user configuration information.</p>
         */
        public Builder tenantConfigModel(TenantConfigModel tenantConfigModel) {
            this.tenantConfigModel = tenantConfigModel;
            return this;
        }

        public ListTenantConfigResponseBody build() {
            return new ListTenantConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantConfigResponseBody</p>
     */
    public static class TenantConfigModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupExpireRemind")
        private Boolean appInstanceGroupExpireRemind;

        @com.aliyun.core.annotation.NameInMap("MultiSessionSupportType")
        @com.aliyun.core.annotation.Validation(maxLength = 16)
        private String multiSessionSupportType;

        @com.aliyun.core.annotation.NameInMap("MultiSessionSupportedRegions")
        private java.util.List<String> multiSessionSupportedRegions;

        private TenantConfigModel(Builder builder) {
            this.appInstanceGroupExpireRemind = builder.appInstanceGroupExpireRemind;
            this.multiSessionSupportType = builder.multiSessionSupportType;
            this.multiSessionSupportedRegions = builder.multiSessionSupportedRegions;
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

        /**
         * @return multiSessionSupportType
         */
        public String getMultiSessionSupportType() {
            return this.multiSessionSupportType;
        }

        /**
         * @return multiSessionSupportedRegions
         */
        public java.util.List<String> getMultiSessionSupportedRegions() {
            return this.multiSessionSupportedRegions;
        }

        public static final class Builder {
            private Boolean appInstanceGroupExpireRemind; 
            private String multiSessionSupportType; 
            private java.util.List<String> multiSessionSupportedRegions; 

            private Builder() {
            } 

            private Builder(TenantConfigModel model) {
                this.appInstanceGroupExpireRemind = model.appInstanceGroupExpireRemind;
                this.multiSessionSupportType = model.multiSessionSupportType;
                this.multiSessionSupportedRegions = model.multiSessionSupportedRegions;
            } 

            /**
             * <p>Indicates whether resource expiration reminders are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder appInstanceGroupExpireRemind(Boolean appInstanceGroupExpireRemind) {
                this.appInstanceGroupExpireRemind = appInstanceGroupExpireRemind;
                return this;
            }

            /**
             * <p>The support type for creating shared session delivery groups.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder multiSessionSupportType(String multiSessionSupportType) {
                this.multiSessionSupportType = multiSessionSupportType;
                return this;
            }

            /**
             * <p>The list of region IDs that support creating shared session delivery groups.
             * Note: This field has a value only when the support type for creating shared session delivery groups is Specific.</p>
             */
            public Builder multiSessionSupportedRegions(java.util.List<String> multiSessionSupportedRegions) {
                this.multiSessionSupportedRegions = multiSessionSupportedRegions;
                return this;
            }

            public TenantConfigModel build() {
                return new TenantConfigModel(this);
            } 

        } 

    }
}
