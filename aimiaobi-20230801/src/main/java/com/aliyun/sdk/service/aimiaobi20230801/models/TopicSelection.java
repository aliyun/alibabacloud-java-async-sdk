// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link TopicSelection} extends {@link TeaModel}
 *
 * <p>TopicSelection</p>
 */
public class TopicSelection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Outlines")
    private java.util.List<Outlines> outlines;

    @com.aliyun.core.annotation.NameInMap("Point")
    private String point;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    private TopicSelection(Builder builder) {
        this.outlines = builder.outlines;
        this.point = builder.point;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TopicSelection create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outlines
     */
    public java.util.List<Outlines> getOutlines() {
        return this.outlines;
    }

    /**
     * @return point
     */
    public String getPoint() {
        return this.point;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private java.util.List<Outlines> outlines; 
        private String point; 
        private String summary; 

        private Builder() {
        } 

        private Builder(TopicSelection model) {
            this.outlines = model.outlines;
            this.point = model.point;
            this.summary = model.summary;
        } 

        /**
         * Outlines.
         */
        public Builder outlines(java.util.List<Outlines> outlines) {
            this.outlines = outlines;
            return this;
        }

        /**
         * Point.
         */
        public Builder point(String point) {
            this.point = point;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public TopicSelection build() {
            return new TopicSelection(this);
        } 

    } 

    /**
     * 
     * {@link TopicSelection} extends {@link TeaModel}
     *
     * <p>TopicSelection</p>
     */
    public static class Outlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outline")
        private String outline;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private Outlines(Builder builder) {
            this.outline = builder.outline;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return outline
         */
        public String getOutline() {
            return this.outline;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String outline; 
            private String summary; 

            private Builder() {
            } 

            private Builder(Outlines model) {
                this.outline = model.outline;
                this.summary = model.summary;
            } 

            /**
             * Outline.
             */
            public Builder outline(String outline) {
                this.outline = outline;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Outlines build() {
                return new Outlines(this);
            } 

        } 

    }
}
