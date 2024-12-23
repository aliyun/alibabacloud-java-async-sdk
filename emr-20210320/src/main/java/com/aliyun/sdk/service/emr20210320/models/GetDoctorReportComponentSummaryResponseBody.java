// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetDoctorReportComponentSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorReportComponentSummaryResponseBody</p>
 */
public class GetDoctorReportComponentSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorReportComponentSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorReportComponentSummaryResponseBody create() {
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
         * <p>Report content.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorReportComponentSummaryResponseBody build() {
            return new GetDoctorReportComponentSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorReportComponentSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorReportComponentSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private Data(Builder builder) {
            this.score = builder.score;
            this.suggestion = builder.suggestion;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private Integer score; 
            private String suggestion; 
            private String summary; 

            /**
             * <p>Score.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>Optimization suggestions.</p>
             * 
             * <strong>example:</strong>
             * <p>计算健康度分数为 88 ，集群处于健康状态，继续保持 
             * 计算任务扫描
             * 对集群中 1518 个计算任务进行了扫描，包含 209 个任务处于不健康状态 ，596 个任务处于亚健康状态 ，713 个任务处于健康状态。 
             * 其中：
             *        Tez 任务 1518 个，加权平均分为 88 ，内存使用量占整体集群的 100.0% ，CPU 使用量占整体集群的 100.0% ，其中 209 个任务处于不健康状态，596 个任务处于亚健康状态；
             * 可在下面的任务明细列表中点击&quot;&quot;查看详情&quot;&quot;，查看存在的具体问题及解决方案。其中&quot;&quot;低分任务算力内存时 (GB*Sec)Top20 &quot;&quot;表根据内存时使用量进行排序，由于大任务对集群整体影响可能更大，建议优先关注。
             * 内存利用率较低
             * 集群整体内存利用率为 47.8% ，内存利用率较低，计算资源存在浪费，建议优先对内存算力时较大且内存利用率较低的 TOP 任务进行优化
             * 其中，Tez作业平均内存利用率为 47.8%</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>Report summary.</p>
             * 
             * <strong>example:</strong>
             * <h4> [计算检测]  计算健康度分数为 88 ，健康度良好，继续加油 </h4><p style=\"\"text-indent：2em\"\">集群中大部分任务保持健康状态 </p><p style=\"\"text-indent：2em\"\">集群内存利用率为： 47.8% 偏低 </p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
