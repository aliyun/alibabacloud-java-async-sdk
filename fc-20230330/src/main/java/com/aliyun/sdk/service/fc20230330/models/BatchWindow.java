// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link BatchWindow} extends {@link TeaModel}
 *
 * <p>BatchWindow</p>
 */
public class BatchWindow extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CountBasedWindow")
    private Integer countBasedWindow;

    @com.aliyun.core.annotation.NameInMap("TimeBasedWindow")
    private Integer timeBasedWindow;

    private BatchWindow(Builder builder) {
        this.countBasedWindow = builder.countBasedWindow;
        this.timeBasedWindow = builder.timeBasedWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchWindow create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return countBasedWindow
     */
    public Integer getCountBasedWindow() {
        return this.countBasedWindow;
    }

    /**
     * @return timeBasedWindow
     */
    public Integer getTimeBasedWindow() {
        return this.timeBasedWindow;
    }

    public static final class Builder {
        private Integer countBasedWindow; 
        private Integer timeBasedWindow; 

        private Builder() {
        } 

        private Builder(BatchWindow model) {
            this.countBasedWindow = model.countBasedWindow;
            this.timeBasedWindow = model.timeBasedWindow;
        } 

        /**
         * <p>The maximum number of events that are allowed in the batch window. When this threshold is reached, data in the window is pushed downstream. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder countBasedWindow(Integer countBasedWindow) {
            this.countBasedWindow = countBasedWindow;
            return this;
        }

        /**
         * <p>The maximum period of time during which events are allowed in the batch window. Unit: seconds. When this threshold is reached, data in the window is pushed downstream. If multiple batch windows exist, data is pushed if triggering conditions are met in one of the windows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder timeBasedWindow(Integer timeBasedWindow) {
            this.timeBasedWindow = timeBasedWindow;
            return this;
        }

        public BatchWindow build() {
            return new BatchWindow(this);
        } 

    } 

}
