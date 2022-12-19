// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityCheckScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityCheckScheduleConfigRequest</p>
 */
public class ModifySecurityCheckScheduleConfigRequest extends Request {
    @Query
    @NameInMap("DaysOfWeek")
    @Validation(required = true)
    private String daysOfWeek;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Integer endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Integer startTime;

    private ModifySecurityCheckScheduleConfigRequest(Builder builder) {
        super(builder);
        this.daysOfWeek = builder.daysOfWeek;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityCheckScheduleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return daysOfWeek
     */
    public String getDaysOfWeek() {
        return this.daysOfWeek;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ModifySecurityCheckScheduleConfigRequest, Builder> {
        private String daysOfWeek; 
        private Integer endTime; 
        private String lang; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityCheckScheduleConfigRequest request) {
            super(request);
            this.daysOfWeek = request.daysOfWeek;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
        } 

        /**
         * The days on which the automatic configuration check runs. You can specify multiple days. Separate multiple days with commas (,). Valid values:
         * <p>
         * 
         * *   **1**: Monday
         * *   **2**: Tuesday
         * *   **3**: Wednesday
         * *   **4**: Thursday
         * *   **5**: Friday
         * *   **6**: Saturday
         * *   **7**: Sunday
         */
        public Builder daysOfWeek(String daysOfWeek) {
            this.putQueryParameter("DaysOfWeek", daysOfWeek);
            this.daysOfWeek = daysOfWeek;
            return this;
        }

        /**
         * The time period during which the automatic configuration check ends. Valid values:
         * <p>
         * 
         * *   **0**: 00:00 to 06:00
         * *   **6**: 06:00 to 12:00
         * *   **12**: 12:00 to 18:00
         * *   **18**: 18:00 to 24:00
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The time period during which the automatic configuration check starts. Valid values:
         * <p>
         * 
         * *   **0**: 00:00 to 06:00
         * *   **6**: 06:00 to 12:00
         * *   **12**: 12:00 to 18:00
         * *   **18**: 18:00 to 24:00
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ModifySecurityCheckScheduleConfigRequest build() {
            return new ModifySecurityCheckScheduleConfigRequest(this);
        } 

    } 

}
