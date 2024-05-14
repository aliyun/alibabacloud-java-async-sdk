// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlConcurrencyControlRulesHistoryRequest} extends {@link RequestModel}
 *
 * <p>GetSqlConcurrencyControlRulesHistoryRequest</p>
 */
public class GetSqlConcurrencyControlRulesHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    private GetSqlConcurrencyControlRulesHistoryRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlConcurrencyControlRulesHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetSqlConcurrencyControlRulesHistoryRequest, Builder> {
        private String consoleContext; 
        private String instanceId; 
        private Long pageNo; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlConcurrencyControlRulesHistoryRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceId = request.instanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * >  Only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters are supported.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number. The value must be an integer that is greater than 0. Default value: 1.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. The value must be an integer that is greater than 0. Default value: 10.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetSqlConcurrencyControlRulesHistoryRequest build() {
            return new GetSqlConcurrencyControlRulesHistoryRequest(this);
        } 

    } 

}
