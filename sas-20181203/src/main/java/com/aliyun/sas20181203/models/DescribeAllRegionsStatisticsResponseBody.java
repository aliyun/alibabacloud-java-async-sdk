// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAllRegionsStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllRegionsStatisticsResponseBody</p>
 */
public class DescribeAllRegionsStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllRegionsStatisticsResponseBody build() {
            return new DescribeAllRegionsStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Account")
        private Integer account;

        @NameInMap("Health")
        private Integer health;

        @NameInMap("NewSuspicious")
        private Integer newSuspicious;

        @NameInMap("Suspicious")
        private Integer suspicious;

        @NameInMap("Trojan")
        private Integer trojan;

        @NameInMap("Vul")
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

            /**
             * <p>Account.</p>
             */
            public Builder account(Integer account) {
                this.account = account;
                return this;
            }

            /**
             * <p>Health.</p>
             */
            public Builder health(Integer health) {
                this.health = health;
                return this;
            }

            /**
             * <p>NewSuspicious.</p>
             */
            public Builder newSuspicious(Integer newSuspicious) {
                this.newSuspicious = newSuspicious;
                return this;
            }

            /**
             * <p>Suspicious.</p>
             */
            public Builder suspicious(Integer suspicious) {
                this.suspicious = suspicious;
                return this;
            }

            /**
             * <p>Trojan.</p>
             */
            public Builder trojan(Integer trojan) {
                this.trojan = trojan;
                return this;
            }

            /**
             * <p>Vul.</p>
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
