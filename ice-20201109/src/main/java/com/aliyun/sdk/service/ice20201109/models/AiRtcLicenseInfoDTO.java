// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AiRtcLicenseInfoDTO} extends {@link TeaModel}
 *
 * <p>AiRtcLicenseInfoDTO</p>
 */
public class AiRtcLicenseInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableCapacity")
    private Long availableCapacity;

    @com.aliyun.core.annotation.NameInMap("BeginOn")
    private String beginOn;

    @com.aliyun.core.annotation.NameInMap("ContractNo")
    private String contractNo;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("ExpiredOn")
    private String expiredOn;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("LicenseCount")
    private Long licenseCount;

    @com.aliyun.core.annotation.NameInMap("LicenseItemId")
    private String licenseItemId;

    @com.aliyun.core.annotation.NameInMap("ModificationTime")
    private String modificationTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("ValidDays")
    private Long validDays;

    private AiRtcLicenseInfoDTO(Builder builder) {
        this.availableCapacity = builder.availableCapacity;
        this.beginOn = builder.beginOn;
        this.contractNo = builder.contractNo;
        this.creationTime = builder.creationTime;
        this.expiredOn = builder.expiredOn;
        this.instanceId = builder.instanceId;
        this.licenseCount = builder.licenseCount;
        this.licenseItemId = builder.licenseItemId;
        this.modificationTime = builder.modificationTime;
        this.status = builder.status;
        this.type = builder.type;
        this.validDays = builder.validDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiRtcLicenseInfoDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableCapacity
     */
    public Long getAvailableCapacity() {
        return this.availableCapacity;
    }

    /**
     * @return beginOn
     */
    public String getBeginOn() {
        return this.beginOn;
    }

    /**
     * @return contractNo
     */
    public String getContractNo() {
        return this.contractNo;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return expiredOn
     */
    public String getExpiredOn() {
        return this.expiredOn;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return licenseCount
     */
    public Long getLicenseCount() {
        return this.licenseCount;
    }

    /**
     * @return licenseItemId
     */
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    /**
     * @return modificationTime
     */
    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return validDays
     */
    public Long getValidDays() {
        return this.validDays;
    }

    public static final class Builder {
        private Long availableCapacity; 
        private String beginOn; 
        private String contractNo; 
        private String creationTime; 
        private String expiredOn; 
        private String instanceId; 
        private Long licenseCount; 
        private String licenseItemId; 
        private String modificationTime; 
        private Integer status; 
        private Integer type; 
        private Long validDays; 

        private Builder() {
        } 

        private Builder(AiRtcLicenseInfoDTO model) {
            this.availableCapacity = model.availableCapacity;
            this.beginOn = model.beginOn;
            this.contractNo = model.contractNo;
            this.creationTime = model.creationTime;
            this.expiredOn = model.expiredOn;
            this.instanceId = model.instanceId;
            this.licenseCount = model.licenseCount;
            this.licenseItemId = model.licenseItemId;
            this.modificationTime = model.modificationTime;
            this.status = model.status;
            this.type = model.type;
            this.validDays = model.validDays;
        } 

        /**
         * <p>The remaining usage capacity of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000</p>
         */
        public Builder availableCapacity(Long availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }

        /**
         * <p>The time when the batch became active.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        public Builder beginOn(String beginOn) {
            this.beginOn = beginOn;
            return this;
        }

        /**
         * <p>The contract number.</p>
         * 
         * <strong>example:</strong>
         * <p>258396267390***</p>
         */
        public Builder contractNo(String contractNo) {
            this.contractNo = contractNo;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-23T13:33:49Z</p>
         */
        public Builder expiredOn(String expiredOn) {
            this.expiredOn = expiredOn;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ice_CoverAILicense_public_cn***</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The total number of licenses contained within this batch.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder licenseCount(Long licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }

        /**
         * <p>The ID of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>17712***</p>
         */
        public Builder licenseItemId(String licenseItemId) {
            this.licenseItemId = licenseItemId;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        public Builder modificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        /**
         * <p>The status of the batch. Valid values:</p>
         * <ul>
         * <li>1: Active</li>
         * <li>2\. Expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The license type. Valid values:</p>
         * <ul>
         * <li>1: Audio call</li>
         * <li>2: Vision call</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The validity period of the licenses in this batch, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder validDays(Long validDays) {
            this.validDays = validDays;
            return this;
        }

        public AiRtcLicenseInfoDTO build() {
            return new AiRtcLicenseInfoDTO(this);
        } 

    } 

}
