// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
    private Long totalCount;

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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OpEntities> opEntities; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>An array that consists of the details of the operation log.</p>
         */
        public Builder opEntities(java.util.List < OpEntities> opEntities) {
            this.opEntities = opEntities;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FB24D70C-71F5-4000-8CD8-22CDA0C53CD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned operation records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
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
             * <p>The operation object.</p>
             * 
             * <strong>example:</strong>
             * <p>203.<em><strong>.</strong></em>.132</p>
             */
            public Builder entityObject(String entityObject) {
                this.entityObject = entityObject;
                return this;
            }

            /**
             * <p>The type of the operation object. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance</li>
             * <li><strong>2</strong>: Anti-DDoS plans</li>
             * <li><strong>3</strong>: ECS instances</li>
             * <li><strong>4</strong>: all logs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder entityType(Integer entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The time when the operation was performed. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1584451769000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to call the API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>128965410602****</p>
             */
            public Builder opAccount(String opAccount) {
                this.opAccount = opAccount;
                return this;
            }

            /**
             * <p>The type of the operation. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: configuring burstable protection bandwidth.</li>
             * <li><strong>5</strong>: using Anti-DDoS plans.</li>
             * <li><strong>8</strong>: changing IP addresses of ECS instances.</li>
             * <li><strong>9</strong>: deactivating blackhole filtering.</li>
             * <li><strong>10</strong>: configuring the Diversion from Origin Server policy.</li>
             * <li><strong>11</strong>: clearing all logs.</li>
             * <li><strong>12</strong>: downgrading the specifications of instances. If the instance expires or the account has overdue payments, this operation is performed to downgrade the burstable protection bandwidth.</li>
             * <li><strong>13</strong>: restoring the specifications of instances. If the instance is renewed or you have paid the overdue payments within your account, this operation is performed to restore the burstable protection bandwidth.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder opAction(Integer opAction) {
                this.opAction = opAction;
                return this;
            }

            /**
             * <p>The details of the operation. This parameter is a JSON string. The string contains the following fields:</p>
             * <ul>
             * <li><strong>newEntity</strong>: the values of the parameters after the operation. This field must be of the STRING type.</li>
             * <li><strong>oldEntity</strong>: the values of the parameters before the operation. This field must be of the STRING type.</li>
             * </ul>
             * <p>Both <strong>newEntity</strong> and <strong>oldEntity</strong> are JSON strings. The returned parameters vary with <strong>OpAtion</strong>.</p>
             * <p>If <strong>OpAction</strong> is <strong>1</strong>, <strong>12</strong>, or <strong>13</strong>, the following parameter is returned:</p>
             * <ul>
             * <li><p><strong>elasticBandwidth</strong>: the burstable protection bandwidth. The value is of the INTEGER type.</p>
             * <p>For example: <code>{&quot;newEntity&quot;:{&quot;elasticBandwidth&quot;:300},&quot;oldEntity&quot;:{&quot;elasticBandwidth&quot;:300}}</code></p>
             * </li>
             * </ul>
             * <p>If <strong>OpAction</strong> is <strong>5</strong>, the following parameters are returned:</p>
             * <ul>
             * <li><p><strong>bandwidth</strong>: the burstable protection bandwidth. The value is of the INTEGER type. Unit: Gbit/s.</p>
             * </li>
             * <li><p><strong>count</strong>: the number of Anti-DDoS plans. The value is of the INTEGER type.</p>
             * </li>
             * <li><p><strong>deductCount</strong>: the number of used Anti-DDoS plans. The value is of the INTEGER type.</p>
             * </li>
             * <li><p><strong>expireTime</strong>: the expiration time of the Anti-DDoS plans. The value is of the LONG type. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * </li>
             * <li><p><strong>instanceId</strong>: the ID of the instance. The value is of the STRING type.</p>
             * </li>
             * <li><p><strong>peakFlow</strong>: the peak throughput on the instance. The value is of the INTEGER type. Unit: bit/s.</p>
             * <p>For example: <code>{&quot;newEntity&quot;:{&quot;bandwidth&quot;:100,&quot;count&quot;:4,&quot;deductCount&quot;:1,&quot;expireTime&quot;:1616299196000,&quot;instanceId&quot;:&quot;ddoscoo-cn-v641kpmq****&quot;,&quot;peakFlow&quot;:751427000}}</code></p>
             * </li>
             * </ul>
             * <p>If <strong>OpAction</strong> is <strong>8</strong>, the following parameter is returned:</p>
             * <ul>
             * <li><p><strong>instanceId</strong>: the ID of the ECS instance whose IP address is changed. The value is of the STRING type.</p>
             * <p>For example: <code>{&quot;newEntity&quot;:{&quot;instanceId&quot;:&quot;i-wz9h6nc313zptbqn****&quot;}}</code></p>
             * </li>
             * </ul>
             * <p>If <strong>OpAction</strong> is <strong>9</strong>, the following parameter is returned:</p>
             * <ul>
             * <li><p><strong>actionMethod</strong>: the operation method. The value is of the STRING type. Valid value: <strong>undo</strong>, which indicates that you deactivated blackhole filtering.</p>
             * <p>For example: <code>{&quot;newEntity&quot;:{&quot;actionMethod&quot;:&quot;undo&quot;}}</code></p>
             * </li>
             * </ul>
             * <p>If <strong>OpAction</strong> is <strong>10</strong>, the following parameters are returned:</p>
             * <ul>
             * <li><p><strong>actionMethod</strong>: the operation method. The value is of the STRING type. Valid values:</p>
             * <ul>
             * <li><strong>do</strong>: The Diversion from Origin Server policy is enabled.</li>
             * <li><strong>undo</strong>: The Diversion from Origin Server policy is disabled.</li>
             * </ul>
             * </li>
             * <li><p><strong>lines</strong>: The Internet service provider (ISP) line from which the traffic is blocked. Valid values:</p>
             * <ul>
             * <li><strong>ct</strong>: China Telecom (International)</li>
             * <li><strong>cut</strong>: China Unicom (International)</li>
             * </ul>
             * <p>For example: <code>{&quot;newEntity&quot;:{&quot;actionMethod&quot;:&quot;undo&quot;,&quot;lines&quot;:[&quot;ct&quot;]}}</code></p>
             * </li>
             * </ul>
             * <p>If <strong>OpAction</strong> is <strong>11</strong>, no parameter is returned, and the description is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;newEntity&quot;:{&quot;actionMethod&quot;:&quot;undo&quot;}}</p>
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
