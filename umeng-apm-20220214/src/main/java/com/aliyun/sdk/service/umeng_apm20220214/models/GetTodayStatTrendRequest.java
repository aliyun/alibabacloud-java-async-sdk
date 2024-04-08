// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTodayStatTrendRequest} extends {@link RequestModel}
 *
 * <p>GetTodayStatTrendRequest</p>
 */
public class GetTodayStatTrendRequest extends Request {
    @Query
    @NameInMap("appVersion")
    private String appVersion;

    @Query
    @NameInMap("dataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private Integer type;

    private GetTodayStatTrendRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.dataSourceId = builder.dataSourceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTodayStatTrendRequest create() {
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
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetTodayStatTrendRequest, Builder> {
        private String appVersion; 
        private String dataSourceId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetTodayStatTrendRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.dataSourceId = request.dataSourceId;
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
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetTodayStatTrendRequest build() {
            return new GetTodayStatTrendRequest(this);
        } 

    } 

}
