// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListApplicationsForNetworkAccessEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsForNetworkAccessEndpointResponseBody</p>
 */
public class ListApplicationsForNetworkAccessEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationsForNetworkAccessEndpoint")
    private java.util.List<ApplicationsForNetworkAccessEndpoint> applicationsForNetworkAccessEndpoint;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationsForNetworkAccessEndpointResponseBody(Builder builder) {
        this.applicationsForNetworkAccessEndpoint = builder.applicationsForNetworkAccessEndpoint;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForNetworkAccessEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationsForNetworkAccessEndpoint
     */
    public java.util.List<ApplicationsForNetworkAccessEndpoint> getApplicationsForNetworkAccessEndpoint() {
        return this.applicationsForNetworkAccessEndpoint;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationsForNetworkAccessEndpoint> applicationsForNetworkAccessEndpoint; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationsForNetworkAccessEndpointResponseBody model) {
            this.applicationsForNetworkAccessEndpoint = model.applicationsForNetworkAccessEndpoint;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The collection of applications under the network access endpoint.</p>
         */
        public Builder applicationsForNetworkAccessEndpoint(java.util.List<ApplicationsForNetworkAccessEndpoint> applicationsForNetworkAccessEndpoint) {
            this.applicationsForNetworkAccessEndpoint = applicationsForNetworkAccessEndpoint;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsForNetworkAccessEndpointResponseBody build() {
            return new ListApplicationsForNetworkAccessEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsForNetworkAccessEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForNetworkAccessEndpointResponseBody</p>
     */
    public static class ApplicationsForNetworkAccessEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private ApplicationsForNetworkAccessEndpoint(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationsForNetworkAccessEndpoint create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String applicationId; 
            private String applicationName; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(ApplicationsForNetworkAccessEndpoint model) {
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app_m5nzr3kk4njkco2nnc4wjxxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudSSO</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_6ed5syotlwdrgmbzn7qn5xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public ApplicationsForNetworkAccessEndpoint build() {
                return new ApplicationsForNetworkAccessEndpoint(this);
            } 

        } 

    }
}
