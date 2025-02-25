// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosCreditResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosCreditResponseBody</p>
 */
public class DescribeDdosCreditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DdosCredit")
    private DdosCredit ddosCredit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDdosCreditResponseBody(Builder builder) {
        this.ddosCredit = builder.ddosCredit;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosCreditResponseBody create() {
        return builder().build();
    }

    /**
     * @return ddosCredit
     */
    public DdosCredit getDdosCredit() {
        return this.ddosCredit;
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
        private DdosCredit ddosCredit; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the security credit score of the current Alibaba Cloud account in the specified region.
         */
        public Builder ddosCredit(DdosCredit ddosCredit) {
            this.ddosCredit = ddosCredit;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDdosCreditResponseBody build() {
            return new DescribeDdosCreditResponseBody(this);
        } 

    } 

    public static class DdosCredit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackholeTime")
        private Integer blackholeTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("ScoreLevel")
        private String scoreLevel;

        private DdosCredit(Builder builder) {
            this.blackholeTime = builder.blackholeTime;
            this.score = builder.score;
            this.scoreLevel = builder.scoreLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdosCredit create() {
            return builder().build();
        }

        /**
         * @return blackholeTime
         */
        public Integer getBlackholeTime() {
            return this.blackholeTime;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return scoreLevel
         */
        public String getScoreLevel() {
            return this.scoreLevel;
        }

        public static final class Builder {
            private Integer blackholeTime; 
            private Integer score; 
            private String scoreLevel; 

            /**
             * The time period after which blackhole filtering is automatically deactivated in the specified region. Unit: minutes.
             */
            public Builder blackholeTime(Integer blackholeTime) {
                this.blackholeTime = blackholeTime;
                return this;
            }

            /**
             * The security credit score. The full score is **1000**.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * The security credit level. Valid values:
             * <p>
             * 
             * *   **A**: outstanding
             * *   **B**: excellent
             * *   **C**: good
             * *   **D**: average
             * *   **E**: poor
             * *   **F**: poorer
             */
            public Builder scoreLevel(String scoreLevel) {
                this.scoreLevel = scoreLevel;
                return this;
            }

            public DdosCredit build() {
                return new DdosCredit(this);
            } 

        } 

    }
}
