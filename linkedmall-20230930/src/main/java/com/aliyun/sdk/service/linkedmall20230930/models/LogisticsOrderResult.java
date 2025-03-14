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
         * dataProvider.
         */
        public Builder dataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }

        /**
         * dataProviderTitle.
         */
        public Builder dataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }

        /**
         * goods.
         */
        public Builder goods(java.util.List<Good> goods) {
            this.goods = goods;
            return this;
        }

        /**
         * logisticsCompanyCode.
         */
        public Builder logisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }

        /**
         * logisticsCompanyName.
         */
        public Builder logisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }

        /**
         * logisticsDetailList.
         */
        public Builder logisticsDetailList(java.util.List<LogisticsDetail> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }

        /**
         * mailNo.
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
