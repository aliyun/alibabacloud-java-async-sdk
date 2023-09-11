// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationAccessPointsResponseBody</p>
 */
public class ListApplicationAccessPointsResponseBody extends TeaModel {
    @NameInMap("ApplicationAccessPoints")
    private ApplicationAccessPoints applicationAccessPoints;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationAccessPointsResponseBody(Builder builder) {
        this.applicationAccessPoints = builder.applicationAccessPoints;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationAccessPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationAccessPoints
     */
    public ApplicationAccessPoints getApplicationAccessPoints() {
        return this.applicationAccessPoints;
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
        private ApplicationAccessPoints applicationAccessPoints; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ApplicationAccessPoints.
         */
        public Builder applicationAccessPoints(ApplicationAccessPoints applicationAccessPoints) {
            this.applicationAccessPoints = applicationAccessPoints;
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

        public ListApplicationAccessPointsResponseBody build() {
            return new ListApplicationAccessPointsResponseBody(this);
        } 

    } 

    public static class ApplicationAccessPoint extends TeaModel {
        @NameInMap("AuthenticationMethod")
        private String authenticationMethod;

        @NameInMap("Name")
        private String name;

        private ApplicationAccessPoint(Builder builder) {
            this.authenticationMethod = builder.authenticationMethod;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationAccessPoint create() {
            return builder().build();
        }

        /**
         * @return authenticationMethod
         */
        public String getAuthenticationMethod() {
            return this.authenticationMethod;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String authenticationMethod; 
            private String name; 

            /**
             * AuthenticationMethod.
             */
            public Builder authenticationMethod(String authenticationMethod) {
                this.authenticationMethod = authenticationMethod;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApplicationAccessPoint build() {
                return new ApplicationAccessPoint(this);
            } 

        } 

    }
    public static class ApplicationAccessPoints extends TeaModel {
        @NameInMap("ApplicationAccessPoint")
        private java.util.List < ApplicationAccessPoint> applicationAccessPoint;

        private ApplicationAccessPoints(Builder builder) {
            this.applicationAccessPoint = builder.applicationAccessPoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationAccessPoints create() {
            return builder().build();
        }

        /**
         * @return applicationAccessPoint
         */
        public java.util.List < ApplicationAccessPoint> getApplicationAccessPoint() {
            return this.applicationAccessPoint;
        }

        public static final class Builder {
            private java.util.List < ApplicationAccessPoint> applicationAccessPoint; 

            /**
             * ApplicationAccessPoint.
             */
            public Builder applicationAccessPoint(java.util.List < ApplicationAccessPoint> applicationAccessPoint) {
                this.applicationAccessPoint = applicationAccessPoint;
                return this;
            }

            public ApplicationAccessPoints build() {
                return new ApplicationAccessPoints(this);
            } 

        } 

    }
}
