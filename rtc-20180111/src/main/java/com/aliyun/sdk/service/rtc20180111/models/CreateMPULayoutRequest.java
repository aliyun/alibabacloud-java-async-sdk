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
