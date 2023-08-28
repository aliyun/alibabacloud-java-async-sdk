// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppLogRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppLogRequest</p>
 */
public class GetSparkAppLogRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("LogLength")
    @Validation(maximum = 500)
    private Long logLength;

    private GetSparkAppLogRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.logLength = builder.logLength;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return logLength
     */
    public Long getLogLength() {
        return this.logLength;
    }

    public static final class Builder extends Request.Builder<GetSparkAppLogRequest, Builder> {
        private String appId; 
        private Long logLength; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppLogRequest request) {
            super(request);
            this.appId = request.appId;
            this.logLength = request.logLength;
        } 

        /**
         * The Spark application ID.
         * <p>
         * 
         * > You can call the [ListSparkApps](~~~~) operation to query the Spark application ID.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The number of log entries to return. Valid values: 1 to 500. Default value: 300.
         */
        public Builder logLength(Long logLength) {
            this.putBodyParameter("LogLength", logLength);
            this.logLength = logLength;
            return this;
        }

        @Override
        public GetSparkAppLogRequest build() {
            return new GetSparkAppLogRequest(this);
        } 

    } 

}
