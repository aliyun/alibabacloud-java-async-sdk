// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MaintainWindowForModify} extends {@link TeaModel}
 *
 * <p>MaintainWindowForModify</p>
 */
public class MaintainWindowForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("effective")
    private String effective;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("maintainWindowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainWindowName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private MaintainWindowForModify(Builder builder) {
        this.description = builder.description;
        this.effective = builder.effective;
        this.endTime = builder.endTime;
        this.filterSetting = builder.filterSetting;
        this.maintainWindowName = builder.maintainWindowName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaintainWindowForModify create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return effective
     */
    public String getEffective() {
        return this.effective;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return maintainWindowName
     */
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String description; 
        private String effective; 
        private String endTime; 
        private FilterSetting filterSetting; 
        private String maintainWindowName; 
        private String startTime; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * effective.
         */
        public Builder effective(String effective) {
            this.effective = effective;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder maintainWindowName(String maintainWindowName) {
            this.maintainWindowName = maintainWindowName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public MaintainWindowForModify build() {
            return new MaintainWindowForModify(this);
        } 

    } 

}
