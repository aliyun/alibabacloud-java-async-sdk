// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommonLogDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCommonLogDetailRequest</p>
 */
public class GetCommonLogDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenProcess")
    private Boolean hiddenProcess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long to;

    private GetCommonLogDetailRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.hiddenProcess = builder.hiddenProcess;
        this.logRequestId = builder.logRequestId;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommonLogDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return hiddenProcess
     */
    public Boolean getHiddenProcess() {
        return this.hiddenProcess;
    }

    /**
     * @return logRequestId
     */
    public String getLogRequestId() {
        return this.logRequestId;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetCommonLogDetailRequest, Builder> {
        private Long from; 
        private Boolean hiddenProcess; 
        private String logRequestId; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(GetCommonLogDetailRequest request) {
            super(request);
            this.from = request.from;
            this.hiddenProcess = request.hiddenProcess;
            this.logRequestId = request.logRequestId;
            this.to = request.to;
        } 

        /**
         * From.
         */
        public Builder from(Long from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * HiddenProcess.
         */
        public Builder hiddenProcess(Boolean hiddenProcess) {
            this.putQueryParameter("HiddenProcess", hiddenProcess);
            this.hiddenProcess = hiddenProcess;
            return this;
        }

        /**
         * LogRequestId.
         */
        public Builder logRequestId(String logRequestId) {
            this.putQueryParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        /**
         * To.
         */
        public Builder to(Long to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public GetCommonLogDetailRequest build() {
            return new GetCommonLogDetailRequest(this);
        } 

    } 

}
