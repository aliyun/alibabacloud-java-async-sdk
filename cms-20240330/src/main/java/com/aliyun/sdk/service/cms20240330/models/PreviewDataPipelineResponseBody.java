// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PreviewDataPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewDataPipelineResponseBody</p>
 */
public class PreviewDataPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("datasets")
    private java.util.List<Datasets> datasets;

    @com.aliyun.core.annotation.NameInMap("effectiveScript")
    private String effectiveScript;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PreviewDataPipelineResponseBody(Builder builder) {
        this.datasets = builder.datasets;
        this.effectiveScript = builder.effectiveScript;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewDataPipelineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasets
     */
    public java.util.List<Datasets> getDatasets() {
        return this.datasets;
    }

    /**
     * @return effectiveScript
     */
    public String getEffectiveScript() {
        return this.effectiveScript;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Datasets> datasets; 
        private String effectiveScript; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PreviewDataPipelineResponseBody model) {
            this.datasets = model.datasets;
            this.effectiveScript = model.effectiveScript;
            this.requestId = model.requestId;
        } 

        /**
         * <p>按逻辑 Dataset 分组的字段元数据和样例行。</p>
         */
        public Builder datasets(java.util.List<Datasets> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * <p>当前编译器为本次候选配置生成并实际执行的公开 Processing SPL。</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| where status_code == &quot;ERROR&quot;</li>
         * </ul>
         */
        public Builder effectiveScript(String effectiveScript) {
            this.effectiveScript = effectiveScript;
            return this;
        }

        /**
         * <p>用于排查问题的请求唯一标识。</p>
         * 
         * <strong>example:</strong>
         * <p>req-01j2example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreviewDataPipelineResponseBody build() {
            return new PreviewDataPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewDataPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewDataPipelineResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Meta(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>预览样例中的字段名称。</p>
             * 
             * <strong>example:</strong>
             * <p>trace_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>预览样例中该字段的数据类型。</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreviewDataPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewDataPipelineResponseBody</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<java.util.Map<String, ?>> data;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.List<Meta> meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sampleCount")
        private Long sampleCount;

        private Datasets(Builder builder) {
            this.data = builder.data;
            this.meta = builder.meta;
            this.name = builder.name;
            this.sampleCount = builder.sampleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        /**
         * @return meta
         */
        public java.util.List<Meta> getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sampleCount
         */
        public Long getSampleCount() {
            return this.sampleCount;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> data; 
            private java.util.List<Meta> meta; 
            private String name; 
            private Long sampleCount; 

            private Builder() {
            } 

            private Builder(Datasets model) {
                this.data = model.data;
                this.meta = model.meta;
                this.name = model.name;
                this.sampleCount = model.sampleCount;
            } 

            /**
             * <p>本 Dataset 返回的只读预览样例行。</p>
             */
            public Builder data(java.util.List<java.util.Map<String, ?>> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>本 Dataset 预览样例的字段名称和类型列表。</p>
             */
            public Builder meta(java.util.List<Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>产生本组预览样例的逻辑 Dataset 名称。</p>
             * 
             * <strong>example:</strong>
             * <p>error_spans</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>本 Dataset 返回的预览样例行数。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sampleCount(Long sampleCount) {
                this.sampleCount = sampleCount;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
}
