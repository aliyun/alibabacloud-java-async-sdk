// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

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
 * {@link GetNativePageTrendRequest} extends {@link RequestModel}
 *
 * <p>GetNativePageTrendRequest</p>
 */
public class GetNativePageTrendRequest extends Request {
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

    private GetNativePageTrendRequest(Builder builder) {
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

    public static GetNativePageTrendRequest create() {
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

    public static final class Builder extends Request.Builder<GetNativePageTrendRequest, Builder> {
        private String appVersion; 
        private String dataSourceId; 
        private String endDate; 
        private String startDate; 
        private String timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(GetNativePageTrendRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5fb6001a73749c24fd9cb356</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-03</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder timeUnit(String timeUnit) {
            this.putQueryParameter("timeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public GetNativePageTrendRequest build() {
            return new GetNativePageTrendRequest(this);
        } 

    } 

}
