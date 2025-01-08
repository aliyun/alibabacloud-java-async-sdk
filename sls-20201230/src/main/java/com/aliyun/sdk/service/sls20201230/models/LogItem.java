// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link LogItem} extends {@link TeaModel}
 *
 * <p>LogItem</p>
 */
public class LogItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Contents")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LogContent> contents;

    @com.aliyun.core.annotation.NameInMap("Time")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<LogContent> getContents() {
        return this.contents;
    }

    /**
     * @return time
     */
    public Integer getTime() {
        return this.time;
    }

    public static final class Builder {
        private java.util.List<LogContent> contents; 
        private Integer time; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contents(java.util.List<LogContent> contents) {
            this.contents = contents;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1690254376</p>
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
