// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CveNum")
    private Integer cveNum;

    @com.aliyun.core.annotation.NameInMap("EmgNum")
    private Integer emgNum;

    @com.aliyun.core.annotation.NameInMap("SysNum")
    private Integer sysNum;

    @com.aliyun.core.annotation.NameInMap("CmsNum")
    private Integer cmsNum;

    @com.aliyun.core.annotation.NameInMap("AppNum")
    private Integer appNum;

    @com.aliyun.core.annotation.NameInMap("ScaNum")
    private Integer scaNum;

    @com.aliyun.core.annotation.NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @com.aliyun.core.annotation.NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @com.aliyun.core.annotation.NameInMap("VulNntfSum")
    private Integer vulNntfSum;

    @com.aliyun.core.annotation.NameInMap("SysAsapNum")
    private Integer sysAsapNum;

    private DataValue(Builder builder) {
        this.cveNum = builder.cveNum;
        this.emgNum = builder.emgNum;
        this.sysNum = builder.sysNum;
        this.cmsNum = builder.cmsNum;
        this.appNum = builder.appNum;
        this.scaNum = builder.scaNum;
        this.vulAsapSum = builder.vulAsapSum;
        this.vulLaterSum = builder.vulLaterSum;
        this.vulNntfSum = builder.vulNntfSum;
        this.sysAsapNum = builder.sysAsapNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cveNum
     */
    public Integer getCveNum() {
        return this.cveNum;
    }

    /**
     * @return emgNum
     */
    public Integer getEmgNum() {
        return this.emgNum;
    }

    /**
     * @return sysNum
     */
    public Integer getSysNum() {
        return this.sysNum;
    }

    /**
     * @return cmsNum
     */
    public Integer getCmsNum() {
        return this.cmsNum;
    }

    /**
     * @return appNum
     */
    public Integer getAppNum() {
        return this.appNum;
    }

    /**
     * @return scaNum
     */
    public Integer getScaNum() {
        return this.scaNum;
    }

    /**
     * @return vulAsapSum
     */
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    /**
     * @return vulLaterSum
     */
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    /**
     * @return vulNntfSum
     */
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

    /**
     * @return sysAsapNum
     */
    public Integer getSysAsapNum() {
        return this.sysAsapNum;
    }

    public static final class Builder {
        private Integer cveNum; 
        private Integer emgNum; 
        private Integer sysNum; 
        private Integer cmsNum; 
        private Integer appNum; 
        private Integer scaNum; 
        private Integer vulAsapSum; 
        private Integer vulLaterSum; 
        private Integer vulNntfSum; 
        private Integer sysAsapNum; 

        private Builder() {
        } 

        private Builder(DataValue model) {
            this.cveNum = model.cveNum;
            this.emgNum = model.emgNum;
            this.sysNum = model.sysNum;
            this.cmsNum = model.cmsNum;
            this.appNum = model.appNum;
            this.scaNum = model.scaNum;
            this.vulAsapSum = model.vulAsapSum;
            this.vulLaterSum = model.vulLaterSum;
            this.vulNntfSum = model.vulNntfSum;
            this.sysAsapNum = model.sysAsapNum;
        } 

        /**
         * CveNum.
         */
        public Builder cveNum(Integer cveNum) {
            this.cveNum = cveNum;
            return this;
        }

        /**
         * EmgNum.
         */
        public Builder emgNum(Integer emgNum) {
            this.emgNum = emgNum;
            return this;
        }

        /**
         * SysNum.
         */
        public Builder sysNum(Integer sysNum) {
            this.sysNum = sysNum;
            return this;
        }

        /**
         * CmsNum.
         */
        public Builder cmsNum(Integer cmsNum) {
            this.cmsNum = cmsNum;
            return this;
        }

        /**
         * AppNum.
         */
        public Builder appNum(Integer appNum) {
            this.appNum = appNum;
            return this;
        }

        /**
         * ScaNum.
         */
        public Builder scaNum(Integer scaNum) {
            this.scaNum = scaNum;
            return this;
        }

        /**
         * VulAsapSum.
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * VulLaterSum.
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * VulNntfSum.
         */
        public Builder vulNntfSum(Integer vulNntfSum) {
            this.vulNntfSum = vulNntfSum;
            return this;
        }

        /**
         * SysAsapNum.
         */
        public Builder sysAsapNum(Integer sysAsapNum) {
            this.sysAsapNum = sysAsapNum;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
