// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceVersionsRequest</p>
 */
public class ListServiceVersionsRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Query
    @NameInMap("direction")
    private String direction;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("startKey")
    private String startKey;

    private ListServiceVersionsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.direction = builder.direction;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.startKey = builder.startKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startKey
     */
    public String getStartKey() {
        return this.startKey;
    }

    public static final class Builder extends Request.Builder<ListServiceVersionsRequest, Builder> {
        private String serviceName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String direction; 
        private Integer limit; 
        private String nextToken; 
        private String startKey; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceVersionsRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.direction = request.direction;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.startKey = request.startKey;
        } 

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time when the function is invoked. The value is in the **EEE,d MMM yyyy HH:mm:ss GMT** format.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The trace ID of the request for Function Compute API.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The order in which the returned versions are sorted. Valid values:
         * <p>
         * 
         * *   **FORWARD**: The results are sorted in ascending order.
         * *   **BACKWARD**: The results are sorted in descending order.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The maximum number of results to return. Default value: 20. Maximum value: 100. The number of returned configurations is less than or equal to the specified number.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The token required to obtain more results. If the number of layers exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The position from which the list begins. Results are sorted based on the version numbers.
         */
        public Builder startKey(String startKey) {
            this.putQueryParameter("startKey", startKey);
            this.startKey = startKey;
            return this;
        }

        @Override
        public ListServiceVersionsRequest build() {
            return new ListServiceVersionsRequest(this);
        } 

    } 

}
