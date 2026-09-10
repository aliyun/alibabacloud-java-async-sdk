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
         * <p>The dataset preview results.</p>
         */
        public Builder datasets(java.util.List<Datasets> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * <p>The effective SPL.</p>
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
         * <p>The request ID.</p>
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
             * <p>The field name.</p>
             * 
             * <strong>example:</strong>
             * <p>trace_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The field type.</p>
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
             * <p>The preview data.</p>
             */
            public Builder data(java.util.List<java.util.Map<String, ?>> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The field metadata.</p>
             */
            public Builder meta(java.util.List<Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The dataset name.</p>
             * 
             * <strong>example:</strong>
             * <p>error_spans</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of samples.</p>
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
