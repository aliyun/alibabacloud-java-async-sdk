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
 * {@link UpdateRtcCloudRecordingRequest} extends {@link RequestModel}
 *
 * <p>UpdateRtcCloudRecordingRequest</p>
 */
public class UpdateRtcCloudRecordingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixLayoutParams")
    private MixLayoutParams mixLayoutParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubscribeParams subscribeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private UpdateRtcCloudRecordingRequest(Builder builder) {
        super(builder);
        this.mixLayoutParams = builder.mixLayoutParams;
        this.subscribeParams = builder.subscribeParams;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRtcCloudRecordingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mixLayoutParams
     */
    public MixLayoutParams getMixLayoutParams() {
        return this.mixLayoutParams;
    }

    /**
     * @return subscribeParams
     */
    public SubscribeParams getSubscribeParams() {
        return this.subscribeParams;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateRtcCloudRecordingRequest, Builder> {
        private MixLayoutParams mixLayoutParams; 
        private SubscribeParams subscribeParams; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRtcCloudRecordingRequest request) {
            super(request);
            this.mixLayoutParams = request.mixLayoutParams;
            this.subscribeParams = request.subscribeParams;
            this.taskId = request.taskId;
        } 

        /**
         * MixLayoutParams.
         */
        public Builder mixLayoutParams(MixLayoutParams mixLayoutParams) {
            String mixLayoutParamsShrink = shrink(mixLayoutParams, "MixLayoutParams", "json");
            this.putQueryParameter("MixLayoutParams", mixLayoutParamsShrink);
            this.mixLayoutParams = mixLayoutParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subscribeParams(SubscribeParams subscribeParams) {
            String subscribeParamsShrink = shrink(subscribeParams, "SubscribeParams", "json");
            this.putQueryParameter("SubscribeParams", subscribeParamsShrink);
            this.subscribeParams = subscribeParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>73-8501-</strong></strong>-8ac1-72295a</strong>****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateRtcCloudRecordingRequest build() {
            return new UpdateRtcCloudRecordingRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>UpdateRtcCloudRecordingRequest</p>
     */
    public static class MixBackground extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderMode")
        private Integer renderMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(maxLength = 2048)
        private String url;

        private MixBackground(Builder builder) {
            this.renderMode = builder.renderMode;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MixBackground create() {
            return builder().build();
        }

        /**
         * @return renderMode
         */
        public Integer getRenderMode() {
            return this.renderMode;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer renderMode; 
            private String url; 

            private Builder() {
            } 

            private Builder(MixBackground model) {
                this.renderMode = model.renderMode;
                this.url = model.url;
            } 

            /**
             * RenderMode.
             */
            public Builder renderMode(Integer renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public MixBackground build() {
                return new MixBackground(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>UpdateRtcCloudRecordingRequest</p>
     */
    public static class SubBackground extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderMode")
        private Integer renderMode;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(maxLength = 2048)
        private String url;

        private SubBackground(Builder builder) {
            this.renderMode = builder.renderMode;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubBackground create() {
            return builder().build();
        }

        /**
         * @return renderMode
         */
        public Integer getRenderMode() {
            return this.renderMode;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer renderMode; 
            private String url; 

            private Builder() {
            } 

            private Builder(SubBackground model) {
                this.renderMode = model.renderMode;
                this.url = model.url;
            } 

            /**
             * RenderMode.
             */
            public Builder renderMode(Integer renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SubBackground build() {
                return new SubBackground(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>UpdateRtcCloudRecordingRequest</p>
     */
    public static class UserPanes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private Integer sourceType;

        @com.aliyun.core.annotation.NameInMap("SubBackground")
        private SubBackground subBackground;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private UserPanes(Builder builder) {
            this.height = builder.height;
            this.sourceType = builder.sourceType;
            this.subBackground = builder.subBackground;
            this.userId = builder.userId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPanes create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return sourceType
         */
        public Integer getSourceType() {
            return this.sourceType;
        }

        /**
         * @return subBackground
         */
        public SubBackground getSubBackground() {
            return this.subBackground;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private String height; 
            private Integer sourceType; 
            private SubBackground subBackground; 
            private String userId; 
            private String width; 
            private String x; 
            private String y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(UserPanes model) {
                this.height = model.height;
                this.sourceType = model.sourceType;
                this.subBackground = model.subBackground;
                this.userId = model.userId;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(Integer sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SubBackground.
             */
            public Builder subBackground(SubBackground subBackground) {
                this.subBackground = subBackground;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public UserPanes build() {
                return new UserPanes(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>UpdateRtcCloudRecordingRequest</p>
     */
    public static class MixLayoutParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MixBackground")
        private MixBackground mixBackground;

        @com.aliyun.core.annotation.NameInMap("UserPanes")
        private java.util.List<UserPanes> userPanes;

        private MixLayoutParams(Builder builder) {
            this.mixBackground = builder.mixBackground;
            this.userPanes = builder.userPanes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MixLayoutParams create() {
            return builder().build();
        }

        /**
         * @return mixBackground
         */
        public MixBackground getMixBackground() {
            return this.mixBackground;
        }

        /**
         * @return userPanes
         */
        public java.util.List<UserPanes> getUserPanes() {
            return this.userPanes;
        }

        public static final class Builder {
            private MixBackground mixBackground; 
            private java.util.List<UserPanes> userPanes; 

            private Builder() {
            } 

            private Builder(MixLayoutParams model) {
                this.mixBackground = model.mixBackground;
                this.userPanes = model.userPanes;
            } 

            /**
             * MixBackground.
             */
            public Builder mixBackground(MixBackground mixBackground) {
                this.mixBackground = mixBackground;
                return this;
            }

            /**
             * UserPanes.
             */
            public Builder userPanes(java.util.List<UserPanes> userPanes) {
                this.userPanes = userPanes;
                return this;
            }

            public MixLayoutParams build() {
                return new MixLayoutParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>UpdateRtcCloudRecordingRequest</p>
     */
    public static class SubscribeUserIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceType")
        private Integer sourceType;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Integer streamType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private SubscribeUserIdList(Builder builder) {
            this.sourceType = builder.sourceType;
            this.streamType = builder.streamType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeUserIdList create() {
            return builder().build();
        }

        /**
         * @return sourceType
         */
        public Integer getSourceType() {
            return this.sourceType;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer sourceType; 
            private Integer streamType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(SubscribeUserIdList model) {
                this.sourceType = model.sourceType;
                this.streamType = model.streamType;
                this.userId = model.userId;
            } 

            /**
             * SourceType.
             */
            public Builder sourceType(Integer sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SubscribeUserIdList build() {
                return new SubscribeUserIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRtcCloudRecordingRequest} extends {@link TeaModel}
     *
     * <p>UpdateRtcCloudRecordingRequest</p>
     */
    public static class SubscribeParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubscribeUserIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<SubscribeUserIdList> subscribeUserIdList;

        private SubscribeParams(Builder builder) {
            this.subscribeUserIdList = builder.subscribeUserIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeParams create() {
            return builder().build();
        }

        /**
         * @return subscribeUserIdList
         */
        public java.util.List<SubscribeUserIdList> getSubscribeUserIdList() {
            return this.subscribeUserIdList;
        }

        public static final class Builder {
            private java.util.List<SubscribeUserIdList> subscribeUserIdList; 

            private Builder() {
            } 

            private Builder(SubscribeParams model) {
                this.subscribeUserIdList = model.subscribeUserIdList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder subscribeUserIdList(java.util.List<SubscribeUserIdList> subscribeUserIdList) {
                this.subscribeUserIdList = subscribeUserIdList;
                return this;
            }

            public SubscribeParams build() {
                return new SubscribeParams(this);
            } 

        } 

    }
}
