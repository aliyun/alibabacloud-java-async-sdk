// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link TestEventPatternRequest} extends {@link RequestModel}
 *
 * <p>TestEventPatternRequest</p>
 */
public class TestEventPatternRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Event")
    @com.aliyun.core.annotation.Validation(required = true)
    private String event;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventPattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventPattern;

    private TestEventPatternRequest(Builder builder) {
        super(builder);
        this.event = builder.event;
        this.eventPattern = builder.eventPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestEventPatternRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return eventPattern
     */
    public String getEventPattern() {
        return this.eventPattern;
    }

    public static final class Builder extends Request.Builder<TestEventPatternRequest, Builder> {
        private String event; 
        private String eventPattern; 

        private Builder() {
            super();
        } 

        private Builder(TestEventPatternRequest request) {
            super(request);
            this.event = request.event;
            this.eventPattern = request.eventPattern;
        } 

        /**
         * <p>The event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;datacontenttype&quot;: &quot;application/json;charset=utf-8&quot;,
         *     &quot;aliyunaccountid&quot;: &quot;<em><strong><strong>&quot;,
         *     &quot;aliyunpublishtime&quot;: &quot;2023-04-</strong></strong>:54:57.939Z&quot;,
         *     &quot;data&quot;: {
         *         &quot;resourceEventType&quot;: &quot;<strong><strong>&quot;,
         *         &quot;resourceCreateTime&quot;: &quot;</strong></strong>&quot;,
         *         &quot;resourceId&quot;: &quot;sls-code-***-debug&quot;,
         *         &quot;captureTime&quot;: &quot;**</em>&quot;
         *     },
         *     &quot;aliyunoriginalaccountid&quot;: &quot;<strong><strong>&quot;,
         *     &quot;specversion&quot;: &quot;1.0&quot;,
         *     &quot;aliyuneventbusname&quot;: &quot;</strong></strong>&quot;,
         *     &quot;id&quot;: &quot;295e6bd2-bb72-4f70-<em><em><strong>-204a0680ee41&quot;,
         *     &quot;source&quot;: &quot;acs.sls&quot;,
         *     &quot;time&quot;: &quot;2023-04-</strong></em>:37:56Z&quot;,
         *     &quot;aliyunregionid&quot;: &quot;cn-</em>**&quot;,
         *     &quot;type&quot;: &quot;sls:Config:****&quot;
         * }</p>
         */
        public Builder event(String event) {
            this.putBodyParameter("Event", event);
            this.event = event;
            return this;
        }

        /**
         * <p>The event pattern.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;: &quot;value1&quot;}</p>
         */
        public Builder eventPattern(String eventPattern) {
            this.putBodyParameter("EventPattern", eventPattern);
            this.eventPattern = eventPattern;
            return this;
        }

        @Override
        public TestEventPatternRequest build() {
            return new TestEventPatternRequest(this);
        } 

    } 

}
