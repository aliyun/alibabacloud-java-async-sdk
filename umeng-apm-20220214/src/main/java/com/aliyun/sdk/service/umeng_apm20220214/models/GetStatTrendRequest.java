// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStatTrendRequest} extends {@link RequestModel}
 *
 * <p>GetStatTrendRequest</p>
 */
public class GetStatTrendRequest extends Request {
    @Query
    @NameInMap("appVersion")
    private String appVersion;

    @Query
    @NameInMap("dataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Query
    @NameInMap("endDate")
    private String endDate;

    @Query
    @NameInMap("startDate")
    private String startDate;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private Integer type;

    private GetStatTrendRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.dataSourceId = builder.dataSourceId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStatTrendRequest create() {
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
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetStatTrendRequest, Builder> {
        private String appVersion; 
        private String dataSourceId; 
        private String endDate; 
        private String startDate; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetStatTrendRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.dataSourceId = request.dataSourceId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
            this.type = request.type;
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
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetStatTrendRequest build() {
            return new GetStatTrendRequest(this);
        } 

    } 

}
