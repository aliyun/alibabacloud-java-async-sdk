// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessPointsResponseBody</p>
 */
public class ListAccessPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPoints")
    private java.util.List<AccessPoints> accessPoints;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAccessPointsResponseBody(Builder builder) {
        this.accessPoints = builder.accessPoints;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessPointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPoints
     */
    public java.util.List<AccessPoints> getAccessPoints() {
        return this.accessPoints;
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
        private java.util.List<AccessPoints> accessPoints; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAccessPointsResponseBody model) {
            this.accessPoints = model.accessPoints;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the access point.</p>
         */
        public Builder accessPoints(java.util.List<AccessPoints> accessPoints) {
            this.accessPoints = accessPoints;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E26DBAAE-A796-4A48-98B4-B45AFCD1F299</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of access points.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAccessPointsResponseBody build() {
            return new ListAccessPointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessPointsResponseBody</p>
     */
    public static class AccessPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private Integer accessPointId;

        @com.aliyun.core.annotation.NameInMap("ActiveSmartAGCount")
        private Integer activeSmartAGCount;

        @com.aliyun.core.annotation.NameInMap("InactiveSmartAGCount")
        private Integer inactiveSmartAGCount;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        private AccessPoints(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.activeSmartAGCount = builder.activeSmartAGCount;
            this.inactiveSmartAGCount = builder.inactiveSmartAGCount;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPoints create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public Integer getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return activeSmartAGCount
         */
        public Integer getActiveSmartAGCount() {
            return this.activeSmartAGCount;
        }

        /**
         * @return inactiveSmartAGCount
         */
        public Integer getInactiveSmartAGCount() {
            return this.inactiveSmartAGCount;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        public static final class Builder {
            private Integer accessPointId; 
            private Integer activeSmartAGCount; 
            private Integer inactiveSmartAGCount; 
            private String latitude; 
            private String longitude; 

            private Builder() {
            } 

            private Builder(AccessPoints model) {
                this.accessPointId = model.accessPointId;
                this.activeSmartAGCount = model.activeSmartAGCount;
                this.inactiveSmartAGCount = model.inactiveSmartAGCount;
                this.latitude = model.latitude;
                this.longitude = model.longitude;
            } 

            /**
             * <p>The ID of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>401</p>
             */
            public Builder accessPointId(Integer accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The number of available SAG instances in the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder activeSmartAGCount(Integer activeSmartAGCount) {
                this.activeSmartAGCount = activeSmartAGCount;
                return this;
            }

            /**
             * <p>The number of offline SAG instances in the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder inactiveSmartAGCount(Integer inactiveSmartAGCount) {
                this.inactiveSmartAGCount = inactiveSmartAGCount;
                return this;
            }

            /**
             * <p>The latitude of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>103.81****</p>
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * <p>The longitude of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>1.35****</p>
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            public AccessPoints build() {
                return new AccessPoints(this);
            } 

        } 

    }
}
