// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetH5PageTrendRequest} extends {@link RequestModel}
 *
 * <p>GetH5PageTrendRequest</p>
 */
public class GetH5PageTrendRequest extends Request {
    @Query
    @NameInMap("appVersion")
    private String appVersion;

    @Query
    @NameInMap("dataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Query
    @NameInMap("endDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("startDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("timeUnit")
    @Validation(required = true)
    private String timeUnit;

    private GetH5PageTrendRequest(Builder builder) {
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

    public static GetH5PageTrendRequest create() {
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

    public static final class Builder extends Request.Builder<GetH5PageTrendRequest, Builder> {
        private String appVersion; 
        private String dataSourceId; 
        private String endDate; 
        private String startDate; 
        private String timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(GetH5PageTrendRequest request) {
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
        public GetH5PageTrendRequest build() {
            return new GetH5PageTrendRequest(this);
        } 

    } 

}
