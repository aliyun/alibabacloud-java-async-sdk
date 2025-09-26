// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BrowserStreams} extends {@link TeaModel}
 *
 * <p>BrowserStreams</p>
 */
public class BrowserStreams extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("automationStream")
    private BrowserAutomationStream automationStream;

    @com.aliyun.core.annotation.NameInMap("liveViewStream")
    private BrowserLiveViewStream liveViewStream;

    private BrowserStreams(Builder builder) {
        this.automationStream = builder.automationStream;
        this.liveViewStream = builder.liveViewStream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserStreams create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return automationStream
     */
    public BrowserAutomationStream getAutomationStream() {
        return this.automationStream;
    }

    /**
     * @return liveViewStream
     */
    public BrowserLiveViewStream getLiveViewStream() {
        return this.liveViewStream;
    }

    public static final class Builder {
        private BrowserAutomationStream automationStream; 
        private BrowserLiveViewStream liveViewStream; 

        private Builder() {
        } 

        private Builder(BrowserStreams model) {
            this.automationStream = model.automationStream;
            this.liveViewStream = model.liveViewStream;
        } 

        /**
         * automationStream.
         */
        public Builder automationStream(BrowserAutomationStream automationStream) {
            this.automationStream = automationStream;
            return this;
        }

        /**
         * liveViewStream.
         */
        public Builder liveViewStream(BrowserLiveViewStream liveViewStream) {
            this.liveViewStream = liveViewStream;
            return this;
        }

        public BrowserStreams build() {
            return new BrowserStreams(this);
        } 

    } 

}
