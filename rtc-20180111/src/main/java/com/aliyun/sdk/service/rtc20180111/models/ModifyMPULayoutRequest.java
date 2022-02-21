// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMPULayoutRequest} extends {@link RequestModel}
 *
 * <p>ModifyMPULayoutRequest</p>
 */
public class ModifyMPULayoutRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AudioMixCount")
    private Integer audioMixCount;

    @Query
    @NameInMap("LayoutId")
    @Validation(required = true)
    private Long layoutId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Panes")
    private java.util.List < Panes> panes;

    private ModifyMPULayoutRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.audioMixCount = builder.audioMixCount;
        this.layoutId = builder.layoutId;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.panes = builder.panes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMPULayoutRequest create() {
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
     * @return layoutId
     */
    public Long getLayoutId() {
        return this.layoutId;
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
    public java.util.List < Panes> getPanes() {
        return this.panes;
    }

    public static final class Builder extends Request.Builder<ModifyMPULayoutRequest, Builder> {
        private String appId; 
        private Integer audioMixCount; 
        private Long layoutId; 
        private String name; 
        private Long ownerId; 
        private java.util.List < Panes> panes; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMPULayoutRequest response) {
            super(response);
            this.appId = response.appId;
            this.audioMixCount = response.audioMixCount;
            this.layoutId = response.layoutId;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.panes = response.panes;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AudioMixCount.
         */
        public Builder audioMixCount(Integer audioMixCount) {
            this.putQueryParameter("AudioMixCount", audioMixCount);
            this.audioMixCount = audioMixCount;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(Long layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * Name.
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
         * Panes.
         */
        public Builder panes(java.util.List < Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
            return this;
        }

        @Override
        public ModifyMPULayoutRequest build() {
            return new ModifyMPULayoutRequest(this);
        } 

    } 

    public static class Panes extends TeaModel {
        @NameInMap("Height")
        private Float height;

        @NameInMap("MajorPane")
        private Integer majorPane;

        @NameInMap("PaneId")
        private Integer paneId;

        @NameInMap("Width")
        private Float width;

        @NameInMap("X")
        private Float x;

        @NameInMap("Y")
        private Float y;

        @NameInMap("ZOrder")
        private Integer ZOrder;

        private Panes(Builder builder) {
            this.height = builder.height;
            this.majorPane = builder.majorPane;
            this.paneId = builder.paneId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.ZOrder = builder.ZOrder;
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
         * @return ZOrder
         */
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public static final class Builder {
            private Float height; 
            private Integer majorPane; 
            private Integer paneId; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer ZOrder; 

            /**
             * Height.
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * MajorPane.
             */
            public Builder majorPane(Integer majorPane) {
                this.majorPane = majorPane;
                return this;
            }

            /**
             * PaneId.
             */
            public Builder paneId(Integer paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * ZOrder.
             */
            public Builder ZOrder(Integer ZOrder) {
                this.ZOrder = ZOrder;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
}
