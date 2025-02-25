// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessPointsResponseBody</p>
 */
public class DescribeAccessPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPointSet")
    private AccessPointSet accessPointSet;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccessPointsResponseBody(Builder builder) {
        this.accessPointSet = builder.accessPointSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessPointSet
     */
    public AccessPointSet getAccessPointSet() {
        return this.accessPointSet;
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
        private AccessPointSet accessPointSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about the access point.</p>
         */
        public Builder accessPointSet(AccessPointSet accessPointSet) {
            this.accessPointSet = accessPointSet;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E85D803-C7CF-4BCD-9CFE-6DBA1DFFA027</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccessPointsResponseBody build() {
            return new DescribeAccessPointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessPointsResponseBody</p>
     */
    public static class AccessPointFeatureModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureKey")
        private String featureKey;

        @com.aliyun.core.annotation.NameInMap("FeatureValue")
        private String featureValue;

        private AccessPointFeatureModel(Builder builder) {
            this.featureKey = builder.featureKey;
            this.featureValue = builder.featureValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPointFeatureModel create() {
            return builder().build();
        }

        /**
         * @return featureKey
         */
        public String getFeatureKey() {
            return this.featureKey;
        }

        /**
         * @return featureValue
         */
        public String getFeatureValue() {
            return this.featureValue;
        }

        public static final class Builder {
            private String featureKey; 
            private String featureValue; 

            /**
             * <p>The feature of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>AP_Support_VbrBandwidthLimit</p>
             */
            public Builder featureKey(String featureKey) {
                this.featureKey = featureKey;
                return this;
            }

            /**
             * <p>The feature value of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder featureValue(String featureValue) {
                this.featureValue = featureValue;
                return this;
            }

            public AccessPointFeatureModel build() {
                return new AccessPointFeatureModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessPointsResponseBody</p>
     */
    public static class AccessPointFeatureModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointFeatureModel")
        private java.util.List<AccessPointFeatureModel> accessPointFeatureModel;

        private AccessPointFeatureModels(Builder builder) {
            this.accessPointFeatureModel = builder.accessPointFeatureModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPointFeatureModels create() {
            return builder().build();
        }

        /**
         * @return accessPointFeatureModel
         */
        public java.util.List<AccessPointFeatureModel> getAccessPointFeatureModel() {
            return this.accessPointFeatureModel;
        }

        public static final class Builder {
            private java.util.List<AccessPointFeatureModel> accessPointFeatureModel; 

            /**
             * AccessPointFeatureModel.
             */
            public Builder accessPointFeatureModel(java.util.List<AccessPointFeatureModel> accessPointFeatureModel) {
                this.accessPointFeatureModel = accessPointFeatureModel;
                return this;
            }

            public AccessPointFeatureModels build() {
                return new AccessPointFeatureModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessPointsResponseBody</p>
     */
    public static class AccessPointType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointFeatureModels")
        private AccessPointFeatureModels accessPointFeatureModels;

        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AttachedRegionNo")
        private String attachedRegionNo;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HostOperator")
        private String hostOperator;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AccessPointType(Builder builder) {
            this.accessPointFeatureModels = builder.accessPointFeatureModels;
            this.accessPointId = builder.accessPointId;
            this.attachedRegionNo = builder.attachedRegionNo;
            this.description = builder.description;
            this.hostOperator = builder.hostOperator;
            this.location = builder.location;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPointType create() {
            return builder().build();
        }

        /**
         * @return accessPointFeatureModels
         */
        public AccessPointFeatureModels getAccessPointFeatureModels() {
            return this.accessPointFeatureModels;
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return attachedRegionNo
         */
        public String getAttachedRegionNo() {
            return this.attachedRegionNo;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hostOperator
         */
        public String getHostOperator() {
            return this.hostOperator;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private AccessPointFeatureModels accessPointFeatureModels; 
            private String accessPointId; 
            private String attachedRegionNo; 
            private String description; 
            private String hostOperator; 
            private String location; 
            private String name; 
            private String status; 
            private String type; 

            /**
             * <p>The feature model of the access point.</p>
             */
            public Builder accessPointFeatureModels(AccessPointFeatureModels accessPointFeatureModels) {
                this.accessPointFeatureModels = accessPointFeatureModels;
                return this;
            }

            /**
             * <p>The ID of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-hangzhou-****</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The region ID of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder attachedRegionNo(String attachedRegionNo) {
                this.attachedRegionNo = attachedRegionNo;
                return this;
            }

            /**
             * <p>The description of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the access point.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) of the access point. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Telehouse</p>
             */
            public Builder hostOperator(String hostOperator) {
                this.hostOperator = hostOperator;
                return this;
            }

            /**
             * <p>The location of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the access point. Valid values:</p>
             * <ul>
             * <li><strong>recommended</strong>: The access point is ready for use.</li>
             * <li><strong>hot</strong>: A large number of Express Connect circuits are connected to the access point.</li>
             * <li><strong>full</strong>: The number of Express Connect circuits connected to the access point has reached the upper limit.</li>
             * <li><strong>disabled</strong>: The access point is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>recommended</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The network type of the Express Connect circuit. Default value: <strong>VPC</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AccessPointType build() {
                return new AccessPointType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessPointsResponseBody</p>
     */
    public static class AccessPointSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointType")
        private java.util.List<AccessPointType> accessPointType;

        private AccessPointSet(Builder builder) {
            this.accessPointType = builder.accessPointType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPointSet create() {
            return builder().build();
        }

        /**
         * @return accessPointType
         */
        public java.util.List<AccessPointType> getAccessPointType() {
            return this.accessPointType;
        }

        public static final class Builder {
            private java.util.List<AccessPointType> accessPointType; 

            /**
             * AccessPointType.
             */
            public Builder accessPointType(java.util.List<AccessPointType> accessPointType) {
                this.accessPointType = accessPointType;
                return this;
            }

            public AccessPointSet build() {
                return new AccessPointSet(this);
            } 

        } 

    }
}
