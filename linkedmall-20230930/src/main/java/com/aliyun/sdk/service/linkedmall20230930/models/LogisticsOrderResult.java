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
 * {@link LogisticsOrderResult} extends {@link TeaModel}
 *
 * <p>LogisticsOrderResult</p>
 */
public class LogisticsOrderResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataProvider")
    private String dataProvider;

    @com.aliyun.core.annotation.NameInMap("dataProviderTitle")
    private String dataProviderTitle;

    @com.aliyun.core.annotation.NameInMap("goods")
    private java.util.List<Good> goods;

    @com.aliyun.core.annotation.NameInMap("logisticsCompanyCode")
    private String logisticsCompanyCode;

    @com.aliyun.core.annotation.NameInMap("logisticsCompanyName")
    private String logisticsCompanyName;

    @com.aliyun.core.annotation.NameInMap("logisticsDetailList")
    private java.util.List<LogisticsDetail> logisticsDetailList;

    @com.aliyun.core.annotation.NameInMap("mailNo")
    private String mailNo;

    private LogisticsOrderResult(Builder builder) {
        this.dataProvider = builder.dataProvider;
        this.dataProviderTitle = builder.dataProviderTitle;
        this.goods = builder.goods;
        this.logisticsCompanyCode = builder.logisticsCompanyCode;
        this.logisticsCompanyName = builder.logisticsCompanyName;
        this.logisticsDetailList = builder.logisticsDetailList;
        this.mailNo = builder.mailNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogisticsOrderResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataProvider
     */
    public String getDataProvider() {
        return this.dataProvider;
    }

    /**
     * @return dataProviderTitle
     */
    public String getDataProviderTitle() {
        return this.dataProviderTitle;
    }

    /**
     * @return goods
     */
    public java.util.List<Good> getGoods() {
        return this.goods;
    }

    /**
     * @return logisticsCompanyCode
     */
    public String getLogisticsCompanyCode() {
        return this.logisticsCompanyCode;
    }

    /**
     * @return logisticsCompanyName
     */
    public String getLogisticsCompanyName() {
        return this.logisticsCompanyName;
    }

    /**
     * @return logisticsDetailList
     */
    public java.util.List<LogisticsDetail> getLogisticsDetailList() {
        return this.logisticsDetailList;
    }

    /**
     * @return mailNo
     */
    public String getMailNo() {
        return this.mailNo;
    }

    public static final class Builder {
        private String dataProvider; 
        private String dataProviderTitle; 
        private java.util.List<Good> goods; 
        private String logisticsCompanyCode; 
        private String logisticsCompanyName; 
        private java.util.List<LogisticsDetail> logisticsDetailList; 
        private String mailNo; 

        private Builder() {
        } 

        private Builder(LogisticsOrderResult model) {
            this.dataProvider = model.dataProvider;
            this.dataProviderTitle = model.dataProviderTitle;
            this.goods = model.goods;
            this.logisticsCompanyCode = model.logisticsCompanyCode;
            this.logisticsCompanyName = model.logisticsCompanyName;
            this.logisticsDetailList = model.logisticsDetailList;
            this.mailNo = model.mailNo;
        } 

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Cainiao</p>
         */
        public Builder dataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }

        /**
         * <p>The data text.</p>
         * 
         * <strong>example:</strong>
         * <p>Cainiao Guoguo</p>
         */
        public Builder dataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }

        /**
         * <p>The product details.</p>
         */
        public Builder goods(java.util.List<Good> goods) {
            this.goods = goods;
            return this;
        }

        /**
         * <p>The logistics company code.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>ZTKY: China Railway Logistics</li>
         * <li>POST: China Post</li>
         * <li>DBKD: Deppon Express</li>
         * <li>JT: J&amp;T Express</li>
         * <li>QFKD: Quanfeng Express</li>
         * <li>EYB: China Post E-commerce Express EYB</li>
         * <li>STO: STO Express</li>
         * <li>SF: SF Express</li>
         * <li>ZTO: ZTO Express</li>
         * <li>YTO: YTO Express</li>
         * <li>TTKDEX: Tiantian Express</li>
         * <li>JDLEx: JD Express</li>
         * <li>ETICKET: Electronic vouchers</li>
         * <li>HTKY: Best Express</li>
         * <li>SHQ: Huaqiang Logistics</li>
         * <li>TAOBAO: Taobao Logistics</li>
         * <li>YUNDA: Yunda Express</li>
         * <li>ZJS: ZJS Express</li>
         * <li>FEDEX: FedEx</li>
         * <li>EMS: EMS</li>
         * <li>POSTB: China Post Parcel</li>
         * <li>OTHER: Other</li>
         * <li>CNDJWL: Cainiao Large Item Logistics</li>
         * <li>TN: Teneng</li>
         * <li>ZMKM: Cainiao Express</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SF</p>
         */
        public Builder logisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }

        /**
         * <p>The logistics company name.</p>
         * 
         * <strong>example:</strong>
         * <p>SF Express</p>
         */
        public Builder logisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }

        /**
         * <p>The logistics details.</p>
         */
        public Builder logisticsDetailList(java.util.List<LogisticsDetail> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }

        /**
         * <p>The logistics tracking number.</p>
         * <blockquote>
         * <p>The logistics tracking number for electronic vouchers is a fixed value: *.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SF234***2345</p>
         */
        public Builder mailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }

        public LogisticsOrderResult build() {
            return new LogisticsOrderResult(this);
        } 

    } 

}
