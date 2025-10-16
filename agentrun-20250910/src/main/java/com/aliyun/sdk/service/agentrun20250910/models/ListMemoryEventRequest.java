// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ListMemoryEventRequest} extends {@link RequestModel}
 *
 * <p>ListMemoryEventRequest</p>
 */
public class ListMemoryEventRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    private Long from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    private Long to;

    private ListMemoryEventRequest(Builder builder) {
        super(builder);
        this.memoryName = builder.memoryName;
        this.sessionId = builder.sessionId;
        this.from = builder.from;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoryEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryName
     */
    public String getMemoryName() {
        return this.memoryName;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<ListMemoryEventRequest, Builder> {
        private String memoryName; 
        private String sessionId; 
        private Long from; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(ListMemoryEventRequest request) {
            super(request);
            this.memoryName = request.memoryName;
            this.sessionId = request.sessionId;
            this.from = request.from;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.to = request.to;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory</p>
         */
        public Builder memoryName(String memoryName) {
            this.putPathParameter("memoryName", memoryName);
            this.memoryName = memoryName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hh309d0li5c4ctpsxlcbismaipcwx4i0s0qxj6wfns6u583zehb7jyxiqt879sf40ucl0r1jytle3tn53lwdmdcxcwpmhnk51a2w8zipv51vu8pcj6t8g84smv5o6d2i080b62bkftam9xtjtdajokhacy6mbggxzu002i4a3jy67ijq7fhqgmyejexikfp80si</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public ListMemoryEventRequest build() {
            return new ListMemoryEventRequest(this);
        } 

    } 

}
