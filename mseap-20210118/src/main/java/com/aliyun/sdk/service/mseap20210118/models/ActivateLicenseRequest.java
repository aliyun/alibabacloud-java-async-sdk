// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link ActivateLicenseRequest} extends {@link RequestModel}
 *
 * <p>ActivateLicenseRequest</p>
 */
public class ActivateLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseNo")
    private String licenseNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicensePublisher")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licensePublisher;

    private ActivateLicenseRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.licenseCode = builder.licenseCode;
        this.licenseNo = builder.licenseNo;
        this.licensePublisher = builder.licensePublisher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return licenseCode
     */
    public String getLicenseCode() {
        return this.licenseCode;
    }

    /**
     * @return licenseNo
     */
    public String getLicenseNo() {
        return this.licenseNo;
    }

    /**
     * @return licensePublisher
     */
    public String getLicensePublisher() {
        return this.licensePublisher;
    }

    public static final class Builder extends Request.Builder<ActivateLicenseRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String licenseCode; 
        private String licenseNo; 
        private String licensePublisher; 

        private Builder() {
            super();
        } 

        private Builder(ActivateLicenseRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.licenseCode = request.licenseCode;
            this.licenseNo = request.licenseNo;
            this.licensePublisher = request.licensePublisher;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.bookkeeping_course</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>B09YICKLVHNR7ZQR</p>
         */
        public Builder licenseCode(String licenseCode) {
            this.putQueryParameter("LicenseCode", licenseCode);
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * LicenseNo.
         */
        public Builder licenseNo(String licenseNo) {
            this.putQueryParameter("LicenseNo", licenseNo);
            this.licenseNo = licenseNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yunMarket</p>
         */
        public Builder licensePublisher(String licensePublisher) {
            this.putQueryParameter("LicensePublisher", licensePublisher);
            this.licensePublisher = licensePublisher;
            return this;
        }

        @Override
        public ActivateLicenseRequest build() {
            return new ActivateLicenseRequest(this);
        } 

    } 

}
