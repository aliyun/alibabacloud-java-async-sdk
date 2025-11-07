// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyPersonasSexStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyPersonasSexStatisticsResponseBody</p>
 */
public class DescribeVerifyPersonasSexStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeVerifyPersonasSexStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyPersonasSexStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeVerifyPersonasSexStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>013DA6E1-3F37-5579-B979-2F12B7E92450</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBody build() {
            return new DescribeVerifyPersonasSexStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyPersonasSexStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyPersonasSexStatisticsResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Age0To14Cnt")
        private Long age0To14Cnt;

        @com.aliyun.core.annotation.NameInMap("Age0To14Rate")
        private String age0To14Rate;

        @com.aliyun.core.annotation.NameInMap("Age14To18Cnt")
        private Long age14To18Cnt;

        @com.aliyun.core.annotation.NameInMap("Age14To18Rate")
        private String age14To18Rate;

        @com.aliyun.core.annotation.NameInMap("Age18To35Cnt")
        private Long age18To35Cnt;

        @com.aliyun.core.annotation.NameInMap("Age18To35Rate")
        private String age18To35Rate;

        @com.aliyun.core.annotation.NameInMap("Age35To50Cnt")
        private Long age35To50Cnt;

        @com.aliyun.core.annotation.NameInMap("Age35To50Rate")
        private String age35To50Rate;

        @com.aliyun.core.annotation.NameInMap("Age50To999Cnt")
        private Long age50To999Cnt;

        @com.aliyun.core.annotation.NameInMap("Age50To999Rate")
        private String age50To999Rate;

        @com.aliyun.core.annotation.NameInMap("AllUserCnt")
        private Long allUserCnt;

        @com.aliyun.core.annotation.NameInMap("FemaleCnt")
        private Long femaleCnt;

        @com.aliyun.core.annotation.NameInMap("FemaleRate")
        private String femaleRate;

        @com.aliyun.core.annotation.NameInMap("MaleCnt")
        private Long maleCnt;

        @com.aliyun.core.annotation.NameInMap("MaleRate")
        private String maleRate;

        private ResultObject(Builder builder) {
            this.age0To14Cnt = builder.age0To14Cnt;
            this.age0To14Rate = builder.age0To14Rate;
            this.age14To18Cnt = builder.age14To18Cnt;
            this.age14To18Rate = builder.age14To18Rate;
            this.age18To35Cnt = builder.age18To35Cnt;
            this.age18To35Rate = builder.age18To35Rate;
            this.age35To50Cnt = builder.age35To50Cnt;
            this.age35To50Rate = builder.age35To50Rate;
            this.age50To999Cnt = builder.age50To999Cnt;
            this.age50To999Rate = builder.age50To999Rate;
            this.allUserCnt = builder.allUserCnt;
            this.femaleCnt = builder.femaleCnt;
            this.femaleRate = builder.femaleRate;
            this.maleCnt = builder.maleCnt;
            this.maleRate = builder.maleRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return age0To14Cnt
         */
        public Long getAge0To14Cnt() {
            return this.age0To14Cnt;
        }

        /**
         * @return age0To14Rate
         */
        public String getAge0To14Rate() {
            return this.age0To14Rate;
        }

        /**
         * @return age14To18Cnt
         */
        public Long getAge14To18Cnt() {
            return this.age14To18Cnt;
        }

        /**
         * @return age14To18Rate
         */
        public String getAge14To18Rate() {
            return this.age14To18Rate;
        }

        /**
         * @return age18To35Cnt
         */
        public Long getAge18To35Cnt() {
            return this.age18To35Cnt;
        }

        /**
         * @return age18To35Rate
         */
        public String getAge18To35Rate() {
            return this.age18To35Rate;
        }

        /**
         * @return age35To50Cnt
         */
        public Long getAge35To50Cnt() {
            return this.age35To50Cnt;
        }

        /**
         * @return age35To50Rate
         */
        public String getAge35To50Rate() {
            return this.age35To50Rate;
        }

        /**
         * @return age50To999Cnt
         */
        public Long getAge50To999Cnt() {
            return this.age50To999Cnt;
        }

        /**
         * @return age50To999Rate
         */
        public String getAge50To999Rate() {
            return this.age50To999Rate;
        }

        /**
         * @return allUserCnt
         */
        public Long getAllUserCnt() {
            return this.allUserCnt;
        }

        /**
         * @return femaleCnt
         */
        public Long getFemaleCnt() {
            return this.femaleCnt;
        }

        /**
         * @return femaleRate
         */
        public String getFemaleRate() {
            return this.femaleRate;
        }

        /**
         * @return maleCnt
         */
        public Long getMaleCnt() {
            return this.maleCnt;
        }

        /**
         * @return maleRate
         */
        public String getMaleRate() {
            return this.maleRate;
        }

        public static final class Builder {
            private Long age0To14Cnt; 
            private String age0To14Rate; 
            private Long age14To18Cnt; 
            private String age14To18Rate; 
            private Long age18To35Cnt; 
            private String age18To35Rate; 
            private Long age35To50Cnt; 
            private String age35To50Rate; 
            private Long age50To999Cnt; 
            private String age50To999Rate; 
            private Long allUserCnt; 
            private Long femaleCnt; 
            private String femaleRate; 
            private Long maleCnt; 
            private String maleRate; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.age0To14Cnt = model.age0To14Cnt;
                this.age0To14Rate = model.age0To14Rate;
                this.age14To18Cnt = model.age14To18Cnt;
                this.age14To18Rate = model.age14To18Rate;
                this.age18To35Cnt = model.age18To35Cnt;
                this.age18To35Rate = model.age18To35Rate;
                this.age35To50Cnt = model.age35To50Cnt;
                this.age35To50Rate = model.age35To50Rate;
                this.age50To999Cnt = model.age50To999Cnt;
                this.age50To999Rate = model.age50To999Rate;
                this.allUserCnt = model.allUserCnt;
                this.femaleCnt = model.femaleCnt;
                this.femaleRate = model.femaleRate;
                this.maleCnt = model.maleCnt;
                this.maleRate = model.maleRate;
            } 

            /**
             * <p>Number of users under 14 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder age0To14Cnt(Long age0To14Cnt) {
                this.age0To14Cnt = age0To14Cnt;
                return this;
            }

            /**
             * <p>Proportion of users under 14 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder age0To14Rate(String age0To14Rate) {
                this.age0To14Rate = age0To14Rate;
                return this;
            }

            /**
             * <p>Number of users between 14 and 18 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder age14To18Cnt(Long age14To18Cnt) {
                this.age14To18Cnt = age14To18Cnt;
                return this;
            }

            /**
             * <p>Proportion of users between 14 and 18 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder age14To18Rate(String age14To18Rate) {
                this.age14To18Rate = age14To18Rate;
                return this;
            }

            /**
             * <p>Number of authenticated users between 18 and 35 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder age18To35Cnt(Long age18To35Cnt) {
                this.age18To35Cnt = age18To35Cnt;
                return this;
            }

            /**
             * <p>Proportion of authenticated users between 18 and 35 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>64.29</p>
             */
            public Builder age18To35Rate(String age18To35Rate) {
                this.age18To35Rate = age18To35Rate;
                return this;
            }

            /**
             * <p>Number of authenticated users between 35 and 50 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder age35To50Cnt(Long age35To50Cnt) {
                this.age35To50Cnt = age35To50Cnt;
                return this;
            }

            /**
             * <p>Proportion of users between 35 and 50 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>35.71</p>
             */
            public Builder age35To50Rate(String age35To50Rate) {
                this.age35To50Rate = age35To50Rate;
                return this;
            }

            /**
             * <p>Number of authenticated users over 50 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder age50To999Cnt(Long age50To999Cnt) {
                this.age50To999Cnt = age50To999Cnt;
                return this;
            }

            /**
             * <p>Proportion of authenticated users over 50 years old.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder age50To999Rate(String age50To999Rate) {
                this.age50To999Rate = age50To999Rate;
                return this;
            }

            /**
             * <p>Total number of authenticated users.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder allUserCnt(Long allUserCnt) {
                this.allUserCnt = allUserCnt;
                return this;
            }

            /**
             * <p>Number of female users.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder femaleCnt(Long femaleCnt) {
                this.femaleCnt = femaleCnt;
                return this;
            }

            /**
             * <p>Proportion of female authenticated users.</p>
             * 
             * <strong>example:</strong>
             * <p>28.57</p>
             */
            public Builder femaleRate(String femaleRate) {
                this.femaleRate = femaleRate;
                return this;
            }

            /**
             * <p>Number of male users.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maleCnt(Long maleCnt) {
                this.maleCnt = maleCnt;
                return this;
            }

            /**
             * <p>Proportion of male users.</p>
             * 
             * <strong>example:</strong>
             * <p>71.43</p>
             */
            public Builder maleRate(String maleRate) {
                this.maleRate = maleRate;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
