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
 * {@link GetAssetCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetCountResponseBody</p>
 */
public class GetAssetCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunAssetCount")
    private Integer aliyunAssetCount;

    @com.aliyun.core.annotation.NameInMap("AwsAssetCount")
    private Integer awsAssetCount;

    @com.aliyun.core.annotation.NameInMap("BuyCertificateCount")
    private Integer buyCertificateCount;

    @com.aliyun.core.annotation.NameInMap("DomainAssetCount")
    private Integer domainAssetCount;

    @com.aliyun.core.annotation.NameInMap("FreeCertificateCount")
    private Integer freeCertificateCount;

    @com.aliyun.core.annotation.NameInMap("HuaweiAssetCount")
    private Integer huaweiAssetCount;

    @com.aliyun.core.annotation.NameInMap("LastPoint")
    private Integer lastPoint;

    @com.aliyun.core.annotation.NameInMap("Point")
    private Integer point;

    @com.aliyun.core.annotation.NameInMap("PointRatio")
    private Integer pointRatio;

    @com.aliyun.core.annotation.NameInMap("PointTime")
    private Long pointTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TencentAssetCount")
    private Integer tencentAssetCount;

    @com.aliyun.core.annotation.NameInMap("UploadCertificateCount")
    private Integer uploadCertificateCount;

    private GetAssetCountResponseBody(Builder builder) {
        this.aliyunAssetCount = builder.aliyunAssetCount;
        this.awsAssetCount = builder.awsAssetCount;
        this.buyCertificateCount = builder.buyCertificateCount;
        this.domainAssetCount = builder.domainAssetCount;
        this.freeCertificateCount = builder.freeCertificateCount;
        this.huaweiAssetCount = builder.huaweiAssetCount;
        this.lastPoint = builder.lastPoint;
        this.point = builder.point;
        this.pointRatio = builder.pointRatio;
        this.pointTime = builder.pointTime;
        this.requestId = builder.requestId;
        this.tencentAssetCount = builder.tencentAssetCount;
        this.uploadCertificateCount = builder.uploadCertificateCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunAssetCount
     */
    public Integer getAliyunAssetCount() {
        return this.aliyunAssetCount;
    }

    /**
     * @return awsAssetCount
     */
    public Integer getAwsAssetCount() {
        return this.awsAssetCount;
    }

    /**
     * @return buyCertificateCount
     */
    public Integer getBuyCertificateCount() {
        return this.buyCertificateCount;
    }

    /**
     * @return domainAssetCount
     */
    public Integer getDomainAssetCount() {
        return this.domainAssetCount;
    }

    /**
     * @return freeCertificateCount
     */
    public Integer getFreeCertificateCount() {
        return this.freeCertificateCount;
    }

    /**
     * @return huaweiAssetCount
     */
    public Integer getHuaweiAssetCount() {
        return this.huaweiAssetCount;
    }

    /**
     * @return lastPoint
     */
    public Integer getLastPoint() {
        return this.lastPoint;
    }

    /**
     * @return point
     */
    public Integer getPoint() {
        return this.point;
    }

    /**
     * @return pointRatio
     */
    public Integer getPointRatio() {
        return this.pointRatio;
    }

    /**
     * @return pointTime
     */
    public Long getPointTime() {
        return this.pointTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tencentAssetCount
     */
    public Integer getTencentAssetCount() {
        return this.tencentAssetCount;
    }

    /**
     * @return uploadCertificateCount
     */
    public Integer getUploadCertificateCount() {
        return this.uploadCertificateCount;
    }

    public static final class Builder {
        private Integer aliyunAssetCount; 
        private Integer awsAssetCount; 
        private Integer buyCertificateCount; 
        private Integer domainAssetCount; 
        private Integer freeCertificateCount; 
        private Integer huaweiAssetCount; 
        private Integer lastPoint; 
        private Integer point; 
        private Integer pointRatio; 
        private Long pointTime; 
        private String requestId; 
        private Integer tencentAssetCount; 
        private Integer uploadCertificateCount; 

        private Builder() {
        } 

        private Builder(GetAssetCountResponseBody model) {
            this.aliyunAssetCount = model.aliyunAssetCount;
            this.awsAssetCount = model.awsAssetCount;
            this.buyCertificateCount = model.buyCertificateCount;
            this.domainAssetCount = model.domainAssetCount;
            this.freeCertificateCount = model.freeCertificateCount;
            this.huaweiAssetCount = model.huaweiAssetCount;
            this.lastPoint = model.lastPoint;
            this.point = model.point;
            this.pointRatio = model.pointRatio;
            this.pointTime = model.pointTime;
            this.requestId = model.requestId;
            this.tencentAssetCount = model.tencentAssetCount;
            this.uploadCertificateCount = model.uploadCertificateCount;
        } 

        /**
         * <p>The total number of Alibaba Cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder aliyunAssetCount(Integer aliyunAssetCount) {
            this.aliyunAssetCount = aliyunAssetCount;
            return this;
        }

        /**
         * <p>The total number of Amazon Web Services (AWS) resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder awsAssetCount(Integer awsAssetCount) {
            this.awsAssetCount = awsAssetCount;
            return this;
        }

        /**
         * <p>The number of paid certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder buyCertificateCount(Integer buyCertificateCount) {
            this.buyCertificateCount = buyCertificateCount;
            return this;
        }

        /**
         * <p>The total number of domain name resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder domainAssetCount(Integer domainAssetCount) {
            this.domainAssetCount = domainAssetCount;
            return this;
        }

        /**
         * <p>The number of free certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder freeCertificateCount(Integer freeCertificateCount) {
            this.freeCertificateCount = freeCertificateCount;
            return this;
        }

        /**
         * <p>The total number of Huawei Cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder huaweiAssetCount(Integer huaweiAssetCount) {
            this.huaweiAssetCount = huaweiAssetCount;
            return this;
        }

        /**
         * <p>The previous health score.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder lastPoint(Integer lastPoint) {
            this.lastPoint = lastPoint;
            return this;
        }

        /**
         * <p>The generated perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder point(Integer point) {
            this.point = point;
            return this;
        }

        /**
         * <p>The health score ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pointRatio(Integer pointRatio) {
            this.pointRatio = pointRatio;
            return this;
        }

        /**
         * <p>The time when the health score was updated (in timestamp format, accurate to seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1767681210879</p>
         */
        public Builder pointTime(Long pointTime) {
            this.pointTime = pointTime;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EECA10D5-BD0F-4EF1-B3EA-B4578E5C6F8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of Tencent Cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder tencentAssetCount(Integer tencentAssetCount) {
            this.tencentAssetCount = tencentAssetCount;
            return this;
        }

        /**
         * <p>The number of uploaded certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder uploadCertificateCount(Integer uploadCertificateCount) {
            this.uploadCertificateCount = uploadCertificateCount;
            return this;
        }

        public GetAssetCountResponseBody build() {
            return new GetAssetCountResponseBody(this);
        } 

    } 

}
