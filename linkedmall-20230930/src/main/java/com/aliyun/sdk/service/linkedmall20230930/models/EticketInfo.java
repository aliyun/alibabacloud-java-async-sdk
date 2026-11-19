// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link EticketInfo} extends {@link TeaModel}
 *
 * <p>EticketInfo</p>
 */
public class EticketInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("availableNum")
    private Long availableNum;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("codeStatus")
    private Long codeStatus;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("lockNum")
    private Long lockNum;

    @com.aliyun.core.annotation.NameInMap("qrcodeUrl")
    private String qrcodeUrl;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("useTime")
    private String useTime;

    @com.aliyun.core.annotation.NameInMap("usedNum")
    private Long usedNum;

    private EticketInfo(Builder builder) {
        this.availableNum = builder.availableNum;
        this.code = builder.code;
        this.codeStatus = builder.codeStatus;
        this.endTime = builder.endTime;
        this.lockNum = builder.lockNum;
        this.qrcodeUrl = builder.qrcodeUrl;
        this.startTime = builder.startTime;
        this.useTime = builder.useTime;
        this.usedNum = builder.usedNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EticketInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableNum
     */
    public Long getAvailableNum() {
        return this.availableNum;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeStatus
     */
    public Long getCodeStatus() {
        return this.codeStatus;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lockNum
     */
    public Long getLockNum() {
        return this.lockNum;
    }

    /**
     * @return qrcodeUrl
     */
    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return useTime
     */
    public String getUseTime() {
        return this.useTime;
    }

    /**
     * @return usedNum
     */
    public Long getUsedNum() {
        return this.usedNum;
    }

    public static final class Builder {
        private Long availableNum; 
        private String code; 
        private Long codeStatus; 
        private String endTime; 
        private Long lockNum; 
        private String qrcodeUrl; 
        private String startTime; 
        private String useTime; 
        private Long usedNum; 

        private Builder() {
        } 

        private Builder(EticketInfo model) {
            this.availableNum = model.availableNum;
            this.code = model.code;
            this.codeStatus = model.codeStatus;
            this.endTime = model.endTime;
            this.lockNum = model.lockNum;
            this.qrcodeUrl = model.qrcodeUrl;
            this.startTime = model.startTime;
            this.useTime = model.useTime;
            this.usedNum = model.usedNum;
        } 

        /**
         * <p>The number of unredeemed voucher electronic credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder availableNum(Long availableNum) {
            this.availableNum = availableNum;
            return this;
        }

        /**
         * <p>The code of the voucher electronic credential.</p>
         * 
         * <strong>example:</strong>
         * <p>taobao******tpg</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status of the voucher electronic credential.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: valid</li>
         * <li>-1: redeemed</li>
         * <li>-2: expired</li>
         * <li>100: locked</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder codeStatus(Long codeStatus) {
            this.codeStatus = codeStatus;
            return this;
        }

        /**
         * <p>The end time of the validity period for the voucher electronic credential.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-02T23:59:59.000+08:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of voucher electronic credentials in locked status.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder lockNum(Long lockNum) {
            this.lockNum = lockNum;
            return this;
        }

        /**
         * <p>The URL of the QR code image for the voucher electronic credential.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://qrcode.alicdn.com/img.jpg">http://qrcode.alicdn.com/img.jpg</a></p>
         */
        public Builder qrcodeUrl(String qrcodeUrl) {
            this.qrcodeUrl = qrcodeUrl;
            return this;
        }

        /**
         * <p>The start time of the validity period for the voucher electronic credential.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T00:00:00.000+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The redemption time of the voucher electronic credential.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T15:07:59.000+08:00</p>
         */
        public Builder useTime(String useTime) {
            this.useTime = useTime;
            return this;
        }

        /**
         * <p>The number of redeemed voucher electronic credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedNum(Long usedNum) {
            this.usedNum = usedNum;
            return this;
        }

        public EticketInfo build() {
            return new EticketInfo(this);
        } 

    } 

}
