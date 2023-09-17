// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link LogItem} extends {@link TeaModel}
 *
 * <p>LogItem</p>
 */
public class LogItem extends TeaModel {
    @NameInMap("Contents")
    @Validation(required = true)
    private java.util.List < LogContent > contents;

    @NameInMap("Time")
    @Validation(required = true)
    private Integer time;

    private LogItem(Builder builder) {
        this.contents = builder.contents;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogItem create() {
        return builder().build();
    }

    /**
     * @return contents
     */
    public java.util.List < LogContent > getContents() {
        return this.contents;
    }

    /**
     * @return time
     */
    public Integer getTime() {
        return this.time;
    }

    public static final class Builder {
        private java.util.List < LogContent > contents; 
        private Integer time; 

        /**
         * Contents.
         */
        public Builder contents(java.util.List < LogContent > contents) {
            this.contents = contents;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(Integer time) {
            this.time = time;
            return this;
        }

        public LogItem build() {
            return new LogItem(this);
        } 

    } 

}
