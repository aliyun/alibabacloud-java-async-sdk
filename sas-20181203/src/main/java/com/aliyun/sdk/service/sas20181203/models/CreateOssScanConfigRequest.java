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
    @NameInMap("BucketNameList")
    private java.util.List < String > bucketNameList;

    @Query
    @NameInMap("Enable")
    private Integer enable;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("KeySuffixList")
    private java.util.List < String > keySuffixList;

    @Query
    @NameInMap("ScanDayList")
    private java.util.List < Integer > scanDayList;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private CreateOssScanConfigRequest(Builder builder) {
        super(builder);
        this.bucketNameList = builder.bucketNameList;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.keySuffixList = builder.keySuffixList;
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
     * @return keySuffixList
     */
    public java.util.List < String > getKeySuffixList() {
        return this.keySuffixList;
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
        private java.util.List < String > bucketNameList; 
        private Integer enable; 
        private String endTime; 
        private java.util.List < String > keySuffixList; 
        private java.util.List < Integer > scanDayList; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssScanConfigRequest request) {
            super(request);
            this.bucketNameList = request.bucketNameList;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.keySuffixList = request.keySuffixList;
            this.scanDayList = request.scanDayList;
            this.startTime = request.startTime;
        } 

        /**
         * BucketNameList.
         */
        public Builder bucketNameList(java.util.List < String > bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * KeySuffixList.
         */
        public Builder keySuffixList(java.util.List < String > keySuffixList) {
            this.putQueryParameter("KeySuffixList", keySuffixList);
            this.keySuffixList = keySuffixList;
            return this;
        }

        /**
         * ScanDayList.
         */
        public Builder scanDayList(java.util.List < Integer > scanDayList) {
            this.putQueryParameter("ScanDayList", scanDayList);
            this.scanDayList = scanDayList;
            return this;
        }

        /**
         * StartTime.
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
