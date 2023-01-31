// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusinessAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBusinessAccessPointsResponseBody</p>
 */
public class ListBusinessAccessPointsResponseBody extends TeaModel {
    @NameInMap("BusinessAccessPoints")
    private java.util.List < BusinessAccessPoints> businessAccessPoints;

    @NameInMap("RequestId")
    private String requestId;

    private ListBusinessAccessPointsResponseBody(Builder builder) {
        this.businessAccessPoints = builder.businessAccessPoints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBusinessAccessPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessAccessPoints
     */
    public java.util.List < BusinessAccessPoints> getBusinessAccessPoints() {
        return this.businessAccessPoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BusinessAccessPoints> businessAccessPoints; 
        private String requestId; 

        /**
         * BusinessAccessPoints.
         */
        public Builder businessAccessPoints(java.util.List < BusinessAccessPoints> businessAccessPoints) {
            this.businessAccessPoints = businessAccessPoints;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBusinessAccessPointsResponseBody build() {
            return new ListBusinessAccessPointsResponseBody(this);
        } 

    } 

    public static class BusinessAccessPoints extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("AccessPointName")
        private String accessPointName;

        @NameInMap("CloudBoxInstanceIds")
        private String cloudBoxInstanceIds;

        @NameInMap("Latitude")
        private Double latitude;

        @NameInMap("Longitude")
        private Double longitude;

        @NameInMap("SupportLineOperator")
        private String supportLineOperator;

        @NameInMap("SupportPortTypes")
        private String supportPortTypes;

        private BusinessAccessPoints(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.accessPointName = builder.accessPointName;
            this.cloudBoxInstanceIds = builder.cloudBoxInstanceIds;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.supportLineOperator = builder.supportLineOperator;
            this.supportPortTypes = builder.supportPortTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessAccessPoints create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return accessPointName
         */
        public String getAccessPointName() {
            return this.accessPointName;
        }

        /**
         * @return cloudBoxInstanceIds
         */
        public String getCloudBoxInstanceIds() {
            return this.cloudBoxInstanceIds;
        }

        /**
         * @return latitude
         */
        public Double getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public Double getLongitude() {
            return this.longitude;
        }

        /**
         * @return supportLineOperator
         */
        public String getSupportLineOperator() {
            return this.supportLineOperator;
        }

        /**
         * @return supportPortTypes
         */
        public String getSupportPortTypes() {
            return this.supportPortTypes;
        }

        public static final class Builder {
            private String accessPointId; 
            private String accessPointName; 
            private String cloudBoxInstanceIds; 
            private Double latitude; 
            private Double longitude; 
            private String supportLineOperator; 
            private String supportPortTypes; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * AccessPointName.
             */
            public Builder accessPointName(String accessPointName) {
                this.accessPointName = accessPointName;
                return this;
            }

            /**
             * CloudBoxInstanceIds.
             */
            public Builder cloudBoxInstanceIds(String cloudBoxInstanceIds) {
                this.cloudBoxInstanceIds = cloudBoxInstanceIds;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(Double latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(Double longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * SupportLineOperator.
             */
            public Builder supportLineOperator(String supportLineOperator) {
                this.supportLineOperator = supportLineOperator;
                return this;
            }

            /**
             * SupportPortTypes.
             */
            public Builder supportPortTypes(String supportPortTypes) {
                this.supportPortTypes = supportPortTypes;
                return this;
            }

            public BusinessAccessPoints build() {
                return new BusinessAccessPoints(this);
            } 

        } 

    }
}
