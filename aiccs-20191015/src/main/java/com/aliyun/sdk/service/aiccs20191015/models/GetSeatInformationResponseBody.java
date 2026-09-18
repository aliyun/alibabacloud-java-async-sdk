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
 * {@link GetSeatInformationResponseBody} extends {@link TeaModel}
 *
 * <p>GetSeatInformationResponseBody</p>
 */
public class GetSeatInformationResponseBody extends TeaModel {
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

    private GetSeatInformationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSeatInformationResponseBody create() {
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

        private Builder(GetSeatInformationResponseBody model) {
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
         * <p>Indicates whether the API invocation succeeded. Valid values:</p>
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

        public GetSeatInformationResponseBody build() {
            return new GetSeatInformationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSeatInformationResponseBody} extends {@link TeaModel}
     *
     * <p>GetSeatInformationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Rowr")
        private String rowr;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        private Data(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.rowr = builder.rowr;
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
         * @return rowr
         */
        public String getRowr() {
            return this.rowr;
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
            private String rowr; 
            private Integer totalNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.rowr = model.rowr;
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
             * <p>The information is a JSON string of the List<Map> type.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;tenant_id&quot;: &quot;905&quot;, &quot;tenant_name&quot;: &quot;非单元测试化BU&quot;, &quot;department_id&quot;: &quot;-1&quot;, &quot;svc_avai_capacity&quot;: 7,      &quot;svc_current_capacity&quot;: 0, &quot;department_name&quot;: &quot;-1&quot;,  &quot;svc_online_cnt&quot;: 3, &quot;svc_ask_offline_servicer_num&quot;: 0,      &quot;date_id&quot;: &quot;20210401&quot;,  &quot;svc_max_capacity&quot;: 7, &quot;svc_rest_cnt&quot;: 0, &quot;current_speci_ability_num&quot;: 0, &quot;servicer_rest_cnt&quot;: 122, &quot;max_speci_ability_num&quot;: 3,      &quot;svc_offline_cnt&quot;: 0,  &quot;svc_no_client_cnt&quot;: 3, &quot;svc_ask_rest_servicer_num&quot;: 0}</p>
             */
            public Builder rowr(String rowr) {
                this.rowr = rowr;
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
