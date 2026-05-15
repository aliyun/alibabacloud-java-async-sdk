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
 * {@link ListIMBotsRequest} extends {@link RequestModel}
 *
 * <p>ListIMBotsRequest</p>
 */
public class ListIMBotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    private String agentRuntimeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("botBizType")
    private String botBizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("botName")
    private String botName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListIMBotsRequest(Builder builder) {
        super(builder);
        this.agentRuntimeId = builder.agentRuntimeId;
        this.botBizType = builder.botBizType;
        this.botName = builder.botName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIMBotsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return botBizType
     */
    public String getBotBizType() {
        return this.botBizType;
    }

    /**
     * @return botName
     */
    public String getBotName() {
        return this.botName;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListIMBotsRequest, Builder> {
        private String agentRuntimeId; 
        private String botBizType; 
        private String botName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListIMBotsRequest request) {
            super(request);
            this.agentRuntimeId = request.agentRuntimeId;
            this.botBizType = request.botBizType;
            this.botName = request.botName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * agentRuntimeId.
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.putQueryParameter("agentRuntimeId", agentRuntimeId);
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * botBizType.
         */
        public Builder botBizType(String botBizType) {
            this.putQueryParameter("botBizType", botBizType);
            this.botBizType = botBizType;
            return this;
        }

        /**
         * botName.
         */
        public Builder botName(String botName) {
            this.putQueryParameter("botName", botName);
            this.botName = botName;
            return this;
        }

        /**
         * <p>默认 1；传入时须 ≥ 1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>默认 20；传入时须 1–100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListIMBotsRequest build() {
            return new ListIMBotsRequest(this);
        } 

    } 

}
