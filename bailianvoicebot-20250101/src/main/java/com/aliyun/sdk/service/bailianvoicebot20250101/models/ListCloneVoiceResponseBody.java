// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link ListCloneVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloneVoiceResponseBody</p>
 */
public class ListCloneVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCloneVoiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloneVoiceResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCloneVoiceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCloneVoiceResponseBody build() {
            return new ListCloneVoiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloneVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloneVoiceResponseBody</p>
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
             * CloneVoiceId.
             */
            public Builder cloneVoiceId(String cloneVoiceId) {
                this.cloneVoiceId = cloneVoiceId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NlsEngine.
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * Voice.
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
     * {@link ListCloneVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloneVoiceResponseBody</p>
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
             * CloneVoices.
             */
            public Builder cloneVoices(java.util.List<CloneVoices> cloneVoices) {
                this.cloneVoices = cloneVoices;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * TotalCount.
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
