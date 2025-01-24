// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceRegistrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceRegistrationsResponseBody</p>
 */
public class ListServiceRegistrationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceRegistrations")
    private java.util.List<ServiceRegistrations> serviceRegistrations;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceRegistrationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceRegistrations = builder.serviceRegistrations;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceRegistrationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return serviceRegistrations
     */
    public java.util.List<ServiceRegistrations> getServiceRegistrations() {
        return this.serviceRegistrations;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ServiceRegistrations> serviceRegistrations; 
        private Integer totalCount; 

        /**
         * <p>Number of items per page in a paginated query. The maximum is 100, and the default is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Service registration information.</p>
         */
        public Builder serviceRegistrations(java.util.List<ServiceRegistrations> serviceRegistrations) {
            this.serviceRegistrations = serviceRegistrations;
            return this;
        }

        /**
         * <p>Total number of records that meet the criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceRegistrationsResponseBody build() {
            return new ListServiceRegistrationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceRegistrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceRegistrationsResponseBody</p>
     */
    public static class ServiceRegistrations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("RegistrationId")
        private String registrationId;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        private ServiceRegistrations(Builder builder) {
            this.comment = builder.comment;
            this.finishTime = builder.finishTime;
            this.registrationId = builder.registrationId;
            this.serviceId = builder.serviceId;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceRegistrations create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return registrationId
         */
        public String getRegistrationId() {
            return this.registrationId;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String comment; 
            private String finishTime; 
            private String registrationId; 
            private String serviceId; 
            private String status; 
            private String submitTime; 

            /**
             * <p>Comment.</p>
             * 
             * <strong>example:</strong>
             * <p>some info is missing</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Finish time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T00:00:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>Registration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sr-001</p>
             */
            public Builder registrationId(String registrationId) {
                this.registrationId = registrationId;
                return this;
            }

            /**
             * <p>Service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>service-f4c0026a254bxxxxxxxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Registration status. Allowed values:</p>
             * <ul>
             * <li><p>Submitted</p>
             * </li>
             * <li><p>Approved</p>
             * </li>
             * <li><p>Rejected</p>
             * </li>
             * <li><p>Canceled</p>
             * </li>
             * <li><p>Executed</p>
             * </li>
             * <li><p>Executed: Executed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Rejected</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Submit time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-22T00:00:00Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public ServiceRegistrations build() {
                return new ServiceRegistrations(this);
            } 

        } 

    }
}
