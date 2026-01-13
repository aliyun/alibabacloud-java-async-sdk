// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link DownloadApiCallDailyDetailCmd} extends {@link TeaModel}
 *
 * <p>DownloadApiCallDailyDetailCmd</p>
 */
public class DownloadApiCallDailyDetailCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiName")
    private String apiName;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("engineType")
    private String engineType;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private DownloadApiCallDailyDetailCmd(Builder builder) {
        this.apiName = builder.apiName;
        this.endTime = builder.endTime;
        this.engineType = builder.engineType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadApiCallDailyDetailCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String apiName; 
        private String endTime; 
        private String engineType; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DownloadApiCallDailyDetailCmd model) {
            this.apiName = model.apiName;
            this.endTime = model.endTime;
            this.engineType = model.engineType;
            this.startTime = model.startTime;
        } 

        /**
         * apiName.
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
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
         * engineType.
         */
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DownloadApiCallDailyDetailCmd build() {
            return new DownloadApiCallDailyDetailCmd(this);
        } 

    } 

}
