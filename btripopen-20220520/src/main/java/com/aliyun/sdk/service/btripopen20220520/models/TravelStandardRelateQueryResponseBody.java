// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TravelStandardRelateQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TravelStandardRelateQueryResponseBody</p>
 */
public class TravelStandardRelateQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultCode")
    private Integer resultCode;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TravelStandardRelateQueryResponseBody(Builder builder) {
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardRelateQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String message; 
        private Module module; 
        private String requestId; 
        private Integer resultCode; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(TravelStandardRelateQueryResponseBody model) {
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultCode.
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210bcc3a16583004579056128d33d7</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TravelStandardRelateQueryResponseBody build() {
            return new TravelStandardRelateQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TravelStandardRelateQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardRelateQueryResponseBody</p>
     */
    public static class ReserveBindEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_name")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        private String entityType;

        private ReserveBindEntityList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReserveBindEntityList create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private String entityName; 
            private String entityType; 

            private Builder() {
            } 

            private Builder(ReserveBindEntityList model) {
                this.entityId = model.entityId;
                this.entityName = model.entityName;
                this.entityType = model.entityType;
            } 

            /**
             * entity_id.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * entity_name.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * entity_type.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public ReserveBindEntityList build() {
                return new ReserveBindEntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TravelStandardRelateQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TravelStandardRelateQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reserve_bind_entity_list")
        private java.util.List<ReserveBindEntityList> reserveBindEntityList;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Module(Builder builder) {
            this.reserveBindEntityList = builder.reserveBindEntityList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return reserveBindEntityList
         */
        public java.util.List<ReserveBindEntityList> getReserveBindEntityList() {
            return this.reserveBindEntityList;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ReserveBindEntityList> reserveBindEntityList; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.reserveBindEntityList = model.reserveBindEntityList;
                this.total = model.total;
            } 

            /**
             * reserve_bind_entity_list.
             */
            public Builder reserveBindEntityList(java.util.List<ReserveBindEntityList> reserveBindEntityList) {
                this.reserveBindEntityList = reserveBindEntityList;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
