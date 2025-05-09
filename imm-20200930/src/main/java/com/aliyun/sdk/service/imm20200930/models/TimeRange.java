// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link TimeRange} extends {@link TeaModel}
 *
 * <p>TimeRange</p>
 */
public class TimeRange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("End")
    private String end;

    @com.aliyun.core.annotation.NameInMap("Start")
    private String start;

    private TimeRange(Builder builder) {
        this.end = builder.end;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimeRange create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder {
        private String end; 
        private String start; 

        private Builder() {
        } 

        private Builder(TimeRange model) {
            this.end = model.end;
            this.start = model.start;
        } 

        /**
         * End.
         */
        public Builder end(String end) {
            this.end = end;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public TimeRange build() {
            return new TimeRange(this);
        } 

    } 

}
