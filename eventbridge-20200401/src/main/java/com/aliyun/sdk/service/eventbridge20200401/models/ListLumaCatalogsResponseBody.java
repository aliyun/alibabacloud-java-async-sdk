// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListLumaCatalogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLumaCatalogsResponseBody</p>
 */
public class ListLumaCatalogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListLumaCatalogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLumaCatalogsResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListLumaCatalogsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. A value of Success indicates a successful call. A specific error code is returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of data catalogs bound to the Agent. All results are returned at once without pagination.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned by the operation. The value is Operation success when the call succeeds, or a specific error description when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, used for troubleshooting and ticket submission.</p>
         * 
         * <strong>example:</strong>
         * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLumaCatalogsResponseBody build() {
            return new ListLumaCatalogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLumaCatalogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLumaCatalogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalogs")
        private java.util.List<Catalog> catalogs;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.catalogs = builder.catalogs;
            this.limit = builder.limit;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return catalogs
         */
        public java.util.List<Catalog> getCatalogs() {
            return this.catalogs;
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Catalog> catalogs; 
            private Integer limit; 
            private String nextToken; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.catalogs = model.catalogs;
                this.limit = model.limit;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of data catalogs bound to the Agent.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Name&quot;:&quot;my_catalog&quot;}]</p>
             */
            public Builder catalogs(java.util.List<Catalog> catalogs) {
                this.catalogs = catalogs;
                return this;
            }

            /**
             * <p>本次请求实际生效的每页数量。未传 Limit 时为服务端默认值，超出上限时为收敛后的值</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>下一页起始Token，传入下次请求的 NextToken 可获取下一页；为空表示已无更多数据</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>Agent 绑定的数据目录总数，与本页返回条数无关</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
