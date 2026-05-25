// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link CreateTlogTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTlogTaskRequest</p>
 */
public class CreateTlogTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliYunCurrentPk")
    private String aliYunCurrentPk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliYunMainPk")
    private String aliYunMainPk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliYunName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliYunName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginDate")
    private Long beginDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CollectionNums")
    private Long collectionNums;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Days")
    private String days;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceJson")
    private String deviceJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErrorType")
    private String errorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifySettingJson")
    private String notifySettingJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    @com.aliyun.core.annotation.Validation(required = true)
    private String os;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsVersion")
    private String osVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateTlogTaskRequest(Builder builder) {
        super(builder);
        this.aliYunCurrentPk = builder.aliYunCurrentPk;
        this.aliYunMainPk = builder.aliYunMainPk;
        this.aliYunName = builder.aliYunName;
        this.appKey = builder.appKey;
        this.appVersion = builder.appVersion;
        this.beginDate = builder.beginDate;
        this.brand = builder.brand;
        this.city = builder.city;
        this.clusterId = builder.clusterId;
        this.collectionNums = builder.collectionNums;
        this.days = builder.days;
        this.deviceJson = builder.deviceJson;
        this.endDate = builder.endDate;
        this.errorType = builder.errorType;
        this.model = builder.model;
        this.notifySettingJson = builder.notifySettingJson;
        this.os = builder.os;
        this.osVersion = builder.osVersion;
        this.sourceType = builder.sourceType;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTlogTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliYunCurrentPk
     */
    public String getAliYunCurrentPk() {
        return this.aliYunCurrentPk;
    }

    /**
     * @return aliYunMainPk
     */
    public String getAliYunMainPk() {
        return this.aliYunMainPk;
    }

    /**
     * @return aliYunName
     */
    public String getAliYunName() {
        return this.aliYunName;
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return beginDate
     */
    public Long getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return collectionNums
     */
    public Long getCollectionNums() {
        return this.collectionNums;
    }

    /**
     * @return days
     */
    public String getDays() {
        return this.days;
    }

    /**
     * @return deviceJson
     */
    public String getDeviceJson() {
        return this.deviceJson;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return errorType
     */
    public String getErrorType() {
        return this.errorType;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return notifySettingJson
     */
    public String getNotifySettingJson() {
        return this.notifySettingJson;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return osVersion
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateTlogTaskRequest, Builder> {
        private String aliYunCurrentPk; 
        private String aliYunMainPk; 
        private String aliYunName; 
        private Long appKey; 
        private String appVersion; 
        private Long beginDate; 
        private String brand; 
        private String city; 
        private String clusterId; 
        private Long collectionNums; 
        private String days; 
        private String deviceJson; 
        private Long endDate; 
        private String errorType; 
        private String model; 
        private String notifySettingJson; 
        private String os; 
        private String osVersion; 
        private String sourceType; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTlogTaskRequest request) {
            super(request);
            this.aliYunCurrentPk = request.aliYunCurrentPk;
            this.aliYunMainPk = request.aliYunMainPk;
            this.aliYunName = request.aliYunName;
            this.appKey = request.appKey;
            this.appVersion = request.appVersion;
            this.beginDate = request.beginDate;
            this.brand = request.brand;
            this.city = request.city;
            this.clusterId = request.clusterId;
            this.collectionNums = request.collectionNums;
            this.days = request.days;
            this.deviceJson = request.deviceJson;
            this.endDate = request.endDate;
            this.errorType = request.errorType;
            this.model = request.model;
            this.notifySettingJson = request.notifySettingJson;
            this.os = request.os;
            this.osVersion = request.osVersion;
            this.sourceType = request.sourceType;
            this.taskName = request.taskName;
        } 

        /**
         * AliYunCurrentPk.
         */
        public Builder aliYunCurrentPk(String aliYunCurrentPk) {
            this.putBodyParameter("AliYunCurrentPk", aliYunCurrentPk);
            this.aliYunCurrentPk = aliYunCurrentPk;
            return this;
        }

        /**
         * AliYunMainPk.
         */
        public Builder aliYunMainPk(String aliYunMainPk) {
            this.putBodyParameter("AliYunMainPk", aliYunMainPk);
            this.aliYunMainPk = aliYunMainPk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>emas_user</p>
         */
        public Builder aliYunName(String aliYunName) {
            this.putBodyParameter("AliYunName", aliYunName);
            this.aliYunName = aliYunName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24780725</p>
         */
        public Builder appKey(Long appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * BeginDate.
         */
        public Builder beginDate(Long beginDate) {
            this.putBodyParameter("BeginDate", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * Brand.
         */
        public Builder brand(String brand) {
            this.putBodyParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putBodyParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CollectionNums.
         */
        public Builder collectionNums(Long collectionNums) {
            this.putBodyParameter("CollectionNums", collectionNums);
            this.collectionNums = collectionNums;
            return this;
        }

        /**
         * Days.
         */
        public Builder days(String days) {
            this.putBodyParameter("Days", days);
            this.days = days;
            return this;
        }

        /**
         * DeviceJson.
         */
        public Builder deviceJson(String deviceJson) {
            this.putBodyParameter("DeviceJson", deviceJson);
            this.deviceJson = deviceJson;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ErrorType.
         */
        public Builder errorType(String errorType) {
            this.putBodyParameter("ErrorType", errorType);
            this.errorType = errorType;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NotifySettingJson.
         */
        public Builder notifySettingJson(String notifySettingJson) {
            this.putBodyParameter("NotifySettingJson", notifySettingJson);
            this.notifySettingJson = notifySettingJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * OsVersion.
         */
        public Builder osVersion(String osVersion) {
            this.putBodyParameter("OsVersion", osVersion);
            this.osVersion = osVersion;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateTlogTaskRequest build() {
            return new CreateTlogTaskRequest(this);
        } 

    } 

}
