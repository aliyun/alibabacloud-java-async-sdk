// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMultimodalModerationResultResponseBody</p>
 */
public class DescribeMultimodalModerationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMultimodalModerationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultimodalModerationResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMultimodalModerationResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMultimodalModerationResultResponseBody build() {
            return new DescribeMultimodalModerationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultimodalModerationResultResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Results(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String description; 
            private String label; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultimodalModerationResultResponseBody</p>
     */
    public static class CommentDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        private CommentDatas(Builder builder) {
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommentDatas create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List<Results> results; 

            private Builder() {
            } 

            private Builder(CommentDatas model) {
                this.results = model.results;
            } 

            /**
             * Results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            public CommentDatas build() {
                return new CommentDatas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultimodalModerationResultResponseBody</p>
     */
    public static class CommentDatasResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private CommentDatasResults(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommentDatasResults create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String description; 
            private String label; 

            private Builder() {
            } 

            private Builder(CommentDatasResults model) {
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public CommentDatasResults build() {
                return new CommentDatasResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultimodalModerationResultResponseBody</p>
     */
    public static class DataCommentDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommentDatas")
        private java.util.List<CommentDatas> commentDatas;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<CommentDatasResults> results;

        private DataCommentDatas(Builder builder) {
            this.commentDatas = builder.commentDatas;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCommentDatas create() {
            return builder().build();
        }

        /**
         * @return commentDatas
         */
        public java.util.List<CommentDatas> getCommentDatas() {
            return this.commentDatas;
        }

        /**
         * @return results
         */
        public java.util.List<CommentDatasResults> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List<CommentDatas> commentDatas; 
            private java.util.List<CommentDatasResults> results; 

            private Builder() {
            } 

            private Builder(DataCommentDatas model) {
                this.commentDatas = model.commentDatas;
                this.results = model.results;
            } 

            /**
             * CommentDatas.
             */
            public Builder commentDatas(java.util.List<CommentDatas> commentDatas) {
                this.commentDatas = commentDatas;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List<CommentDatasResults> results) {
                this.results = results;
                return this;
            }

            public DataCommentDatas build() {
                return new DataCommentDatas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultimodalModerationResultResponseBody</p>
     */
    public static class MainDataResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private MainDataResults(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainDataResults create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String description; 
            private String label; 

            private Builder() {
            } 

            private Builder(MainDataResults model) {
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public MainDataResults build() {
                return new MainDataResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultimodalModerationResultResponseBody</p>
     */
    public static class MainData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<MainDataResults> results;

        private MainData(Builder builder) {
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MainData create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List<MainDataResults> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List<MainDataResults> results; 

            private Builder() {
            } 

            private Builder(MainData model) {
                this.results = model.results;
            } 

            /**
             * Results.
             */
            public Builder results(java.util.List<MainDataResults> results) {
                this.results = results;
                return this;
            }

            public MainData build() {
                return new MainData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultimodalModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultimodalModerationResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommentDatas")
        private java.util.List<DataCommentDatas> commentDatas;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("MainData")
        private MainData mainData;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Data(Builder builder) {
            this.commentDatas = builder.commentDatas;
            this.dataId = builder.dataId;
            this.mainData = builder.mainData;
            this.reqId = builder.reqId;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commentDatas
         */
        public java.util.List<DataCommentDatas> getCommentDatas() {
            return this.commentDatas;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return mainData
         */
        public MainData getMainData() {
            return this.mainData;
        }

        /**
         * @return reqId
         */
        public String getReqId() {
            return this.reqId;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<DataCommentDatas> commentDatas; 
            private String dataId; 
            private MainData mainData; 
            private String reqId; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.commentDatas = model.commentDatas;
                this.dataId = model.dataId;
                this.mainData = model.mainData;
                this.reqId = model.reqId;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * CommentDatas.
             */
            public Builder commentDatas(java.util.List<DataCommentDatas> commentDatas) {
                this.commentDatas = commentDatas;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * MainData.
             */
            public Builder mainData(MainData mainData) {
                this.mainData = mainData;
                return this;
            }

            /**
             * ReqId.
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
