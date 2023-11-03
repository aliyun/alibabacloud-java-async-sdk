// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOssBucketScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOssBucketScanTaskRequest</p>
 */
public class CreateOssBucketScanTaskRequest extends Request {
    @Query
    @NameInMap("BucketNameList")
    @Validation(required = true)
    private java.util.List < String > bucketNameList;

    @Query
    @NameInMap("ExcludeKeySuffixList")
    private java.util.List < String > excludeKeySuffixList;

    @Query
    @NameInMap("KeySuffixList")
    private java.util.List < String > keySuffixList;

    @Query
    @NameInMap("ScanMode")
    @Validation(required = true)
    private Integer scanMode;

    private CreateOssBucketScanTaskRequest(Builder builder) {
        super(builder);
        this.bucketNameList = builder.bucketNameList;
        this.excludeKeySuffixList = builder.excludeKeySuffixList;
        this.keySuffixList = builder.keySuffixList;
        this.scanMode = builder.scanMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssBucketScanTaskRequest create() {
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
     * @return excludeKeySuffixList
     */
    public java.util.List < String > getExcludeKeySuffixList() {
        return this.excludeKeySuffixList;
    }

    /**
     * @return keySuffixList
     */
    public java.util.List < String > getKeySuffixList() {
        return this.keySuffixList;
    }

    /**
     * @return scanMode
     */
    public Integer getScanMode() {
        return this.scanMode;
    }

    public static final class Builder extends Request.Builder<CreateOssBucketScanTaskRequest, Builder> {
        private java.util.List < String > bucketNameList; 
        private java.util.List < String > excludeKeySuffixList; 
        private java.util.List < String > keySuffixList; 
        private Integer scanMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssBucketScanTaskRequest request) {
            super(request);
            this.bucketNameList = request.bucketNameList;
            this.excludeKeySuffixList = request.excludeKeySuffixList;
            this.keySuffixList = request.keySuffixList;
            this.scanMode = request.scanMode;
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
         * ExcludeKeySuffixList.
         */
        public Builder excludeKeySuffixList(java.util.List < String > excludeKeySuffixList) {
            this.putQueryParameter("ExcludeKeySuffixList", excludeKeySuffixList);
            this.excludeKeySuffixList = excludeKeySuffixList;
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
         * ScanMode.
         */
        public Builder scanMode(Integer scanMode) {
            this.putQueryParameter("ScanMode", scanMode);
            this.scanMode = scanMode;
            return this;
        }

        @Override
        public CreateOssBucketScanTaskRequest build() {
            return new CreateOssBucketScanTaskRequest(this);
        } 

    } 

}
