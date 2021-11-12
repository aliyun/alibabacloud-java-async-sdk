// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateSasOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateSasOrderRequest</p>
 */
public class CreateSasOrderRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @Query
    @NameInMap("ContainerImageScan")
    private String containerImageScan;

    @Query
    @NameInMap("InstanceCount")
    private String instanceCount;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("SasAntiRansomware")
    private String sasAntiRansomware;

    @Query
    @NameInMap("SasProductService")
    private String sasProductService;

    @Query
    @NameInMap("SasSc")
    private String sasSc;

    @Query
    @NameInMap("SasSlsStorage")
    private String sasSlsStorage;

    @Query
    @NameInMap("SasWebguardBoolean")
    private String sasWebguardBoolean;

    @Query
    @NameInMap("SasWebguardOrderNum")
    private String sasWebguardOrderNum;

    @Query
    @NameInMap("Spec")
    private String spec;

    @Query
    @NameInMap("Vcore")
    private String vcore;


    private CreateSasOrderRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.containerImageScan = builder.containerImageScan;
        this.instanceCount = builder.instanceCount;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.sasAntiRansomware = builder.sasAntiRansomware;
        this.sasProductService = builder.sasProductService;
        this.sasSc = builder.sasSc;
        this.sasSlsStorage = builder.sasSlsStorage;
        this.sasWebguardBoolean = builder.sasWebguardBoolean;
        this.sasWebguardOrderNum = builder.sasWebguardOrderNum;
        this.spec = builder.spec;
        this.vcore = builder.vcore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSasOrderRequest create() {
        return builder().build();
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return containerImageScan
     */
    public String getContainerImageScan() {
        return this.containerImageScan;
    }

    /**
     * @return instanceCount
     */
    public String getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return sasAntiRansomware
     */
    public String getSasAntiRansomware() {
        return this.sasAntiRansomware;
    }

    /**
     * @return sasProductService
     */
    public String getSasProductService() {
        return this.sasProductService;
    }

    /**
     * @return sasSc
     */
    public String getSasSc() {
        return this.sasSc;
    }

    /**
     * @return sasSlsStorage
     */
    public String getSasSlsStorage() {
        return this.sasSlsStorage;
    }

    /**
     * @return sasWebguardBoolean
     */
    public String getSasWebguardBoolean() {
        return this.sasWebguardBoolean;
    }

    /**
     * @return sasWebguardOrderNum
     */
    public String getSasWebguardOrderNum() {
        return this.sasWebguardOrderNum;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return vcore
     */
    public String getVcore() {
        return this.vcore;
    }

    public static final class Builder extends Request.Builder {
        private Boolean autoPay; 
        private Integer autoRenewPeriod; 
        private Boolean autoUseCoupon; 
        private String containerImageScan; 
        private String instanceCount; 
        private Integer period; 
        private String periodUnit; 
        private String sasAntiRansomware; 
        private String sasProductService; 
        private String sasSc; 
        private String sasSlsStorage; 
        private String sasWebguardBoolean; 
        private String sasWebguardOrderNum; 
        private String spec; 
        private String vcore; 

        /**
         * <p>AutoPay.</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>AutoRenewPeriod.</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>AutoUseCoupon.</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>ContainerImageScan.</p>
         */
        public Builder containerImageScan(String containerImageScan) {
            this.putQueryParameter("ContainerImageScan", containerImageScan);
            this.containerImageScan = containerImageScan;
            return this;
        }

        /**
         * <p>InstanceCount.</p>
         */
        public Builder instanceCount(String instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>Period.</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>PeriodUnit.</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>SasAntiRansomware.</p>
         */
        public Builder sasAntiRansomware(String sasAntiRansomware) {
            this.putQueryParameter("SasAntiRansomware", sasAntiRansomware);
            this.sasAntiRansomware = sasAntiRansomware;
            return this;
        }

        /**
         * <p>SasProductService.</p>
         */
        public Builder sasProductService(String sasProductService) {
            this.putQueryParameter("SasProductService", sasProductService);
            this.sasProductService = sasProductService;
            return this;
        }

        /**
         * <p>SasSc.</p>
         */
        public Builder sasSc(String sasSc) {
            this.putQueryParameter("SasSc", sasSc);
            this.sasSc = sasSc;
            return this;
        }

        /**
         * <p>SasSlsStorage.</p>
         */
        public Builder sasSlsStorage(String sasSlsStorage) {
            this.putQueryParameter("SasSlsStorage", sasSlsStorage);
            this.sasSlsStorage = sasSlsStorage;
            return this;
        }

        /**
         * <p>SasWebguardBoolean.</p>
         */
        public Builder sasWebguardBoolean(String sasWebguardBoolean) {
            this.putQueryParameter("SasWebguardBoolean", sasWebguardBoolean);
            this.sasWebguardBoolean = sasWebguardBoolean;
            return this;
        }

        /**
         * <p>SasWebguardOrderNum.</p>
         */
        public Builder sasWebguardOrderNum(String sasWebguardOrderNum) {
            this.putQueryParameter("SasWebguardOrderNum", sasWebguardOrderNum);
            this.sasWebguardOrderNum = sasWebguardOrderNum;
            return this;
        }

        /**
         * <p>Spec.</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>Vcore.</p>
         */
        public Builder vcore(String vcore) {
            this.putQueryParameter("Vcore", vcore);
            this.vcore = vcore;
            return this;
        }

        public CreateSasOrderRequest build() {
            return new CreateSasOrderRequest(this);
        } 

    } 

}
