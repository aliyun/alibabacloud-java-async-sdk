// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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

        /**
         * CountBasedWindow.
         */
        public Builder countBasedWindow(Integer countBasedWindow) {
            this.countBasedWindow = countBasedWindow;
            return this;
        }

        /**
         * TimeBasedWindow.
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
