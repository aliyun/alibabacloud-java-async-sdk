// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDemandsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDemandsRequest</p>
 */
public class DescribeDemandsRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("DemandId")
    private String demandId;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("DemandStatus")
    private java.util.List < String > demandStatus;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("DemandType")
    private String demandType;

    private DescribeDemandsRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.zoneId = builder.zoneId;
        this.demandId = builder.demandId;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.instanceType = builder.instanceType;
        this.instanceChargeType = builder.instanceChargeType;
        this.demandStatus = builder.demandStatus;
        this.dryRun = builder.dryRun;
        this.demandType = builder.demandType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDemandsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return demandId
     */
    public String getDemandId() {
        return this.demandId;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return demandStatus
     */
    public java.util.List < String > getDemandStatus() {
        return this.demandStatus;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return demandType
     */
    public String getDemandType() {
        return this.demandType;
    }

    public static final class Builder extends Request.Builder<DescribeDemandsRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String zoneId; 
        private String demandId; 
        private String instanceTypeFamily; 
        private String instanceType; 
        private String instanceChargeType; 
        private java.util.List < String > demandStatus; 
        private Boolean dryRun; 
        private String demandType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDemandsRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.zoneId = response.zoneId;
            this.demandId = response.demandId;
            this.instanceTypeFamily = response.instanceTypeFamily;
            this.instanceType = response.instanceType;
            this.instanceChargeType = response.instanceChargeType;
            this.demandStatus = response.demandStatus;
            this.dryRun = response.dryRun;
            this.demandType = response.demandType;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the destination region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The page number of the report list. Start value: 1
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum Value: 100
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the zone. For more information, see [DescribeZones](~~ 25610 ~~) for a list of zones.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The ID of the report. If this parameter is specified, other non-required request parameters are ignored.
         */
        public Builder demandId(String demandId) {
            this.putQueryParameter("DemandId", demandId);
            this.demandId = demandId;
            return this;
        }

        /**
         * The instance type family.
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * The instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * -PostPaid: pay-as-you-go
         * -PrePaid: Subscription
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The status of the report or resource usage. Valid values:
         * <p>
         * 
         * -Creating: a report is being created.
         * -Active: resources are being supplied.
         * -Expired: The report has Expired.
         * -Finished: consumed.
         * -Refused: The report is rejected. For more information, see the response parameter "Comment ".
         * -Cancelled: The filing is canceled.
         */
        public Builder demandStatus(java.util.List < String > demandStatus) {
            this.putQueryParameter("DemandStatus", demandStatus);
            this.demandStatus = demandStatus;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: a check request is sent without querying the status of the report. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
         * -false (default): a normal request is sent. After the request passes the check, the status code 2XX is returned and the status of the report is directly queried.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Report instance source. Valid values:
         * <p>
         * 
         * * Custom: self-report.
         * * System (default): Alibaba Cloud assists in reporting.
         */
        public Builder demandType(String demandType) {
            this.putQueryParameter("DemandType", demandType);
            this.demandType = demandType;
            return this;
        }

        @Override
        public DescribeDemandsRequest build() {
            return new DescribeDemandsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
