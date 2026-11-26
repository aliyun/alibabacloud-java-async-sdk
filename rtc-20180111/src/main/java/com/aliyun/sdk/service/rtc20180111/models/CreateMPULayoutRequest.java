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
 * {@link CreateMPULayoutRequest} extends {@link RequestModel}
 *
 * <p>CreateMPULayoutRequest</p>
 */
public class CreateMPULayoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioMixCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer audioMixCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Panes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Panes> panes;

    private CreateMPULayoutRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.audioMixCount = builder.audioMixCount;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.panes = builder.panes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMPULayoutRequest create() {
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
     * @return audioMixCount
     */
    public Integer getAudioMixCount() {
        return this.audioMixCount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return panes
     */
    public java.util.List<Panes> getPanes() {
        return this.panes;
    }

    public static final class Builder extends Request.Builder<CreateMPULayoutRequest, Builder> {
        private String appId; 
        private Integer audioMixCount; 
        private String name; 
        private Long ownerId; 
        private java.util.List<Panes> panes; 

        private Builder() {
            super();
        } 

        private Builder(CreateMPULayoutRequest request) {
            super(request);
            this.appId = request.appId;
            this.audioMixCount = request.audioMixCount;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.panes = request.panes;
        } 

        /**
         * <p>The application ID. Only a single ID is supported. You can create and query application IDs in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The maximum number of audio mixes. Valid values: <strong>0</strong> to <strong>6</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder audioMixCount(Integer audioMixCount) {
            this.putQueryParameter("AudioMixCount", audioMixCount);
            this.audioMixCount = audioMixCount;
            return this;
        }

        /**
         * <p>The name of the layout.</p>
         * 
         * <strong>example:</strong>
         * <p>LayoutName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The list of panes in the layout.</p>
         * <p>This parameter is required.</p>
         */
        public Builder panes(java.util.List<Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
            return this;
        }

        @Override
        public CreateMPULayoutRequest build() {
            return new CreateMPULayoutRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMPULayoutRequest} extends {@link TeaModel}
     *
     * <p>CreateMPULayoutRequest</p>
     */
    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("MajorPane")
        private Integer majorPane;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        private Integer paneId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Panes(Builder builder) {
            this.height = builder.height;
            this.majorPane = builder.majorPane;
            this.paneId = builder.paneId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Panes create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return majorPane
         */
        public Integer getMajorPane() {
            return this.majorPane;
        }

        /**
         * @return paneId
         */
        public Integer getPaneId() {
            return this.paneId;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Float height; 
            private Integer majorPane; 
            private Integer paneId; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Panes model) {
                this.height = model.height;
                this.majorPane = model.majorPane;
                this.paneId = model.paneId;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The height of the pane, represented as a normalized percentage. Valid values: <strong>0.0 &lt; Height ≤ 1.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>Specifies the main pane. Each layout can have only one main pane.</p>
             * <ul>
             * <li><p><strong>0</strong>: secondary pane.</p>
             * </li>
             * <li><p><strong>1</strong>: main pane.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder majorPane(Integer majorPane) {
                this.majorPane = majorPane;
                return this;
            }

            /**
             * <p>The pane ID. Panes are sorted from top left to bottom right, starting from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paneId(Integer paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * <p>The width of the pane, represented as a normalized percentage. Valid values: <strong>0.0 &lt; Width ≤ 1.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X-coordinate, represented as a normalized percentage. Valid values: <strong>0.0 ≤ X ≤ 1.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate, represented as a normalized percentage. Valid values: <strong>0.0 ≤ Y ≤ 1.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
}
