// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveCdnDiagnoseInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveCdnDiagnoseInfoRequest</p>
 */
public class DescribeLiveCdnDiagnoseInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("intervalType")
    private String intervalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("phase")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestType")
    private String requestType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("streamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("streamSuffix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamSuffix;

    private DescribeLiveCdnDiagnoseInfoRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.app = builder.app;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.intervalType = builder.intervalType;
        this.phase = builder.phase;
        this.requestType = builder.requestType;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
        this.streamSuffix = builder.streamSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveCdnDiagnoseInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return intervalType
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * @return phase
     */
    public Integer getPhase() {
        return this.phase;
    }

    /**
     * @return requestType
     */
    public String getRequestType() {
        return this.requestType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return streamSuffix
     */
    public String getStreamSuffix() {
        return this.streamSuffix;
    }

    public static final class Builder extends Request.Builder<DescribeLiveCdnDiagnoseInfoRequest, Builder> {
        private String securityToken; 
        private String app; 
        private String domain; 
        private Long endTime; 
        private String intervalType; 
        private Integer phase; 
        private String requestType; 
        private Long startTime; 
        private String streamName; 
        private String streamSuffix; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveCdnDiagnoseInfoRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.app = request.app;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.intervalType = request.intervalType;
            this.phase = request.phase;
            this.requestType = request.requestType;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
            this.streamSuffix = request.streamSuffix;
        } 

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("app", app);
            this.app = app;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * intervalType.
         */
        public Builder intervalType(String intervalType) {
            this.putQueryParameter("intervalType", intervalType);
            this.intervalType = intervalType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder phase(Integer phase) {
            this.putQueryParameter("phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * requestType.
         */
        public Builder requestType(String requestType) {
            this.putQueryParameter("requestType", requestType);
            this.requestType = requestType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("streamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder streamSuffix(String streamSuffix) {
            this.putQueryParameter("streamSuffix", streamSuffix);
            this.streamSuffix = streamSuffix;
            return this;
        }

        @Override
        public DescribeLiveCdnDiagnoseInfoRequest build() {
            return new DescribeLiveCdnDiagnoseInfoRequest(this);
        } 

    } 

}
