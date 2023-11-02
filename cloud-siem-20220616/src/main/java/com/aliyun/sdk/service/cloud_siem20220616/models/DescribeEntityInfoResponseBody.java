// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEntityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEntityInfoResponseBody</p>
 */
public class DescribeEntityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeEntityInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEntityInfoResponseBody create() {
        return builder().build();
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
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

        public DescribeEntityInfoResponseBody build() {
            return new DescribeEntityInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EntityId")
        private Long entityId;

        @NameInMap("EntityInfo")
        private java.util.Map < String, ? > entityInfo;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("TipInfo")
        private java.util.Map < String, ? > tipInfo;

        private Data(Builder builder) {
            this.entityId = builder.entityId;
            this.entityInfo = builder.entityInfo;
            this.entityType = builder.entityType;
            this.tipInfo = builder.tipInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityInfo
         */
        public java.util.Map < String, ? > getEntityInfo() {
            return this.entityInfo;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return tipInfo
         */
        public java.util.Map < String, ? > getTipInfo() {
            return this.tipInfo;
        }

        public static final class Builder {
            private Long entityId; 
            private java.util.Map < String, ? > entityInfo; 
            private String entityType; 
            private java.util.Map < String, ? > tipInfo; 

            /**
             * EntityId.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * EntityInfo.
             */
            public Builder entityInfo(java.util.Map < String, ? > entityInfo) {
                this.entityInfo = entityInfo;
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
             * TipInfo.
             */
            public Builder tipInfo(java.util.Map < String, ? > tipInfo) {
                this.tipInfo = tipInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
