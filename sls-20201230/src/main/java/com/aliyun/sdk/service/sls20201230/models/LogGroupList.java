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
 * {@link LogGroupList} extends {@link TeaModel}
 *
 * <p>LogGroupList</p>
 */
public class LogGroupList extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logGroupList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LogGroup> logGroupList;

    private LogGroupList(Builder builder) {
        this.logGroupList = builder.logGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogGroupList create() {
        return builder().build();
    }

    /**
     * @return logGroupList
     */
    public java.util.List<LogGroup> getLogGroupList() {
        return this.logGroupList;
    }

    public static final class Builder {
        private java.util.List<LogGroup> logGroupList; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder logGroupList(java.util.List<LogGroup> logGroupList) {
            this.logGroupList = logGroupList;
            return this;
        }

        public LogGroupList build() {
            return new LogGroupList(this);
        } 

    } 

}
