// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOssScanConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateOssScanConfigRequest</p>
 */
public class CreateOssScanConfigRequest extends Request {
    @Query
    @NameInMap("AllKeyPrefix")
    private Boolean allKeyPrefix;

    @Query
    @NameInMap("BucketNameList")
    private java.util.List < String > bucketNameList;

    @Query
    @NameInMap("Enable")
    private Integer enable;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("KeyPrefixList")
    private java.util.List < String > keyPrefixList;

    @Query
    @NameInMap("KeySuffixList")
    private java.util.List < String > keySuffixList;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ScanDayList")
    private java.util.List < Integer > scanDayList;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private CreateOssScanConfigRequest(Builder builder) {
        super(builder);
        this.allKeyPrefix = builder.allKeyPrefix;
        this.bucketNameList = builder.bucketNameList;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.keyPrefixList = builder.keyPrefixList;
        this.keySuffixList = builder.keySuffixList;
        this.name = builder.name;
        this.scanDayList = builder.scanDayList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssScanConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allKeyPrefix
     */
    public Boolean getAllKeyPrefix() {
        return this.allKeyPrefix;
    }

    /**
     * @return bucketNameList
     */
    public java.util.List < String > getBucketNameList() {
        return this.bucketNameList;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyPrefixList
     */
    public java.util.List < String > getKeyPrefixList() {
        return this.keyPrefixList;
    }

    /**
     * @return keySuffixList
     */
    public java.util.List < String > getKeySuffixList() {
        return this.keySuffixList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scanDayList
     */
    public java.util.List < Integer > getScanDayList() {
        return this.scanDayList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateOssScanConfigRequest, Builder> {
        private Boolean allKeyPrefix; 
        private java.util.List < String > bucketNameList; 
        private Integer enable; 
        private String endTime; 
        private java.util.List < String > keyPrefixList; 
        private java.util.List < String > keySuffixList; 
        private String name; 
        private java.util.List < Integer > scanDayList; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssScanConfigRequest request) {
            super(request);
            this.allKeyPrefix = request.allKeyPrefix;
            this.bucketNameList = request.bucketNameList;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.keyPrefixList = request.keyPrefixList;
            this.keySuffixList = request.keySuffixList;
            this.name = request.name;
            this.scanDayList = request.scanDayList;
            this.startTime = request.startTime;
        } 

        /**
         * Whether to match all prefixes.
         */
        public Builder allKeyPrefix(Boolean allKeyPrefix) {
            this.putQueryParameter("AllKeyPrefix", allKeyPrefix);
            this.allKeyPrefix = allKeyPrefix;
            return this;
        }

        /**
         * The names of buckets.
         */
        public Builder bucketNameList(java.util.List < String > bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        /**
         * Specifies whether to enable the policy. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The time when the scan ends. The time must be in the HH:mm:ss format.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The prefixes of the object that you want to check.
         */
        public Builder keyPrefixList(java.util.List < String > keyPrefixList) {
            this.putQueryParameter("KeyPrefixList", keyPrefixList);
            this.keyPrefixList = keyPrefixList;
            return this;
        }

        /**
         * The suffixes of the files to scan.
         */
        public Builder keySuffixList(java.util.List < String > keySuffixList) {
            this.putQueryParameter("KeySuffixList", keySuffixList);
            this.keySuffixList = keySuffixList;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The days on which the scan is executed in a week.
         */
        public Builder scanDayList(java.util.List < Integer > scanDayList) {
            this.putQueryParameter("ScanDayList", scanDayList);
            this.scanDayList = scanDayList;
            return this;
        }

        /**
         * The time when the scan starts. The time must be in the HH:mm:ss format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateOssScanConfigRequest build() {
            return new CreateOssScanConfigRequest(this);
        } 

    } 

}
