// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpEntitiesResponseBody</p>
 */
public class DescribeOpEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpEntities")
    private java.util.List < OpEntities> opEntities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOpEntitiesResponseBody(Builder builder) {
        this.opEntities = builder.opEntities;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpEntitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return opEntities
     */
    public java.util.List < OpEntities> getOpEntities() {
        return this.opEntities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OpEntities> opEntities; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The ID of the request.
         */
        public Builder opEntities(java.util.List < OpEntities> opEntities) {
            this.opEntities = opEntities;
            return this;
        }

        /**
         * The end time. Operation logs that were generated before this time are queried.**** This value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the log was generated. This value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOpEntitiesResponseBody build() {
            return new DescribeOpEntitiesResponseBody(this);
        } 

    } 

    public static class OpEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityObject")
        private String entityObject;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private Integer entityType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("OpAccount")
        private String opAccount;

        @com.aliyun.core.annotation.NameInMap("OpAction")
        private Integer opAction;

        @com.aliyun.core.annotation.NameInMap("OpDesc")
        private String opDesc;

        private OpEntities(Builder builder) {
            this.entityObject = builder.entityObject;
            this.entityType = builder.entityType;
            this.gmtCreate = builder.gmtCreate;
            this.opAccount = builder.opAccount;
            this.opAction = builder.opAction;
            this.opDesc = builder.opDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpEntities create() {
            return builder().build();
        }

        /**
         * @return entityObject
         */
        public String getEntityObject() {
            return this.entityObject;
        }

        /**
         * @return entityType
         */
        public Integer getEntityType() {
            return this.entityType;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return opAccount
         */
        public String getOpAccount() {
            return this.opAccount;
        }

        /**
         * @return opAction
         */
        public Integer getOpAction() {
            return this.opAction;
        }

        /**
         * @return opDesc
         */
        public String getOpDesc() {
            return this.opDesc;
        }

        public static final class Builder {
            private String entityObject; 
            private Integer entityType; 
            private Long gmtCreate; 
            private String opAccount; 
            private Integer opAction; 
            private String opDesc; 

            /**
             * Queries the operation logs of an Anti-DDoS Origin instance.
             */
            public Builder entityObject(String entityObject) {
                this.entityObject = entityObject;
                return this;
            }

            /**
             * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
             * <p>
             * 
             * For more information about sample requests, see the **"Examples"** section of this topic.
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * WB01342967
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * OpAccount.
             */
            public Builder opAccount(String opAccount) {
                this.opAccount = opAccount;
                return this;
            }

            /**
             * DescribeOpEntities
             */
            public Builder opAction(Integer opAction) {
                this.opAction = opAction;
                return this;
            }

            /**
             * OpDesc.
             */
            public Builder opDesc(String opDesc) {
                this.opDesc = opDesc;
                return this;
            }

            public OpEntities build() {
                return new OpEntities(this);
            } 

        } 

    }
}
