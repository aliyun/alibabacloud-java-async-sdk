// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The start time of the time range within which the logs that you want to query were generated. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1703821542</p>
         */
        public Builder from(Long from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>Specifies whether to hide the process of each step. Valid values:</p>
         * <ul>
         * <li>true: hides the process and returns only the result log of each step.</li>
         * <li>false: does not hide the process and displays the start and result logs of each step.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hiddenProcess(Boolean hiddenProcess) {
            this.putQueryParameter("HiddenProcess", hiddenProcess);
            this.hiddenProcess = hiddenProcess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder logRequestId(String logRequestId) {
            this.putQueryParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        /**
         * <p>The end time of the time range within which the logs that you want to query were generated. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1703821666</p>
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
