// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetRiskCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetRiskCountResponseBody</p>
 */
public class GetRiskCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunAssetCertificateExpiredCount")
    private Integer aliyunAssetCertificateExpiredCount;

    @com.aliyun.core.annotation.NameInMap("AliyunAssetCertificateWillExpiredCount")
    private Integer aliyunAssetCertificateWillExpiredCount;

    @com.aliyun.core.annotation.NameInMap("BuyCertificateExpireCount")
    private Integer buyCertificateExpireCount;

    @com.aliyun.core.annotation.NameInMap("BuyCertificateNotDeploymentCount")
    private Integer buyCertificateNotDeploymentCount;

    @com.aliyun.core.annotation.NameInMap("BuyCertificateNotTrusteeCount")
    private Integer buyCertificateNotTrusteeCount;

    @com.aliyun.core.annotation.NameInMap("BuyCertificateWillExpiredCount")
    private Integer buyCertificateWillExpiredCount;

    @com.aliyun.core.annotation.NameInMap("BuyCheckedFailCount")
    private Integer buyCheckedFailCount;

    @com.aliyun.core.annotation.NameInMap("DomainAssetNotMonitorCount")
    private Integer domainAssetNotMonitorCount;

    @com.aliyun.core.annotation.NameInMap("FreeCertificateExpireCount")
    private Integer freeCertificateExpireCount;

    @com.aliyun.core.annotation.NameInMap("FreeCertificateNotDeploymentCount")
    private Integer freeCertificateNotDeploymentCount;

    @com.aliyun.core.annotation.NameInMap("FreeCertificateWillExpiredCount")
    private Integer freeCertificateWillExpiredCount;

    @com.aliyun.core.annotation.NameInMap("FreeCheckedFailCount")
    private Integer freeCheckedFailCount;

    @com.aliyun.core.annotation.NameInMap("MultiCloudAssetCertificateExpiredCount")
    private Integer multiCloudAssetCertificateExpiredCount;

    @com.aliyun.core.annotation.NameInMap("MultiCloudAssetCertificateWillExpiredCount")
    private Integer multiCloudAssetCertificateWillExpiredCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadCertificateExpireCount")
    private Integer uploadCertificateExpireCount;

    @com.aliyun.core.annotation.NameInMap("UploadCertificateNotDeploymentCount")
    private Integer uploadCertificateNotDeploymentCount;

    @com.aliyun.core.annotation.NameInMap("UploadCertificateNotNoticeCount")
    private Integer uploadCertificateNotNoticeCount;

    @com.aliyun.core.annotation.NameInMap("UploadCertificateWillExpiredCount")
    private Integer uploadCertificateWillExpiredCount;

    private GetRiskCountResponseBody(Builder builder) {
        this.aliyunAssetCertificateExpiredCount = builder.aliyunAssetCertificateExpiredCount;
        this.aliyunAssetCertificateWillExpiredCount = builder.aliyunAssetCertificateWillExpiredCount;
        this.buyCertificateExpireCount = builder.buyCertificateExpireCount;
        this.buyCertificateNotDeploymentCount = builder.buyCertificateNotDeploymentCount;
        this.buyCertificateNotTrusteeCount = builder.buyCertificateNotTrusteeCount;
        this.buyCertificateWillExpiredCount = builder.buyCertificateWillExpiredCount;
        this.buyCheckedFailCount = builder.buyCheckedFailCount;
        this.domainAssetNotMonitorCount = builder.domainAssetNotMonitorCount;
        this.freeCertificateExpireCount = builder.freeCertificateExpireCount;
        this.freeCertificateNotDeploymentCount = builder.freeCertificateNotDeploymentCount;
        this.freeCertificateWillExpiredCount = builder.freeCertificateWillExpiredCount;
        this.freeCheckedFailCount = builder.freeCheckedFailCount;
        this.multiCloudAssetCertificateExpiredCount = builder.multiCloudAssetCertificateExpiredCount;
        this.multiCloudAssetCertificateWillExpiredCount = builder.multiCloudAssetCertificateWillExpiredCount;
        this.requestId = builder.requestId;
        this.uploadCertificateExpireCount = builder.uploadCertificateExpireCount;
        this.uploadCertificateNotDeploymentCount = builder.uploadCertificateNotDeploymentCount;
        this.uploadCertificateNotNoticeCount = builder.uploadCertificateNotNoticeCount;
        this.uploadCertificateWillExpiredCount = builder.uploadCertificateWillExpiredCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunAssetCertificateExpiredCount
     */
    public Integer getAliyunAssetCertificateExpiredCount() {
        return this.aliyunAssetCertificateExpiredCount;
    }

    /**
     * @return aliyunAssetCertificateWillExpiredCount
     */
    public Integer getAliyunAssetCertificateWillExpiredCount() {
        return this.aliyunAssetCertificateWillExpiredCount;
    }

    /**
     * @return buyCertificateExpireCount
     */
    public Integer getBuyCertificateExpireCount() {
        return this.buyCertificateExpireCount;
    }

    /**
     * @return buyCertificateNotDeploymentCount
     */
    public Integer getBuyCertificateNotDeploymentCount() {
        return this.buyCertificateNotDeploymentCount;
    }

    /**
     * @return buyCertificateNotTrusteeCount
     */
    public Integer getBuyCertificateNotTrusteeCount() {
        return this.buyCertificateNotTrusteeCount;
    }

    /**
     * @return buyCertificateWillExpiredCount
     */
    public Integer getBuyCertificateWillExpiredCount() {
        return this.buyCertificateWillExpiredCount;
    }

    /**
     * @return buyCheckedFailCount
     */
    public Integer getBuyCheckedFailCount() {
        return this.buyCheckedFailCount;
    }

    /**
     * @return domainAssetNotMonitorCount
     */
    public Integer getDomainAssetNotMonitorCount() {
        return this.domainAssetNotMonitorCount;
    }

    /**
     * @return freeCertificateExpireCount
     */
    public Integer getFreeCertificateExpireCount() {
        return this.freeCertificateExpireCount;
    }

    /**
     * @return freeCertificateNotDeploymentCount
     */
    public Integer getFreeCertificateNotDeploymentCount() {
        return this.freeCertificateNotDeploymentCount;
    }

    /**
     * @return freeCertificateWillExpiredCount
     */
    public Integer getFreeCertificateWillExpiredCount() {
        return this.freeCertificateWillExpiredCount;
    }

    /**
     * @return freeCheckedFailCount
     */
    public Integer getFreeCheckedFailCount() {
        return this.freeCheckedFailCount;
    }

    /**
     * @return multiCloudAssetCertificateExpiredCount
     */
    public Integer getMultiCloudAssetCertificateExpiredCount() {
        return this.multiCloudAssetCertificateExpiredCount;
    }

    /**
     * @return multiCloudAssetCertificateWillExpiredCount
     */
    public Integer getMultiCloudAssetCertificateWillExpiredCount() {
        return this.multiCloudAssetCertificateWillExpiredCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadCertificateExpireCount
     */
    public Integer getUploadCertificateExpireCount() {
        return this.uploadCertificateExpireCount;
    }

    /**
     * @return uploadCertificateNotDeploymentCount
     */
    public Integer getUploadCertificateNotDeploymentCount() {
        return this.uploadCertificateNotDeploymentCount;
    }

    /**
     * @return uploadCertificateNotNoticeCount
     */
    public Integer getUploadCertificateNotNoticeCount() {
        return this.uploadCertificateNotNoticeCount;
    }

    /**
     * @return uploadCertificateWillExpiredCount
     */
    public Integer getUploadCertificateWillExpiredCount() {
        return this.uploadCertificateWillExpiredCount;
    }

    public static final class Builder {
        private Integer aliyunAssetCertificateExpiredCount; 
        private Integer aliyunAssetCertificateWillExpiredCount; 
        private Integer buyCertificateExpireCount; 
        private Integer buyCertificateNotDeploymentCount; 
        private Integer buyCertificateNotTrusteeCount; 
        private Integer buyCertificateWillExpiredCount; 
        private Integer buyCheckedFailCount; 
        private Integer domainAssetNotMonitorCount; 
        private Integer freeCertificateExpireCount; 
        private Integer freeCertificateNotDeploymentCount; 
        private Integer freeCertificateWillExpiredCount; 
        private Integer freeCheckedFailCount; 
        private Integer multiCloudAssetCertificateExpiredCount; 
        private Integer multiCloudAssetCertificateWillExpiredCount; 
        private String requestId; 
        private Integer uploadCertificateExpireCount; 
        private Integer uploadCertificateNotDeploymentCount; 
        private Integer uploadCertificateNotNoticeCount; 
        private Integer uploadCertificateWillExpiredCount; 

        private Builder() {
        } 

        private Builder(GetRiskCountResponseBody model) {
            this.aliyunAssetCertificateExpiredCount = model.aliyunAssetCertificateExpiredCount;
            this.aliyunAssetCertificateWillExpiredCount = model.aliyunAssetCertificateWillExpiredCount;
            this.buyCertificateExpireCount = model.buyCertificateExpireCount;
            this.buyCertificateNotDeploymentCount = model.buyCertificateNotDeploymentCount;
            this.buyCertificateNotTrusteeCount = model.buyCertificateNotTrusteeCount;
            this.buyCertificateWillExpiredCount = model.buyCertificateWillExpiredCount;
            this.buyCheckedFailCount = model.buyCheckedFailCount;
            this.domainAssetNotMonitorCount = model.domainAssetNotMonitorCount;
            this.freeCertificateExpireCount = model.freeCertificateExpireCount;
            this.freeCertificateNotDeploymentCount = model.freeCertificateNotDeploymentCount;
            this.freeCertificateWillExpiredCount = model.freeCertificateWillExpiredCount;
            this.freeCheckedFailCount = model.freeCheckedFailCount;
            this.multiCloudAssetCertificateExpiredCount = model.multiCloudAssetCertificateExpiredCount;
            this.multiCloudAssetCertificateWillExpiredCount = model.multiCloudAssetCertificateWillExpiredCount;
            this.requestId = model.requestId;
            this.uploadCertificateExpireCount = model.uploadCertificateExpireCount;
            this.uploadCertificateNotDeploymentCount = model.uploadCertificateNotDeploymentCount;
            this.uploadCertificateNotNoticeCount = model.uploadCertificateNotNoticeCount;
            this.uploadCertificateWillExpiredCount = model.uploadCertificateWillExpiredCount;
        } 

        /**
         * AliyunAssetCertificateExpiredCount.
         */
        public Builder aliyunAssetCertificateExpiredCount(Integer aliyunAssetCertificateExpiredCount) {
            this.aliyunAssetCertificateExpiredCount = aliyunAssetCertificateExpiredCount;
            return this;
        }

        /**
         * AliyunAssetCertificateWillExpiredCount.
         */
        public Builder aliyunAssetCertificateWillExpiredCount(Integer aliyunAssetCertificateWillExpiredCount) {
            this.aliyunAssetCertificateWillExpiredCount = aliyunAssetCertificateWillExpiredCount;
            return this;
        }

        /**
         * BuyCertificateExpireCount.
         */
        public Builder buyCertificateExpireCount(Integer buyCertificateExpireCount) {
            this.buyCertificateExpireCount = buyCertificateExpireCount;
            return this;
        }

        /**
         * BuyCertificateNotDeploymentCount.
         */
        public Builder buyCertificateNotDeploymentCount(Integer buyCertificateNotDeploymentCount) {
            this.buyCertificateNotDeploymentCount = buyCertificateNotDeploymentCount;
            return this;
        }

        /**
         * BuyCertificateNotTrusteeCount.
         */
        public Builder buyCertificateNotTrusteeCount(Integer buyCertificateNotTrusteeCount) {
            this.buyCertificateNotTrusteeCount = buyCertificateNotTrusteeCount;
            return this;
        }

        /**
         * BuyCertificateWillExpiredCount.
         */
        public Builder buyCertificateWillExpiredCount(Integer buyCertificateWillExpiredCount) {
            this.buyCertificateWillExpiredCount = buyCertificateWillExpiredCount;
            return this;
        }

        /**
         * BuyCheckedFailCount.
         */
        public Builder buyCheckedFailCount(Integer buyCheckedFailCount) {
            this.buyCheckedFailCount = buyCheckedFailCount;
            return this;
        }

        /**
         * DomainAssetNotMonitorCount.
         */
        public Builder domainAssetNotMonitorCount(Integer domainAssetNotMonitorCount) {
            this.domainAssetNotMonitorCount = domainAssetNotMonitorCount;
            return this;
        }

        /**
         * FreeCertificateExpireCount.
         */
        public Builder freeCertificateExpireCount(Integer freeCertificateExpireCount) {
            this.freeCertificateExpireCount = freeCertificateExpireCount;
            return this;
        }

        /**
         * FreeCertificateNotDeploymentCount.
         */
        public Builder freeCertificateNotDeploymentCount(Integer freeCertificateNotDeploymentCount) {
            this.freeCertificateNotDeploymentCount = freeCertificateNotDeploymentCount;
            return this;
        }

        /**
         * FreeCertificateWillExpiredCount.
         */
        public Builder freeCertificateWillExpiredCount(Integer freeCertificateWillExpiredCount) {
            this.freeCertificateWillExpiredCount = freeCertificateWillExpiredCount;
            return this;
        }

        /**
         * FreeCheckedFailCount.
         */
        public Builder freeCheckedFailCount(Integer freeCheckedFailCount) {
            this.freeCheckedFailCount = freeCheckedFailCount;
            return this;
        }

        /**
         * MultiCloudAssetCertificateExpiredCount.
         */
        public Builder multiCloudAssetCertificateExpiredCount(Integer multiCloudAssetCertificateExpiredCount) {
            this.multiCloudAssetCertificateExpiredCount = multiCloudAssetCertificateExpiredCount;
            return this;
        }

        /**
         * MultiCloudAssetCertificateWillExpiredCount.
         */
        public Builder multiCloudAssetCertificateWillExpiredCount(Integer multiCloudAssetCertificateWillExpiredCount) {
            this.multiCloudAssetCertificateWillExpiredCount = multiCloudAssetCertificateWillExpiredCount;
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
         * UploadCertificateExpireCount.
         */
        public Builder uploadCertificateExpireCount(Integer uploadCertificateExpireCount) {
            this.uploadCertificateExpireCount = uploadCertificateExpireCount;
            return this;
        }

        /**
         * UploadCertificateNotDeploymentCount.
         */
        public Builder uploadCertificateNotDeploymentCount(Integer uploadCertificateNotDeploymentCount) {
            this.uploadCertificateNotDeploymentCount = uploadCertificateNotDeploymentCount;
            return this;
        }

        /**
         * UploadCertificateNotNoticeCount.
         */
        public Builder uploadCertificateNotNoticeCount(Integer uploadCertificateNotNoticeCount) {
            this.uploadCertificateNotNoticeCount = uploadCertificateNotNoticeCount;
            return this;
        }

        /**
         * UploadCertificateWillExpiredCount.
         */
        public Builder uploadCertificateWillExpiredCount(Integer uploadCertificateWillExpiredCount) {
            this.uploadCertificateWillExpiredCount = uploadCertificateWillExpiredCount;
            return this;
        }

        public GetRiskCountResponseBody build() {
            return new GetRiskCountResponseBody(this);
        } 

    } 

}
