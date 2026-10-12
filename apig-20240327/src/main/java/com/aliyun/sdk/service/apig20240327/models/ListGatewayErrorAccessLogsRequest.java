// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayErrorAccessLogsRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayErrorAccessLogsRequest</p>
 */
public class ListGatewayErrorAccessLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authority")
    private String authority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayRequestId")
    private String gatewayRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("responseCode")
    private String responseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("routeName")
    private String routeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ListGatewayErrorAccessLogsRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.authority = builder.authority;
        this.endTime = builder.endTime;
        this.gatewayRequestId = builder.gatewayRequestId;
        this.path = builder.path;
        this.responseCode = builder.responseCode;
        this.routeName = builder.routeName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayErrorAccessLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return authority
     */
    public String getAuthority() {
        return this.authority;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return gatewayRequestId
     */
    public String getGatewayRequestId() {
        return this.gatewayRequestId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return routeName
     */
    public String getRouteName() {
        return this.routeName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListGatewayErrorAccessLogsRequest, Builder> {
        private String gatewayId; 
        private String authority; 
        private Long endTime; 
        private String gatewayRequestId; 
        private String path; 
        private String responseCode; 
        private String routeName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayErrorAccessLogsRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.authority = request.authority;
            this.endTime = request.endTime;
            this.gatewayRequestId = request.gatewayRequestId;
            this.path = request.path;
            this.responseCode = request.responseCode;
            this.routeName = request.routeName;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The gateway ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The domain name filter. This parameter performs an exact match against the authority field in Simple Log Service (SLS).</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        public Builder authority(String authority) {
            this.putQueryParameter("authority", authority);
            this.authority = authority;
            return this;
        }

        /**
         * <p>The end of the query window, in UNIX seconds. The value cannot be later than the current time, and the time span cannot exceed 24 hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1756348800</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The gateway request ID (x-acs-request-id) for exact match filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>E5D4xxxx</p>
         */
        public Builder gatewayRequestId(String gatewayRequestId) {
            this.putQueryParameter("gatewayRequestId", gatewayRequestId);
            this.gatewayRequestId = gatewayRequestId;
            return this;
        }

        /**
         * <p>The request path filter.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/pets</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The HTTP error code. Only three-digit numbers in the 400–599 range are accepted. This parameter is required. If you do not specify this parameter, the API returns InvalidParameter.WithDetail (400).</p>
         * 
         * <strong>example:</strong>
         * <p>502</p>
         */
        public Builder responseCode(String responseCode) {
            this.putQueryParameter("responseCode", responseCode);
            this.responseCode = responseCode;
            return this;
        }

        /**
         * <p>The route name filter.</p>
         * 
         * <strong>example:</strong>
         * <p>my-route</p>
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("routeName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * <p>The start of the query window, in UNIX seconds. The value must be no earlier than 24 hours before the current time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1756262400</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListGatewayErrorAccessLogsRequest build() {
            return new ListGatewayErrorAccessLogsRequest(this);
        } 

    } 

}
