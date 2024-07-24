// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScoreInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetScoreInfoResponseBody</p>
 */
public class GetScoreInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetScoreInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScoreInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetScoreInfoResponseBody build() {
            return new GetScoreInfoResponseBody(this);
        } 

    } 

    public static class ScoreParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreSubId")
        private Integer scoreSubId;

        @com.aliyun.core.annotation.NameInMap("ScoreSubName")
        private String scoreSubName;

        @com.aliyun.core.annotation.NameInMap("ScoreType")
        private Integer scoreType;

        private ScoreParam(Builder builder) {
            this.scoreNum = builder.scoreNum;
            this.scoreSubId = builder.scoreSubId;
            this.scoreSubName = builder.scoreSubName;
            this.scoreType = builder.scoreType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoreParam create() {
            return builder().build();
        }

        /**
         * @return scoreNum
         */
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        /**
         * @return scoreSubId
         */
        public Integer getScoreSubId() {
            return this.scoreSubId;
        }

        /**
         * @return scoreSubName
         */
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        /**
         * @return scoreType
         */
        public Integer getScoreType() {
            return this.scoreType;
        }

        public static final class Builder {
            private Integer scoreNum; 
            private Integer scoreSubId; 
            private String scoreSubName; 
            private Integer scoreType; 

            /**
             * ScoreNum.
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * ScoreSubId.
             */
            public Builder scoreSubId(Integer scoreSubId) {
                this.scoreSubId = scoreSubId;
                return this;
            }

            /**
             * ScoreSubName.
             */
            public Builder scoreSubName(String scoreSubName) {
                this.scoreSubName = scoreSubName;
                return this;
            }

            /**
             * ScoreType.
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            public ScoreParam build() {
                return new ScoreParam(this);
            } 

        } 

    }
    public static class ScoreInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScoreParam")
        private java.util.List < ScoreParam> scoreParam;

        private ScoreInfos(Builder builder) {
            this.scoreParam = builder.scoreParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoreInfos create() {
            return builder().build();
        }

        /**
         * @return scoreParam
         */
        public java.util.List < ScoreParam> getScoreParam() {
            return this.scoreParam;
        }

        public static final class Builder {
            private java.util.List < ScoreParam> scoreParam; 

            /**
             * ScoreParam.
             */
            public Builder scoreParam(java.util.List < ScoreParam> scoreParam) {
                this.scoreParam = scoreParam;
                return this;
            }

            public ScoreInfos build() {
                return new ScoreInfos(this);
            } 

        } 

    }
    public static class ScorePo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScoreId")
        private Integer scoreId;

        @com.aliyun.core.annotation.NameInMap("ScoreInfos")
        private ScoreInfos scoreInfos;

        @com.aliyun.core.annotation.NameInMap("ScoreName")
        private String scoreName;

        private ScorePo(Builder builder) {
            this.scoreId = builder.scoreId;
            this.scoreInfos = builder.scoreInfos;
            this.scoreName = builder.scoreName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScorePo create() {
            return builder().build();
        }

        /**
         * @return scoreId
         */
        public Integer getScoreId() {
            return this.scoreId;
        }

        /**
         * @return scoreInfos
         */
        public ScoreInfos getScoreInfos() {
            return this.scoreInfos;
        }

        /**
         * @return scoreName
         */
        public String getScoreName() {
            return this.scoreName;
        }

        public static final class Builder {
            private Integer scoreId; 
            private ScoreInfos scoreInfos; 
            private String scoreName; 

            /**
             * ScoreId.
             */
            public Builder scoreId(Integer scoreId) {
                this.scoreId = scoreId;
                return this;
            }

            /**
             * ScoreInfos.
             */
            public Builder scoreInfos(ScoreInfos scoreInfos) {
                this.scoreInfos = scoreInfos;
                return this;
            }

            /**
             * ScoreName.
             */
            public Builder scoreName(String scoreName) {
                this.scoreName = scoreName;
                return this;
            }

            public ScorePo build() {
                return new ScorePo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScorePo")
        private java.util.List < ScorePo> scorePo;

        private Data(Builder builder) {
            this.scorePo = builder.scorePo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scorePo
         */
        public java.util.List < ScorePo> getScorePo() {
            return this.scorePo;
        }

        public static final class Builder {
            private java.util.List < ScorePo> scorePo; 

            /**
             * ScorePo.
             */
            public Builder scorePo(java.util.List < ScorePo> scorePo) {
                this.scorePo = scorePo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
