// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListTrustedServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrustedServiceStatusResponseBody</p>
 */
public class ListTrustedServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnabledServicePrincipals")
    private EnabledServicePrincipals enabledServicePrincipals;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTrustedServiceStatusResponseBody(Builder builder) {
        this.enabledServicePrincipals = builder.enabledServicePrincipals;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrustedServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return enabledServicePrincipals
     */
    public EnabledServicePrincipals getEnabledServicePrincipals() {
        return this.enabledServicePrincipals;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private EnabledServicePrincipals enabledServicePrincipals; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The trusted services that are enabled.</p>
         */
        public Builder enabledServicePrincipals(EnabledServicePrincipals enabledServicePrincipals) {
            this.enabledServicePrincipals = enabledServicePrincipals;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CD76D376-2517-4924-92C5-DBC52262F93A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTrustedServiceStatusResponseBody build() {
            return new ListTrustedServiceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrustedServiceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrustedServiceStatusResponseBody</p>
     */
    public static class EnabledServicePrincipal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableTime")
        private String enableTime;

        @com.aliyun.core.annotation.NameInMap("ServicePrincipal")
        private String servicePrincipal;

        private EnabledServicePrincipal(Builder builder) {
            this.enableTime = builder.enableTime;
            this.servicePrincipal = builder.servicePrincipal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnabledServicePrincipal create() {
            return builder().build();
        }

        /**
         * @return enableTime
         */
        public String getEnableTime() {
            return this.enableTime;
        }

        /**
         * @return servicePrincipal
         */
        public String getServicePrincipal() {
            return this.servicePrincipal;
        }

        public static final class Builder {
            private String enableTime; 
            private String servicePrincipal; 

            /**
             * <p>The time when the trusted service was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-18T15:32:10.473Z</p>
             */
            public Builder enableTime(String enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * <p>The identification of the trusted service.</p>
             * 
             * <strong>example:</strong>
             * <p>config.aliyuncs.com</p>
             */
            public Builder servicePrincipal(String servicePrincipal) {
                this.servicePrincipal = servicePrincipal;
                return this;
            }

            public EnabledServicePrincipal build() {
                return new EnabledServicePrincipal(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTrustedServiceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrustedServiceStatusResponseBody</p>
     */
    public static class EnabledServicePrincipals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnabledServicePrincipal")
        private java.util.List<EnabledServicePrincipal> enabledServicePrincipal;

        private EnabledServicePrincipals(Builder builder) {
            this.enabledServicePrincipal = builder.enabledServicePrincipal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnabledServicePrincipals create() {
            return builder().build();
        }

        /**
         * @return enabledServicePrincipal
         */
        public java.util.List<EnabledServicePrincipal> getEnabledServicePrincipal() {
            return this.enabledServicePrincipal;
        }

        public static final class Builder {
            private java.util.List<EnabledServicePrincipal> enabledServicePrincipal; 

            /**
             * EnabledServicePrincipal.
             */
            public Builder enabledServicePrincipal(java.util.List<EnabledServicePrincipal> enabledServicePrincipal) {
                this.enabledServicePrincipal = enabledServicePrincipal;
                return this;
            }

            public EnabledServicePrincipals build() {
                return new EnabledServicePrincipals(this);
            } 

        } 

    }
}
