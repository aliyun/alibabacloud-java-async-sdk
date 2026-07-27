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
 * {@link SlsNamedQueryEntry} extends {@link TeaModel}
 *
 * <p>SlsNamedQueryEntry</p>
 */
public class SlsNamedQueryEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("end")
    private Long end;

    @com.aliyun.core.annotation.NameInMap("expr")
    private String expr;

    @com.aliyun.core.annotation.NameInMap("start")
    private Long start;

    @com.aliyun.core.annotation.NameInMap("timeUnit")
    private String timeUnit;

    @com.aliyun.core.annotation.NameInMap("window")
    private Long window;

    private SlsNamedQueryEntry(Builder builder) {
        this.end = builder.end;
        this.expr = builder.expr;
        this.start = builder.start;
        this.timeUnit = builder.timeUnit;
        this.window = builder.window;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SlsNamedQueryEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return expr
     */
    public String getExpr() {
        return this.expr;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * @return window
     */
    public Long getWindow() {
        return this.window;
    }

    public static final class Builder {
        private Long end; 
        private String expr; 
        private Long start; 
        private String timeUnit; 
        private Long window; 

        private Builder() {
        } 

        private Builder(SlsNamedQueryEntry model) {
            this.end = model.end;
            this.expr = model.expr;
            this.start = model.start;
            this.timeUnit = model.timeUnit;
            this.window = model.window;
        } 

        /**
         * end.
         */
        public Builder end(Long end) {
            this.end = end;
            return this;
        }

        /**
         * expr.
         */
        public Builder expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
         * start.
         */
        public Builder start(Long start) {
            this.start = start;
            return this;
        }

        /**
         * timeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * window.
         */
        public Builder window(Long window) {
            this.window = window;
            return this;
        }

        public SlsNamedQueryEntry build() {
            return new SlsNamedQueryEntry(this);
        } 

    } 

}
