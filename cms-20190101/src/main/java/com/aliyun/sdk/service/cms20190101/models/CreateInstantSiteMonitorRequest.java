// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstantSiteMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateInstantSiteMonitorRequest</p>
 */
public class CreateInstantSiteMonitorRequest extends Request {
    @Query
    @NameInMap("Address")
    @Validation(required = true)
    private String address;

    @Query
    @NameInMap("IspCities")
    private String ispCities;

    @Query
    @NameInMap("OptionsJson")
    private String optionsJson;

    @Query
    @NameInMap("RandomIspCity")
    private Integer randomIspCity;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private CreateInstantSiteMonitorRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.ispCities = builder.ispCities;
        this.optionsJson = builder.optionsJson;
        this.randomIspCity = builder.randomIspCity;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstantSiteMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return ispCities
     */
    public String getIspCities() {
        return this.ispCities;
    }

    /**
     * @return optionsJson
     */
    public String getOptionsJson() {
        return this.optionsJson;
    }

    /**
     * @return randomIspCity
     */
    public Integer getRandomIspCity() {
        return this.randomIspCity;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateInstantSiteMonitorRequest, Builder> {
        private String address; 
        private String ispCities; 
        private String optionsJson; 
        private Integer randomIspCity; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstantSiteMonitorRequest request) {
            super(request);
            this.address = request.address;
            this.ispCities = request.ispCities;
            this.optionsJson = request.optionsJson;
            this.randomIspCity = request.randomIspCity;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * The URL or IP address that you want to test.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * The detection points. If you leave this parameter empty, the system randomly selects three detection points.
         * <p>
         * 
         * The value is a `JSON array`. Example: {"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}. The values of the city field indicate Beijing, Hangzhou, and Qingdao.
         * 
         * For information about how to obtain detection points, see [DescribeSiteMonitorISPCityList](~~115045~~).
         * 
         * > You must specify one of the `IspCities` and `RandomIspCity` parameters.
         */
        public Builder ispCities(String ispCities) {
            this.putQueryParameter("IspCities", ispCities);
            this.ispCities = ispCities;
            return this;
        }

        /**
         * The extended options of the protocol that is used by the instant test task. The options vary based on the protocol.
         */
        public Builder optionsJson(String optionsJson) {
            this.putQueryParameter("OptionsJson", optionsJson);
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * The number of detection points.
         * <p>
         * 
         * > 
         * 
         * *   You must specify one of the `IspCities` and `RandomIspCity` parameters. If you specify the `RandomIspCity` parameter, the `IspCities` parameter automatically becomes invalid.
         */
        public Builder randomIspCity(Integer randomIspCity) {
            this.putQueryParameter("RandomIspCity", randomIspCity);
            this.randomIspCity = randomIspCity;
            return this;
        }

        /**
         * The name of the instant test task.
         * <p>
         * 
         * The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of the instant test task. Valid values: HTTP, PING, TCP, UDP, and DNS.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateInstantSiteMonitorRequest build() {
            return new CreateInstantSiteMonitorRequest(this);
        } 

    } 

}
