// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorDataListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridMonitorDataListRequest</p>
 */
public class DescribeHybridMonitorDataListRequest extends Request {
    @Query
    @NameInMap("End")
    @Validation(required = true)
    private Long end;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("PromSQL")
    @Validation(required = true)
    private String promSQL;

    @Query
    @NameInMap("Start")
    @Validation(required = true)
    private Long start;

    private DescribeHybridMonitorDataListRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.namespace = builder.namespace;
        this.period = builder.period;
        this.promSQL = builder.promSQL;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorDataListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return promSQL
     */
    public String getPromSQL() {
        return this.promSQL;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<DescribeHybridMonitorDataListRequest, Builder> {
        private Long end; 
        private String namespace; 
        private String period; 
        private String promSQL; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridMonitorDataListRequest request) {
            super(request);
            this.end = request.end;
            this.namespace = request.namespace;
            this.period = request.period;
            this.promSQL = request.promSQL;
            this.start = request.start;
        } 

        /**
         * The interval at which monitoring data is collected.
         * <p>
         * 
         * Unit: seconds.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The error message.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeHybridMonitorDataList**.
         */
        public Builder promSQL(String promSQL) {
            this.putQueryParameter("PromSQL", promSQL);
            this.promSQL = promSQL;
            return this;
        }

        /**
         * The metric values that are collected at different timestamps.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public DescribeHybridMonitorDataListRequest build() {
            return new DescribeHybridMonitorDataListRequest(this);
        } 

    } 

}
