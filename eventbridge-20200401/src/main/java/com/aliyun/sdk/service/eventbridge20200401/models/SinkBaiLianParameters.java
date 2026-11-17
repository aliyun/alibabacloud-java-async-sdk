// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SinkBaiLianParameters} extends {@link TeaModel}
 *
 * <p>SinkBaiLianParameters</p>
 */
public class SinkBaiLianParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("After")
    private After after;

    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.NameInMap("Before")
    private Before before;

    @com.aliyun.core.annotation.NameInMap("Context")
    private Object context;

    @com.aliyun.core.annotation.NameInMap("Extend")
    private Object extend;

    @com.aliyun.core.annotation.NameInMap("Offset")
    private Offset offset;

    @com.aliyun.core.annotation.NameInMap("Op")
    private Op op;

    @com.aliyun.core.annotation.NameInMap("Partition")
    private Partition partition;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SinkBaiLianParameters(Builder builder) {
        this.after = builder.after;
        this.applicationType = builder.applicationType;
        this.before = builder.before;
        this.context = builder.context;
        this.extend = builder.extend;
        this.offset = builder.offset;
        this.op = builder.op;
        this.partition = builder.partition;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkBaiLianParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return after
     */
    public After getAfter() {
        return this.after;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return before
     */
    public Before getBefore() {
        return this.before;
    }

    /**
     * @return context
     */
    public Object getContext() {
        return this.context;
    }

    /**
     * @return extend
     */
    public Object getExtend() {
        return this.extend;
    }

    /**
     * @return offset
     */
    public Offset getOffset() {
        return this.offset;
    }

    /**
     * @return op
     */
    public Op getOp() {
        return this.op;
    }

    /**
     * @return partition
     */
    public Partition getPartition() {
        return this.partition;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private After after; 
        private String applicationType; 
        private Before before; 
        private Object context; 
        private Object extend; 
        private Offset offset; 
        private Op op; 
        private Partition partition; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(SinkBaiLianParameters model) {
            this.after = model.after;
            this.applicationType = model.applicationType;
            this.before = model.before;
            this.context = model.context;
            this.extend = model.extend;
            this.offset = model.offset;
            this.op = model.op;
            this.partition = model.partition;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * After.
         */
        public Builder after(After after) {
            this.after = after;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * Before.
         */
        public Builder before(Before before) {
            this.before = before;
            return this;
        }

        /**
         * Context.
         */
        public Builder context(Object context) {
            this.context = context;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(Object extend) {
            this.extend = extend;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Offset offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Op.
         */
        public Builder op(Op op) {
            this.op = op;
            return this;
        }

        /**
         * Partition.
         */
        public Builder partition(Partition partition) {
            this.partition = partition;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public SinkBaiLianParameters build() {
            return new SinkBaiLianParameters(this);
        } 

    } 

    /**
     * 
     * {@link SinkBaiLianParameters} extends {@link TeaModel}
     *
     * <p>SinkBaiLianParameters</p>
     */
    public static class After extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private After(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static After create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(After model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public After build() {
                return new After(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkBaiLianParameters} extends {@link TeaModel}
     *
     * <p>SinkBaiLianParameters</p>
     */
    public static class Before extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Before(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Before create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Before model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Before build() {
                return new Before(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkBaiLianParameters} extends {@link TeaModel}
     *
     * <p>SinkBaiLianParameters</p>
     */
    public static class Offset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Offset(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Offset create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Offset model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Offset build() {
                return new Offset(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkBaiLianParameters} extends {@link TeaModel}
     *
     * <p>SinkBaiLianParameters</p>
     */
    public static class Op extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Op(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Op create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Op model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Op build() {
                return new Op(this);
            } 

        } 

    }
    /**
     * 
     * {@link SinkBaiLianParameters} extends {@link TeaModel}
     *
     * <p>SinkBaiLianParameters</p>
     */
    public static class Partition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Partition(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Partition create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(Partition model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Partition build() {
                return new Partition(this);
            } 

        } 

    }
}
