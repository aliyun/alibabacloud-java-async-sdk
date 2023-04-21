// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmEventStackInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmEventStackInfoRequest</p>
 */
public class DescribeAlarmEventStackInfoRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private String desktopId;

    @Query
    @NameInMap("EventName")
    @Validation(required = true)
    private String eventName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UniqueInfo")
    @Validation(required = true)
    private String uniqueInfo;

    private DescribeAlarmEventStackInfoRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.eventName = builder.eventName;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.uniqueInfo = builder.uniqueInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventStackInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return uniqueInfo
     */
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public static final class Builder extends Request.Builder<DescribeAlarmEventStackInfoRequest, Builder> {
        private String desktopId; 
        private String eventName; 
        private String lang; 
        private String regionId; 
        private String uniqueInfo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmEventStackInfoRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.eventName = request.eventName;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.uniqueInfo = request.uniqueInfo;
        } 

        /**
         * The ID of the cloud desktop.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The name of the alert event.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The natural language of the request and response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the alert event.
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        @Override
        public DescribeAlarmEventStackInfoRequest build() {
            return new DescribeAlarmEventStackInfoRequest(this);
        } 

    } 

}
