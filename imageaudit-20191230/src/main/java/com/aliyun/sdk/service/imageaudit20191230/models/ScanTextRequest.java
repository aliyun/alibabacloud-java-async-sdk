// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageaudit20191230.models;

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
 * {@link ScanTextRequest} extends {@link RequestModel}
 *
 * <p>ScanTextRequest</p>
 */
public class ScanTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tasks> tasks;

    private ScanTextRequest(Builder builder) {
        super(builder);
        this.labels = builder.labels;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder extends Request.Builder<ScanTextRequest, Builder> {
        private java.util.List<Labels> labels; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
            super();
        } 

        private Builder(ScanTextRequest request) {
            super(request);
            this.labels = request.labels;
            this.tasks = request.tasks;
        } 

        /**
         * <p>1</p>
         * <p>This parameter is required.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>1</p>
         * <p>This parameter is required.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.putBodyParameter("Tasks", tasks);
            this.tasks = tasks;
            return this;
        }

        @Override
        public ScanTextRequest build() {
            return new ScanTextRequest(this);
        } 

    } 

    /**
     * 
     * {@link ScanTextRequest} extends {@link TeaModel}
     *
     * <p>ScanTextRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        @com.aliyun.core.annotation.Validation(required = true)
        private String label;

        private Labels(Builder builder) {
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String label; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.label = model.label;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ad</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScanTextRequest} extends {@link TeaModel}
     *
     * <p>ScanTextRequest</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        private Tasks(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.content = model.content;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
