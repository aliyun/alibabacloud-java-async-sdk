// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStatefulAsyncInvocationsRequest} extends {@link RequestModel}
 *
 * <p>ListStatefulAsyncInvocationsRequest</p>
 */
public class ListStatefulAsyncInvocationsRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Host
    @NameInMap("AccountID")
    private String accountID;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Code-Checksum")
    private String xFcCodeChecksum;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Invocation-Type")
    private String xFcInvocationType;

    @Header
    @NameInMap("X-Fc-Log-Type")
    private String xFcLogType;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Query
    @NameInMap("includePayload")
    private Boolean includePayload;

    @Query
    @NameInMap("invocationIdPrefix")
    private String invocationIdPrefix;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    @Query
    @NameInMap("sortOrderByTime")
    private String sortOrderByTime;

    @Query
    @NameInMap("startedTimeBegin")
    private Long startedTimeBegin;

    @Query
    @NameInMap("startedTimeEnd")
    private Long startedTimeEnd;

    @Query
    @NameInMap("status")
    private String status;

    private ListStatefulAsyncInvocationsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.accountID = builder.accountID;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
        this.xFcTraceId = builder.xFcTraceId;
        this.includePayload = builder.includePayload;
        this.invocationIdPrefix = builder.invocationIdPrefix;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.qualifier = builder.qualifier;
        this.sortOrderByTime = builder.sortOrderByTime;
        this.startedTimeBegin = builder.startedTimeBegin;
        this.startedTimeEnd = builder.startedTimeEnd;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatefulAsyncInvocationsRequest create() {
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
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return accountID
     */
    public String getAccountID() {
        return this.accountID;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcCodeChecksum
     */
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcInvocationType
     */
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    /**
     * @return xFcLogType
     */
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return includePayload
     */
    public Boolean getIncludePayload() {
        return this.includePayload;
    }

    /**
     * @return invocationIdPrefix
     */
    public String getInvocationIdPrefix() {
        return this.invocationIdPrefix;
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sortOrderByTime
     */
    public String getSortOrderByTime() {
        return this.sortOrderByTime;
    }

    /**
     * @return startedTimeBegin
     */
    public Long getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    /**
     * @return startedTimeEnd
     */
    public Long getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListStatefulAsyncInvocationsRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String accountID; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcInvocationType; 
        private String xFcLogType; 
        private String xFcTraceId; 
        private Boolean includePayload; 
        private String invocationIdPrefix; 
        private Integer limit; 
        private String nextToken; 
        private String qualifier; 
        private String sortOrderByTime; 
        private Long startedTimeBegin; 
        private Long startedTimeEnd; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListStatefulAsyncInvocationsRequest response) {
            super(response);
            this.serviceName = response.serviceName;
            this.functionName = response.functionName;
            this.accountID = response.accountID;
            this.xFcAccountId = response.xFcAccountId;
            this.xFcCodeChecksum = response.xFcCodeChecksum;
            this.xFcDate = response.xFcDate;
            this.xFcInvocationType = response.xFcInvocationType;
            this.xFcLogType = response.xFcLogType;
            this.xFcTraceId = response.xFcTraceId;
            this.includePayload = response.includePayload;
            this.invocationIdPrefix = response.invocationIdPrefix;
            this.limit = response.limit;
            this.nextToken = response.nextToken;
            this.qualifier = response.qualifier;
            this.sortOrderByTime = response.sortOrderByTime;
            this.startedTimeBegin = response.startedTimeBegin;
            this.startedTimeEnd = response.startedTimeEnd;
            this.status = response.status;
        } 

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * AccountID.
         */
        public Builder accountID(String accountID) {
            this.putHostParameter("AccountID", accountID);
            this.accountID = accountID;
            return this;
        }

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Code-Checksum.
         */
        public Builder xFcCodeChecksum(String xFcCodeChecksum) {
            this.putHeaderParameter("X-Fc-Code-Checksum", xFcCodeChecksum);
            this.xFcCodeChecksum = xFcCodeChecksum;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Invocation-Type.
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * X-Fc-Log-Type.
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * includePayload.
         */
        public Builder includePayload(Boolean includePayload) {
            this.putQueryParameter("includePayload", includePayload);
            this.includePayload = includePayload;
            return this;
        }

        /**
         * invocationIdPrefix.
         */
        public Builder invocationIdPrefix(String invocationIdPrefix) {
            this.putQueryParameter("invocationIdPrefix", invocationIdPrefix);
            this.invocationIdPrefix = invocationIdPrefix;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * sortOrderByTime.
         */
        public Builder sortOrderByTime(String sortOrderByTime) {
            this.putQueryParameter("sortOrderByTime", sortOrderByTime);
            this.sortOrderByTime = sortOrderByTime;
            return this;
        }

        /**
         * startedTimeBegin.
         */
        public Builder startedTimeBegin(Long startedTimeBegin) {
            this.putQueryParameter("startedTimeBegin", startedTimeBegin);
            this.startedTimeBegin = startedTimeBegin;
            return this;
        }

        /**
         * startedTimeEnd.
         */
        public Builder startedTimeEnd(Long startedTimeEnd) {
            this.putQueryParameter("startedTimeEnd", startedTimeEnd);
            this.startedTimeEnd = startedTimeEnd;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListStatefulAsyncInvocationsRequest build() {
            return new ListStatefulAsyncInvocationsRequest(this);
        } 

    } 

}
