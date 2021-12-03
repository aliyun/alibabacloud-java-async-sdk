// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private Boolean includePayload; 
        private String invocationIdPrefix; 
        private Integer limit; 
        private String nextToken; 
        private String qualifier; 
        private String sortOrderByTime; 
        private Long startedTimeBegin; 
        private Long startedTimeEnd; 
        private String status; 

        /**
         * <p>serviceName.</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>functionName.</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>includePayload.</p>
         */
        public Builder includePayload(Boolean includePayload) {
            this.putQueryParameter("includePayload", includePayload);
            this.includePayload = includePayload;
            return this;
        }

        /**
         * <p>invocationIdPrefix.</p>
         */
        public Builder invocationIdPrefix(String invocationIdPrefix) {
            this.putQueryParameter("invocationIdPrefix", invocationIdPrefix);
            this.invocationIdPrefix = invocationIdPrefix;
            return this;
        }

        /**
         * <p>limit.</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>nextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>qualifier.</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>sortOrderByTime.</p>
         */
        public Builder sortOrderByTime(String sortOrderByTime) {
            this.putQueryParameter("sortOrderByTime", sortOrderByTime);
            this.sortOrderByTime = sortOrderByTime;
            return this;
        }

        /**
         * <p>startedTimeBegin.</p>
         */
        public Builder startedTimeBegin(Long startedTimeBegin) {
            this.putQueryParameter("startedTimeBegin", startedTimeBegin);
            this.startedTimeBegin = startedTimeBegin;
            return this;
        }

        /**
         * <p>startedTimeEnd.</p>
         */
        public Builder startedTimeEnd(Long startedTimeEnd) {
            this.putQueryParameter("startedTimeEnd", startedTimeEnd);
            this.startedTimeEnd = startedTimeEnd;
            return this;
        }

        /**
         * <p>status.</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        public ListStatefulAsyncInvocationsRequest build() {
            return new ListStatefulAsyncInvocationsRequest(this);
        } 

    } 

}
