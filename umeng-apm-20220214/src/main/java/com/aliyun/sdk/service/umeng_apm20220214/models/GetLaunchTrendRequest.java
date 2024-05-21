// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLaunchTrendRequest} extends {@link RequestModel}
 *
 * <p>GetLaunchTrendRequest</p>
 */
public class GetLaunchTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeUnit;

    private GetLaunchTrendRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.dataSourceId = builder.dataSourceId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.timeUnit = builder.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLaunchTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static final class Builder extends Request.Builder<GetLaunchTrendRequest, Builder> {
        private String appVersion; 
        private String dataSourceId; 
        private String endDate; 
        private String startDate; 
        private String timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(GetLaunchTrendRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.dataSourceId = request.dataSourceId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.timeUnit = request.timeUnit;
        } 

        /**
         * appVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("appVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * timeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.putQueryParameter("timeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public GetLaunchTrendRequest build() {
            return new GetLaunchTrendRequest(this);
        } 

    } 

}
