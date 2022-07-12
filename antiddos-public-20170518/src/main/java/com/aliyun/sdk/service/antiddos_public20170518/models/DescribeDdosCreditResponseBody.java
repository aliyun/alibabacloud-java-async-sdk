// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosCreditResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosCreditResponseBody</p>
 */
public class DescribeDdosCreditResponseBody extends TeaModel {
    @NameInMap("DdosCredit")
    private DdosCredit ddosCredit;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * DdosCredit.
         */
        public Builder ddosCredit(DdosCredit ddosCredit) {
            this.ddosCredit = ddosCredit;
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

        public DescribeDdosCreditResponseBody build() {
            return new DescribeDdosCreditResponseBody(this);
        } 

    } 

    public static class DdosCredit extends TeaModel {
        @NameInMap("BlackholeTime")
        private Integer blackholeTime;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("ScoreLevel")
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
             * BlackholeTime.
             */
            public Builder blackholeTime(Integer blackholeTime) {
                this.blackholeTime = blackholeTime;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * ScoreLevel.
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
