// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateLiveStreamMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveStreamMonitorRequest</p>
 */
public class UpdateLiveStreamMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DingTalkWebHookUrl")
    private String dingTalkWebHookUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorConfig")
    private String monitorConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorName")
    private String monitorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputTemplate")
    private String outputTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    private String stream;

    private UpdateLiveStreamMonitorRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.callbackUrl = builder.callbackUrl;
        this.dingTalkWebHookUrl = builder.dingTalkWebHookUrl;
        this.domain = builder.domain;
        this.inputList = builder.inputList;
        this.monitorConfig = builder.monitorConfig;
        this.monitorId = builder.monitorId;
        this.monitorName = builder.monitorName;
        this.outputTemplate = builder.outputTemplate;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveStreamMonitorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return dingTalkWebHookUrl
     */
    public String getDingTalkWebHookUrl() {
        return this.dingTalkWebHookUrl;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return inputList
     */
    public String getInputList() {
        return this.inputList;
    }

    /**
     * @return monitorConfig
     */
    public String getMonitorConfig() {
        return this.monitorConfig;
    }

    /**
     * @return monitorId
     */
    public String getMonitorId() {
        return this.monitorId;
    }

    /**
     * @return monitorName
     */
    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * @return outputTemplate
     */
    public String getOutputTemplate() {
        return this.outputTemplate;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<UpdateLiveStreamMonitorRequest, Builder> {
        private String app; 
        private String callbackUrl; 
        private String dingTalkWebHookUrl; 
        private String domain; 
        private String inputList; 
        private String monitorConfig; 
        private String monitorId; 
        private String monitorName; 
        private String outputTemplate; 
        private Long ownerId; 
        private String regionId; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveStreamMonitorRequest request) {
            super(request);
            this.app = request.app;
            this.callbackUrl = request.callbackUrl;
            this.dingTalkWebHookUrl = request.dingTalkWebHookUrl;
            this.domain = request.domain;
            this.inputList = request.inputList;
            this.monitorConfig = request.monitorConfig;
            this.monitorId = request.monitorId;
            this.monitorName = request.monitorName;
            this.outputTemplate = request.outputTemplate;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.stream = request.stream;
        } 

        /**
         * <p>The name of the application to which the output stream of the monitoring session belongs. You can specify a name. If you do not specify a name, the system uses <strong>monitor</strong> as the name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>monitor****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The callback URL. Supported formats include HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The URL of the DingTalk chatbot. Specify a DingTalk chatbot that you have configured, and you can receive live monitoring alerts from the chatbot. For more information, see <a href="https://open.dingtalk.com/document/robots/custom-robot-access">Configure a custom chatbot</a>.</p>
         * <blockquote>
         * <p> Specify &quot;Alert&quot; as the custom keyword of the DingTalk chatbot. Otherwise, you cannot receive messages.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa">https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa</a>****</p>
         */
        public Builder dingTalkWebHookUrl(String dingTalkWebHookUrl) {
            this.putQueryParameter("DingTalkWebHookUrl", dingTalkWebHookUrl);
            this.dingTalkWebHookUrl = dingTalkWebHookUrl;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The list of input streams to monitor. For more information, see the following <strong>InputConfig</strong> table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InputConfig</p>
         */
        public Builder inputList(String inputList) {
            this.putQueryParameter("InputList", inputList);
            this.inputList = inputList;
            return this;
        }

        /**
         * <p>The monitoring alert thresholds. The value is a JSON string. For more information, see the following MonitorConfig table.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;fpsLowThres&quot;: 0.6,&quot;brLowThres&quot;: 1.1,&quot;eofDurationThresSec&quot;: 10}&quot;</p>
         */
        public Builder monitorConfig(String monitorConfig) {
            this.putQueryParameter("MonitorConfig", monitorConfig);
            this.monitorConfig = monitorConfig;
            return this;
        }

        /**
         * <p>The ID of the monitoring session.</p>
         * <blockquote>
         * <p> You can obtain the monitoring session ID from the response of the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder monitorId(String monitorId) {
            this.putQueryParameter("MonitorId", monitorId);
            this.monitorId = monitorId;
            return this;
        }

        /**
         * <p>The name of the monitoring session.</p>
         * 
         * <strong>example:</strong>
         * <p>liveMonitor****</p>
         */
        public Builder monitorName(String monitorName) {
            this.putQueryParameter("MonitorName", monitorName);
            this.monitorName = monitorName;
            return this;
        }

        /**
         * <p>The output template of the monitoring session. Valid values:</p>
         * <ul>
         * <li><strong>lp_ld</strong>: low definition</li>
         * <li><strong>lp_sd</strong>: standard definition</li>
         * <li><strong>lp_hd</strong>: high definition</li>
         * <li><strong>lp_ud</strong>: ultra-high definition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lp_ud</p>
         */
        public Builder outputTemplate(String outputTemplate) {
            this.putQueryParameter("OutputTemplate", outputTemplate);
            this.outputTemplate = outputTemplate;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the output stream of the monitoring session.</p>
         * 
         * <strong>example:</strong>
         * <p>monitorStream****</p>
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public UpdateLiveStreamMonitorRequest build() {
            return new UpdateLiveStreamMonitorRequest(this);
        } 

    } 

}
