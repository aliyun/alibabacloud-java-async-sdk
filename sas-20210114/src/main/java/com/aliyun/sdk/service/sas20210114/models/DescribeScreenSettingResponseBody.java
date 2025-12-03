// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenSettingResponseBody</p>
 */
public class DescribeScreenSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogoPower")
    private Boolean logoPower;

    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    private String logoUrl;

    @com.aliyun.core.annotation.NameInMap("MonitorUrl")
    private String monitorUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScreenDataMap")
    private String screenDataMap;

    @com.aliyun.core.annotation.NameInMap("ScreenDefault")
    private Integer screenDefault;

    @com.aliyun.core.annotation.NameInMap("ScreenId")
    private Integer screenId;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private DescribeScreenSettingResponseBody(Builder builder) {
        this.logoPower = builder.logoPower;
        this.logoUrl = builder.logoUrl;
        this.monitorUrl = builder.monitorUrl;
        this.requestId = builder.requestId;
        this.screenDataMap = builder.screenDataMap;
        this.screenDefault = builder.screenDefault;
        this.screenId = builder.screenId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logoPower
     */
    public Boolean getLogoPower() {
        return this.logoPower;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return monitorUrl
     */
    public String getMonitorUrl() {
        return this.monitorUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return screenDataMap
     */
    public String getScreenDataMap() {
        return this.screenDataMap;
    }

    /**
     * @return screenDefault
     */
    public Integer getScreenDefault() {
        return this.screenDefault;
    }

    /**
     * @return screenId
     */
    public Integer getScreenId() {
        return this.screenId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private Boolean logoPower; 
        private String logoUrl; 
        private String monitorUrl; 
        private String requestId; 
        private String screenDataMap; 
        private Integer screenDefault; 
        private Integer screenId; 
        private String title; 

        private Builder() {
        } 

        private Builder(DescribeScreenSettingResponseBody model) {
            this.logoPower = model.logoPower;
            this.logoUrl = model.logoUrl;
            this.monitorUrl = model.monitorUrl;
            this.requestId = model.requestId;
            this.screenDataMap = model.screenDataMap;
            this.screenDefault = model.screenDefault;
            this.screenId = model.screenId;
            this.title = model.title;
        } 

        /**
         * LogoPower.
         */
        public Builder logoPower(Boolean logoPower) {
            this.logoPower = logoPower;
            return this;
        }

        /**
         * LogoUrl.
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * MonitorUrl.
         */
        public Builder monitorUrl(String monitorUrl) {
            this.monitorUrl = monitorUrl;
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
         * ScreenDataMap.
         */
        public Builder screenDataMap(String screenDataMap) {
            this.screenDataMap = screenDataMap;
            return this;
        }

        /**
         * ScreenDefault.
         */
        public Builder screenDefault(Integer screenDefault) {
            this.screenDefault = screenDefault;
            return this;
        }

        /**
         * ScreenId.
         */
        public Builder screenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public DescribeScreenSettingResponseBody build() {
            return new DescribeScreenSettingResponseBody(this);
        } 

    } 

}
