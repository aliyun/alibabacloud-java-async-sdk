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
 * {@link ModifySecurityCheckScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityCheckScheduleConfigRequest</p>
 */
public class ModifySecurityCheckScheduleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
    @com.aliyun.core.annotation.Validation(required = true)
    private String daysOfWeek;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The days on which the automatic configuration check runs. You can specify multiple days. Separate multiple days with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Monday</li>
         * <li><strong>2</strong>: Tuesday</li>
         * <li><strong>3</strong>: Wednesday</li>
         * <li><strong>4</strong>: Thursday</li>
         * <li><strong>5</strong>: Friday</li>
         * <li><strong>6</strong>: Saturday</li>
         * <li><strong>7</strong>: Sunday</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4,5,6</p>
         */
        public Builder daysOfWeek(String daysOfWeek) {
            this.putQueryParameter("DaysOfWeek", daysOfWeek);
            this.daysOfWeek = daysOfWeek;
            return this;
        }

        /**
         * <p>The time period during which the automatic configuration check ends. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: 00:00 to 06:00</li>
         * <li><strong>6</strong>: 06:00 to 12:00</li>
         * <li><strong>12</strong>: 12:00 to 18:00</li>
         * <li><strong>18</strong>: 18:00 to 24:00</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The time period during which the automatic configuration check starts. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: 00:00 to 06:00</li>
         * <li><strong>6</strong>: 06:00 to 12:00</li>
         * <li><strong>12</strong>: 12:00 to 18:00</li>
         * <li><strong>18</strong>: 18:00 to 24:00</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
