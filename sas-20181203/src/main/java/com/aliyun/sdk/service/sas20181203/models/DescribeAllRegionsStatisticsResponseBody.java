// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAllRegionsStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllRegionsStatisticsResponseBody</p>
 */
public class DescribeAllRegionsStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAllRegionsStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllRegionsStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAllRegionsStatisticsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B9A68671-BD84-55CD-807A-BA3A5490FCB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllRegionsStatisticsResponseBody build() {
            return new DescribeAllRegionsStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAllRegionsStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllRegionsStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private Integer account;

        @com.aliyun.core.annotation.NameInMap("Health")
        private Integer health;

        @com.aliyun.core.annotation.NameInMap("NewSuspicious")
        private Integer newSuspicious;

        @com.aliyun.core.annotation.NameInMap("Suspicious")
        private Integer suspicious;

        @com.aliyun.core.annotation.NameInMap("Trojan")
        private Integer trojan;

        @com.aliyun.core.annotation.NameInMap("Vul")
        private Integer vul;

        private Data(Builder builder) {
            this.account = builder.account;
            this.health = builder.health;
            this.newSuspicious = builder.newSuspicious;
            this.suspicious = builder.suspicious;
            this.trojan = builder.trojan;
            this.vul = builder.vul;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public Integer getAccount() {
            return this.account;
        }

        /**
         * @return health
         */
        public Integer getHealth() {
            return this.health;
        }

        /**
         * @return newSuspicious
         */
        public Integer getNewSuspicious() {
            return this.newSuspicious;
        }

        /**
         * @return suspicious
         */
        public Integer getSuspicious() {
            return this.suspicious;
        }

        /**
         * @return trojan
         */
        public Integer getTrojan() {
            return this.trojan;
        }

        /**
         * @return vul
         */
        public Integer getVul() {
            return this.vul;
        }

        public static final class Builder {
            private Integer account; 
            private Integer health; 
            private Integer newSuspicious; 
            private Integer suspicious; 
            private Integer trojan; 
            private Integer vul; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.account = model.account;
                this.health = model.health;
                this.newSuspicious = model.newSuspicious;
                this.suspicious = model.suspicious;
                this.trojan = model.trojan;
                this.vul = model.vul;
            } 

            /**
             * <p>The number of logons to the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder account(Integer account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The total number of unfixed baseline risks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder health(Integer health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The number of alerts that are generated by Server Guard or Security Center.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If <strong>From</strong> is set to <strong>sas</strong>, this parameter indicates the number of alerts that are generated by Security Center.</p>
             * </li>
             * <li><p>If <strong>From</strong> is set to <strong>aqs</strong>, this parameter indicates the number of alerts that are generated by Server Guard.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder newSuspicious(Integer newSuspicious) {
                this.newSuspicious = newSuspicious;
                return this;
            }

            /**
             * <p>The number of alerts that are generated by Server Guard.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder suspicious(Integer suspicious) {
                this.suspicious = suspicious;
                return this;
            }

            /**
             * <p>The number of webshell alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trojan(Integer trojan) {
                this.trojan = trojan;
                return this;
            }

            /**
             * <p>The number of unfixed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder vul(Integer vul) {
                this.vul = vul;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
