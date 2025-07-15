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
 * {@link CreateLiveStreamMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveStreamMonitorRequest</p>
 */
public class CreateLiveStreamMonitorRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorConfig")
    private String monitorConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
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

    private CreateLiveStreamMonitorRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.callbackUrl = builder.callbackUrl;
        this.dingTalkWebHookUrl = builder.dingTalkWebHookUrl;
        this.domain = builder.domain;
        this.inputList = builder.inputList;
        this.monitorConfig = builder.monitorConfig;
        this.monitorName = builder.monitorName;
        this.outputTemplate = builder.outputTemplate;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveStreamMonitorRequest create() {
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

    public static final class Builder extends Request.Builder<CreateLiveStreamMonitorRequest, Builder> {
        private String app; 
        private String callbackUrl; 
        private String dingTalkWebHookUrl; 
        private String domain; 
        private String inputList; 
        private String monitorConfig; 
        private String monitorName; 
        private String outputTemplate; 
        private Long ownerId; 
        private String regionId; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveStreamMonitorRequest request) {
            super(request);
            this.app = request.app;
            this.callbackUrl = request.callbackUrl;
            this.dingTalkWebHookUrl = request.dingTalkWebHookUrl;
            this.domain = request.domain;
            this.inputList = request.inputList;
            this.monitorConfig = request.monitorConfig;
            this.monitorName = request.monitorName;
            this.outputTemplate = request.outputTemplate;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.stream = request.stream;
        } 

        /**
         * <p>The name of the application that plays the output streams of the monitoring session.</p>
         * <p>You can specify a name. If you do not specify a name, the system uses <strong>monitor</strong> as the name of the application.</p>
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
         * <p>Supports input of callback addresses in HTTP(S) format.</p>
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
         * <p>DingTalk alert monitoring sends alert notifications through a DingTalk group robot. Please set up the DingTalk group robot first and enter the HTTP(S) address of the robot here. For more details, see <a href="https://open.dingtalk.com/document/robots/custom-robot-access">Custom Robot Access</a>.</p>
         * <blockquote>
         * <p>Configure the custom keyword for the DingTalk group robot as &quot;alert&quot;, otherwise, messages will not be received.</p>
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
         * <p>The endpoint of the monitoring session.</p>
         * <p>This parameter is required.</p>
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
         * <p>Alarm threshold setting for monitoring, in JSON format. For more details, please refer to the table below for MonitorConfig.</p>
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
         * <p>The name of the monitoring session.</p>
         * <p>This parameter is required.</p>
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
         * <li><strong>lp_ld</strong>: low definition.</li>
         * <li><strong>lp_sd</strong>: standard definition.</li>
         * <li><strong>lp_hd</strong>: high definition.</li>
         * <li><strong>lp_ud</strong>: ultra high definition.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The name of the output stream of the monitoring session. If you do not specify a name, the system generates a name at random.</p>
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
        public CreateLiveStreamMonitorRequest build() {
            return new CreateLiveStreamMonitorRequest(this);
        } 

    } 

}
