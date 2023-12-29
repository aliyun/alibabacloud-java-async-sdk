// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchWindow} extends {@link TeaModel}
 *
 * <p>BatchWindow</p>
 */
public class BatchWindow extends TeaModel {
    @NameInMap("CountBasedWindow")
    private Long countBasedWindow;

    @NameInMap("TimeBasedWindow")
    private Long timeBasedWindow;

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
    public Long getCountBasedWindow() {
        return this.countBasedWindow;
    }

    /**
     * @return timeBasedWindow
     */
    public Long getTimeBasedWindow() {
        return this.timeBasedWindow;
    }

    public static final class Builder {
        private Long countBasedWindow; 
        private Long timeBasedWindow; 

        /**
         * CountBasedWindow.
         */
        public Builder countBasedWindow(Long countBasedWindow) {
            this.countBasedWindow = countBasedWindow;
            return this;
        }

        /**
         * TimeBasedWindow.
         */
        public Builder timeBasedWindow(Long timeBasedWindow) {
            this.timeBasedWindow = timeBasedWindow;
            return this;
        }

        public BatchWindow build() {
            return new BatchWindow(this);
        } 

    } 

}
