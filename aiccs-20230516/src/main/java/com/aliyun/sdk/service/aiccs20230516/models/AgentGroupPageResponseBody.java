// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link AgentGroupPageResponseBody} extends {@link TeaModel}
 *
 * <p>AgentGroupPageResponseBody</p>
 */
public class AgentGroupPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private AgentGroupPageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentGroupPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(AgentGroupPageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
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

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public AgentGroupPageResponseBody build() {
            return new AgentGroupPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AgentGroupPageResponseBody} extends {@link TeaModel}
     *
     * <p>AgentGroupPageResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentGroupId")
        private Long agentGroupId;

        @com.aliyun.core.annotation.NameInMap("AgentGroupName")
        private String agentGroupName;

        @com.aliyun.core.annotation.NameInMap("AgentIds")
        private java.util.List<Long> agentIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        private Records(Builder builder) {
            this.agentGroupId = builder.agentGroupId;
            this.agentGroupName = builder.agentGroupName;
            this.agentIds = builder.agentIds;
            this.createTime = builder.createTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return agentGroupId
         */
        public Long getAgentGroupId() {
            return this.agentGroupId;
        }

        /**
         * @return agentGroupName
         */
        public String getAgentGroupName() {
            return this.agentGroupName;
        }

        /**
         * @return agentIds
         */
        public java.util.List<Long> getAgentIds() {
            return this.agentIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        public static final class Builder {
            private Long agentGroupId; 
            private String agentGroupName; 
            private java.util.List<Long> agentIds; 
            private String createTime; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.agentGroupId = model.agentGroupId;
                this.agentGroupName = model.agentGroupName;
                this.agentIds = model.agentIds;
                this.createTime = model.createTime;
            } 

            /**
             * <p>坐席组ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentGroupId(Long agentGroupId) {
                this.agentGroupId = agentGroupId;
                return this;
            }

            /**
             * <p>坐席组名称</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder agentGroupName(String agentGroupName) {
                this.agentGroupName = agentGroupName;
                return this;
            }

            /**
             * <p>坐席组下的坐席id列表</p>
             */
            public Builder agentIds(java.util.List<Long> agentIds) {
                this.agentIds = agentIds;
                return this;
            }

            /**
             * <p>创建坐席组的时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 11:11:11</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentGroupPageResponseBody} extends {@link TeaModel}
     *
     * <p>AgentGroupPageResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Long current;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private Long pages;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Model(Builder builder) {
            this.current = builder.current;
            this.pages = builder.pages;
            this.records = builder.records;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Long getCurrent() {
            return this.current;
        }

        /**
         * @return pages
         */
        public Long getPages() {
            return this.pages;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long current; 
            private Long pages; 
            private java.util.List<Records> records; 
            private Long size; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.current = model.current;
                this.pages = model.pages;
                this.records = model.records;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Long current) {
                this.current = current;
                return this;
            }

            /**
             * Pages.
             */
            public Builder pages(Long pages) {
                this.pages = pages;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
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
