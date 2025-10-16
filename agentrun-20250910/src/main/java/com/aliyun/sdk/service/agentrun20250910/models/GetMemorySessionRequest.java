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
 * {@link GetMemorySessionRequest} extends {@link RequestModel}
 *
 * <p>GetMemorySessionRequest</p>
 */
public class GetMemorySessionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    private Long to;

    private GetMemorySessionRequest(Builder builder) {
        super(builder);
        this.memoryName = builder.memoryName;
        this.sessionId = builder.sessionId;
        this.from = builder.from;
        this.size = builder.size;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemorySessionRequest create() {
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetMemorySessionRequest, Builder> {
        private String memoryName; 
        private String sessionId; 
        private Long from; 
        private Integer size; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(GetMemorySessionRequest request) {
            super(request);
            this.memoryName = request.memoryName;
            this.sessionId = request.sessionId;
            this.from = request.from;
            this.size = request.size;
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
         * <p>9fdb0de3-a0f0-4ff1-8d46-18ec5db78c5d</p>
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
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
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
        public GetMemorySessionRequest build() {
            return new GetMemorySessionRequest(this);
        } 

    } 

}
