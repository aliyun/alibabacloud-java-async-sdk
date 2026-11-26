// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link StartViewRequest} extends {@link RequestModel}
 *
 * <p>StartViewRequest</p>
 */
public class StartViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgColor")
    private BgColor bgColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CropMode")
    private Integer cropMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionColor")
    private RegionColor regionColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWithoutChannel")
    private Boolean startWithoutChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWithoutChannelWaitTime")
    private Integer startWithoutChannelWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 55, minLength = 1)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewContent")
    private String viewContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewSubscribers")
    private java.util.List<String> viewSubscribers;

    private StartViewRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.bgColor = builder.bgColor;
        this.channelId = builder.channelId;
        this.cropMode = builder.cropMode;
        this.regionColor = builder.regionColor;
        this.startWithoutChannel = builder.startWithoutChannel;
        this.startWithoutChannelWaitTime = builder.startWithoutChannelWaitTime;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
        this.viewContent = builder.viewContent;
        this.viewSubscribers = builder.viewSubscribers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return bgColor
     */
    public BgColor getBgColor() {
        return this.bgColor;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return cropMode
     */
    public Integer getCropMode() {
        return this.cropMode;
    }

    /**
     * @return regionColor
     */
    public RegionColor getRegionColor() {
        return this.regionColor;
    }

    /**
     * @return startWithoutChannel
     */
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    /**
     * @return startWithoutChannelWaitTime
     */
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return viewContent
     */
    public String getViewContent() {
        return this.viewContent;
    }

    /**
     * @return viewSubscribers
     */
    public java.util.List<String> getViewSubscribers() {
        return this.viewSubscribers;
    }

    public static final class Builder extends Request.Builder<StartViewRequest, Builder> {
        private String appId; 
        private BgColor bgColor; 
        private String channelId; 
        private Integer cropMode; 
        private RegionColor regionColor; 
        private Boolean startWithoutChannel; 
        private Integer startWithoutChannelWaitTime; 
        private String taskId; 
        private String templateId; 
        private String viewContent; 
        private java.util.List<String> viewSubscribers; 

        private Builder() {
            super();
        } 

        private Builder(StartViewRequest request) {
            super(request);
            this.appId = request.appId;
            this.bgColor = request.bgColor;
            this.channelId = request.channelId;
            this.cropMode = request.cropMode;
            this.regionColor = request.regionColor;
            this.startWithoutChannel = request.startWithoutChannel;
            this.startWithoutChannelWaitTime = request.startWithoutChannelWaitTime;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.viewContent = request.viewContent;
            this.viewSubscribers = request.viewSubscribers;
        } 

        /**
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The global background color.</p>
         */
        public Builder bgColor(BgColor bgColor) {
            this.putQueryParameter("BgColor", bgColor);
            this.bgColor = bgColor;
            return this;
        }

        /**
         * <p>The ID of an existing channel. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: proportional cropping</li>
         * <li><strong>2</strong>: proportional padding (default)</li>
         * <li><strong>3</strong>: stretch to fill</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cropMode(Integer cropMode) {
            this.putQueryParameter("CropMode", cropMode);
            this.cropMode = cropMode;
            return this;
        }

        /**
         * <p>The global pane background color.</p>
         */
        public Builder regionColor(RegionColor regionColor) {
            this.putQueryParameter("RegionColor", regionColor);
            this.regionColor = regionColor;
            return this;
        }

        /**
         * <p>Specifies whether to allow starting the task when the channel does not exist. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No (default).</li>
         * </ul>
         */
        public Builder startWithoutChannel(Boolean startWithoutChannel) {
            this.putQueryParameter("StartWithoutChannel", startWithoutChannel);
            this.startWithoutChannel = startWithoutChannel;
            return this;
        }

        /**
         * <p>The wait time for the task when the channel is not started, in seconds. This parameter is valid only when the StartWithoutChannel parameter is set to true. Valid values: 30 to 120.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder startWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
            this.putQueryParameter("StartWithoutChannelWaitTime", startWithoutChannelWaitTime);
            this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
            return this;
        }

        /**
         * <p>The task ID for the current request. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>567</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The stream property. Valid values:</p>
         * <ul>
         * <li>main: main stream</li>
         * <li>screen-cast: shared stream</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder viewContent(String viewContent) {
            this.putQueryParameter("ViewContent", viewContent);
            this.viewContent = viewContent;
            return this;
        }

        /**
         * <p>The list of user IDs of Session Initiation Protocol (SIP) devices that are allowed to view the main stream or shared stream.</p>
         */
        public Builder viewSubscribers(java.util.List<String> viewSubscribers) {
            String viewSubscribersShrink = shrink(viewSubscribers, "ViewSubscribers", "simple");
            this.putQueryParameter("ViewSubscribers", viewSubscribersShrink);
            this.viewSubscribers = viewSubscribers;
            return this;
        }

        @Override
        public StartViewRequest build() {
            return new StartViewRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartViewRequest} extends {@link TeaModel}
     *
     * <p>StartViewRequest</p>
     */
    public static class BgColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer r;

        private BgColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BgColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(BgColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public BgColor build() {
                return new BgColor(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartViewRequest} extends {@link TeaModel}
     *
     * <p>StartViewRequest</p>
     */
    public static class RegionColor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("B")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer b;

        @com.aliyun.core.annotation.NameInMap("G")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer g;

        @com.aliyun.core.annotation.NameInMap("R")
        @com.aliyun.core.annotation.Validation(maximum = 255)
        private Integer r;

        private RegionColor(Builder builder) {
            this.b = builder.b;
            this.g = builder.g;
            this.r = builder.r;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionColor create() {
            return builder().build();
        }

        /**
         * @return b
         */
        public Integer getB() {
            return this.b;
        }

        /**
         * @return g
         */
        public Integer getG() {
            return this.g;
        }

        /**
         * @return r
         */
        public Integer getR() {
            return this.r;
        }

        public static final class Builder {
            private Integer b; 
            private Integer g; 
            private Integer r; 

            private Builder() {
            } 

            private Builder(RegionColor model) {
                this.b = model.b;
                this.g = model.g;
                this.r = model.r;
            } 

            /**
             * <p>The B value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder b(Integer b) {
                this.b = b;
                return this;
            }

            /**
             * <p>The G value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder g(Integer g) {
                this.g = g;
                return this;
            }

            /**
             * <p>The R value.</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder r(Integer r) {
                this.r = r;
                return this;
            }

            public RegionColor build() {
                return new RegionColor(this);
            } 

        } 

    }
}
