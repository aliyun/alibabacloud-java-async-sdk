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
 * {@link CreateScreenSettingRequest} extends {@link RequestModel}
 *
 * <p>CreateScreenSettingRequest</p>
 */
public class CreateScreenSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoPower")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean logoPower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logoUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorUrl")
    private String monitorUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScreenDataMap")
    @com.aliyun.core.annotation.Validation(required = true)
    private String screenDataMap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScreenDefault")
    private Integer screenDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateScreenSettingRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.logoPower = builder.logoPower;
        this.logoUrl = builder.logoUrl;
        this.monitorUrl = builder.monitorUrl;
        this.screenDataMap = builder.screenDataMap;
        this.screenDefault = builder.screenDefault;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScreenSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateScreenSettingRequest, Builder> {
        private Integer id; 
        private Boolean logoPower; 
        private String logoUrl; 
        private String monitorUrl; 
        private String screenDataMap; 
        private Integer screenDefault; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateScreenSettingRequest request) {
            super(request);
            this.id = request.id;
            this.logoPower = request.logoPower;
            this.logoUrl = request.logoUrl;
            this.monitorUrl = request.monitorUrl;
            this.screenDataMap = request.screenDataMap;
            this.screenDefault = request.screenDefault;
            this.title = request.title;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder logoPower(Boolean logoPower) {
            this.putQueryParameter("LogoPower", logoPower);
            this.logoPower = logoPower;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/tfs/xxxx.png">https://img.alicdn.com/tfs/xxxx.png</a></p>
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * MonitorUrl.
         */
        public Builder monitorUrl(String monitorUrl) {
            this.putQueryParameter("MonitorUrl", monitorUrl);
            this.monitorUrl = monitorUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;positionId&quot;:1,&quot;componentId&quot;:3,&quot;date&quot;:&quot;7-day&quot;},{&quot;positionId&quot;:2,&quot;componentId&quot;:1,&quot;date&quot;:&quot;0-second&quot;},{&quot;positionId&quot;:3,&quot;componentId&quot;:8,&quot;date&quot;:&quot;15-day&quot;},{&quot;positionId&quot;:4,&quot;componentId&quot;:11,&quot;date&quot;:&quot;15-day&quot;},{&quot;positionId&quot;:5,&quot;componentId&quot;:23,&quot;date&quot;:&quot;24-hour&quot;},{&quot;positionId&quot;:6,&quot;componentId&quot;:17,&quot;date&quot;:&quot;24-hour&quot;},{&quot;positionId&quot;:7,&quot;componentId&quot;:13,&quot;date&quot;:&quot;24-hour&quot;},{&quot;positionId&quot;:8,&quot;componentId&quot;:25,&quot;date&quot;:&quot;0-second&quot;}]</p>
         */
        public Builder screenDataMap(String screenDataMap) {
            this.putQueryParameter("ScreenDataMap", screenDataMap);
            this.screenDataMap = screenDataMap;
            return this;
        }

        /**
         * ScreenDefault.
         */
        public Builder screenDefault(Integer screenDefault) {
            this.putQueryParameter("ScreenDefault", screenDefault);
            this.screenDefault = screenDefault;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateScreenSettingRequest build() {
            return new CreateScreenSettingRequest(this);
        } 

    } 

}
