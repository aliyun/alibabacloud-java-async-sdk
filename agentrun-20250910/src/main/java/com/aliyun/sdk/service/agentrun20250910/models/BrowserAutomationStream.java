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
 * {@link BrowserAutomationStream} extends {@link TeaModel}
 *
 * <p>BrowserAutomationStream</p>
 */
public class BrowserAutomationStream extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("streamEndpoint")
    private String streamEndpoint;

    @com.aliyun.core.annotation.NameInMap("streamStatus")
    private String streamStatus;

    private BrowserAutomationStream(Builder builder) {
        this.streamEndpoint = builder.streamEndpoint;
        this.streamStatus = builder.streamStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserAutomationStream create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return streamEndpoint
     */
    public String getStreamEndpoint() {
        return this.streamEndpoint;
    }

    /**
     * @return streamStatus
     */
    public String getStreamStatus() {
        return this.streamStatus;
    }

    public static final class Builder {
        private String streamEndpoint; 
        private String streamStatus; 

        private Builder() {
        } 

        private Builder(BrowserAutomationStream model) {
            this.streamEndpoint = model.streamEndpoint;
            this.streamStatus = model.streamStatus;
        } 

        /**
         * streamEndpoint.
         */
        public Builder streamEndpoint(String streamEndpoint) {
            this.streamEndpoint = streamEndpoint;
            return this;
        }

        /**
         * streamStatus.
         */
        public Builder streamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }

        public BrowserAutomationStream build() {
            return new BrowserAutomationStream(this);
        } 

    } 

}
