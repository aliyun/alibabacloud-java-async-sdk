// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDdosCreditResponseBody model) {
            this.ddosCredit = model.ddosCredit;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the security credit score of the current Alibaba Cloud account in the specified region.</p>
         */
        public Builder ddosCredit(DdosCredit ddosCredit) {
            this.ddosCredit = ddosCredit;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E1F7BD73-8E9D-58D9-8658-CFC97112C641</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDdosCreditResponseBody build() {
            return new DescribeDdosCreditResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDdosCreditResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosCreditResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DdosCredit model) {
                this.blackholeTime = model.blackholeTime;
                this.score = model.score;
                this.scoreLevel = model.scoreLevel;
            } 

            /**
             * <p>The time period after which blackhole filtering is automatically deactivated in the specified region. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder blackholeTime(Integer blackholeTime) {
                this.blackholeTime = blackholeTime;
                return this;
            }

            /**
             * <p>The security credit score. The full score is <strong>1000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>550</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The security credit level. Valid values:</p>
             * <ul>
             * <li><strong>A</strong>: outstanding</li>
             * <li><strong>B</strong>: excellent</li>
             * <li><strong>C</strong>: good</li>
             * <li><strong>D</strong>: average</li>
             * <li><strong>E</strong>: poor</li>
             * <li><strong>F</strong>: poorer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>D</p>
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
