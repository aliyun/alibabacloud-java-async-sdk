// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListCloneVoicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloneVoicesResponseBody</p>
 */
public class ListCloneVoicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCloneVoicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloneVoicesResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCloneVoicesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>返回码</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>返回数据</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>Instance does not exist. Instance=anchashi.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>错误信息中的变量值列表</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否调用成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloneVoicesResponseBody build() {
            return new ListCloneVoicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloneVoicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloneVoicesResponseBody</p>
     */
    public static class CloneVoices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloneVoiceId")
        private String cloneVoiceId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        private CloneVoices(Builder builder) {
            this.cloneVoiceId = builder.cloneVoiceId;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.model = builder.model;
            this.name = builder.name;
            this.nlsEngine = builder.nlsEngine;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.updatedTime = builder.updatedTime;
            this.voice = builder.voice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloneVoices create() {
            return builder().build();
        }

        /**
         * @return cloneVoiceId
         */
        public String getCloneVoiceId() {
            return this.cloneVoiceId;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nlsEngine
         */
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        public static final class Builder {
            private String cloneVoiceId; 
            private Long createdTime; 
            private String instanceId; 
            private String model; 
            private String name; 
            private String nlsEngine; 
            private String status; 
            private String tenantId; 
            private Long updatedTime; 
            private String voice; 

            private Builder() {
            } 

            private Builder(CloneVoices model) {
                this.cloneVoiceId = model.cloneVoiceId;
                this.createdTime = model.createdTime;
                this.instanceId = model.instanceId;
                this.model = model.model;
                this.name = model.name;
                this.nlsEngine = model.nlsEngine;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.updatedTime = model.updatedTime;
                this.voice = model.voice;
            } 

            /**
             * <p>克隆音色ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
             */
            public Builder cloneVoiceId(String cloneVoiceId) {
                this.cloneVoiceId = cloneVoiceId;
                return this;
            }

            /**
             * <p>创建时间，毫秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>模型名称</p>
             * 
             * <strong>example:</strong>
             * <p>CosyVoice</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>目前支持IFLYTEK、VOLC</p>
             * 
             * <strong>example:</strong>
             * <p>BAILIAN</p>
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * <p>状态</p>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>租户ID</p>
             * 
             * <strong>example:</strong>
             * <p>1308144684576765</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>更新时间，毫秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>音色</p>
             * 
             * <strong>example:</strong>
             * <p>cosyvoice-v3-flash-voicebot2-8aa485413eba42089c873eec1f901d64</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            public CloneVoices build() {
                return new CloneVoices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloneVoicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloneVoicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloneVoices")
        private java.util.List<CloneVoices> cloneVoices;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.cloneVoices = builder.cloneVoices;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cloneVoices
         */
        public java.util.List<CloneVoices> getCloneVoices() {
            return this.cloneVoices;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CloneVoices> cloneVoices; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cloneVoices = model.cloneVoices;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>数据列表</p>
             */
            public Builder cloneVoices(java.util.List<CloneVoices> cloneVoices) {
                this.cloneVoices = cloneVoices;
                return this;
            }

            /**
             * <p>页码，从1开始</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>每页记录数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>符合条件的记录总数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
