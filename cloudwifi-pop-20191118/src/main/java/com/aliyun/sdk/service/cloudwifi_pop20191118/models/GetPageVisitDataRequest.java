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
 * {@link GetPageVisitDataRequest} extends {@link RequestModel}
 *
 * <p>GetPageVisitDataRequest</p>
 */
public class GetPageVisitDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PId")
    private String pId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private GetPageVisitDataRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.endTime = builder.endTime;
        this.pId = builder.pId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPageVisitDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pId
     */
    public String getPId() {
        return this.pId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetPageVisitDataRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String endTime; 
        private String pId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetPageVisitDataRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.endTime = request.endTime;
            this.pId = request.pId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>appCode</p>
         * 
         * <strong>example:</strong>
         * <p>3c0837d5-e65b-11ec-9985-02420bb080c6</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>appName</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_NETWORK</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>endTime</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-11</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>pId</p>
         * 
         * <strong>example:</strong>
         * <p>19048</p>
         */
        public Builder pId(String pId) {
            this.putQueryParameter("PId", pId);
            this.pId = pId;
            return this;
        }

        /**
         * <p>startTime</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-22</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetPageVisitDataRequest build() {
            return new GetPageVisitDataRequest(this);
        } 

    } 

}
