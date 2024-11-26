// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryProductInstanceListRequest} extends {@link RequestModel}
 *
 * <p>QueryProductInstanceListRequest</p>
 */
public class QueryProductInstanceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fromTime")
    private Long fromTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantUid")
    private String tenantUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("toTime")
    private Long toTime;

    private QueryProductInstanceListRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.fromTime = builder.fromTime;
        this.requestId = builder.requestId;
        this.tenantUid = builder.tenantUid;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductInstanceListRequest create() {
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
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantUid
     */
    public String getTenantUid() {
        return this.tenantUid;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    public static final class Builder extends Request.Builder<QueryProductInstanceListRequest, Builder> {
        private String appCode; 
        private Long fromTime; 
        private String requestId; 
        private String tenantUid; 
        private Long toTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryProductInstanceListRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.fromTime = request.fromTime;
            this.requestId = request.requestId;
            this.tenantUid = request.tenantUid;
            this.toTime = request.toTime;
        } 

        /**
         * appCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("appCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * fromTime.
         */
        public Builder fromTime(Long fromTime) {
            this.putQueryParameter("fromTime", fromTime);
            this.fromTime = fromTime;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * tenantUid.
         */
        public Builder tenantUid(String tenantUid) {
            this.putQueryParameter("tenantUid", tenantUid);
            this.tenantUid = tenantUid;
            return this;
        }

        /**
         * toTime.
         */
        public Builder toTime(Long toTime) {
            this.putQueryParameter("toTime", toTime);
            this.toTime = toTime;
            return this;
        }

        @Override
        public QueryProductInstanceListRequest build() {
            return new QueryProductInstanceListRequest(this);
        } 

    } 

}
