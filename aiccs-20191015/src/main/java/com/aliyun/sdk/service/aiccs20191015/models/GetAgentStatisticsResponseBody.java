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
 * {@link GetAgentStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentStatisticsResponseBody</p>
 */
public class GetAgentStatisticsResponseBody extends TeaModel {
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

    private GetAgentStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentStatisticsResponseBody create() {
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

        private Builder(GetAgentStatisticsResponseBody model) {
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
         * <p>Data list.</p>
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
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API was invoked successfully. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.  </li>
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

        public GetAgentStatisticsResponseBody build() {
            return new GetAgentStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private String rows;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

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
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
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
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer pageNum; 
            private Integer pageSize; 
            private String rows; 
            private Integer totalNum; 

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
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Information is a JSON string of type List<Map>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;n_resttype_1&quot;:15,&quot;t_outcall_speak&quot;:829747,&quot;average_incoming_time&quot;:&quot;8451.29&quot;,&quot;n_resttype_3&quot;:0,&quot;minute_id&quot;:&quot;-1&quot;,&quot;n_conference_speak&quot;:0,&quot;n_resttype_2&quot;:0,&quot;n_resttype_5&quot;:0,&quot;n_resttype_4&quot;:0,&quot;n_resttype_7&quot;:0,&quot;n_resttype_6&quot;:0,&quot;n_resttype_9&quot;:0,&quot;n_resttype_8&quot;:0,&quot;n_outcall_dial&quot;:25,&quot;total_break_time&quot;:&quot;58555&quot;,&quot;n_internal_speak&quot;:0,&quot;n_send_step_transfer&quot;:7,&quot;n_consulted_internal_speak&quot;:0}</p>
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
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
