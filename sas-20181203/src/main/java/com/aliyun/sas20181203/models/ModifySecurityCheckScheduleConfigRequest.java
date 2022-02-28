// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

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
    private String daysOfWeek;

    @Query
    @NameInMap("EndTime")
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

        private Builder(ModifySecurityCheckScheduleConfigRequest response) {
            super(response);
            this.daysOfWeek = response.daysOfWeek;
            this.endTime = response.endTime;
            this.lang = response.lang;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceIp = response.sourceIp;
            this.startTime = response.startTime;
        } 

        /**
         * DaysOfWeek.
         */
        public Builder daysOfWeek(String daysOfWeek) {
            this.putQueryParameter("DaysOfWeek", daysOfWeek);
            this.daysOfWeek = daysOfWeek;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartTime.
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
