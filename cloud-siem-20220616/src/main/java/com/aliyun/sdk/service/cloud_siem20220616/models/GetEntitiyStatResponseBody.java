// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link GetEntitiyStatResponseBody} extends {@link TeaModel}
 *
 * <p>GetEntitiyStatResponseBody</p>
 */
public class GetEntitiyStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetEntitiyStatResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntitiyStatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetEntitiyStatResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEntitiyStatResponseBody build() {
            return new GetEntitiyStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEntitiyStatResponseBody} extends {@link TeaModel}
     *
     * <p>GetEntitiyStatResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertNum")
        private Long alertNum;

        @com.aliyun.core.annotation.NameInMap("EntityNum")
        private Integer entityNum;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("EntityUuid")
        private String entityUuid;

        @com.aliyun.core.annotation.NameInMap("IncidentNum")
        private Long incidentNum;

        private Data(Builder builder) {
            this.alertNum = builder.alertNum;
            this.entityNum = builder.entityNum;
            this.entityType = builder.entityType;
            this.entityUuid = builder.entityUuid;
            this.incidentNum = builder.incidentNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertNum
         */
        public Long getAlertNum() {
            return this.alertNum;
        }

        /**
         * @return entityNum
         */
        public Integer getEntityNum() {
            return this.entityNum;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return entityUuid
         */
        public String getEntityUuid() {
            return this.entityUuid;
        }

        /**
         * @return incidentNum
         */
        public Long getIncidentNum() {
            return this.incidentNum;
        }

        public static final class Builder {
            private Long alertNum; 
            private Integer entityNum; 
            private String entityType; 
            private String entityUuid; 
            private Long incidentNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertNum = model.alertNum;
                this.entityNum = model.entityNum;
                this.entityType = model.entityType;
                this.entityUuid = model.entityUuid;
                this.incidentNum = model.incidentNum;
            } 

            /**
             * AlertNum.
             */
            public Builder alertNum(Long alertNum) {
                this.alertNum = alertNum;
                return this;
            }

            /**
             * EntityNum.
             */
            public Builder entityNum(Integer entityNum) {
                this.entityNum = entityNum;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * EntityUuid.
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            /**
             * IncidentNum.
             */
            public Builder incidentNum(Long incidentNum) {
                this.incidentNum = incidentNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
