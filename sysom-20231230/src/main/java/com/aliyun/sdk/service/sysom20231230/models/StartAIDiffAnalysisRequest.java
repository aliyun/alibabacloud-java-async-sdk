// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link StartAIDiffAnalysisRequest} extends {@link RequestModel}
 *
 * <p>StartAIDiffAnalysisRequest</p>
 */
public class StartAIDiffAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("task1")
    @com.aliyun.core.annotation.Validation(required = true)
    private Task1 task1;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("task2")
    @com.aliyun.core.annotation.Validation(required = true)
    private Task2 task2;

    private StartAIDiffAnalysisRequest(Builder builder) {
        super(builder);
        this.task1 = builder.task1;
        this.task2 = builder.task2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAIDiffAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return task1
     */
    public Task1 getTask1() {
        return this.task1;
    }

    /**
     * @return task2
     */
    public Task2 getTask2() {
        return this.task2;
    }

    public static final class Builder extends Request.Builder<StartAIDiffAnalysisRequest, Builder> {
        private Task1 task1; 
        private Task2 task2; 

        private Builder() {
            super();
        } 

        private Builder(StartAIDiffAnalysisRequest request) {
            super(request);
            this.task1 = request.task1;
            this.task2 = request.task2;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder task1(Task1 task1) {
            this.putBodyParameter("task1", task1);
            this.task1 = task1;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder task2(Task2 task2) {
            this.putBodyParameter("task2", task2);
            this.task2 = task2;
            return this;
        }

        @Override
        public StartAIDiffAnalysisRequest build() {
            return new StartAIDiffAnalysisRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartAIDiffAnalysisRequest} extends {@link TeaModel}
     *
     * <p>StartAIDiffAnalysisRequest</p>
     */
    public static class Task1 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisId")
        private String analysisId;

        @com.aliyun.core.annotation.NameInMap("pids")
        private java.util.List<String> pids;

        @com.aliyun.core.annotation.NameInMap("step_end")
        private Float stepEnd;

        @com.aliyun.core.annotation.NameInMap("step_start")
        private Float stepStart;

        private Task1(Builder builder) {
            this.analysisId = builder.analysisId;
            this.pids = builder.pids;
            this.stepEnd = builder.stepEnd;
            this.stepStart = builder.stepStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task1 create() {
            return builder().build();
        }

        /**
         * @return analysisId
         */
        public String getAnalysisId() {
            return this.analysisId;
        }

        /**
         * @return pids
         */
        public java.util.List<String> getPids() {
            return this.pids;
        }

        /**
         * @return stepEnd
         */
        public Float getStepEnd() {
            return this.stepEnd;
        }

        /**
         * @return stepStart
         */
        public Float getStepStart() {
            return this.stepStart;
        }

        public static final class Builder {
            private String analysisId; 
            private java.util.List<String> pids; 
            private Float stepEnd; 
            private Float stepStart; 

            private Builder() {
            } 

            private Builder(Task1 model) {
                this.analysisId = model.analysisId;
                this.pids = model.pids;
                this.stepEnd = model.stepEnd;
                this.stepStart = model.stepStart;
            } 

            /**
             * analysisId.
             */
            public Builder analysisId(String analysisId) {
                this.analysisId = analysisId;
                return this;
            }

            /**
             * pids.
             */
            public Builder pids(java.util.List<String> pids) {
                this.pids = pids;
                return this;
            }

            /**
             * step_end.
             */
            public Builder stepEnd(Float stepEnd) {
                this.stepEnd = stepEnd;
                return this;
            }

            /**
             * step_start.
             */
            public Builder stepStart(Float stepStart) {
                this.stepStart = stepStart;
                return this;
            }

            public Task1 build() {
                return new Task1(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartAIDiffAnalysisRequest} extends {@link TeaModel}
     *
     * <p>StartAIDiffAnalysisRequest</p>
     */
    public static class Task2 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String analysisId;

        @com.aliyun.core.annotation.NameInMap("pids")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> pids;

        @com.aliyun.core.annotation.NameInMap("step_end")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float stepEnd;

        @com.aliyun.core.annotation.NameInMap("step_start")
        @com.aliyun.core.annotation.Validation(required = true)
        private Float stepStart;

        private Task2(Builder builder) {
            this.analysisId = builder.analysisId;
            this.pids = builder.pids;
            this.stepEnd = builder.stepEnd;
            this.stepStart = builder.stepStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task2 create() {
            return builder().build();
        }

        /**
         * @return analysisId
         */
        public String getAnalysisId() {
            return this.analysisId;
        }

        /**
         * @return pids
         */
        public java.util.List<String> getPids() {
            return this.pids;
        }

        /**
         * @return stepEnd
         */
        public Float getStepEnd() {
            return this.stepEnd;
        }

        /**
         * @return stepStart
         */
        public Float getStepStart() {
            return this.stepStart;
        }

        public static final class Builder {
            private String analysisId; 
            private java.util.List<String> pids; 
            private Float stepEnd; 
            private Float stepStart; 

            private Builder() {
            } 

            private Builder(Task2 model) {
                this.analysisId = model.analysisId;
                this.pids = model.pids;
                this.stepEnd = model.stepEnd;
                this.stepStart = model.stepStart;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
             */
            public Builder analysisId(String analysisId) {
                this.analysisId = analysisId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>452651:python3 ./test.py</p>
             */
            public Builder pids(java.util.List<String> pids) {
                this.pids = pids;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>4660551334179.955</p>
             */
            public Builder stepEnd(Float stepEnd) {
                this.stepEnd = stepEnd;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>4660550379415.497</p>
             */
            public Builder stepStart(Float stepStart) {
                this.stepStart = stepStart;
                return this;
            }

            public Task2 build() {
                return new Task2(this);
            } 

        } 

    }
}
