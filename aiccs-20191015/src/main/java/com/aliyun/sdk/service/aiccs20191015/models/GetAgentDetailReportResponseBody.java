// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetAgentDetailReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentDetailReportResponseBody</p>
 */
public class GetAgentDetailReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetAgentDetailReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentDetailReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetAgentDetailReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>List of data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetAgentDetailReportResponseBody build() {
            return new GetAgentDetailReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentDetailReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentDetailReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private String rows;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Long totalNum;

        private Data(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.rows = builder.rows;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return rows
         */
        public String getRows() {
            return this.rows;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Long pageNum; 
            private Long pageSize; 
            private String rows; 
            private Long totalNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.rows = model.rows;
                this.totalNum = model.totalNum;
            } 

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>A JSON string of type List<Map>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;t_wait&quot;:379322.0,&quot;hotline_time_outcall_avg&quot;:&quot;32.00&quot;,&quot;n_ringing&quot;:0,&quot;t_outbound_40&quot;:0.0,&quot;hotline_time_incall_avg&quot;:-1,&quot;t_calldialing&quot;:0.0,&quot;n_inbound&quot;:276,&quot;servicer_id&quot;:&quot;-1&quot;,&quot;call_in_sep_sat_cnt&quot;:13,&quot;request_cnt&quot;:231,&quot;n_not_ready_99&quot;:811,&quot;t_work_outbound&quot;:49338.0,&quot;hotline_rate_handle_in_60s&quot;:&quot;96%&quot;,&quot;n_not_ready_login&quot;:811,&quot;t_not_ready_login&quot;:0.0,&quot;n_work_inbound&quot;:176,&quot;}</p>
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
