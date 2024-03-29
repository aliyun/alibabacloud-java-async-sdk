// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrustedServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrustedServiceStatusResponseBody</p>
 */
public class ListTrustedServiceStatusResponseBody extends TeaModel {
    @NameInMap("EnabledServicePrincipals")
    private EnabledServicePrincipals enabledServicePrincipals;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * EnabledServicePrincipals.
         */
        public Builder enabledServicePrincipals(EnabledServicePrincipals enabledServicePrincipals) {
            this.enabledServicePrincipals = enabledServicePrincipals;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTrustedServiceStatusResponseBody build() {
            return new ListTrustedServiceStatusResponseBody(this);
        } 

    } 

    public static class EnabledServicePrincipal extends TeaModel {
        @NameInMap("EnableTime")
        private String enableTime;

        @NameInMap("ServicePrincipal")
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
             * EnableTime.
             */
            public Builder enableTime(String enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * ServicePrincipal.
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
    public static class EnabledServicePrincipals extends TeaModel {
        @NameInMap("EnabledServicePrincipal")
        private java.util.List < EnabledServicePrincipal> enabledServicePrincipal;

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
        public java.util.List < EnabledServicePrincipal> getEnabledServicePrincipal() {
            return this.enabledServicePrincipal;
        }

        public static final class Builder {
            private java.util.List < EnabledServicePrincipal> enabledServicePrincipal; 

            /**
             * EnabledServicePrincipal.
             */
            public Builder enabledServicePrincipal(java.util.List < EnabledServicePrincipal> enabledServicePrincipal) {
                this.enabledServicePrincipal = enabledServicePrincipal;
                return this;
            }

            public EnabledServicePrincipals build() {
                return new EnabledServicePrincipals(this);
            } 

        } 

    }
}
