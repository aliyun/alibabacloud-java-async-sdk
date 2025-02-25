// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetErrorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetErrorsResponseBody</p>
 */
public class GetErrorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Args")
    private java.util.Map<String, ?> args;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetErrorsResponseBody(Builder builder) {
        this.args = builder.args;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return args
     */
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private java.util.Map<String, ?> args; 
        private Integer errorCode; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Args</p>
         */
        public Builder args(java.util.Map<String, ?> args) {
            this.args = args;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>B3AD0FE4-36EF-1641-90B1-77618166F2ff</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetErrorsResponseBody build() {
            return new GetErrorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetErrorsResponseBody} extends {@link TeaModel}
     *
     * <p>GetErrorsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientTime")
        private Long clientTime;

        @com.aliyun.core.annotation.NameInMap("Did")
        private String did;

        @com.aliyun.core.annotation.NameInMap("Utdid")
        private String utdid;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Items(Builder builder) {
            this.clientTime = builder.clientTime;
            this.did = builder.did;
            this.utdid = builder.utdid;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return clientTime
         */
        public Long getClientTime() {
            return this.clientTime;
        }

        /**
         * @return did
         */
        public String getDid() {
            return this.did;
        }

        /**
         * @return utdid
         */
        public String getUtdid() {
            return this.utdid;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long clientTime; 
            private String did; 
            private String utdid; 
            private String uuid; 

            /**
             * ClientTime.
             */
            public Builder clientTime(Long clientTime) {
                this.clientTime = clientTime;
                return this;
            }

            /**
             * Did.
             */
            public Builder did(String did) {
                this.did = did;
                return this;
            }

            /**
             * <p>Utdid</p>
             * 
             * <strong>example:</strong>
             * <p>RANDOM-1729634758587856312DEVICE</p>
             */
            public Builder utdid(String utdid) {
                this.utdid = utdid;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetErrorsResponseBody} extends {@link TeaModel}
     *
     * <p>GetErrorsResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private Integer pages;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Model(Builder builder) {
            this.items = builder.items;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pages = builder.pages;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
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
         * @return pages
         */
        public Integer getPages() {
            return this.pages;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer pages; 
            private Long total; 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Pages.
             */
            public Builder pages(Integer pages) {
                this.pages = pages;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
