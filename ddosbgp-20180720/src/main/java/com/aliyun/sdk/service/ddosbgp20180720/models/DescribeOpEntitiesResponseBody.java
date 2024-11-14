// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the operation log.</p>
         */
        public Builder opEntities(java.util.List < OpEntities> opEntities) {
            this.opEntities = opEntities;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>52C8ECB0-0B1A-4E66-A31C-B6A855120E82</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of operation logs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOpEntitiesResponseBody build() {
            return new DescribeOpEntitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpEntitiesResponseBody</p>
     */
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
             * <p>The operation object, which is the ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-n6w1r7nz****</p>
             */
            public Builder entityObject(String entityObject) {
                this.entityObject = entityObject;
                return this;
            }

            /**
             * <p>The type of the operation object. The value is fixed as <strong>1</strong>, which indicates Anti-DDoS Origin instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The time when the log was generated. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1635818114000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that performs the operation.</p>
             * <blockquote>
             * <p>If the value is <strong>system</strong>, the operation is performed by Anti-DDoS Origin.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>171986973287****</p>
             */
            public Builder opAccount(String opAccount) {
                this.opAccount = opAccount;
                return this;
            }

            /**
             * <p>The type of operation. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: indicates an operation to add an IP address to the Anti-DDoS Origin instance for protection.</li>
             * <li><strong>4</strong>: indicates an operation to remove a protected IP address from the Anti-DDoS Origin instance.</li>
             * <li><strong>5</strong>: indicates an operation to downgrade the Anti-DDoS Origin instance.</li>
             * <li><strong>6</strong>: indicates an operation to deactivate blackhole filtering for an IP address.</li>
             * <li><strong>7</strong>: indicates an operation to reset the number of times that you can deactivate blackhole filtering.</li>
             * <li><strong>8</strong>: indicates an operation to enable burstable protection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder opAction(Integer opAction) {
                this.opAction = opAction;
                return this;
            }

            /**
             * <p>The details of the operation. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><p><strong>entity</strong>: the operation object. Data type: object. The fields that are included in the value of the <strong>entity</strong> parameter vary based on the value of the <strong>OpAction</strong> parameter. Valid values:</p>
             * <ul>
             * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>3</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
             * <ul>
             * <li><strong>ips</strong>: the public IP addresses that are protected by the Anti-DDoS Origin instance. Data type: array</li>
             * </ul>
             * </li>
             * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>4</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
             * <ul>
             * <li><strong>ips</strong>: the public IP addresses that are no longer protected by the Anti-DDoS Origin instance. Data type: array.</li>
             * </ul>
             * </li>
             * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>5</strong>, the value of the <strong>entity</strong> parameter consists of the following fields:</p>
             * <ul>
             * <li><strong>baseBandwidth</strong>: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
             * <li><strong>elasticBandwidth</strong>: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
             * <li><strong>opSource</strong>: the source of the operation. The value is fixed as <strong>1</strong>, indicating that the operation is performed by Anti-DDoS Origin. Data type: integer.</li>
             * </ul>
             * </li>
             * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>6</strong>, the value of the <strong>entity</strong> parameter consists of the following field:</p>
             * <ul>
             * <li><strong>ips</strong>: the public IP addresses for which to deactivate blackhole filtering. Data type: array.</li>
             * </ul>
             * </li>
             * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>7</strong>, the <strong>entity</strong> parameter is not returned.</p>
             * </li>
             * <li><p>If the value of the <strong>OpAction</strong> parameter is <strong>8</strong>, the value of the <strong>entity</strong> parameter consists of the following fields:</p>
             * <ul>
             * <li><strong>baseBandwidth</strong>: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
             * <li><strong>elasticBandwidth</strong>: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;entity&quot;:{&quot;baseBandwidth&quot;:20,&quot;elasticBandwidth&quot;:20}}</p>
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
