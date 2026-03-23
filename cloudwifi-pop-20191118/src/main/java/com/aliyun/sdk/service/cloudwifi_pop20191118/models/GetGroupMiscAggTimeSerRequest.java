// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link GetGroupMiscAggTimeSerRequest} extends {@link RequestModel}
 *
 * <p>GetGroupMiscAggTimeSerRequest</p>
 */
public class GetGroupMiscAggTimeSerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apgroupUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long start;

    private GetGroupMiscAggTimeSerRequest(Builder builder) {
        super(builder);
        this.apgroupUuid = builder.apgroupUuid;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.end = builder.end;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupMiscAggTimeSerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apgroupUuid
     */
    public String getApgroupUuid() {
        return this.apgroupUuid;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetGroupMiscAggTimeSerRequest, Builder> {
        private String apgroupUuid; 
        private String appCode; 
        private String appName; 
        private Long end; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetGroupMiscAggTimeSerRequest request) {
            super(request);
            this.apgroupUuid = request.apgroupUuid;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.end = request.end;
            this.start = request.start;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apgroupUuid(String apgroupUuid) {
            this.putQueryParameter("ApgroupUuid", apgroupUuid);
            this.apgroupUuid = apgroupUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetGroupMiscAggTimeSerRequest build() {
            return new GetGroupMiscAggTimeSerRequest(this);
        } 

    } 

}
